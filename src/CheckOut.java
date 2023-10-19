import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double itemPrice;
        double totalCost = 0.0;
        boolean hasItemsLeft = true;

        while (hasItemsLeft)
        {
            itemPrice = SafeInput.getRangedDouble(in, "Please enter the price of your item: ",0.50,10.00);

            totalCost = totalCost + itemPrice;

            hasItemsLeft = SafeInput.getYNConfirm(in, "Do you have more items? ");
        }
        System.out.printf("Total cost: $%.2f\n", totalCost);
    }
}