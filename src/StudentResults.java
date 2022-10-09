public class StudentResults
{
    static int total;
    static double percentage;

    public static void studentMarksheet(String name, int rollNo, int maths, int science, int english)
    {
        total = maths + science + english;
        percentage = total/3;

        String PassFail = (percentage>=35) ? "Pass" : "Fail";
        System.out.println(name + "\n" + " Roll Number " + rollNo + "\n" + " Total Marks = " + total + "\n" + " Percentage = " + percentage + "\n" + " Result is " + PassFail  );

    }

    public static void main(String[] Args)
    {
        studentMarksheet("Geeta",1,25,20,30);
    }
}
