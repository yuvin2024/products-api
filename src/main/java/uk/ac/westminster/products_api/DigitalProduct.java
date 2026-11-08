package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {
    private double discountedPrice;
    private String downloadUrl;
    private double fileSizeMB;
    public DigitalProduct(){

    }


    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMb) {
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMb;
        this.discountedPrice = price;
    }
    @Override
    public void applyDiscount(double rate) {
        this.discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    @Override
    public  String getSummary() {
        return "digital :" + getName() + "Download :" + downloadUrl;
    }

    public double getFileSizeMB () {
        return fileSizeMB;
    }

    public void setFileSizeMB ( double fileSizeMB){
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl () {
        return downloadUrl;
    }

    public void setDownloadUrl (String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

}
