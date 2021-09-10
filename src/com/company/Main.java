package com.company;

public class Main {

  //    We can get the documentation in intelliJ by cntrl + J in Mac Cntrl + q in windows
  public static void main(String[] args) {
    // write your code here
    System.out.println("Hello World");
    System.out.println("test ");

    StringBuilder sb = new StringBuilder();
    sb.append("Welcome")
        .append(" to")
        .append(" the world");
    String s = sb.toString();
    System.out.println(s);
  }
}
