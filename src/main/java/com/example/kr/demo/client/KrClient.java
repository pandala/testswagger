package com.example.kr.demo.client;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import com.example.kr.demo.resp.AuthorizedData;
import com.example.kr.demo.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.huobi.crypto.http.HttpApi;
import com.huobi.crypto.http.HttpClient;

/**
 * 韩国站客户端.
 */
public class KrClient {

  @Autowired
  private HttpClient httpClient;

  @Value("${huobi.kr.url: https://testapi.open-platform.or.kr}")
  private String url;

  @Value("${huobi.kr.callback.url: http://localhost:8083/openapi/test/callback}")
  private String callbackUrl;

  @Value("${huobi.kr.client-id: l7xx57ce8395cf694c0a9958f7164a9fe127}")
  private String clientId;

  @Value("${huobi.kr.client-secret: ec6bf4edd1d3474089e0c00ca4b13b69}")
  private String clientSecret;

  private HttpApi<AuthorizedData> authorizeApi;

  @PostConstruct
  private void init() {
    HttpApi.Builder<String> httpApiBuilder = httpClient.apiBuilder(JsonUtil.objectMapper);

    authorizeApi = httpApiBuilder.response(AuthorizedData.class).build(url + "/oauth/2.0/authorize");
  }

  public AuthorizedData authorize(String clientInfo, String scope) {

    Map<String, Object> paramMap = new HashMap<>();
    paramMap.put("response_type", "code");
    paramMap.put("client_id", clientId);
    paramMap.put("redirect_uri", callbackUrl);
    paramMap.put("scope", scope);
    paramMap.put("client_info", clientInfo);

    AuthorizedData authorizedData = authorizeApi.doGet(paramMap);

    return authorizedData;
  }



}
