package BasicObject.Clone;

public class Clone {
    Person person1;
    public Clone() {
        this.person1 = new Person("Changsi", 23);
        System.out.println(this.person1);
        Person person1copy = this.person1;
        System.out.println("this is a object from copy reference:" + person1copy);
        try {
            Person personClone = (Person) person1.clone();
            System.out.println("this is a object from copy reference:" + personClone);
            String copyRes = "Result of directly call super.clone() method: " + this.person1.name == personClone.name ? "deep copy" : "shallow copy";
            System.out.println(copyRes);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }

    }

    public static void main(String[] args) {
        Clone c = new Clone();
    }
}
