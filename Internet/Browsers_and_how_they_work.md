# 인터넷은 어떻게 동작하는가?

## 인터넷이란
컴퓨터들이 서로 통신 가능한 네트워크<br><br>
[5분 인터넷 요약 동영상](https://www.youtube.com/watch?v=7_LPdttKXPc) <br><br>
현재 인터넷은 생활의 필수적인 부분으로 개발자로서 인터넷이 어떻게 작동하는지와 인터넷을 뒷바침하는 다양한 기술과 프로토콜에 대한 이해가 필요하다


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

