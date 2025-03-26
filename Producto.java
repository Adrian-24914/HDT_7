public class Producto implements Comparable<Producto> {
    private String sku;
    private double priceRetail;
    private double priceCurrent;
    private String productName;
    private String category;

    public Producto(String sku, double priceRetail, double priceCurrent, String productName, String category) {
        this.sku = sku;
        this.priceRetail = priceRetail;
        this.priceCurrent = priceCurrent;
        this.productName = productName;
        this.category = category;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPriceRetail() {
        return priceRetail;
    }

    public void setPriceRetail(double priceRetail) {
        this.priceRetail = priceRetail;
    }

    public double getPriceCurrent() {
        return priceCurrent;
    }

    public void setPriceCurrent(double priceCurrent) {
        this.priceCurrent = priceCurrent;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int compareTo(Producto other) {
        return this.sku.compareTo(other.sku); // Compara por SKU
    }

    @Override
    public String toString() {
        return "Producto{" +
                "sku='" + sku + '\'' +
                ", priceRetail=" + priceRetail +
                ", priceCurrent=" + priceCurrent +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
