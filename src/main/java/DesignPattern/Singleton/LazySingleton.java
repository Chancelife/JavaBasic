package DesignPattern.Singleton;

import java.util.HashMap;
import java.util.Hashtable;

public class LazySingleton {
    private static LazySingleton obj;
    public static LazySingleton getInstance() {
        if(obj==null)
            obj = new LazySingleton();
        Hashtable<Integer, Integer> map = new Hashtable<>();
        return obj;
    }

    private LazySingleton() {}

    protected static void method() {
        System.out.println("This print is from "+Class.class);
    }
}
