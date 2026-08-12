//Finding substring

import java.util.*;
public class ex7
{
    public static void main(String[] args) {
        String str="abc";
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<=str.length(); j++){
                String sub= str.substring(i,j);
                System.out.println(sub);
            }
        }            
    }
}

/*OP;
a
ab
abc

b
bc

c*/
