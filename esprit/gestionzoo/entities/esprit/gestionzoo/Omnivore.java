package esprit.gestionzoo;
public interface Omnivore<T extends Enum<T>> extends Carnivore<T>, Herbivore<T> {
    void eatPlantsAndMeat(T food);

    void eatPlant(Food plant);

    void eatPlantAndMeat(Food food);
}