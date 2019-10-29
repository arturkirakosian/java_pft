package ru.stqa.pft.sandbox;

import org.junit.Assert;
import org.junit.Test;

public class EquationTests {

  @Test
  public void test0() {
    Equation e = new Equation(1, 1, 1);
    Assert.assertEquals(e.rootNumber(), 0);
  }

  @Test
  public void test1() {
    Equation e = new Equation(1, 1, 1);
    Assert.assertEquals(e.rootNumber(), 1);

  }

  @Test
  public void test3() {
    Equation e = new Equation(1, 1, 1);
    Assert.assertEquals(e.rootNumber(), 2;

  }
}
