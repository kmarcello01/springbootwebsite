package com.mk.mk_blog.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controler {
  @GetMapping("/index")
  public String index(){
    return "index";
  }
  @GetMapping("/about")
  public String about(){
    return "about";
  }
  @GetMapping("/service")
  public String service(){
    return "service";
  }
  @GetMapping("/contact")
  public String contact(){
    return "contact";
  }
  @GetMapping("/gallery")
  public String gallery(){
    return "gallery";
  }
  @GetMapping("/other")
  public String other(){
    return "other";
  }

}
