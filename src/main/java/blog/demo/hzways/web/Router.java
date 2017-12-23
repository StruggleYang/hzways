package blog.demo.hzways.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Router {

    @GetMapping("")
    public String Roots(){
        return "index";
    }

    @GetMapping("/about")
    public String About(){
        return "about";
    }

    @GetMapping("/blog")
    public String Blog(){
        return "blog";
    }

    @GetMapping("/contact")
    public String Contact(){
        return "contact";
    }

    @GetMapping("/portfolio")
    public String Portfolio(){
        return "portfolio";
    }
}
