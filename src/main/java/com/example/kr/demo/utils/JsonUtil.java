package com.example.kr.demo.utils;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonUtil {
  private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);

  public static final ObjectMapper objectMapper = createObjectMapper();

  static ObjectMapper createObjectMapper() {
    return createObjectMapper(PropertyNamingStrategy.KEBAB_CASE);
  }

  public static ObjectMapper createObjectMapperUsingKebabCase() {
    return createObjectMapper(PropertyNamingStrategy.KEBAB_CASE);
  }

  public static ObjectMapper createObjectMapperUsingLowerCamelCase() {
    return createObjectMapper(PropertyNamingStrategy.LOWER_CAMEL_CASE);
  }

  static ObjectMapper createObjectMapper(PropertyNamingStrategy strategy) {
    final ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(strategy);
    mapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
    // disabled features:
    mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    return mapper;
  }

  public static String writeValue(Object obj) {
    try {
      return objectMapper.writeValueAsString(obj);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  public static <T> T readValue(String str, Class<T> clazz) {
    try {
      return objectMapper.readValue(str, clazz);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static <T> T readValue(String str, TypeReference<T> typeReference) {
    try {
      return objectMapper.readValue(str, typeReference);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static Map<String, Object> toMap(Object object) {
    return objectMapper.convertValue(object, Map.class);
  }
}
