package DesignPattern.Builder;

public class Run {
    public static void main(String[] orgs) {
        McFood combo = new McFood.Builder()
                .totalCount(3)
                .drink(new McFood.Drink(McFood.Drink.DRINK_SPRITE))
                .hamburger(new McFood.Hamburger(McFood.Hamburger.HAMBURGER_BEEF))
                .remark("Haha")
                .toGo(false)
                .create();
        System.out.println(combo);
    }
}
