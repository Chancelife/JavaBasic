package DesignPattern.Singleton;

public class Singleton {
    Singleton obj;
    private Singleton() {}
    public Singleton getInstance() {
        if(obj==null) {
            synchronized(Singleton.class) {
                if(obj==null) {
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }
}
