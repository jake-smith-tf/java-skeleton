package answers;
import java.util.Set;
import java.util.HashSet;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
	    int max = 0;
        for (int i = 0; i < portfolios.count - 1; i++) {
            for (int j = i + 1; j < portfolios.count; j++) {
                int ci = portfolios[i] ^ portfolios[j];
                max = (ci > max) ? ci : max;
            }
        }
	}
	
}
