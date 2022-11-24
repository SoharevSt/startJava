public class Wolf {

    private char sex;
    private String name;
    private float weight;
    private short age;
    private String colour;

    public void walk() {
        System.out.println("walks");
    }

    public void sit() {
        System.out.println("sits");
    }

    public void run() {
        System.out.println("runs");
    }

    public void howl() {
        System.out.println("howls");
    }

    public void hunt() {
        System.out.println("hunts");
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}