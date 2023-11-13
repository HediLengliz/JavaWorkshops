import esprit.gestionzoo.Food;
import esprit.gestionzoo.Omnivore;

public class Terrestrial implements Omnivore<Food> extends Animal {
    private final int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    @Override
    public String toString(){
        return  super.toString() + "nbrLegs :" + nbrLegs;
    }
    public void eatMeat(Food meat) {
        // Implementation for eating meat on land
        System.out.println("Terrestrial is eating meat: " + meat);
    }

    @Override
    public void eatPlant(Food plant) {
        // Implementation for eating plant on land
        System.out.println("Terrestrial is eating plant: " + plant);
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        // Implementation for eating both plant and meat on land
        System.out.println("Terrestrial is eating plant and meat: " + food);
    }
}