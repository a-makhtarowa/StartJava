public class Wolf {
    private String sex;
    private String name;
    private double weight;
    private int age;
    private String color;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age < 0 || age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public void go() {
        System.out.println("Go!");
    }

    public void sit() {
        System.out.println("Sit!");
    }

    public void run() {
        System.out.println("Run!");
    }

    public void howl() {
        System.out.println("Howl louder!");
    }

    public void hunt() {
        System.out.println("Hunt!");
    }
}