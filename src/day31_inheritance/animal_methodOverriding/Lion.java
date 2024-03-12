package day31_inheritance.animal_methodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfrican) {
        super(name, breed, gender, age, size, color);
        setAfrican(isAfrican);
    }

    public boolean isAfrican() {
        return isAfricanLion;
    }

    public void setAfrican(boolean african) {
        isAfricanLion = african;
    }

    @Override
    public void eat() {
        System.out.println("Lion "+ getName() + " is eating deer");
    }

    public void roar() { // uniq method for lion
        System.out.println("Lion " + getName()+ " is roaring");
    }

    @Override
    public String toString() { // since we have additional variable in lion class, we need override toString method
        return super.toString().replace("}", "") +
                ", African Lion='" + isAfricanLion + '\'' +
                '}';
    }
}
