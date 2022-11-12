import java.util.Objects;

public class Herbivores extends Mammals{
   String typeOfFood;

   public Herbivores(String name, int age, String livingEnvironment,
                     int travelSpeed, String typeOfFood) {
      super(name,age, livingEnvironment,
      travelSpeed);

   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Herbivores that = (Herbivores) o;
      return Objects.equals(typeOfFood, that.typeOfFood);
   }

   @Override
   public int hashCode() {
      return Objects.hash(  typeOfFood);
   }

   public String getTypeOfFood() {
      return typeOfFood;
   }

   public void setTypeOfFood(String typeOfFood) {
      if(typeOfFood!=null){this.typeOfFood = typeOfFood;
         }
      else{typeOfFood="неизвестно";

   }}

   public void go(){
      System.out.println("пастись");
   }


}
