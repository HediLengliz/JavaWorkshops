import esprit.gestionzoo.Omnivore;

public class Animal implements Omnivore<String> {

    String family, name;
    int age;
    boolean isMammal;


    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("L'âge ne peut pas être négatif.");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public void eatMeat(String meat) {
        // Implementation for carnivorous behavior
        System.out.println("Eating meat: " + meat);
    }

    @Override
    public void eatPlants(String plants) {
        // Implementation for herbivorous behavior
        System.out.println("Eating plants: " + plants);
    }

    public void eatPlantsAndMeat(String food) {
        // Implementation for omnivorous behavior
        System.out.println("Eating plants and meat: " + food);
    }
}
