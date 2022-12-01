public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex('m');
        wolf.setName("Max");
        wolf.setWeight(51.2f);
        wolf.setAge((short) 3);
        wolf.setColour("black");
        System.out.println(wolf.getSex() + ", " + wolf.getName() + ", " + wolf.getWeight() + ", " + 
                wolf.getAge() + ", " + wolf.getColour());
    }
}