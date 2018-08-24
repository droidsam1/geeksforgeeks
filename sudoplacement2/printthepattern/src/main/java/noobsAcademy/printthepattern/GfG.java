/**
 * 
 */
package noobsAcademy.printthepattern;

/*
 * Please note that it's Function problem i.e. you need to write your
 * solution in the form of Function(s) only. Driver Code to call/invoke your
 * function is mentioned above.
 */
public class GfG {
    static void printPat(int n) {
	System.out.print(getPat(n));
    }

    static String getPat(int n) {
	int m = n;
	StringBuilder sb = new StringBuilder();
	while (m > 0) {
	    for (int i = n; i > 0; i--) {
		for (int j = 0; j < m; j++) {
		    sb.append(i);
		    sb.append(" ");
		}
	    }
	    sb.append("$");
	    m--;
	}
	return sb.toString();
    }
}