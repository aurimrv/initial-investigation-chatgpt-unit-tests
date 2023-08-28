package tests;
import junit.framework.*;
import junit.textui.*;

public class GeneratedTest_Crash_1686701006411_ extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public GeneratedTest_Crash_1686701006411_(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(GeneratedTest_Crash_1686701006411_0.class));
    return result;
  }

}
