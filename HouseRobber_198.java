//House robber (Topic on recursion)

class Solution {
    static int maxTheft(int[] nums, int index) {       
        if(index>= nums.length)//
            return 0;           // base
        int rob = nums[index] + maxTheft(nums, index+2); // finds max between the numbers 6+1+8 =20,15
        int skip = maxTheft(nums, index+1);
        return Math.max(rob,skip);
       
    }
    public int rob(int [] nums)
    {
        return maxTheft(nums,0);
    }
}


input: //6 7 1 3 8 2 5Op: 6+1+8+5=20


// find the nth fibonaaci number 1 1 2 3 5 7 13 

import java.util.*;
public class Main
{
    public static int Fibonacci(int n)
    { if(n==0)
        return 0;
      if(n==1 || n== 2)
        return 1;
      return Fibonacci(n-1)+Fibonacci(n-2); // if dividing function or multiplication then it would be log 
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n= sc.nextInt();
	    
		System.out.println(Fibonacci(n));
	}
}
//Time complexity is 2 power n large inputs cannot handle

//DP solution for fibonacci sequence
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n= sc.nextInt();
	    long dp[] = new long[n+1];
	    dp[0]=0;
	    dp[1]=1;
	    for( int i=2; i<=n; i++)
	    {
	        dp[i] =dp[i-1] + dp[i-2];
	    }
	    
		System.out.println(dp[n]);
	}
}
//much more faster dpp repeated tasks to be saved  doesnt lag
// Dpp types memorization and tabulation

//dp[n]=dp[n-1]+dp[n-2] // memorization
