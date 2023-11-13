package  esprit.gestionzoo;
public interface Carnivore<T extends Enum<T>> {
    void eatMeat(T meat);
}