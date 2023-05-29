import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int productNumber = 1;
        int quantitySold = 1;
        double Amount = 0;

        while (productNumber != -1) {
            System.out.println("Enter product number(1-5) or -1 to exit: ");
            productNumber = input.nextInt();

            if(productNumber >= 1 && productNumber <= 5) {
                System.out.println("Enter quantity sold: ");
                quantitySold = input.nextInt();
            }

            switch (productNumber) {
                case 1:
                    Amount += 2.98 * quantitySold;
                    break;
                case 2:
                    Amount += 4.50 * quantitySold;
                    break;
                case 3:
                    Amount += 9.98 * quantitySold;
                    break;
                case 4:
                    Amount += 4.49 * quantitySold;
                    break;
                case 5:
                    Amount += 6.87 * quantitySold;
                    break;
                default:
                    Amount += 0;
                    break;
            }
            System.out.println("Product Number " + productNumber + " with " + quantitySold + " quantity amount: " + Amount);
        }

        System.out.println("Total Amount: $" + Amount);
    }
}
