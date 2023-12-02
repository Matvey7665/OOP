package OOP;

import java.time.LocalDate;

public class Cat extends Animal implements Speakble,Goable{
    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void speak() {
        System.out.println("meow");
    }
    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }


}
