package com.example.kr.demo.client;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import com.huobi.crypto.http.HttpApi;

public class HttpExtendApi<T> extends HttpApi<T> {

  public HttpExtendApi(HttpUrl url, OkHttpClient client, ObjectMapper mapper, Converter<T> converter) {
    super(url, client, mapper, converter);
  }

  public T doGet(Map<String, ?> params, Map<String, String> headerMap) {
    logger.debug("GET {}, params={}", url, params);

    HttpUrl url = buildRequestUrl("GET", params);

    Request request = buildRequest(url, null).headers(buildHeaders(headerMap)).get().build();
    return execute(request);
  }

  public T doPost(Object data, Map<String, String> headerMap) throws IOException {
    HttpUrl url = buildRequestUrl("POST", Collections.emptyMap());
    RequestBody body = buildRequestBody(data);

    Request request = buildRequest(url, body).headers(buildHeaders(headerMap)).post(body).build();
    return execute(request);
  }

  private Headers buildHeaders(Map<String, String> headerMap) {
    Headers.Builder builder = new Headers.Builder();
    if (headerMap == null || headerMap.isEmpty()) {
      return builder.build();
    }
    for (String key : headerMap.keySet()) {
      builder.add(key, headerMap.get(key));
    }
    return builder.build();
  }


}
