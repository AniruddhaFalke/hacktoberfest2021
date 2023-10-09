import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int num_test_cases = scanner.nextInt();

        for (int t = 0; t < num_test_cases; t++) {
            
            int N = scanner.nextInt();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < N - i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println(); // Add a blank line between test cases
        }

        scanner.close();
    }
}




			
