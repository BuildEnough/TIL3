# 브라우저, 그리고 동작 방식

<br>

## 브라우저 작동 방법
주로 사용되는 브라우저는 `Chrome`, `Microsoft Edge`, `Firefox`, `Safari`, `Opera`<br>

모바일에서 주로 사용되는 브라우저는 `Android Browser`, `IPhone`, `Opera Mini`, `Opera Mobile`, `UC Browser`, `the Nokia S40/S60 browsers`, `Chrome`이 있다<br>
`Opera browsers`를 제외한 모든 브라우저가 Webkit에 기반을 두고 있다

<br>

## 브라우저의 주요 기능
브라우저의 주요 기능은 선택한 웹 resource를 서버에 요청하여 브라우저 창에 표시하는 것이다<br>
resource는 일반적으로 HTML 문서이지만, PDF, Image 또는 일부 다른 유형의 내용일 수도 있다<br>
resource의 위치는 사용자가 URI(Uniform Resource Identifier)를 사용하여 지정한다

<br>

브라우저가 HTML 파일을 해석하고 표시하는 방식은 HTML과 CSS의 설계에 명시되어 있다<br>
이 규격들은 웹 표준 기구인 W3C(World Wide Web Consortium) 기구에 의해 유지된다<br>
수년 동안 브라우저는 사양의 일부만 준수하고 **자체 확장 기능**을 개발했다<br>
이로 인해 웹 작성자에게 심각한 호환성 문제가 발생하게되었다<br>
오늘날의 대부분의 브라우저는 사양에 어느정도 준수한다

<br>

## 브라우저의 상위 수준 구조
- User interface<br>
주소 표시줄, 뒤로/앞으로 버튼, 홈 버튼, 북마크 메뉴 등이 포함됩니다. 요청한 페이지가 표시되는 창을 제외한 브라우저 디스플레이의 모든 부분<br>
웹 페이지에서 사용할 수 있는 모든 시각적 요소와 상호 작용할 수 있다

- Browser engine<br>
모든 웹 브라우저의 핵심 구성요소<br>
브라우저 엔진은 사용자 인터페이스와 Rendering engine 사이의 다리 역할을 한다<br>
사용자 인터페이스에서 받은 입력에 따라 Rendering engine을 query하고 처리한다
UI와 렌더링 엔진 간의 작업을 [마셜링](https://ko.wikipedia.org/wiki/%EB%A7%88%EC%83%AC%EB%A7%81_(%EC%BB%B4%ED%93%A8%ED%84%B0_%EA%B3%BC%ED%95%99))한다<br>
(marshal: 한 객체의 메모리에서 표현방식을 저장 또는 전송에 적합한 다른 데이터 형식으로 변환하는 과정)

- Rendering engine<br>
사용자가 요청한 특정 웹 페이지를 화면에 렌더링하는 역할을 한다<br>
CSS를 사용하여 스타일이 지정되거나 형식이 지정된 이미지와 함께 HTML 및 XML 문서를 해석하고 사용자 인터페이스에 표시되는 최종 레이아웃이 생성된다<br>
요청된 콘텐츠 표시를 담당하고 요청한 콘텐츠가 HTML인 경우 렌더링 엔진은 HTML과 CSS 구분 분석하고 구문 분석된 콘텐츠를 화면에 표시한다

- Networking<br>
HTTP 요청과 같은 네트워크 호출의 경우, 플랫폼-독립적인 인터페이스 뒤에서, 서로 다른 플랫폼에 대해 서로 다른 구현을 사용한다<br>
HTTP 또는 FTP와 같은 표준 프로토콜을 사용하여 네트워크 호출을 관리하고 인터넷 통신과 관련된 보안 문제도 처리한다

- UI backend<br>
기본 운영 체제의 사용자 인터페이스 메서드를 사용한다<br>
combo boxes나 창과 같은 기본 위젯을 그리는데 사용된다

- JavaScript interpreter<br>
JavaScript 코드를 분석하고 실행하는데 사용된다<br>
해석된 결과가 생성되면 사용자 인터페이스에 표시하기 위해 렌더링 엔진으로 전달된다

- Data storage<br>
Persistence Layer(지속성 Layer)이다<br>
브라우저는 쿠키와 같은 모든 종류의 데이터를 로컬에 저장해야 할 수 있다<br>
브라우저는 `localStorage`, `IndexedDB`, `WebSQL`, `FileSystem`과 같은 스토리지 메커니즘도 지원한다

<br>

![브라우저 구성 요소](images/%EB%B8%8C%EB%9D%BC%EC%9A%B0%EC%A0%80%20%EA%B5%AC%EC%84%B1%20%EC%9A%94%EC%86%8C.png)

<br>

## 렌더링 엔진의 역할
![렌더링 엔진의 기본적인 역할](images/%EB%A0%8C%EB%8D%94%EB%A7%81%20%EC%97%94%EC%A7%84%EC%9D%98%20%EA%B8%B0%EB%B3%B8%EC%A0%81%EC%9D%B8%20%EC%97%AD%ED%95%A0.png)
<br>

1. 요청된 HTML 페이지는 렌더링 엔진에 의해 외부 CSS 파일 및 스타일 요소를 포함하여 chunk 단위로 구문 분석된다<br>
그런 다음 HTML 요소는 DOM 노드로 변환되어 `콘텐츠 트리` 또는 `DOM 트리`를 형성한다

<br>

2. 동시에 브라우저는 **render tree**도 생성한다<br>
**render tree**에는 스타일 정보와 요소가 표시되는 순서를 정의하는 시각적 지침이 모두 포함된다<br>
**render tree**는 콘텐츠가 원하는 순서로 표시되도록 한다

<br>

3. render tree는 레이아웃 프로세스를 거친다<br>
렌더 트리가 생성되면 위치 또는 크기 값이 할당되지 않는다<br>
원하는 위치를 평가하기 위한 값을 계산하는 전체 프로세스를 레이아웃 프로세스라고 하고 이 과정에서 모든 노드에는 정확한 좌표가 할당된다<br>
이렇게 하면 모든 노드가 화면의 정확한 위치에 나타나게 된다

<br>

4. 화면을 그린다<br>
render tree를 순회하고 renderer의 paint() 메서드가 호출되어 UI 백엔드 레이어를 사용하여 화면의 각 노드를 그린다

<br>

## 생각 정리
브라우저의 핵심은 사용자가 참조하고자 하는 웹페이지를 서버에 요청하고 서버의 응답을 받아 브라우저에 표시하는 것<br>
브라우저는 서버로부터 HTML, CSS, JavaScript, image 파일 등을 응답받는다<br>
HTML, CSS 파일은 Rendering engine의 HTML parser와 CSS parser에 의해 Parsing되어 DOM, CSSOM 트리로 변환되고 render tree로 결합된다<br>
생성된 render tree를 기반으로 브라우저는 웹페이지를 표시한다

<br>

[브라우저는 어떻게 동작하는가?](https://d2.naver.com/helloworld/59361)

[How browsers work](https://web.dev/howbrowserswork/)

[Understanding the Role of Rendering Engine in Browsers](https://www.browserstack.com/guide/browser-rendering-engine)

[How browsers work](https://developer.mozilla.org/en-US/docs/Web/Performance/How_browsers_work)