import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager_Producto manager = new Manager_Producto();
        manager.loadProducts("home_appliance_skus_lowes.csv");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el SKU a buscar: ");
        String sku = scanner.nextLine();

        Producto product = manager.searchProduct(sku);
        if (product != null) {
            System.out.println("Producto encontrado: " + product);
        } else {
            System.out.println("Producto no encontrado.");
        }
        scanner.close();
    }
}
