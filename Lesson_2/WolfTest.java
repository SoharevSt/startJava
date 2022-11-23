public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = 'm';
        wolf.name = "Max";
        wolf.weight = 51.2f;
        wolf.age = 3;
        wolf.colour = "black";
        System.out.println(wolf.sex + ", " + wolf.name + ", " + wolf.weight + ", " + wolf.age + 
                ", " + wolf.colour);
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}