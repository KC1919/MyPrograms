class Solution {
	static boolean[] validDaysForTravel;
	static Integer[] dp;

	public int mincostTickets(int[] days, int[] costs) {
		validDaysForTravel = new boolean[366];
		for (int day : days) {
			validDaysForTravel[day] = true;
		}
		dp=new Integer[366];
		return mincostTickets(days, costs, 0);
	}

	public int mincostTickets(int[] days, int[] costs, int i) {

		if (i >= 366)
			return 0;
		if (dp[i] != null)
			return dp[i];
		int res = Integer.MAX_VALUE;
		if (validDaysForTravel[i]) {
			res = Math.min(res, costs[0] + mincostTickets(days, costs, i + 1));
			res = Math.min(res, costs[1] + mincostTickets(days, costs, i + 7));
			res = Math.min(res, costs[2] + mincostTickets(days, costs, i + 30));
		} else {
			res = Math.min(res, mincostTickets(days, costs, i + 1));
		}
		return dp[i] = res;

	}
}