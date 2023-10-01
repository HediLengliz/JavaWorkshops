// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class ZooManagement

{
    private int nbrCages = 20;
    private String zooName = "my zoo";

    public ZooManagement(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("entrer le nombre des cages ");

        while(!scanner.hasNextInt()){
            System.out.println("erreur !, veuillez enter un nombre des cages");
        }

        nbrCages = scanner.nextInt();

        scanner.nextLine();

        System.out.print("entrer le nom du Zoo");
        zooName = scanner.nextLine();

        scanner.close();


    }
    public void displayMessage()
    {
        System.out.println(zooName +" comporte " + nbrCages+" cages ");

    }
    public static void main (String[] args) {

        ZooManagement zoo = new ZooManagement();
        zoo.displayMessage();


        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Wildlife Park";
        myZoo.city = "Ariana";
        myZoo.setNbrCages(25);
        myZoo.animals = new Animal[25];


        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

    }


}