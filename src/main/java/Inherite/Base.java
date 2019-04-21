package Inherite;

class Base {
    private void fun() {
        System.out.println("Inherite.Base fun");
    }
}

class Derived extends Base {
    private void fun() {
        System.out.println("Inherite.Derived fun");
    }
    public static void main(String[] args) {
        Base obj = new Derived();
//        obj.fun();
    }
}