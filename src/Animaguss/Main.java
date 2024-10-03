package Animaguss;

public class Main {
    public static void main(String[] args) throws Exception {
        Spider spiders = new Spider();
        spiders.eat();

        Dog trixy = new Dog();
        trixy.setName("Trixy");
        System.out.println("Nama anjing saya adalah " + trixy.getName());
        trixy.play();
        trixy.eat();
        trixy.walk();

        Cat winter = new Cat("Winter");
        System.out.println("Nama kucing saya adalah " + winter.getName());
        winter.play();
        winter.eat();
        winter.walk();
    }
}
