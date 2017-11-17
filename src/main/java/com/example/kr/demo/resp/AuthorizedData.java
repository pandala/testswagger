package com.example.kr.demo.resp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthorizedData {
  @JsonProperty("code")
  private String code;

  @JsonProperty("scope")
  private String scope;

  @JsonProperty("client_info")
  private String clientInfo;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public String getClientInfo() {
    return clientInfo;
  }

  public void setClientInfo(String clientInfo) {
    this.clientInfo = clientInfo;
  }
}
