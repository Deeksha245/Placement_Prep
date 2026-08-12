/*SOme prime numbers can be expresssed as a sum of other consecutive prime numbers

Ex:5=2+3,
17=2+3+5+7,
41=2+3+5+7+11+13
Input:20
op:2 below 20 there are two such members 5 and 17 5=2+3
17=2+3+5+7*/


import java.util.*;
public class Main
{
	public static boolean isPrime(int n) {
	    if(n<2)
	        return false;
	    for(int deno=2; deno<= Math.sqrt(n); deno++)
	        if(n % deno ==0)
	            return false;
	    return true;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> primeList = new ArrayList<Integer>();
        for(int i=2; i<=n; i++)
            if(isPrime(i))
                primeList.add(i);
        int sum=2, count=0;
        for(int num: primeList.subList(1,primeList.size()))
        {
            sum+=num;
            if(sum<= n && isPrime(sum))
                count++;
                
        }
        System.out.println(count);
        
	}
    }