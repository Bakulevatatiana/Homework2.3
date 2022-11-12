import java.util.Objects;

public class Flying extends Birds{
    String movementType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    public Flying(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = movementType;
    }

    public String getMovementType() {
        return movementType;
    }

    public void go (){
        System.out.println("летать");
    }
}
