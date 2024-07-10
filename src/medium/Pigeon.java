package medium;

public class Pigeon extends MediumFlyingBirds {

    public Pigeon (String name){
        super.name = name;
    }

    public void fly() {
        super.fly();
        System.out.println("flying");
    }

}
