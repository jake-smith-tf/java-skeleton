package answers;
import java.lang;

public class Question1 {

    0b1110000 0b00011101

	public static int bestMergedPortfolio(int[] portfolios) {
		// TODO Auto-generated method stub
		int highest = 0;
		//int currentShift = 0;
        /*
		for (int i = 0; i < portfolios.length; i++)
		{
			int currentPortfolio = portfolios[i];
			int currentBit = portfolios[i] >> 15 - currentShift;

		}
		*/

        //Find most left-most 1's
        int highestInt = 0;
        for (int i = 0; i < portfolios.length; i++)
        {
            if (portfolios[i] > highestInt)
            {
                highestInt = portfolios[i];
            }
        }

        for (int i = 0; i < portfolios.length; i++)
        {
            if ((portfolios[i] ^ portfolios[j]) > highest)
            {
                highest = highestInt ^ portfolios[j];
            }
        }

        /*
		for (int i = 0; i < portfolios.length; i++)
		{
			for (int j = i + 1; j < portfolios.length; j++)
			{
				if ((portfolios[i] ^ portfolios[j]) > highest)
				{
					highest = portfolios[i] ^ portfolios[j];
				}
			}
		}
		*/
		System.out.println("HIGHEST:"+highest);
		return highest;
	}



}
