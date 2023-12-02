package OOP;

import java.time.LocalDate;

public class Duck extends Animal implements Goable,Flyable,Swimable{
    public Duck() {
        super();
    }

    public Duck(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }




    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }


}
