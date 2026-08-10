//sliding window
/*Question:Given an array of integers arr,an integer k task is to find and print max number in each contigious window size of k
clea*/



import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data[]=sc.nextLine().split("");
        int arr[] = new int[data.length];
        for(int i=0;i<data.length;i++)
            arr[i]=Integer.parseInt(data[i]);
        int arr2[]=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
}
        
    }



