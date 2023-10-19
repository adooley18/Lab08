import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double favDouble;
        int favInt;

        favDouble = SafeInput.getDouble(in, "Please enter your favorite double: ");
        favInt = SafeInput.getInt(in, "Please enter your favorite int: ");

        System.out.println("Your favorite double is: " + favDouble);
        System.out.println("Your favorite int is: " + favInt);

    }
}