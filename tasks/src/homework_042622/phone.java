package homework_042622;

public class phone {
    String brand;
    String model;
    Double price;
    String country;

    public void setPhone(String brand,String model,double price,String country){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.country=country;
    }
    public String toString() {
        return "Brand: "+brand+"\n"+
                "Model: "+model+"\n"+
                "Price: "+price+"\n"+
                "Country :"+country;
    }
    public String call(){
        return "I'm calling you with my new "+brand+" phone.";
    }


    public static void main(String[] args) {
        phone newPhone=new phone();
        newPhone.setPhone("Apple","iPhone 13 Pro Max",1500,"Designed in California");
        System.out.println(newPhone);
        System.out.println(newPhone.call());
    }
}

