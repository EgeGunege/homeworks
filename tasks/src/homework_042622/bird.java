package homework_042622;

public class bird {
    public static void main(String[] args) {
        animal bird=new animal();
        bird.setAnimal("Bird",2,"Blue");
        System.out.println(bird.getInfoBird());
        System.out.println(bird.sleep());
        System.out.println(bird.fly());
        System.out.println(bird.eat());
        System.out.println(bird.drink());
    }
}
