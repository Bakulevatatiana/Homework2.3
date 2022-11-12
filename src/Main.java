public class Main {
    public static void main(String[] args) {
        Herbivores gazelle=new Herbivores("Газель",2,"Африка",20,"Трава");
        Herbivores giraffe=new Herbivores("Жираф",1,"Африка",1,"трава");
        Herbivores horse=new Herbivores("Лошадь",3,"степь",20,"трава");
Predators hyena=new Predators("Гиена",3,"Африка",20,"мясо");
        Predators tiger =new Predators("Тигр",7,"Африка",40,"мясо");
        Predators bear=new Predators("Медведь",5,"Сибирь",2,"мясо");
        Amphibians frog =new Amphibians("Лягушка",4,"болото");
        Amphibians already=new Amphibians("Уж пресноводный",1,"болото");
        Flightless peacock =new Flightless("Павлин",5,"джунгли","гулять");
        Flightless penguin=new Flightless("Пингвин",3,"Северный полюс","гулять");
        Flightless dodo=new Flightless("Додо птица",1,"Сибирь","гулять");
        Flying gull =new Flying("Чайка",2,"морские просторы","летать");
        Flying albatross =new Flying("Альбатрос",3,"морские просторы","летать");
        Flying falcon =new Flying("Сокол",4,"южный океан","летать");
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(already);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);





    }
}