/**
 * 
 */
package util;
/**
 * @author mintn
 *
 */
public class TableHelper {
	
	public static void printTableHeader(String column1a, String column1b, String column2a, String column2b) {
		
	
	System.out.printf("%10s  %10s    | %10s %10s%n-----------------------"
			+ "-----------------------------%n", column1a, column1b, column2a, column2b);
	}
	
	public static void printTableRow(double column1a, double column1b, double column2a, double column2b) {
		System.out.printf("%10.1f %10.2f     | %10.1f %10.3f %n", column1a, column1b, column2a, column2b);
	}
	
	public static void printTableRow(double column1a, double column1b, double column2a, double column2b, int colBprecision) {
		System.out.printf("%10.1f %10."+colBprecision+"f     | %10.1f %10."+colBprecision+"f %n", column1a, column1b, column2a, column2b);
	}
	
	public static void printTableRow(double column1a, double column1b, double column2a, double column2b, int col1Bprecision, int col2Bprecision) {
		System.out.printf("%10.1f %10."+col1Bprecision+"f     | %10.1f %10."+col2Bprecision+"f %n", column1a, column1b, column2a, column2b);
	}
	
	
}
