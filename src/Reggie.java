import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = "";
        String mNumber = "";
        String menuChoice = "";

        ssn = SafeInput.getRegExString(in, "Please enter your Social Security Number (###-##-####) ","^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("A valid Social Security Number: " + ssn);

        mNumber = SafeInput.getRegExString(in, "Please enter your UC Student M number (M#########)", "^(M|m)\\d{8}$");
        System.out.println("Valid M number: " + mNumber);

        menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.println("Valid menu choice: " + menuChoice);

    }
}