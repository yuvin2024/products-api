package uk.ac.westminster.products_api;
//A physical product is a product because it represents all the variable based on the class called product
//Customer will not pass this test because it not a product

public class PhysicalProduct extends Product{

    private double weightKg;
    private String dimensions;

    public PhysicalProduct(){

    }

    public PhysicalProduct(Long id, String name, double price, double weightKg,String dimensions){
        super(id,name,price);
        this.dimensions = dimensions;
        this.weightKg = weightKg;
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
