package com.example.kr.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@Api("韩国站测试")
public class KftcController {

  @ApiOperation("测试hello")
  @RequestMapping("/hello")
  public String hello(@RequestParam("name") String name) {
    return name + " said: Hello World!";
  }
}
