package test.java;

import main.java.TravisMath;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestTravisMath {


   @Test
   public void testAdd() {
      int res = TravisMath.add(1, 1);
      assertEquals(res, 2);
   }

   @Test
   public void testSubtract() {
      int res = TravisMath.subtract(1, 1);
      assertEquals(res, 0);
   }
}
