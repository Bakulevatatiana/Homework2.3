import java.util.Objects;

public class Flightless extends Birds {
    String movementType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public String toString() {
        return "Flightless{" +
                "movementType='" + movementType + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    public Flightless(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = movementType;
    }

    public String getMovementType() {
        return movementType;
    }

    public void go (){
        System.out.println("гулять");
    }
}
