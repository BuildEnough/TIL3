# 자바개발도구 (JDK8) 설치

**[for MAC] SDKMAN을 이용하여 openJDK 설치**
<br>

```
$ curl -s "https://get.sdkman.io" | bash  
$ source "$HOME/.sdkman/bin/sdkman-init.sh"    
```
<br>

**SDKMAN 명령어**
```
$ sdk version  <--- sdkman 버전출력  
$ sdk list java  <-- 설치 가능 & 설치된 JDK목록  
$ sdk install java 8.0.292-zulu <--- 지정된 JDK설치(원하는 종류와 버전 지정)  
$ sdk default java 8.0.292-zulu <--- 사용할 java버전을 변경(모든 쉘에 적용)
$ sdk use java 8.0.292-zulu <--- 사용할 java버전을 변경(현재 쉘에만 적용)  
$ sdk current java <--- 현재 사용중인 java버전 출력  
$ echo $JAVA_HOME  <--- JAVA_HOME으로 지정된 경로 출력
```
<br>

**eclipse 설치**
<br>
[Mac] https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2019-09/R/eclipse-java-2019-09-R-macosx-cocoa-x86_64.dmg&mirror_id=1273
