package swirlythingy;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class swirler {

	public static void main(String[] args) throws Exception { 
		
		Robot r = new Robot(); 

		char[] code = {'1', '2', '3'}; //put code in here letter by letter
		int sleeplength = 30; //change this for time in seconds between repetitions

		while (true) {

			Thread.sleep(sleeplength * 1000);

			presslocation(r, 100, 100);

			presscode(r, code);
			
			presslocation (r, 200, 200);

		}

	}
	
	public static void presslocation(Robot r, int x, int y) throws Exception {
		
		Thread.sleep(100);
		
		for (int focus = 0; focus < 8; focus++) {
			r.mouseMove(x, y);
			Thread.sleep(25);
		}
		
		Thread.sleep(500);
		
		r.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(100);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(100);
		
	}
	
	public static void presskey(Robot r, char c) throws Exception {
		
		r.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
		Thread.sleep(100);
		r.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
		Thread.sleep(100);
		
	}
	
	public static void presscode(Robot r, char[] charss) throws Exception {
		
		for (int i = 0; i < charss.length; i++) {
			
			presskey(r, charss[i]);
			
		}
		
	}

}