package homework_042622;

public class animal {
    String name;
    Integer age;
    String color;
    public void setAnimal(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public String sleep(){
        return name+" is sleeping";
    }
    public String eat(){
        return name+" is eating";
    }
    public String drink(){
        return name+" is drinking";
    }
    public String move(){
        return name+" is moving";
    }
    public String fly(){
        return name+" is flying";
    }
    public String getInfoCat(){
        return name+" is cat."+age+" years old and in "+color;
    }
    public String getInfoBird(){
        return name+" is bird."+age+" years old and in "+color;
    }


}
