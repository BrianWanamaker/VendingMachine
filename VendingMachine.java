import java.util.Scanner;

class VendingMachine{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Candy Vending Machine! Please enter the number (1-10) of the snack you want!");
        System.out.println("|   1. CandyCorn  - $1.00    |");
        System.out.println("|   2. KitKats    - $1.00    |");
        System.out.println("|   3. Reeses     - $1.00    |");
        System.out.println("|   4. Skittles   - $1.00    |");
        System.out.println("|   5. Starburts  - $1.00    |");
        System.out.println("|   6. Twix       - $1.00    |");
        System.out.println("|   7. Swedish Fish - $1.00  |");
        System.out.println("|   8. Snickers   - $1.00    |");
        System.out.println("|   9. M&M's      - $1.00    |");
        System.out.println("|   10. 3 Musketeers - $5.00 |");

        int num = sc.nextInt();
    }
}