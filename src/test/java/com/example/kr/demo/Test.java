package com.example.kr.demo;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by yangguobiao on 2017/11/20.
 */
public class Test {

  public static void main(String[] args) {
    LocalDate firstDayOfMonth = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
    System.out.println(firstDayOfMonth);


    LocalDate today = LocalDate.now();
    System.out.println(today);

  }
}
