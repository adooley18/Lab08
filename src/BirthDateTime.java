import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int birthYear;
        int birthMonth;
        int birthDay;
        int birthHour;
        int birthMinute;

        birthYear = SafeInput.getRangedInt(in, "Please enter the year you were born: ", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in, "Please enter the month you were born: ", 1, 12);
        birthDay = getValidDay(in, birthMonth);
        birthHour = SafeInput.getRangedInt(in, "Please enter the hour you were born: ",1,24);
        birthMinute = SafeInput.getRangedInt(in, "Please enter the minute you were born: ",1,59);

        System.out.println("You were born on: " + birthMonth + "/" + birthDay + "/" + birthYear + " " + birthHour + ":" + birthMinute);

    }

    private static int getValidDay(Scanner in, int month)
    {
        int birthDay;

        switch (month)

        {
            case 2:
                birthDay = SafeInput.getRangedInt(in, "Please enter the day your were born: ; ",1,29);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                birthDay = SafeInput.getRangedInt(in, "Please enter the day you were born: ", 1, 30);
                break;
            default:
                birthDay = SafeInput.getRangedInt(in, "Please enter the day you were born: ",1,31);
        }
        return birthDay;
    }
}