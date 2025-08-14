import java.util.Scanner;

public class FibonacciNonRecursive {
    
    static void printFibonacci(int n) {
        int first = 0, second = 1;
       
        System.out.print(first + " " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();
        
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (terms == 1) {
            System.out.println("Fibonacci Series: 0");
        } else {
            System.out.print("Fibonacci Series: ");
            printFibonacci(terms);
        }
        
        sc.close();
    }
}
