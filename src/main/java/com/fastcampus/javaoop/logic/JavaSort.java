package com.fastcampus.javaoop.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSort <T extends Comparable<T>> implements Sort<T> {
  @Override
  public List<T> sort(List<T> list) {
    List<T> output = new ArrayList<>(list); // 변하지 않는 값으로...
    Collections.sort(output);

    return output;
  }
}
