import java.util.Random;

public class Pet {

    private int age = generateDefaultAge();
    private Shelter shelter;
    private Color color;

    private int generateDefaultAge() {
        Random r = new Random();
        return r.nextInt(20);
    }

    public int getAge() {
        return age;
    }

    public String getInfo2() {
        return " Питомец    { " +
                " возраст = "+getAge()+
                ", цвет = "+getColor()+
                ", приют "+shelter.getName()+
                " по адрессу "+shelter.getAddress()+
                " }";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getInfo() {
        return "Питомец{" +
                "возраст=" + age +
                ", приют=" + shelter.getName() + " " + shelter.getAddress() +
                ", цвет=" + color +
                '}';
    }



}

























