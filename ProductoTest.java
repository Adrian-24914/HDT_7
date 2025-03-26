import org.junit.*;

public class ProductoTest {
    
    
    @Test
    public void MismoSKU() {
        Producto producto1 = new Producto("SKU123", 100.0, 90.0, "Producto A", "Electrónica");
        Producto p3 = new Producto("SKU123", 150.0, 140.0, "Producto C", "Electrónica");
        Assert.assertTrue("Los productos con el mismo SKU deben ser iguales", producto1.equals(p3)); // Mismo SKU, se consideran iguales
    }

    
    @Test
    public void DiferenteSKU() {
        Producto producto1 = new Producto("SKU123", 100.0, 90.0, "Producto A", "Electrónica");
        Producto producto2 = new Producto("SKU456", 200.0, 180.0, "Producto B", "Hogar");
        Assert.assertFalse("Los productos con SKU diferentes no deben ser iguales", producto1.equals(producto2)); // Diferentes SKU, se consideran diferentes
    }

    
    @Test
    public void SameCategory() {
        Producto producto1 = new Producto("SKU123", 100.0, 90.0, "Producto A", "Electrónica");
        Producto producto2 = new Producto("SKU456", 200.0, 180.0, "Producto B", "Hogar");
        Assert.assertTrue("El producto1 debe tener un SKU menor que el producto2", producto1.compareTo(producto2) < 0); // SKU123 < SKU456
    }

  
}
