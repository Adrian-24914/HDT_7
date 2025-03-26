import java.io.*;

public class Manager_Producto {
    private BinarySearchTree<Producto> bst = new BinarySearchTree<>();

    // Carga productos desde un archivo CSV
    public void loadProducts(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine(); // Omitimos encabezado
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                
                // Asegurarse de que las columnas de precio no estén vacías
                String sku = data[6];
                
                double priceRetail = 0.0;
                if (!data[9].isEmpty()) {
                    priceRetail = Double.parseDouble(data[9]);
                }
                
                double priceCurrent = 0.0;
                if (!data[10].isEmpty()) {
                    priceCurrent = Double.parseDouble(data[10]);
                }
                
                String productName = data[18];
                String category = data[0];

                Producto product = new Producto(sku, priceRetail, priceCurrent, productName, category);
                bst.insert(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Buscar un producto por su SKU
    public Producto searchProduct(String sku) {
        return bst.search(new Producto(sku, 0, 0, "", ""));
    }
}
