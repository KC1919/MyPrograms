class Solution {
    public int divide(int A, int B) {
    if (A == 1 << 31 && B == -1) return (1 << 31) - 1; //overflow detection
	//division 
    int a = Math.abs(A), b = Math.abs(B), res = 0, x = 0;
    //Find Cn, Cn-1, ..., C0
    while (a - b >= 0) {
        //find Cm, 
        int Cm = 0;
        while(a - (b * (1 << Cm << 1)) >= 0){
            Cm++;
        }
        
        res = res + (1<< Cm);
        a = a - b*(1<<Cm);
    }
    
    
    return (A > 0) == (B > 0) ? res : -res; //deal with the sign
}
}