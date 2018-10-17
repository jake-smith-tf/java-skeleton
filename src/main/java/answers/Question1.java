package answers;

public class Question1 {

	public int merge(int a, int b)
	{
		return (a ^ b);
	}

	public static int bestMergedPortfolio(int[] portfolios) {
		// TODO Auto-generated method stub
		int highest = 0;

		for (int i = 0, i < portfolios.length, i++)
		{
			for (int j = 0, j < portfolios.length, j++)
			{
				if (merge(portfolios[i],portfolios[j]) > highest)
				{
					highest = merge(portfolios[i],portfolios[j]);
				}
			}
		}

		return highest;
	}

	public static void main(String[] args)
	{

	}



}
