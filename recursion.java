/*Given a string print all permutations of the string using recursion 
Approach 1:Fix one character ,permute the rest
  *Pick one character
  *Fix at current position
  *Recursively permute remaining characters
  Input str="abc"
  Output:
abc
acb
bac
bca
cab
cba*/
//call stack
fun(0)//condition violates
fun(1)// 1 is the last one who called 0 so it will retuirn to 1 then goes back back reaches main method
fun(2)
fun(3)
main
//no tail recursion          
void fun(n)
{
  if(n<=0)
    return 
 fun(n-1)
  print(n);
}

in no tail if voilated for condition so it calls for f(1) because there is printing statement so 1 will be the first number to print and then it will be 1 2 3 4 5
in tail if condition vioilated

void fun(n)
{
  if(n<=0)
    return 
  print(n);
  fun(n-1)
}


public class Main {
    public static void main(String[] args) {
        String name = "Deeksha";
        
        for (int index = 0; index < name.length(); index++) {
            System.out.println(name.charAt(index));
        }
    }
}
//Printing names char by char

reversing names letter by letter/
public class Main
{
    public static void fun(String name,int index){
        if(index<0 || index>=name.length())
            return;
        fun(name,index+1);
        System.out.println(name.charAt(index));
    }
 
	public static void main(String[] args) {
		String name="Deeksha";
		fun(name,0);
	}
}

//
import java.util.*;
public class Main
{
    public static void permute(String prefix,String remaining)
    {
        if(remaining.length()==0)
        {
            System.out.println(prefix);
            return;
        }
        for(int i=0;i<remaining.length(); i++)
        {
            char ch = remaining.charAt(i);
            String nextRemaining = remaining.substring(0,i) + remaining.substring(i+1);
            permute(prefix + ch, nextRemaining);
        }
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    String input = sc.next();
		permute("", input);
	}
}

/*
abc
abc
acb
bac
bca
cab
cba*/

