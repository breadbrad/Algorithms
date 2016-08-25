/** Since the multiples of 3 are not prime, set primes[3 * i] to false for all 3 <= i <= n/3 
    Complexity = O( n^1.5 / log n) */
import java.util.Scanner;

class find_prime_Sieve {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Find all prime numbers <= n, enter n: ");
                int n = input.nextInt();

                boolean[] primes = new boolean[n + 1]; // Prime number sieve
                int limit = (int)  Math.sqrt(primes.length);
                // Initialize primes[i] to true
                for (int i = 0; i < primes.length; i++) {
                        primes[i] = true;
                }

                for (int k = 2; k <= n/k; k++) { // k * i below is greater than n 
                        if (primes[k]) {
                                for (int i = k; i <= n/k; i++) {
                                        primes[k * i] = false; // k * i is not prime 
                                }
                        }
                }

                int count = 0;
                for(int i = 2; i < primes.length; i++) {
                        if (primes[i]) {
                                count++;
                                if (count % 10 == 0) 
                                        System.out.printf("%7d\n", i);
                                else 
                                        System.out.printf("%7d", i);
                        }
                }

                System.out.println("\n" + count + " prime(s) less than or equal to " + n);
        }
}

