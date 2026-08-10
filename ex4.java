//Coderforce427A

import java.util.*;
class ex4 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int untreated=0,availablePolice=0;
      int event;
      for(int i=1;i<=n;i++)
      {
          event=sc.nextInt();
          if(event>0)
          {
              availablePolice+=event;
          }
          else{
              if (availablePolice>0)
                availablePolice--;
              else
               untreated++;
          }
            
      }
      System.out.println(untreated);
        
    }
}

/*OP

3
-1 -1 1

-1 is crime
1 is police recruited
1 -1 police alloted to crime -1*/
