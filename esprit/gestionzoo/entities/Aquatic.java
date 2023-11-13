import esprit.gestionzoo.Carnivore;
import esprit.gestionzoo.Food;

public abstract non-sealed  class Aquatic extends Animal  implements  Carnivore<Food> {
    private final String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return super.toString() + " Habitat: " + habitat;
    }

    public abstract void swim();
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aquatic other)) {
            return false;
        }
        return this.getname().equals(other.getname()) && this.getAge() == other.getAge() && this.habitat.equals(other.habitat);
    }



    protected abstract Object getname();

    public void eatMeat(Food meat) {
        // Implementation for eating meat in water
        System.out.println("Aquatic is eating meat: " + meat);
    }
}