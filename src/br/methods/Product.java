package br.methods;

public class Product {

    private String productName;
    private double productValue;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductValue(double productValue) {
        this.productValue = productValue;
    }

    public double getProductValue() {
        return productValue;
    }

    @Override
    public String toString() {
        return "Product [name=" + productName + ", value=" + productValue + "]";
    }
}
