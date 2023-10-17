public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
        Aquatic aquatic = new Aquatic("fish", "shark", 10, false, "ocean") {
            @Override
            public void swim() {

            }

            @Override
            protected Object getname() {
                return null;
            }
        };
        Terrestrial terrestrial = new Terrestrial("Felidae","Tiger",15,true,4);
        Dolphin dolphin = new Dolphin("Dolphinidae", "dolphon", 6, false, "ocean", 37.3f) {
            @Override
            public void swim() {

            }

            @Override
            protected Object getname() {
                return null;
            }
        };
        Penguin penguin = new Penguin("Spheniscidae", "penguin", 7, false, "ocean", 50.0f) {
            @Override
            public void swim() {

            }

            @Override
            protected Object getname() {
                return null;
            }
        };
        Aquatic shark = new Aquatic("Lamnidae", "Shark", 10, false, "Ocean") {
            @Override
            public void swim() {

            }

            @Override
            protected Object getname() {
                return null;
            }
        };
        System.out.println(aquatic.toString());
        System.out.println(terrestrial.toString());
        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());
        aquatic.swim();
        dolphin.swim();
        penguin.swim();
        myZoo.addAquaticAnimal(shark);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.letAquaticAnimalsSwim();

//        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());

    }

}
