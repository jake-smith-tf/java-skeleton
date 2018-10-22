package answers;

public class Question2 {

	public static int equallyBalancedCashFlow(int[] cashflowIn, int[] cashflowOut) {
		int lowestPair = 0;
		for (int i = 0; i < cashflowIn.length; i++)
		{
			int lowest = Math.abs(cashflowIn[0] - cashflowOut[0]);
			for (int j = 0; j < cashflowOut.length; j++)
			{
				for (int bound = 0; bound < 10; bound++) {
					int diff = Math.abs(cashflowIn[i] - cashflowOut[j]);
					if (diff <= bound && dif <= lowest) {
						lowest = diff;
					}
				}
			}
			if (lowest < lowestPair)
			{
				lowestPair = lowest;
			}
		}
		return lowestPair;
	}

}
