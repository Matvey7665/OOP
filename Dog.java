package OOP;

import java.time.LocalDate;

public class Dog extends Animal implements Goable{
    public Dog() {
        super();
    }

    public Dog(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return null;
    }


    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }
}
