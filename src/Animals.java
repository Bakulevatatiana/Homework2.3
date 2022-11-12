public class Animals  {
   String name;
   int age;

    public Animals(String name, int age) {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat(){}
    public void sleep(){}
    public void go (){}

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
