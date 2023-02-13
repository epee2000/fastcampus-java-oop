package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.BubbleSort;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    BubbleSort<String> sort = new BubbleSort<>();

    System.out.println("[result] " + sort.sort(Arrays.asList(args)));

  }
}
