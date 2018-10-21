package answers;

public class Question1 {


	public static int bestMergedPortfolio(int[] portfolios) {
        int u = 0, bitmask = 0;
        for(int i = 31; i >= 0; i--){
            bitmask = bitmask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for(int portfolio : portfolios){
                set.add(portfolio & bitmask);
            }
            int tmp = u | (1 << i);
            for(int beg : set){
                if(set.contains(tmp ^ beg)) {
                    u = tmp;
                    break;
                }
            }
        }
        return u;
	}



}
