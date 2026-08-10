import java.util.*;

class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        
        while (t-- > 0) {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == 'B' && s.charAt(i + 1) == 'G') {
                    s = s.substring(0, i) + "GB" + s.substring(i + 2);
                    i++; // Skip the next position since it was swapped
                }
            }
        }
        
        System.out.println(s);
    }
}


/*input:
5 1
BGGBG
output:
GBGGB*/