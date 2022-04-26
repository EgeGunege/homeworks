package homework_042622;

public class cat {
    public static void main(String[] args) {
        animal cat=new animal();
        cat.setAnimal("Thor",1,"Yelow");
        System.out.println(cat.getInfoCat());
        System.out.println(cat.sleep());
        System.out.println(cat.move());
        System.out.println(cat.eat());
        System.out.println(cat.drink());
    }
}
