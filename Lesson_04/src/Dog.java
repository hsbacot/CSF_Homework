/**
 * Created by hsbacot on 12/16/13.
 */
public class Dog {

    private String name;
    private String breed;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String bark() {
        return "Woof!";
    }

    public int numberOfLegs() {
        return 4;
    }

    public void move() {
        System.out.println(this.name + " walked 4 steps");
    }

}
