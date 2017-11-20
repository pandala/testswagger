package com.example.kr.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/openapi/test")
@Api("韩国站回调测试")
public class CallbackController {

  @ApiOperation("回调")
  @GetMapping("/callback")
  public Object authorize(@RequestParam("code") String code, @RequestParam("scope") String scope, @RequestParam("client_info") String clientInfo) {
    System.out.println(code);
    return "code";
  }
}
