class Solution {
	static boolean[] validDaysForTravel;
	static int[] dp;

	public int mincostTickets(int[] days, int[] costs) {
		validDaysForTravel = new boolean[366];
		dp = new int[366];
		for (int day : days) {
			validDaysForTravel[day] = true;
		}
		Arrays.fill(dp, -1);
		return mincostTickets(days, costs, 0);
	}

	public int mincostTickets(int[] days, int[] costs, int i) {

		if (i >= 366)
			return 0;
		if (dp[i] != -1)
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