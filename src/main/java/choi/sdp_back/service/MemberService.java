package choi.sdp_back.service;

import choi.sdp_back.dto.MemberJoinDto;
import choi.sdp_back.entity.Member;
import choi.sdp_back.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    // 1. 회원가입 기능
    @Transactional
    public void join(MemberJoinDto dto) {
        if (memberRepository.existsByMemberId(dto.getMemberId())) {
            throw new RuntimeException("이미 사용 중인 아이디입니다.");
        }

        // 비밀번호 암호화
        String encodedPwd = passwordEncoder.encode(dto.getPassword());

        // 개인/기업 구분 로직
        String memberType = "INDIVIDUAL";
        String bizNum = null;
        String ssn = dto.getSsn();

        if ("company".equalsIgnoreCase(dto.getType())) {
            memberType = "COMPANY";
            bizNum = dto.getBusinessNumber();
            ssn = null;
        }

        Member member = Member.builder()
                .memberId(dto.getMemberId())
                .password(encodedPwd)
                .name(dto.getName())
                .phoneNumber(dto.getPhoneNumber())
                .email(dto.getEmail())
                .role("USER")
                .memberType(memberType)
                .ssn(ssn)
                .businessNumber(bizNum)
                .build();

        memberRepository.save(member);
    }

    // 2. 로그인 기능 (이 부분이 추가되었습니다!)
    public Member login(String memberId, String password) {
        // 아이디 검사
        Member member = memberRepository.findByMemberId(memberId)
                .orElseThrow(() -> new RuntimeException("아이디가 존재하지 않습니다."));

        // 비밀번호 검사 (입력받은 비번 vs DB 암호화된 비번)
        if (!passwordEncoder.matches(password, member.getPassword())) {
            throw new RuntimeException("비밀번호가 일치하지 않습니다.");
        }

        return member;
    }
}
