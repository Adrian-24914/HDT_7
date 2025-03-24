import java.io.*;
import java.util.*;

public class Manager_Producto {
    

    public void loadProducts() {
        //Lector CSV
        String fileName = "home appliance skus lowes.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine(); // Omitir encabezado
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String sku = data[6];
                double priceRetail = Double.parseDouble(data[9]);
                double priceCurrent = Double.parseDouble(data[10]);
                String productName = data[18];
                String category = data[0];

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}