package spboot.spbootpractice.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name", required = false) String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-api")
    @ResponseBody // JSON 타입으로 데이터를 만들어서 HTTP Body에 바로 넣겠다는 어노테이션
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }
    static class Hello{ // Java Bean 규칙 
        private String name; // private으로 변수 자체에 직접 접근 불가
        public String getName(){ // 이런 식으로 메서드를 통해서 객체에 접근하게 함
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }
}
