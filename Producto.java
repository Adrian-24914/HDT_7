//Clase producto con gets 

public class Producto {
    private String sku;
    private double price_Retail;
    private double price_Current;
    private String product_Name;
    private String category;

    public Producto(String sku, double price_Retail, double price_Current, String product_Name, String category) {
        this.sku = sku;
        this.price_Retail = price_Retail;
        this.price_Current = price_Current;
        this.product_Name = product_Name;
        this.category = category;
    }

    public String getSku() {
        return sku;
    }

    public double getprice_Retail() {
        return price_Retail;
    }

    public double getprice_Current() {
        return price_Current;
    }

    public String getproduct_Name() {
        return product_Name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "SKU: " + sku + ", Producto: " + product_Name + ", Categoria: " + category +
               ", Precio Minorista: $" + price_Retail + ", Precio Actual: $" + price_Current;
    }
}
