package choi.sdp_back.controller;

import choi.sdp_back.dto.MemberJoinDto;
import choi.sdp_back.dto.MemberLoginDto;
import choi.sdp_back.entity.Member;
import choi.sdp_back.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000") // 리액트(3000번 포트)에서 오는 요청 허용
public class MemberController {

    private final MemberService memberService;

    // 회원가입 API
    @PostMapping("/join")
    public ResponseEntity<?> join(@RequestBody MemberJoinDto dto) {
        try {
            memberService.join(dto);
            return ResponseEntity.ok("회원가입 성공");
        } catch (Exception e) {
            // 실패 시 에러 메시지 반환 (예: "이미 사용 중인 아이디입니다.")
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // 로그인 API
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody MemberLoginDto dto) {
        try {
            // 서비스에서 아이디, 비번 확인 후 Member 객체 받아옴
            Member member = memberService.login(dto.getMemberId(), dto.getPassword());

            // 프론트엔드(리액트)에 돌려줄 정보 담기
            Map<String, Object> response = new HashMap<>();
            response.put("message", "로그인 성공");
            response.put("name", member.getName()); // 사용자 이름
            response.put("type", member.getMemberType()); // INDIVIDUAL(개인) 또는 COMPANY(기업)
            response.put("role", member.getRole()); // USER 또는 ADMIN

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
