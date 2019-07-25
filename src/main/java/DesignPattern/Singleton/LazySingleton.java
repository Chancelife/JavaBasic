package DesignPattern.Singleton;

public class LazySingleton {
    private static LazySingleton obj;
    public static LazySingleton getInstance() {
        if(obj==null)
            obj = new LazySingleton();
        return obj;
    }

    private LazySingleton() {}

    protected static void method() {
        System.out.println("This print is from "+Class.class);
    }
}
