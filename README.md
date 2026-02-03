## 📊 프로젝트 개요

프로젝트명: ROOT STATION (루트 스테이션)

개발 기간: 2025.12.29 ~ 2026.02.01 (약 5주)

역할: PL(Project Leader) - (Full Stack Development & System Architecture)

주요 성과: DTO 패턴 도입을 통한 보안 강화, 동적 렌더링 기반의 UX 최적화

---
## 🛠 Tech Stack (기술 스택)

### Frontend
![React](https://img.shields.io/badge/REACT-61DAFB?style=for-the-badge&logo=react&logoColor=black) ![Axios](https://img.shields.io/badge/AXIOS-5A29E4?style=for-the-badge&logo=axios&logoColor=white) ![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)

### Backend
![Spring Boot](https://img.shields.io/badge/SPRING_BOOT-6DB33F?style=for-the-badge&logo=springboot&logoColor=white) ![Java 17](https://img.shields.io/badge/JAVA_17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring Security](https://img.shields.io/badge/SPRING_SECURITY-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white) ![JPA](https://img.shields.io/badge/JPA_(HIBERNATE)-6DB33F?style=for-the-badge&logo=hibernate&logoColor=white)

### Database & Storage
![Oracle 19c](https://img.shields.io/badge/ORACLE_19C-F80000?style=for-the-badge&logo=oracle&logoColor=white) ![Local Storage](https://img.shields.io/badge/LOCAL_STORAGE-444444?style=for-the-badge&logo=files&logoColor=white)

---
## 🌟 Key Features (핵심 기능)

### 1. 🏗️ 플랫폼 아키텍처 (Main & Admin)
- **기술:** React-Router-Dom, UI/UX Component Library
- **기능:** 브랜드 아이덴티티 유지를 위한 기본 가이드 템플릿을 직접 제작하고, SPA 기반의 효율적인 Routing 시스템을 구축했습니다.
- **특징:** 사용자의 작업 몰입도를 높이는 인터페이스와 실시간 피드백 시스템을 통해 직관적인 UX를 실현했습니다.

### 2. 📦 스마트 인벤토리 관리 (제품 등록)
- **기술:** DTO & Entity Mapping, Dynamic Sort Logic

- **기능:** 백엔드 설계 시 DTO와 Entity를 분리하여 데이터 무결성을 확보하고, 관리 효율을 위한 동적 정렬 로직을 구현했습니다.

- **특징:** 데이터 모델의 보안성을 높이는 동시에 관리자가 방대한 제품군을 효율적으로 제어할 수 있는 환경을 설계했습니다.

### 3. 📢 운영 보안 및 공지 시스템 (공지사항)
- **기술:** DTO Pattern, CORS Policy Configuration

- **기능:** DTO 패턴을 통해 전송 데이터의 안전성을 확보하고, 프론트-백엔드 간 이기종 통신을 위한 CORS 정책을 수립했습니다.

- **특징:** 표준화된 데이터 전송 규격을 정립하여 시스템 유지보수성과 외부 보안 위협에 대한 대응력을 강화했습니다.

### 4. 🖼️ 인터렉티브 큐레이션 (추천 배치)
- **기술:** Dynamic Rendering, Asynchronous Loading

- **기능:** 테마 선택에 따라 화면 요소가 실시간으로 변하는 동적 렌더링을 적용하고, 고화질 데이터를 비동기로 로드합니다.

- **특징:** 초기 로딩 속도를 최적화하여 사용자에게 시각적 끊김 없는 몰입형 디자인 가이드 경험을 제공합니다.

### 5. 📑 고성능 제품 라이브러리 (페이지네이션)
- **기술:** Dynamic Page Calculation, window.scrollTo

- **기능:** 필터링 결과에 맞춰 전체 페이지 수를 동적으로 계산하는 알고리즘을 설계하고 스크롤 제어 로직을 구현했습니다.

- **특징:** 대량의 데이터 탐색 시 발생할 수 있는 부자연스러움을 해소하고 시각적 연속성을 보장하는 최적화된 탐색 UX를 실현했습니다.

---
## 📈 PL로서의 문제 해결 (Troubleshooting)
- **데이터 보안 강화:** 엔티티 직접 노출로 인한 취약점을 방지하기 위해 모든 API 통신 계층에 DTO 패턴을 도입하여 시스템 무결성을 높였습니다.

- **이기종 통신 해결:** 프론트엔드와 백엔드 포트 불일치로 발생한 CORS 이슈를 전역 보안 설정을 통해 해결하여 원활한 통합 환경을 구축했습니다.

- **탐색 경험 최적화:** 대용량 제품 리스트 로딩 시의 부자연스러움을 동적 페이지네이션과 스크롤 제어 로직으로 해결하여 완성도를 확보했습니다.
