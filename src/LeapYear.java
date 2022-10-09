public class LeapYear
{
    static int year = 2003;

    public static void main(String[] args)
    {
        if (year % 4 == 0)
        {
            System.out.println(year + " is leap year");
        }
        else
        {
            System.out.println(year + " is not leap year");
        }
    }

}
