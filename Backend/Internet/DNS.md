# DNS (Domain Name System)
인터넷에 연결된 리소스에 대한 계층적이고 분산된 이름 지정 시스템<br>
사용자는 `www.google.com`과 같은 도메인 이름을 통해 온라인으로 정보에 엑세스하게된다<br>
웹 브라우저는 IP 주소를 통해 상호작용하고 DNS는 브라우저가 인터넷 리소스를 로드할 수 있도록 **도메인 이름을 IP 주소로 변환한다**

<br>

인터넷에 연결된 각 장치에는 다른 시스템이 장치를 찾는데 사용하는 고유한 IP 주소가 있고 DNS 서버는 사람이 192.168.1.1(IPv4)과 같은 IP 주소 또는 2400:cb00:2048:1::c629:d7a2(IPv6의 경우)와 같은 보다 복잡한 IP 주소를 기억할 필요가 없게 해준다

<br>

이러한 과정, 전체 시스템을 DNS라고 한다

<br>

이러한 시스템은 전세계적으로 약속된 규칙을 공유한다<br>
상위 기관에서 인증된 기관에게 도메인을 생성하거나 IP 주소로 변경할 수 있는 권한을 부여한다<br>
DNS는 이처럼 상위 기관과 하위 기관과 같은 '계층 구조'를 가지는 분산 데이터베이스 구조를 가진다

<br>

## DNS 동작 방식
- 웹 브라우저는 해결사 서버에게 요청함<br>
“www.hanamon.kr"의 IP 주소를 알려줘

- 해결사 서버는 최상위 기관에서 관리하는 Name 서버에게 요청함<br>
.kr 이라는 도메인 있어?

- 최상위 기관에서 관리하는 Name 서버는 응답함<br>
.kr 한국 국가 도메인 입니다<br>
.kr Name 서버로 가세요

- 해결사 서버는 .kr Name 서버에게 요청함<br>
“hanamon.kr" 있나요?”

- .kr Name 서버는 응답함<br>
네 [가비아](https://www.gabia.com/?utm_source=google&utm_medium=cpc&utm_term=%25EA%25B0%2580%25EB%25B9%2584%25EC%2595%2584&utm_campaign=%25EA%25B0%2580%25EB%25B9%2584%25EC%2595%2584)로 가세요


- 해결사 서버는 가비아 Name 서버에게 요청함<br>
“www.hanamon.kr" 있나요?”


- 가비아 네임 서버는 응답함<br>
12.345.678.900 으로 가세요”

- 해결사 서버는 웹 브라우저에게 알려준<br>
12.345.678.900 으로 가세요”

<br>

[DNS란? (도메인 네임 시스템 개념부터 작동 방식까지)](https://hanamon.kr/dns%EB%9E%80-%EB%8F%84%EB%A9%94%EC%9D%B8-%EB%84%A4%EC%9E%84-%EC%8B%9C%EC%8A%A4%ED%85%9C-%EA%B0%9C%EB%85%90%EB%B6%80%ED%84%B0-%EC%9E%91%EB%8F%99-%EB%B0%A9%EC%8B%9D%EA%B9%8C%EC%A7%80/)

[DNS(Domain Name System)란?](https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=gaegurijump&logNo=110186376474)

[DNS란 뭐고, 네임서버란 뭔지 개념정리](https://gentlysallim.com/dns%EB%9E%80-%EB%AD%90%EA%B3%A0-%EB%84%A4%EC%9E%84%EC%84%9C%EB%B2%84%EB%9E%80-%EB%AD%94%EC%A7%80-%EA%B0%9C%EB%85%90%EC%A0%95%EB%A6%AC/)

[FQDN(Fully Qualified Domain Name) 이란?](https://onlywis.tistory.com/14)

[DNS](https://developer.mozilla.org/en-US/docs/Glossary/DNS)

[What is DNS? | How DNS works](https://www.cloudflare.com/en-gb/learning/dns/what-is-dns/)

[A fun and colorful explanation of how DNS works.](https://howdns.works/)

[DNS and How does it work?](https://www.youtube.com/watch?v=Wj0od2ag5sk)

[DNS Records](https://www.youtube.com/watch?v=7lxgpKh_fRY)

[What does DNS do ?](https://www.youtube.com/watch?v=zEmUuNFBgN8&list=PLTk5ZYSbd9MhMmOiPhfRJNW7bhxHo4q-K)
