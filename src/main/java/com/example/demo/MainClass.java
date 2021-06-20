package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainClass {

    @GetMapping("/test1")
    public void test1(){
        System.out.println(":asdfasdf");
    }

    @GetMapping("/test2")
    public void test2(){

    }
    
    @GetMapping("/test3")
    public void test3(){

    }
    @GetMapping("/test4")
    public void test4(){

    }
    
    
    @GetMapping("/test5")
    public void test5(){

    }
    
    @GetMapping("/test6")
    public void test6(){

    }

    @GetMapping("/test7")
    public void test7(){

    }

    @GetMapping("/test8")
    public void test8(){

    }

    @GetMapping("/test9")
    public void test9(){

    }
    @GetMapping("/test10")
    public void test10(){

    }

    @GetMapping("/dev/feature/test1")
    public void devfeaturetest1(){

    }


}
