#### 20.11.09

> 스프링 웹 개발 기초
- 정적 컨텐츠
    - 웹 브라우저에서 요청을 보내면 가장 먼저 내장 톰캣 서버가 그 요청을 받는다.
    - 이 요청을 스프링부트에게 전달을 하고 스프링 컨테이너에서 Controller가 있는지 찾는다.
    - 컨트롤러가 없다면 내부에 있는 static 폴더 밑에서 정적 컨텐츠를 찾고, 리턴한다.
    
    
> MVC와 템플릿 엔진
- MVC : Model, View, Controller
    - Controller 메서드에 매핑이 되어있으면 viewResolver로 보낸 뒤, 템플릿 엔진이 html로 변환하여 리턴한다.
     

> API
- `@ResponseBody`를 사용하면 `viewResolver`를 사용하지 않고 객체를 반환하기 때문에 `HttpMessageConverter`가 동작한다.
- view 없이 HTTP Response에 JSON 형태로 넣어서 바로 반환해준다. 
    - 이 때 사용하는 라이브러리가 `Jackson`이다. 스프링부트에서는 `Jackson`이 기본이며 `gson`도 있다. 