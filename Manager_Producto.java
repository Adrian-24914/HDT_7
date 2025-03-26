import java.io.*;
import java.util.*;


public class Manager_Producto {
    private BinarySearchTree<Producto> bst = new BinarySearchTree<>();

    public void loadProducts(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine(); // Omitimos encabezado
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String sku = data[6];
                double priceRetail = Double.parseDouble(data[9]);
                double priceCurrent = Double.parseDouble(data[10]);
                String productName = data[18];
                String category = data[0];

                Producto product = new Producto(sku, priceRetail, priceCurrent, productName, category);
                bst.insert(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Producto searchProduct(String sku) {
        return bst.search(new Producto(sku, 0, 0, "", ""));
    }
}