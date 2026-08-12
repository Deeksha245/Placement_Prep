import java.util.Scanner;

public class ex9 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length())
            if (s.charAt(i) == t.charAt(j++)) i++;
        return i == s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s and t: ");
        
        ex9 solver = new ex9();
        System.out.println("Result: " + solver.isSubsequence(sc.nextLine(), sc.nextLine()));
        sc.close();
    }
}


/*IP:
"abc"

OP
"ahbgdc"
*/
