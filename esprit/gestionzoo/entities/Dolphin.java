public abstract class Dolphin extends Aquatic {
    private final float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public abstract void swim();

    @Override
    public String toString(){
        return  super.toString() + "swimmingSpeed :" + swimmingSpeed;
    }
}