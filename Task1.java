package OOP;

import java.time.LocalDate;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Cat cat = new Cat();//Экземпляр класса
        cat.setName("Barsic");
        System.out.println(cat.getName());
        Dog dog = new Dog("max",new Chumka("chumka"),"petr", LocalDate.of(3,12,21));
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
        dog.getIllness().heal();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        cat.liveCircle();
        Seagull seagull = new Seagull("Sen",new Illness("Tif"),"Mike",LocalDate.of(4,11,14));
        Duck duck = new Duck();
        Fish fish = new Fish();
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatient(cat).addPatient(dog).addPatient(duck).addPatient(fish).addPatient(seagull);;
        //System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoable());
        System.out.println(clinic.getGoable());
        System.out.println(duck.getFlySpeed());
        System.out.println(duck.getRunSpeed());
        System.out.println(fish.getSwimSpeed());
        Doctor doctor = new Doctor("Mike Paul","M",12,"high");
        fish.setName("Dodo");
        duck.setName("Popo");
        System.out.println(clinic.getingSwim());

        /*
        Хочу во-первых сказать большое спасибо за качественную подачу материала
        после вас хоть в чем-то разобрался.Проьлем у меня не возникло , так как я пересмотрел семинар
        и все стало на свои места)
         */



    }
}
