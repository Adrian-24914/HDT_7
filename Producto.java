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

    // Comparación basada solo en el SKU
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return sku.equals(producto.sku); // Solo compara el SKU
    }

    @Override
    public int hashCode() {
        return sku.hashCode(); // Se usa solo el SKU para el hashCode
    }

    @Override
    public int compareTo(Producto other) {
        return this.sku.compareTo(other.sku); // Compara solo por SKU
    }

    // Imprimir información de forma ordenada
    @Override
    public String toString() {
        return String.format(
            "\n=== Producto ===\nSKU: %s\nNombre: %s\nCategoría: %s\nPrecio Retail: $%.2f\nPrecio Actual: $%.2f",
            sku, productName, category, priceRetail, priceCurrent
        );
    }
}
