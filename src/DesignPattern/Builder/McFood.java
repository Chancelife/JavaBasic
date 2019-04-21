package DesignPattern.Builder;

public class McFood {
    private int totalCound;
    private boolean addIce;
    private Hamburger hamburger;
    private Drink dirnk;
    private String remark;
    private boolean toGo;

    public static class Hamburger {
        public static final String HAMBURGER_CHICKEN = "chicken";
        public static final String HAMBURGER_BEEF = "beef";

        private String hamburgName;
        public Hamburger(String name) {
            this.hamburgName = name;
        }

        public String getHamburgName() {
            return hamburgName;
        }
    }

    public static class Drink {
        public static final String DRINK_COKE = "coke";
        public static final String DRINK_SPRITE = "sprite";

        private String drinkName;
        public Drink(String name) {
            this.drinkName = name;
        }
        public String getDrinkName() {
            return drinkName;
        }
    }

    public McFood(Builder builder) {
        this.totalCound = builder.totalCount;
        this.addIce = builder.addIce;
        this.hamburger = builder.hamburger;
        this.dirnk = builder.drink;
        this.remark = builder.remark;
        this.toGo = builder.toGo;
    }

    public static class Builder {
        private int totalCount = 0;
        private boolean addIce = false;
        private Hamburger hamburger = null;
        private Drink drink = null;
        private String remark = null;
        private boolean toGo = false;

        public Builder totalCount(int count) {
            this.totalCount = count;
            return this;
        }

        public Builder hamburger(Hamburger hamburger) {
            this.hamburger = hamburger;
            return this;
        }

        public Builder drink(Drink drink) {
            this.drink = drink;
            return this;
        }

        public Builder toGo(boolean togo) {
            this.toGo = togo;
            return this;
        }

        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public McFood create() {
            return new McFood(this);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(dirnk.getDrinkName()).append("|");
        sb.append(hamburger.getHamburgName()).append("|");
        sb.append("togo:").append(this.toGo).append("|");
        sb.append("total:").append(this.totalCound).append("|");
        sb.append("remkar:").append(remark);
        return sb.toString();
    }
}
