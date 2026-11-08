package uk.ac.westminster.products_api;
//A physical product is a product because it represents all the variable based on the class called product
//Customer will not pass this test because it not a product

public class PhysicalProduct extends Product implements Discountable{

    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct(){
    }
    @Override
    public String getSummary() {
    return "physical: " + getName() + "weight: " + getWeightKg();
    }


    public PhysicalProduct(Long id, String name, double price, double weightKg,String dimensions){
        super(id,name,price);
        this.dimensions = dimensions;
        this.weightKg = weightKg;
        this.discountedPrice = price;
    }
    @Override
    public void applyDiscount(double rate){
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - capped);
    }
    @Override
    public double getDiscountedPrice(){
        return discountedPrice;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
