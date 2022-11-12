import java.util.Objects;

public class Predators extends Mammals{
    String typeOfFood;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public String toString() {
        return "Predators{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", travelSpeed=" + travelSpeed +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    public Predators(String name, int age, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, age, livingEnvironment,
         travelSpeed);
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if(typeOfFood!=null){this.typeOfFood = typeOfFood;
        }
        else{typeOfFood="неизвестно";
    }}

    public void aet(){
        System.out.println("охотиться");
}}
