package choi.sdp_back.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "MEMBER") // 오라클 테이블명
public class Member {

    @Id
    @Column(name = "MEMBER_ID") // DB 컬럼명 매핑
    private String memberId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    // 관리자(ADMIN) / 일반사용자(USER) 구분
    @Column(nullable = false)
    private String role;

    // 개인(INDIVIDUAL) / 기업(COMPANY) 구분
    @Column(name = "MEMBER_TYPE")
    private String memberType;

    // 추가 정보
    private String email;
    private String ssn;            // 주민번호

    @Column(name = "BUSINESS_NUMBER")
    private String businessNumber; // 사업자번호

    @CreationTimestamp // 가입 시 시간 자동 저장 (sysdate 대체)
    @Column(name = "JOIN_DATE", updatable = false)
    private LocalDateTime joinDate;
}
