import java.util.Scanner;

public class ExchangeCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Enter the amount you have (USD)");
        int usd = scanner.nextInt();
        System.out.printf("After exchange from USD: %d\n", usd * rate);
    }
}
