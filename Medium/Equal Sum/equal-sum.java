//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            String ans = new Solution().equilibrium(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    String equilibrium(int arr[], int n) {
        // code here
        int prefix[]=new int [n];
        prefix[0]=arr[0];
        int suffix[]=new int [n];
        suffix[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=n-2;i>0;i--){
            suffix[i]=suffix[i+1]+arr[i];
        }
        for(int i=1;i<n-1;i++){
            if(prefix[i]==suffix[i]){
                return "YES";
            }
        }
        return "NO";
    }
}