public class left_right shift {
    public static void main(String[] args) {
        int target = -5; // Binary: 11111111111111111111111111111011
        
        // Shift left by 1
        int result = target << 1; 
        
        System.out.println("Result: " + result); // Outputs -10
        System.out.println("Binary: " + Integer.toBinaryString(result));
    }
}
