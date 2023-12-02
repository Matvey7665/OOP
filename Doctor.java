package OOP;

public class Doctor {
   private String name;
    private String sex;
    private int workexperience;
    private String education;
    public Doctor(String name, String sex, int workexperience, String education) {
        this.name = name;
        this.sex = sex;
        this.workexperience = workexperience;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getWorkexperience() {
        return workexperience;
    }

    public String getEducation() {
        return education;
    }
}
