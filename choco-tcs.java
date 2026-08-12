/*The Chocolate Factory problem is a frequently asked TCS NQT coding question. The task is to take an array of integers representing chocolate packets, 
find all the empty packets marked with 0, and push all the zeros to the end of the array while keeping the relative order of the non-zero elements the same.Problem DetailsInput 
Example: N = 8, arr = [4, 5, 0, 1, 9, 0, 5, 0]
Output Example: 4 5 1 9 5 0 0 0
Core Logic: This is identical to the classic "Move all zeros to the end of an array" problem disguised in a factory storyline.*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cBelt[] = new int[n];
        for(int i=0;i<n;i++)
             cBelt[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            if(cBelt[i]==0){
                for(int j=i;j<n-1;j++)
                    cBelt[j]=cBelt[j+1];
                cBelt[n-1]=0;
            }
        }
        for(int ele:cBelt)
         System.out.print(ele+" ");
    }
}
