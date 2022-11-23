public class Person {

    String name = "Max";
    char sex = 'm';
    short age = 25;
    float height = 1.89f;
    float weight = 85.5f;

    void spellName() {
        System.out.println(name);
    }

    void walk() {
        System.out.println("I walk");
    }

    void lernJava() {
        System.out.println("I am learning Java!");
    }

    short getAge() {
        return age;
    }
}
