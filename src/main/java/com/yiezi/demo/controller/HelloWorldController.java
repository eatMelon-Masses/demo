package com.yiezi.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yiezi
 * @date 2019-04-19
 */
@RestController
@RequestMapping("api/v1/demo")
public class HelloWorldController {
  @RequestMapping("/hello")
  public String helloWorld() {
    return "helloWorld";
  }
}
