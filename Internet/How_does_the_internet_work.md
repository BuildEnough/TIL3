# 인터넷은 어떻게 동작하는가?

## 인터넷이란
컴퓨터들이 서로 통신 가능한 네트워크<br>
현재 인터넷은 생활의 필수적인 부분으로 개발자로서 인터넷이 어떻게 작동하는지와 인터넷을 뒷바침하는 다양한 기술과 프로토콜에 대한 이해가 필요하다<br>
**인터넷은 표준화된 프로토콜 세트를 통해 통신하는 서로 연결된 컴퓨터의 글로벌 네트워크이다**


<br>

## 네트워크
인터넷을 공부하기 전에 네트워크란 무엇인지 알아야함<br>
A network is a group of computers or other devices which are connected to eachother<br>
두 대의 컴퓨터가 통신이 필요할때, 다른 컴퓨터와 물리적(이더넷 케이블)으로 또는 무선(와이파이, 블루투스)으로 연결되어야 한다
![간단한 네트워크](images/%EA%B0%84%EB%8B%A8%ED%95%9C%20%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC.png)
<br><br>
> The internet is a network of networks.

<br>

두 대의 컴퓨터를 연결할 때는 복잡하지 않지만 여러 대의 컴퓨터를 연결하는 경우 복잡하게 된다(10대의 컴퓨터)

![복잡한 네트워크](images/%EB%B3%B5%EC%9E%A1%ED%95%9C%20%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC.png)

<br>

이러한 문제를 해결하기 위해 네트워크의 각 컴퓨터는 **라우터**라고하는 특수한 소형 컴퓨터에 연결된다<br>
컴퓨터가 10대일 경우 라우터를 시스템에 추가하게되면 10개의 캐이블만 필요하다
![라우터](images/%EB%9D%BC%EC%9A%B0%ED%84%B0.png)
<br><br>

## 인터넷 작동방식
개략적으로 인터넷은 표준화된 프로토콜 세트를 사용하여 장치들과 컴퓨터 시스템을 함께 연결한다
이러한 프로토콜은 장치 간 정보 교환 방법을 정희하고 데이터가 안정적이고 안전하게 전송되도록 보장해준다<br>
인터넷의 핵심으로 서로 연결된 라우터의 전세계적인 네트워크이다<br>
인터넷을 통해 데이터를 전송하면 장치에서 라우터로 전송되는 작은 패킷으로 나눠진다<br>
라우터는 패킷을 검사하여 대상 경로의 다음 라우터로 전달하고 이것은 최종 목적지에 도착할때까지 계속된다

<br>

패킷이 올바르게 송수신되기 위해 인터넷은 Internet Protocol(IP)와 Transmission Control Protocol(TCP)를 포함한 다양한 프로토콜을 사용한다<br>
IP는 패킷을 올바른 대상으로 라우팅하는 역할을하고<br>
TCP는 패킷이 신뢰할 수 있고 올바른 순서로 전송되도록 보장한다

<br>

## 기본 개념 용어
- 패킷: 인터넷을 통해 전송되는 데이터의 작은 단위
- 라우터: 서로 다른 네트워크 간에 데이터 패킷을 전달하는 장치
- IP 주소: 네트워크의 각 장치에 할당된 고유 식별자, 데이터를 올바른 대상으로 라우팅하는데 사용됨
- 도메인 이름: google.com과 같이 웹 사이트를 식별하는데 사용되는 사용자 이름
- DNS(Domain Name System): 도메인 이름을 IP 주소로 변환하는 역할
- HTTP(Hypertext Transfer Protocol): 클라이언트(웹 브라우저)와 서버(웹 사이트)간에 데이터를 전송하는데 사용됨
- HTTPS: HTTP의 암호화된 버전으로 클라이언트와 서버 간의 보안 통신을 제공하는데 사용됨
- SSL(Secure Sockets Layer)/TLS(Transport Layer Security): 인터넷을 통한 보안 통신을 제공함

<br>

## 인터넷에서 프로토콜의 역할
프로토콜은 인터넷을 통한 통신 및 데이터 교환을 가능하게 하는 중요한 역할을 한다<br>
프로토콜은 장치와 시스템 간에 정보가 교환되는 방법을 정의하는 일련의 규칙 및 표준

<br>

인터넷 통신에는 다양한 프로토콜이 사용된다
- IP(Internet Protocol)
- TCP(Transmission Control Protocol)
- UDP(User Datagram Protocol)
- DNS(Domain Name System)
- 등등

<br>

표준화된 프로토콜을 사용함으로써 얻을 수 있는 이점은 서로다른 manufacturers와 vendors의 장치와 시스템이 균일, 원활하게 통신할 수 있다는 점이 있다<br>
예를 들어 A회사, B회사 둘 다 HTTP 프로토콜을 준수하는 한 A 회사가 개발한 웹 브라우저는 B 회사가 개발한 웹 서버와 통신할 수 있다

<br>

## IP 주소와 Domain Name의 이해
IP 주소는 네트워크의 각 장치에 할당된 고유 식별자이다<br>
IP 주소는 올바른 목적지로 라우팅하여 정보가 의도된 수신자에게 전송되도록 하는데 사용된다<br>
IP 주소는 `192.168.1.1`와 같이 마침표로 구분된 4개의 일련의 숫자로 표현된다

<br>

Domain Name은 사람이 읽을 수 있고 웹 사이트 및 인터넷 정보를 읽을 수 있는 이름이다<br>
예를 들어 `google.com`은 Domain Name이다<br>
Domain Name은 **DNS**(Domain Name System)을 사용하여 IP주소로 변경된다

<br>

DNS는 Domain Name을 IP 주소로 변환하는 인터넷의 중요한 infrastructure(인프라)이다<br>
웹 브라우저에 Domain Name을 입력하면 컴퓨터가 DNS 서버로 DNS query(쿼리)를 보내 해당 IP 주소를 반환한다<br>
그런 다음 컴퓨터는 해당 IP 주소를 사용하여 요청한 웹사이트 또는 기타 리소스에 연결한다

<br>

## HTTP와 HTTPS
HTTP(Hypertext Transfer Protocol)와 HTTPS (HTTP Secure)는 인터넷 기반 응용 프로그램 및 서비스에서 가장 일반적으로 사용되는 프로토콜이다

<br>

HTTP는 클라이언트(웹 브라우저)와 서버(웹 사이트)간에 데이터를 전송하는데 사용되는 프로토콜이다<br>
웹 사이트를 방문하면 웹 브라우저가 서버에 HTTP 요청을 보내어 요청한 웹 페이지 또는 기타 리소스를 요청한다<br>
그런 다음 서버는 요청된 데이터를 포함하는 HTTP 응답을 클라이언트로 다시 보낸다

<br>

HTTPS는 HTTP의 보다 안전한 버전으로 SSL/TLS 암호화를 사용하여 클라이언트와 서버 건에 전송되는 데이터를 암호화한다<br>
이렇게 하면 로그인 자격 증명, 결제 정보 및 기타 테이터와 같은 중요한 정보를 보호하는데 도움이 되는 (additional layer of security)추가 보안 계층이 제공된다<br>
HTTPS를 사용하는 웹 사이트를 방문하면 웹 브라우저에 연결이 안전함을 나타내는 자물쇠 아이콘이 주소 표시줄에 표시된다<br>
또한 웹 사이트의 시작 부분에 `http`가 아닌 `https`라는 문자가 표시될 수도 있다
<br>
![HTTPS](images/HTTPS.png)

<br>

## TCP/IP를 사용한 애플리케이션 구축
TCP/IP (Transmission Control Protocol/Internet Protocol)는 근본적인 통신 프로토콜로 대부분의 인터넷 기반 응용 프로그램과 서비스에서 사용된다<br>
TCP/IP는 서로 다른 장치에서 실행 중인 응용 프로그램 간에 안정적이고 순서가 지정되고 오류가 확인된 데이터 전송을 제공한다

<br>

### TCP/IP를 사용하여 애플리케이션을 구축할 때 이해해야할 몇 가지 중요한 개념
- Ports(포트): 장치에서 실행 중인 응용 프로그램 또는 서비스를 식별하는데 사용된다. 각 애플리케이션, 서비스에는 고유한 포트 번호가 할당되어 데이터를 올바른 대상으로 전송할 수 있다
- Sockets(소켓): IP 주소와 포트 번호의 조합으로, 통신을 위한 특정 endpoint를 나타낸다. 소켓은 장치 간 연결을 설정하고 응용 프로그램 간에 데이터를 전송하는데 사용된다
- Connections: 두 장치가 서로 통신하기를 원할 때 두 소켓 사이에 연결이 설정된다. 연결 설정 프로세스 동안 장치는 최대 segment(세그먼트) 크기 및 window size(창 크기)와 같은 다양한 parameters(매개 변수)를 협상하여 연결을 통해 데이터가 전송되는 방법을 결정한다
- Data Transfer: 한 번 연결이 설정되면 각 장치에서 응용 프로그램 간에 데이터를 전송할 수 있다. 데이터는 일반적으로 segments(세그먼트)로 전송되며, 각 세그먼트에는 안정적인 전송을 보장하기 위해 시퀀스 번호와 기타 메타데이터가 포함되어 있다

<br>

## SSL/TLS를 사용한 인터넷 통신 보안
SSL/TLS은 인터넷을 통해 전송되는 데이터를 암호화하는 데 사용되는 프로토콜이다<br>
일반적으로 웹 브라우저, 전자 메일 클라이언트 및 파일 전송 프로그램과 같은 응용 프로그램에 대한 보안 연결을 제공하는 데 사용된다

<br>

### SSL/TLS를 사용하여 인터넷 통신을 보호할 때 이해해야 할 몇 가지 주요 개념
- Certificates(인증서): 클라이언트와 서버 간의 신뢰를 설정하는데 사용된다. 서버 ID에 대한 정보가 포함되어 있으며 신뢰할 수 있는 third party가 서명하여 신뢰성을 확인한다
- Handshake: SSL/TLS handshake 프로세스 중에 클라이언트와 서버는 보안 연결을 위한 암호화 알고리즘 및 기타 매개 변수를 협상하기 위해 정보를 교환한다
- Encryption(암호화): 보안 연결이 설정되면 합의된 알고리즘을 사용하여 데이터를 암호화하고 클라이언트와 서버 간에 안전하게 전송할 수 있다

<br>

인터넷 기반 응용프로그램 및 서비스를 구축할 때는 SSL/TLS의 작동 방식을 이해하고<br>
로그인 자격 증명, 결제 정보 및 기타 개인 데이터와 같은 중요한 데이터를 전송할 때 응용프로그램이 SSL/TLS를 사용하도록 설계되었는지 확인하는 것이 중요하다<br>

서버에 대해 유효한 SSL/TLS 인증서를 가져오고 유지 관리해야 하며, SSL/TLS 연결을 구성하고 보안하는 모범 사례를 따라야 한다<br>
이렇게 하면 사용자의 데이터를 보호하고 인터넷을 통한 응용프로그램 통신의 integrity(무결성)과 confidentiality(기밀성)을 보장할 수 있다

<br>

[인터넷은 어떻게 동작하는가?](https://developer.mozilla.org/ko/docs/Learn/Common_questions/Web_mechanics/How_does_the_Internet_work)

[How does the Internet Work?](https://cs.fyi/guide/how-does-internet-work)

[The Internet Explained](https://www.vox.com/2014/6/16/18076282/the-internet)

[How Does the Internet Work?](http://web.stanford.edu/class/msande91si/www-spr04/readings/week1/InternetWhitepaper.htm)

[Introduction to Internet](https://roadmap.sh/guides/what-is-internet)

[How does the Internet work?](https://www.youtube.com/watch?v=x3c1ih2NJEg)

[5분 인터넷 요약 동영상](https://www.youtube.com/watch?v=7_LPdttKXPc)

[How does the internet work? (Full Course)](https://www.youtube.com/watch?v=zN8YNNHcaZc)