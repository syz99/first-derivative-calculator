package FirstDerivative;
import java.util.*;
// import javax.swing.*;

/**
 * First Derivative calculator
 * @author Sam
 * To-Do:
 * - Add swing components (UI/UX)
 * - Second/Third/Fourth/etc. derivative functionality?
 * - think PEMDAS for detectComponenents (i.e. prioritize parentheses and split first)
 */

public class FirstDerivative {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Welcome to the Derivator!\nSymbols Bank: *, /, +, -, ^(), e^(), sin()/arcsin(), ln(), log(), ! \nLack of spaces does not always imply multiplication\nFormat your input as simplified as possible (i.e. Don't: 5*x*2, Do: 10*x\n\nEnter an equation to derive: f(x) = ");
		String fcn = in.nextLine();
		// derive(fcn);
		System.out.println(powerRule(fcn));
	}
	
	/**
	 * Various methods covering derivative rules
	 * @param gx
	 * @return component derivatives
	 */
	public static String constantX(String gx) {
		gx = gx.replaceAll("\\s+", ""); // remove all whitespaces
		if (gx.contains("*"))
			if (gx.indexOf("*x") > 0)
				return gx.substring(0, gx.toLowerCase().indexOf("*x"));
		else if (gx.indexOf("x") > 0)
			return gx.substring(0, gx.toLowerCase().indexOf("x"));
		else if (!gx.contains("x"))
			return "0";
		return "1";
	}
	public static String powerRule(String x2the) { 
		x2the = x2the.replaceAll("\\s+", "");
		int intPower = Integer.parseInt(x2the.substring(x2the.indexOf("x^(") + 3, x2the.length()));
		int newPower = intPower - 1;
		if (x2the.contains("x)")) {
			
		} 
		return Integer.toString(intPower) + "x^(" + Integer.toString(newPower) + ")";
	}
	public static String exponentRule(String eX) {
		return constantX(eX.substring(eX.indexOf("e^") + 2, eX.length()))/*+ derive(eX.substring(eX.indexOf("e^") + 2, eX.length()));*/ + eX;
	}
	
	
	/**
	 * Method will split string f into various strings
	 * @param f
	 */
	public static void detectComponents(String f) {
		
	}
	
	public static String derive(String f) {
		String dydx = "";
		detectComponents(f);
		return dydx;
	}
	/**
	 * Progress Log:
	 * 9/12: established class; declared detectComponents() and derive(); wrote constantX(), powerRule()
	 */
}