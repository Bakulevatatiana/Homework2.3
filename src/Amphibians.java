import java.util.Objects;

public class Amphibians extends Animals {
    String livingEnvironment;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }


    public Amphibians(String name, int age, String livingEnvironment) {
        super(name,age);
        this.livingEnvironment = livingEnvironment;
    }

    public void aet() {
        System.out.println("охотиться");
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                "} " + super.toString();
    }
}
