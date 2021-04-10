package templateMethod;

import templateMethod.concreateDisplay.CharDisplay;
import templateMethod.concreateDisplay.StringDisplay;
import templateMethod.templates.AbstractDisplay;

public class Main {
	public static void main(String[] args) {
		AbstractDisplay c = new CharDisplay('C');
		AbstractDisplay helloWorld = new StringDisplay("hello world");
		AbstractDisplay goodNight = new StringDisplay("good night");

		c.display();
		helloWorld.display();
		goodNight.display();
	}
}
