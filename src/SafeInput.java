import java.util.Scanner;
public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString;
        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int value = 0;
        boolean validInput = false;

        while (!validInput)
        {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                validInput = true;
            } else
            {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.nextLine();
            }
        }

        pipe.nextLine();

        return value;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double value = 0.0;
        boolean validInput = false;

        while (!validInput)
        {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                validInput = true;
            } else
            {
                System.out.println("Invalid input. Please enter a valid double value.");
                pipe.nextLine();
            }
        }

        pipe.nextLine();

        return value;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        String promptWithRange = prompt + " [" + low + " - " + high + "]: ";
        int value = 0;
        boolean validInput = false;

        while (!validInput)
        {
            System.out.print("\n" + promptWithRange);

            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                if (value >= low && value <= high)
                {
                    validInput = true;
                } else
                {
                    System.out.println("Invalid input. Please enter an integer within the specified range.");
                }
            } else
            {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.nextLine();
            }
        }

        pipe.nextLine();

        return value;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        String promptWithRange = prompt + " [" + low + " - " + high + "]: ";
        double value = 0.0;
        boolean validInput = false;

        while (!validInput)
        {
            System.out.print("\n" + promptWithRange);

            if (pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                if (value >= low && value <= high)
                {
                    validInput = true;
                } else
                {
                    System.out.println("Invalid input. Please enter a double value within the specified range.");
                }
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid double value.");
                pipe.nextLine();
            }
        }

        pipe.nextLine();

        return value;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean validInput = false;
        boolean confirmed = false;

        while (!validInput)
        {
            System.out.print("\n" + prompt + " [Y/N]: ");
            String input = pipe.nextLine();

            if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N"))
            {
                validInput = true;
                confirmed = input.equalsIgnoreCase("Y");
            }
            else
            {
                System.out.println("Invalid input. Please enter either 'Y' or 'N'.");
            }
        }

        return confirmed;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String value = "";
        boolean validInput = false;

        while (!validInput)
        {
            System.out.print("\n" + prompt + ": ");
            value = pipe.nextLine();

            if (value.matches(regEx))
            {
                validInput = true;
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid string matching the specified pattern.");
            }
        }

        return value;
    }

    public static void prettyHeader(String msg)
    {
        int whiteSpace = (53 - msg.length()) / 2;

        for (int x = 0; x <= 59; x++)
        {
            System.out.print("*");
        }
        System.out.print("\n***");

        for (int x = 0; x <= whiteSpace; x++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int x = 0; x <= whiteSpace; x++)
        {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int x = 0; x <= 59; x++)
        {
            System.out.print("*");
        }
    }

}