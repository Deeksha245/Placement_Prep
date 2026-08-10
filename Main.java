//sliding window
/*Question:Given an array of integers arr,an integer k task is to find and print max number in each contigious window size of k
clea*/



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array values from one line, allowing spaces between integers
        String[] tokens = sc.nextLine().trim().split("\\s+");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        // Read window size k from the next line
        int k = Integer.parseInt(sc.nextLine().trim());

        List<Integer> result = maxSlidingWindow(arr, k);
        System.out.println(result);
    }

    private static List<Integer> maxSlidingWindow(int[] arr, int k) {
        List<Integer> output = new ArrayList<>();
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            return output;
        }

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                output.add(arr[dq.peekFirst()]);
            }
        }

        return output;
    }
}




