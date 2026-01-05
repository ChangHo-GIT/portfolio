package choi.sdp_back.repository;

import choi.sdp_back.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// <Member, String> : 엔티티 타입은 Member, PK(기본키) 타입은 String (MEMBER_ID가 문자열이므로)
public interface MemberRepository extends JpaRepository<Member, String> {

    // 1. 로그인용: 아이디로 회원 정보 찾기 (결과가 없을 수 있으니 Optional 사용)
    Optional<Member> findByMemberId(String memberId);

    // 2. 회원가입용: 아이디 중복 검사 (있으면 true, 없으면 false)
    boolean existsByMemberId(String memberId);
}
