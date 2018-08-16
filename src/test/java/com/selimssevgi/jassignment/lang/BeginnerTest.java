package com.selimssevgi.jassignment.lang;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BeginnerTest {

  Beginner beginner = new Beginner();

  @Test
  public void findMaxNumber() {
    int[] singleElementArray = {5};
    Assertions.assertThat(beginner.findMaxNumber(singleElementArray)).isEqualTo(5);
    int[] multipleElements = {3, 46, 32, 64};
    Assertions.assertThat(beginner.findMaxNumber(multipleElements)).isEqualTo(64);
    int[] justNegativeElements = {-4, -20, -100};
    Assertions.assertThat(beginner.findMaxNumber(justNegativeElements)).isEqualTo(-4);
    Assertions.assertThat(beginner.findMaxNumber(new int[]{})).isEqualTo(0);
    Assertions.assertThat(beginner.findMaxNumber(null)).isEqualTo(0);
  }

  @Test
  public void findMinNumber() {
    int[] singleElementArray = {5};
    Assertions.assertThat(beginner.findMinNumber(singleElementArray)).isEqualTo(5);
    int[] multipleElements = {3, 46, 32, 64};
    Assertions.assertThat(beginner.findMinNumber(multipleElements)).isEqualTo(3);
    int[] justNegativeElements = {-4, -20, -100};
    Assertions.assertThat(beginner.findMinNumber(justNegativeElements)).isEqualTo(-100);
    Assertions.assertThat(beginner.findMinNumber(new int[]{})).isEqualTo(0);
    Assertions.assertThat(beginner.findMinNumber(null)).isEqualTo(0);
  }
}