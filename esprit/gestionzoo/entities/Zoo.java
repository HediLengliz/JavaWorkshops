
public class Zoo {

    static final int NUMBER_OF_CAGES = 25;
    Animal[] animals;
    String name, city;
    int nbrAnimals;
    private Aquatic[] aquaticAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.city = city;
        this.name = name;
        aquaticAnimals = new Aquatic[10];
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Le nom du zoo ne peut pas être vide.");
        }
    }
    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    void addAnimal(Animal animal) throws zooFullException,invalidAgeException {
        if (nbrAnimals == NUMBER_OF_CAGES) {
            throw new zooFullException("Le zoo est plein. Impossible d'ajouter un nouvel animal.");
        }
        if (animal.getAge() < 0) {
            throw new invalidAgeException("L'âge de l'animal ne peut pas être négatif.");
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println("Animal ajouté au zoo.");
    }

    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
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

    boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }
    public void addAquaticAnimal(Aquatic aquatic){
        for (int i = 0; i< aquaticAnimals.length;i++){
            if (aquaticAnimals[i] == null){
                aquaticAnimals = new Aquatic[]{aquatic};
                System.out.println("aquatic animal added to the zoo ");
                return;
            }

        }
        System.out.println("no space available for additional aquatic animals ");
    }
    public void letAquaticAnimalsSwim() {
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                aquatic.swim();
            }
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal instanceof Penguin penguin) {
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimal instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of dolphins in the zoo: " + dolphinCount);
        System.out.println("Number of penguins in the zoo: " + penguinCount);
    }
}