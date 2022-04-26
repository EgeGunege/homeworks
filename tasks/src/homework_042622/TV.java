package homework_042622;

public class TV {
    String brand;
    String model;
    Double price;
    String country;

    public void setTV(String brand,String model,double price,String country){
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
    public String watch(){
        return "I'm watching TV series on my "+brand+" TV.";
    }

    public static void main(String[] args) {
        TV newTV=new TV();
        newTV.setTV("Samsung","60' Q80 Qled TV",1200,"Republic of Korea");
        System.out.println(newTV);
        System.out.println(newTV.watch());
    }
}
