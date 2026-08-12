/* Collecting Candies — Question

Krish has N boxes, and each box contains a certain number of candies. He wants to collect all the candies into a single box. In one operation, he can choose any two boxes and combine them into one box. The time required to combine two boxes is equal to the total number of candies in those two boxes. After combining, the new box contains the total candies of both boxes. Find the minimum total time required to combine all the boxes into one box.
Example:
Input:
1
4
1 2 3 4
Output:
19
For this case, the minimum combination is 1+2=3, then 3+3=6, then 6+4=10, giving total time 3+6+10 = 19.*/
import java.util.*;
class ex14 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-- >0){
             int n=sc.nextInt();
             int[] candies=new int[n];
             for(int i=0;i<n;i++){
                 candies[i]=sc.nextInt();
             }
             int newBox=candies[0],minTime=0;
             for(int i=1;i<n;i++){
                newBox+=candies[i];
                minTime+=newBox;
             }
             System.out.println(minTime);
        }
    }
}