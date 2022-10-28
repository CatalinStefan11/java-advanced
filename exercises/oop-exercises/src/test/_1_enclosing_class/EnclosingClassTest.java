package _1_enclosing_class;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnclosingClassTest {
  
  @Test
  public void testEnclosedClassIncrementCounter() {
  
    EnclosingClass instance = new EnclosingClass();
  
    EnclosingClass.EnclosedClass innerInstance
        = instance.new EnclosedClass();
  
    innerInstance.incrementCounter();
  
    int expected = 1;
    int actual = instance.getCounter();
  
    assertEquals(expected, actual);
  }
  
}