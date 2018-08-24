package noobsAcademy.printthepattern;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName
     *            name of the test case
     */
    public AppTest(String testName) {
	super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
	return new TestSuite(AppTest.class);
    }

    public void testExample() {
	int input = 2;
	assertEquals("2 2 1 1 $2 1 $", GfG.getPat(input));
    }

    public void testExample1() {
	int input = 1;
	assertEquals("1 $", GfG.getPat(input));
    }

    public void testPerformance() {
	int input = 40;
	double startTime = System.nanoTime();
	GfG.getPat(input);
	double estimatedTime = (System.nanoTime() - startTime) / 1000000;
	assertTrue("Time limit exceed", estimatedTime < 50);
    }
}
