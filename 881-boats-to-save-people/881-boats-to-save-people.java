class Solution {
  public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int solution = 0;
        int start = 0;
        int end = people.length -1;
        
        while(start <= end) {
            solution++;
            if(start == end) break; // last person on boat
            if(people[start] + people[end] <= limit) start++; // we can carry two people
            end--;
        }
        return solution;
    }
}