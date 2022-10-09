public class EvenOdd
{
    static int num = 3;

    public static void main(String[] args)
    {
        String evenodd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenodd);
    }
}
