package OOP;

import java.time.LocalDate;

public class Seagull extends Animal implements Goable,Swimable,Flyable,Speakble{
    public Seagull(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getFlySpeed() {
        return Flyable.super.getFlySpeed();
    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }

    @Override
    public void speak() {

    }

    @Override
    public double getSwimSpeed() {
        return Swimable.super.getSwimSpeed();
    }
}
