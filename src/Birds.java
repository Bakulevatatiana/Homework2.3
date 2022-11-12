import java.util.Objects;

public class Birds extends Animals {
    String livingEnvironment;

    @Override
    public String toString() {
        return "Birds{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if(livingEnvironment!=null){
        this.livingEnvironment = livingEnvironment;}
        else{livingEnvironment="неизвестно";
    }}

    public void aet(){
        System.out.println("охотиться");
    }}

