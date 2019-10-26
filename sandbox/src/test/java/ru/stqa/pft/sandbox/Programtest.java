package ru.stqa.pft.sandbox;

import org.junit.Before;
import org.junit.Test;

public class Programtest {
  public Square obj;

  @Before
  public void init() {
    obj = new Square(9);
  }

  @Test
  public void tets() {
    System.out.println("Площадь квадрата со стороной " + obj.l + " = " + obj.area());
  }
}
