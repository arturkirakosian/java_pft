package ru.stqa.pft.sandbox;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    assertEquals (s.area(), 25.0);
  }
}
