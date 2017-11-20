package com.example.kr.demo.controller;

import com.example.kr.demo.client.KrClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@Api("韩国站测试")
public class KftcController {

  @Autowired
  private KrClient krClient;

  @ApiOperation("测试hello")
  @GetMapping("/hello")
  public String hello(@RequestParam("name") String name) {
    return name + " said: Hello World!";
  }

  @ApiOperation("认证")
  @GetMapping("/authorize")
  public Object authorize(@RequestParam("scope") String scope, @RequestParam("clientInfo") String clientInfo) {
    return krClient.authorize(scope, clientInfo);
  }

  @ApiOperation("余额")
  @GetMapping("/balance")
  public Object balance(@RequestParam("fintech_use_num") String fintechUseNum, @RequestParam("tran_dtime") String tranDtime) {
    return krClient.balance(fintechUseNum, tranDtime);
  }
}
