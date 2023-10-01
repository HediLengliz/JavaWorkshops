public class Zoo
{
    public Animal[] animals;
    public String name;
    public String city;
    private int nbrCages = 25;
    int nbrAnimals;

    public Zoo() {
    }


    public Zoo(String name,String city, int nbrCages){

        this.name = name;
        this.city = city;
        this.setNbrCages(nbrCages);
        this.animals = new Animal[25];
    }
    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages/Animals: " + getNbrCages());
    }
    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (nbrAnimals == getNbrCages())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }
    void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }
    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + getNbrCages();
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public boolean isZooFull() {

        int animalCount = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                animalCount++;
            }
        }
        return animalCount == nbrCages;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        int animalCountZ1 = 0;
        int animalCountZ2 = 0;

        for (Animal animal : z1.animals) {
            if (animal != null) {
                animalCountZ1++;
            }
        }

        for (Animal animal : z2.animals) {
            if (animal != null) {
                animalCountZ2++;
            }
        }

        if (animalCountZ1 > animalCountZ2) {
            return z1;
        } else if (animalCountZ2 > animalCountZ1) {
            return z2;
        } else {
            // Les zoos ont le même nombre d'animaux, renvoyer l'un d'eux (z1 dans ce cas)
            return z1;
        }
    }

}