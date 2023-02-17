import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class VendingMachine{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        boolean money = true;
        int balance = 0;
        int currentPay = 0;
        
        System.out.println("Welcome to the Candy Vending Machine! Please enter the number (1-10) of the snack you want!");
        System.out.println("______________________________");
        System.out.println("|   1. CandyCorn  - $2.00    |");
        System.out.println("|   2. KitKats    - $2.00    |");
        System.out.println("|   3. Reeses     - $1.00    |");
        System.out.println("|   4. Skittles   - $3.00    |");
        System.out.println("|   5. Starburts  - $2.00    |");
        System.out.println("|   6. Twix       - $1.00    |");
        System.out.println("|   7. Swedish Fish - $1.00  |");
        System.out.println("|   8. Snickers   - $1.00    |");
        System.out.println("|   9. M&M's      - $4.00    |");
        System.out.println("|   10. 3 Musketeers - $5.00 |");
        System.out.println("|____________________________|");

        int num = sc.nextInt();
        Map<Integer, String> vendingItems  = new HashMap<Integer, String>();
        vendingItems.put(1, "Candycorn");
        vendingItems.put(2, "KitKats");
        vendingItems.put(3, "Reeses");
        vendingItems.put(4, "Skittles");
        vendingItems.put(5, "Starburst");
        vendingItems.put(6, "Twix");
        vendingItems.put(7, "Swedish Fish");
        vendingItems.put(8, "Snickers");
        vendingItems.put(9, "M&M's");
        vendingItems.put(10, "3 Musketeers");
        System.out.println("You choose: " + vendingItems.get(num));

       
        System.out.println("Insert payment. $1 bills only.");
         while (money){
              currentPay = sc.nextInt();
            if (currentPay != 1) {
                System.out.println("Please enter $1");
            } else if (balance <= 5) {
                System.out.println("Please enter more money.");
                balance += 1;
                System.out.println("You've inserted " + balance);
            } 
            else if(balance == num){
                System.out.println("Thank you for your payment.");
                money = false;
            }
         }

    }
}