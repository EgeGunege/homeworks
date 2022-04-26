package homework_042622;

public class device {
    String brand;
    String model;
    Double price;
    String country;

    public void setDevice(String brand,String model,double price,String country){
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


    public static void main(String[] args) {
        device newDevice=new device();
        newDevice.setDevice("Apple","iPhone 13 Pro Max",1500,"Designed in California");
        System.out.println(newDevice);
    }
}
