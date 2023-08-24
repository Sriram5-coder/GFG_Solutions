//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDivisible(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDivisible(int N) {
        // code here
        int sum=0;
        int temp=N;
        while(N!=0)
        {
            int r=N%10;
            sum+=r;
            N=N/10;
        }
        if(temp%sum==0)
        {
            return 1;
        }
        return 0;
    }
};