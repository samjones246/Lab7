/**
 * Class to hold the main function of this program, which instantiates the TestCalculator class and calls its methods.
 */
public class Main {

	public static void main(String[] args) {
		TestCalculator myTester = new TestCalculator();
		boolean testParser = myTester.testParser();
		boolean testAdd = myTester.testAdd();
		boolean testMultiplication = myTester.testMultiplication();
		if(testParser && testAdd && testMultiplication) {
			System.out.println("Congratulations, your Calculator appears to be working.");
		}
	}

}
