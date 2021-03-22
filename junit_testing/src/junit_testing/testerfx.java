package junit_testing;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class testerfx {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(fix_xy_test.class);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
}  	