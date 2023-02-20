import java.util.ArrayList;
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
        num-=1;
        ArrayList<candy> candy = new ArrayList<candy>();
        candy.add(new candy(1,"Candycorn", 2));
        candy.add(new candy(2,"KitKats", 2));
        candy.add(new candy(3,"Reeses", 1));
        candy.add(new candy(4,"Skittles", 3));
        candy.add(new candy(5,"Starburst", 2));
        candy.add(new candy(6,"Twix", 1));
        candy.add(new candy(7,"Swedish Fish", 1));
        candy.add(new candy(8,"Snickers", 1));
        candy.add(new candy(9,"M&M's", 4));
        candy.add(new candy(10,"3 Musketeers", 5));

        System.out.println("You chose " + candy.get(num).getItem() + " for $"  + candy.get(num).getPrice());
       
        System.out.println("Insert payment. $1 bills only.");
         while (money){
              currentPay = sc.nextInt();
            if (currentPay != 1) {
                System.out.println("Please enter $1");      
            } 
            else if(balance >= candy.get(num).getPrice()-1)
            {
                balance+=1;
                System.out.println("Thank you for your payment.");
                System.out.println("You've inserted $" + balance);
                System.out.println("Would you like to enter more money?(Y OR N)");
                String input = sc.next();
                if(input.toLowerCase().equals("n"))
                {
                    money = false;
                }
                else
                {
                    System.out.println("Insert payment. $1 bills only.");
                }           
            }
            else 
            {
                System.out.println("Please enter more money.");
                balance += 1;
                System.out.println("You've inserted $" + balance);
                System.out.println("You owe $" + (candy.get(num).getPrice() - balance) + " more");
            }       
         }
         System.out.println();
         System.out.println("You selected " + candy.get(num).getItem() + " for $"  + candy.get(num).getPrice());
         System.out.println("You have inserted $" + balance);
         System.out.println("Would you like to finish the purchase?(Y or N)");
         String input = sc.next();
         if(input.toLowerCase().equals("n"))
         {
            System.out.println("You have been refunded $" + balance);
         }
         else
         { 
            System.out.println("You've inserted $" + balance + " your change is $" + (balance - candy.get(num).getPrice()));
         }
    }
}
class candy
{
    String item;
    int numberOfItem;
    int price;
    candy( int numberOfItem,String item,int price)
    {
        this.item=item;
        this.numberOfItem=numberOfItem;
        this.price= price;
    }
    public String getItem()
    {
        return item;
    }
    public int getNumberOfItem()
    {
        return numberOfItem;
    }
    public int getPrice()
    {
        return price;
    }
}