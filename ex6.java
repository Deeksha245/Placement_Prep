/*chocolate problem */

import java.util.*;

class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cBelt[]=new int[n];
        for(int i=0;i<n;i++)
            cBelt[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            if(cBelt[i]==0){
                for(int j=i;j<n-1;j++)
                    cBelt[j]=cBelt[j+1];
                cBelt[n-1]=0;
                
            }
        }
        for(int ele: cBelt)
            System.out.println(ele +" ");
    }
}