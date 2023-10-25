package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SyHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello What are learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<HTML>" +
                "<head>" +
                "<title>" +
                "My first HTML Page</title>" +
                "<h1>My first html page with body</h1>" +
                "</body>" +
                "</html>");
        return sb.toString();
    }
}
