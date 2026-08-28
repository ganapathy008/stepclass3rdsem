package weekthree;
import java.util.Scanner;

public class Prime {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n))
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");

        System.out.println("Primes up to " + n + ":");
        for (int i = 2; i <= n; i++)
            if (isPrime(i)) System.out.print(i + " ");
    }
}

