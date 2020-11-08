#### 20.11.02

- gradlew 파일을 실행하면 `build/libs` 에 jar파일이 만들어진다.
  - 혹시 문제가 생기는 경우 `./gradlew clean build` 을 해준다.  
- 이 jar 파일을 cmd에서 실행해도 서버가 켜진다.
- 배포 할 때는 이 jar 파일 하나만 배포해도 된다.