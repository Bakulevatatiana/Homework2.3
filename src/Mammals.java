import java.util.Objects;

public class Mammals extends Animals{

    String livingEnvironment;
    int travelSpeed;

    public Mammals(String name, int age, String livingEnvironment,
    int travelSpeed) {
        super(name,age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammals mammals = (Mammals) o;
        return travelSpeed == mammals.travelSpeed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment, travelSpeed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if(livingEnvironment!=null){this.livingEnvironment = livingEnvironment;
        }
        else{livingEnvironment="неизвестно";

    }}

    public int getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(int travelSpeed) {
        if(travelSpeed!=0){this.travelSpeed = travelSpeed;
        }
        else{travelSpeed=2;


    }}

    public void go(){
        System.out.println("гулять");
    };
}
