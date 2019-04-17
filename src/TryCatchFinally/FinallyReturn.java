package TryCatchFinally;

public class FinallyReturn {
    public static void main(String args[])
    {
        String havefun = test();
        System.out.println(havefun);
    }

    public static String test()
    {
        try {
            System.out.println("try");
            throw new Exception();
        } catch(Exception e) {
            System.out.println("catch");
            return "return";
        } finally {
            System.out.println("finally");

            return "return in finally";
        }
    }
}
