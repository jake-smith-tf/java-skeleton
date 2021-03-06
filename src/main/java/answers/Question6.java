package answers;

public class Question6 {

	int numServers,targetServer;
	int[][] times;

	public Question6(int numServers,int targetServer,int[][] times)
	{
		this.numServers = numServers;
		this.targetServer = targetServer;
		this.times = times;
	}


	public int[] fastestTo(int target)
	{
		int[] server = {0,times[0][target]};
		for (int i = 0; i < numServers; i++)
		{
			if (times[i][target] < server[1])
			{
				server[1] = times[i][target];
				server[0] = i;
			}
		}
		return server;
	}

	public static int shortestServerRoute(int numServers, int targetServer, int[][] times) {
		int time = 0;
		Question6 question6 = new Question6(numServers,targetServer,times);
		int[] currentServer = {targetServer,0};
		while (currentServer[0] != 0) {
			currentServer = question6.fastestTo(currentServer[0]);
			time += currentServer[1];
		}


		return time;
	}

}
