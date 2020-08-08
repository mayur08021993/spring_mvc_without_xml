package com.springxml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class RestApiController{
 
   @RequestMapping(method = RequestMethod.GET)
   public String printHello() {
      return "hello";
   }
 
 @RequestMapping("/ok")
  @RequestMapping(method = RequestMethod.GET)
   public String printOK() {
      return "OK";
   }
   
   @RequestMapping("/world")
  @RequestMapping(method = RequestMethod.GET)
   public String printHelloWorld() {
      return "hello world";
   }
}
