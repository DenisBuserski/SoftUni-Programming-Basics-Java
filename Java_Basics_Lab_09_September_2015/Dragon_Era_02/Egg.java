package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Archive.Advanced_Java.Advanced_Java_Exams.Java_Basics_Lab_09_September_2015.Dragon_Era_02;

public class Egg {
    private final int AGE_HATCH = 2;

    private int age;
    private Dragon parent;
    private YearType yearFactor;

    public void setYearFactor(YearType yearType){
        this.yearFactor = yearType;
    }

    public Egg(int age, Dragon parent) {
        this.setAge(age);
        this.setParent(parent);
    }

    public Dragon getParent() {
        return parent;
    }

    private void setParent(Dragon parent) {
        this.parent = parent;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public void age(){
        this.age++;
    }

    public void hatch(){

        if(this.age == AGE_HATCH){
            int yearFactor = this.yearFactor.ordinal();
            for (int i = 0; i <yearFactor ; i++) {
                Dragon baby = new Dragon(this.parent.getName()+"/Dragon_" + Dragon.dragonsCount,-1);
                this.parent.increaseOffspring(baby);
                Dragon.dragonsCount++;
            }
        }
    }
}
