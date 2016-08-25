import java.util.Scanner;
/** 
    worst-case time complexity is O(log n)
    if n <= m/2,  m % n < m/2 (since the remainder of m / n is always less than n)
    if n >  m/2,  m % n = (m-n) < m/2
*/

/**
    gcd(m, n)
      = gcd(n, m % n)
        = gcd(m % n, n % (m % n))
          = ...
*/


/**
    Since m % n < m/2 and n % (m % n) < n/2 
    the argument passed to the gcd method is reduced 
    by fal after every two iterations
*/
class GCD {

public static int gcd(int m, int n) {
        if (m % n == 0)
                return n;
        else if (m < n) 
                return gcd(n, m); // transpose arguments  
        else
                return gcd(n, m % n);
}

        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter first integer: ");
                int m = input.nextInt();
                System.out.print("Enter second integer: ");
                int n = input.nextInt();

                System.out.println("The greatest common divisor for " + m + " and " + n + " is  " + gcd(m, n));
        }
}

