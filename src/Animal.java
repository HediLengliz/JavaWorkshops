public class Animal {


    public String family;
    public  String  name;
    public  int age;
    public boolean isMammal;

    public Animal(String family , String name , int age , boolean isMammal)
    {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;


    }

    public Animal() {

    }

    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
