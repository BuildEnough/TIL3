# HTTP란?
[HTTP](https://build-enough.tistory.com/6)(Hypertext Transfer Protocol)는 HTML과 같은 하이퍼미디어 문서를 전송하기 위한 애플리케이션 레이어 프로토콜이다<br>
웹 브라우저와 웹 서버간의 통신을 위해 설계되었지만 다른 목적으로도 사용할 수 있다<br>
즉, **HTTP는 HTML 문서와 같은 리소스들을 가져올 수 있도록 해주는 프로토콜이다**<br>

HTTP는 클라이언트가 요청을 하기 위해 연결을 연 다음 응답을 받을때 까지 대기하는 클라이언트-서버 모델을 따른다<br>
HTTP를 통한 일반적인 흐름은 클라이언트 시스템이 서버에 요청을 하고 응답 메시지를 보내는 것을 포함한다<br>
클라이언트-서버 프로토콜이란 (보통 웹브라우저인) 수신자 측에 의해 요청이 초기화되는 프로토콜을 의미한다<br>
HTTP는 클라이언트와 서버가 서로 통신하는 방법을 표준화하는 TCP/IP 기반 응용 프로그램 계층 통신 프로토콜로 이것을 정의하면 콘텐츠가 인터넷을 통해 요청되고 전송되는 방법을 정의한다<br>

클라이언트와 서버들은 (데이터 스트림과 대조적으로) 개별적인 메시지 교환에 의해 통신합니다. 보통 브라우저인 클라이언트에 의해 전송되는 메시지를 요청(requests)이라고 부르며, 그에 대해 서버에서 응답으로 전송되는 메시지를 응답(responses)이라고 부른다<br>

애플리케이션 계층 프로토콜은 hosts(클라이언트 및 서버)의 통신 방식을 표준화하는 추상화 계층에 불과하고 HTTP 자체는 클라이언트와 서버 간의 요청과 응답을 얻기 위해 TCP/IP에 의존한다<br>

![HTTP란](images/HTTP란.png)


<br>

## HTTP request?
HTTP 요청은 웹 브라우저와 같은 인터넷 통신 플랫폼이 웹 사이트를 로드하는데 필요한 정보를 요청하는 방식이다<br>
인터넷을 통해 만들어진 각각의 HTTP 요청은 서로 다른 유형의 정보를 전달하는 일련의 인코딩된 데이터를 가지고 있다

<br>

## HTTP method?
HTTP 메서드에서 HTTP 요청이 쿼리된 서버에서 예상하는 작업을 나타낸다<br>
가장 일반적인 HTTP의 두 가지 메서드는 `GET`과 `POST` 방식이다<br>
GET 요청은 반환되는 정보(일반적으로 웹 사이트 형식)를, POST 요청은 클라이언트가 웹 서비에 정보(제출된 사용자 이름 및 암호)를 제출하고 있음을 나타낸다

<br>

## HTTP 기반 시스템의 구성요소?
HTTP는 클라이언트-서버 프로토콜이다<br>
요청은 하나의 개체, 사용자 agent(또는 proxy)에 의해 전송된다<br>

각각의 개별적인 요청은 서버로 보내지며, 서버는 요청을 처리하고 response라고 불리는 응답을 제공한다
요청과 응답 사이에 여러 개체들이 있는데, 다양한 작업을 수행하는 gateway 또는 캐시 역할을하는 proxy 등이 있다<br>

![HTTP 기반 시스템의 구성요소](images/HTTP%20%EA%B5%AC%EC%84%B1%EC%9A%94%EC%86%8C.png)

<br>

## HTTP의 기본적인 특징
### HTTP는 간단하다
HTTP는 사람이 읽을 수 있으며 간단하게 고안되었다<br>
HTTP 메시지들은 사람이 읽고 이해할 수 있어, 개발자에게 더 쉬운 테스트를 제공하고 새로운 사람에게는 복잡성을 줄여준다

<br>

### HTTP는 extensible하다
HTTP/1.0에서 소개된, HTTP 헤더는 HTTP를 확장하고 실험하기 쉽게 만들어주었다<br>
클라이언트와 서버가 새로운 헤더의 시맨틱에 대해 간단한 합의만 한다면, 언제든지 새로운 기능을 추가할 수 있다

<br>

### HTTP은 상태는 없지만 세션은 있다
HTTP는 상태를 저장하지 않는다(Stateless)<br>
동일한 연결 상에서 연속하여 전달된 두 개의 요청 사이에는 연결고리가 없ek<br>
하지만, HTTP의 핵심은 상태가 없는 것이지만 HTTP 쿠키는 상태가 있는 세션을 만들도록 해준다<br>
헤더 확장성을 사용하여, 동일한 컨텍스트 또는 동일한 상태를 공유하기 위해 각각의 요청들에 세션을 만들도록 HTTP 쿠키가 추가된다<br>

<br>

### HTTP 연결
**연결은 전송 계층에서 제어되므로 근본적으로 HTTP 영역 밖이다**<br>
HTTP는 연결될 수 있도록 하는 근본적인 전송 프로토콜을 요구하지 않습니다, 다만 그저 신뢰할 수 있거나 메시지 손실이 없는(최소한의 오류는 표시) 연결을 요구할 뿐이다<br>
인터넷 상의 가장 일반적인 두 개의 전송 프로토콜 중에서 TCP는 신뢰할 수 있으며 UDP는 그렇지 않다<br>
그러므로 HTTP는 연결이 필수는 아니지만 연결 기반인 TCP 표준에 의존한다

<br>

## HTTP 흐름
1. TCP 연결을 연다<br>
TCP 연결은 요청을 보내거나(혹은 여러 개의 요청) 응답을 받는데 사용된다<br>
클라이언트는 새 연결을 열거나, 기존 연결을 재사용하거나, 서버에 대한 여러 TCP 연결을 열 수 있다
2. HTTP 메시지를 전송합니다<br>
HTTP 메시지(HTTP/2 이전)는 사람이 읽을 수 있다<br>
HTTP/2에서는 이런 간단한 메시지가 프레임 속으로 캡슐화되어 직접 읽는게 불가능하지만 원칙은 동일하다<br>
    ```
    GET / HTTP/1.1
    Host: developer.mozilla.org
    Accept-Language: fr
    ```
3. 서버에 의해 전송된 응답을 읽어들인다<br>
    ```
    HTTP/1.1 200 OK
    Date: Sat, 09 Oct 2010 14:28:02 GMT
    Server: Apache
    Last-Modified: Tue, 01 Dec 2009 20:18:22 GMT
    ETag: "51142bc1-7449-479b075b2891b"
    Accept-Ranges: bytes
    Content-Length: 29769
    Content-Type: text/html

    <!DOCTYPE html... (here comes the 29769 bytes of the requested web page)
    ```
4. 연결을 닫거나 다른 요청들을 위해 재사용된다

<br>

## 정리
HTML은 하이퍼 텍스트를 마크업 하는 언어로 웹에서 자유롭게 오갈 수 있는 웹 문서를 만드는 언어이다

<br>

[An overview of HTTP](https://developer.mozilla.org/en-US/docs/Web/HTTP/Overview)<br>
[Everything you need to know about HTTP](https://cs.fyi/guide/http-in-depth)<br>
[What is HTTP?](https://www.cloudflare.com/en-gb/learning/ddos/glossary/hypertext-transfer-protocol-http/)<br>
[HTTP/3 From A To Z: Core Concepts](https://www.smashingmagazine.com/2021/08/http3-core-concepts-part1/)<br>
[Full HTTP Networking Course – Fetch and REST APIs in JavaScript](https://www.youtube.com/watch?v=2JYT5f2isg4)<br>
[HTTP/1 to HTTP/2 to HTTP/3](https://www.youtube.com/watch?v=a-sBfyiXysI)<br>
[HTTP Crash Course & Exploration
](https://www.youtube.com/watch?v=iYM2zFP3Zn0)<br>