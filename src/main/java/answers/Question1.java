package answers;

public class Question1 {



	public static int bestMergedPortfolio(int[] portfolios) {
		// TODO Auto-generated method stub
		int highest = 0;




		for (int i = 0; i < portfolios.length; i++)
		{
			for (int j = 0; j < portfolios.length; j++)
			{
				if ((portfolios[i] ^ portfolios[j]) > highest)
				{
					highest = portfolios[i] ^ portfolios[j];
				}
			}
		}

		return highest;
	}



}
