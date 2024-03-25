/*
 Consider a simplified representation of a mobile phone manufacturing company 
and implement it using dynamic method dispatch.
1. MobilePhone (Superclass):
• Properties: model, price
• Methods: assemblePhone(), displayDetails()
2. Smartphone (Subclass):
• Properties: operatingSystem, cameraResolution
• Methods: assemblePhone() (overrides the superclass method)
3. FeaturePhone (Subclass):
• Properties: screenType, batteryLife
• Methods: assemblePhone() (overrides the superclass method)
Create objects of both the Smartphone and FeaturePhone classes and refer to them 
using a common MobilePhone reference. Invoke overridden methods based on the 
actual object type, such as calling assemblePhone() to assemble a smartphone or a 
feature phone, depending on the actual object being referred to.
 */
class MobilePhone{
    String model;
    int price;
    public MobilePhone(String model, int price){
        this.model=model;
        this.price=price;
    }
    public void assemblePhone(){
        System.out.println("Assempling phone...");
    }
    public void displayDetails(){
        System.out.println("Model Name is: "+model);
        System.out.println("Price is: "+price);
    }
}
class Smartphone extends MobilePhone{
    String operatingSystem;
    int cameraResolution;
    public Smartphone(String model, int price, String operatingSystem, int cameraResolution){
        super(model,price);
        this.operatingSystem=operatingSystem;
        this.cameraResolution=cameraResolution;
    }
    public void assemblePhone(){
        System.out.println("Assempling Smartphone...");
        super.displayDetails();
    }
}
class FeaturePhone extends MobilePhone{
    String screenType;
    int batteryLife;
    public FeaturePhone(String model, int price, String screenType, int batteryLife){
        super(model, price);
        this.batteryLife=batteryLife;
        this.screenType=screenType;
    }
    public void assemblePhone(){
        System.out.println("Assempling Featurephone...");
        super.displayDetails();
    }
}
public class Code3 {
    public static void main(String[] args) {
        Smartphone obj1 = new Smartphone("Samsung M21", 16000, "Exynos", 48);
        FeaturePhone obj2 = new FeaturePhone("Nokia", 2000, "LCD", 10);
        obj1.assemblePhone();
        obj2.assemblePhone();
    }
}
