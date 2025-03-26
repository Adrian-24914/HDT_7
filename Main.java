import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager_Producto manager = new Manager_Producto();
        manager.loadProducts("SKUs.csv");

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n=== Menú ===");
            System.out.println("1. Buscar producto por SKU");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Ingrese un número válido: ");
                scanner.next();
            }
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (option) {
                case 1:
                    System.out.print("Ingrese el SKU a buscar: ");
                    String sku = scanner.nextLine().trim();

                    if (sku.isEmpty()) {
                        System.out.println("El SKU no puede estar vacío.");
                        break;
                    }

                    Producto product = manager.searchProduct(sku);
                    if (product != null) {
                        printProduct(product);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (option != 2);

        scanner.close();
    }

    // Método para imprimir un producto de forma ordenada
    private static void printProduct(Producto product) {
        System.out.println("\n=== Producto Encontrado ===");
        System.out.println(String.format("SKU: %s", product.getSku()));
        System.out.println(String.format("Nombre: %s", product.getProductName()));
        System.out.println(String.format("Categoría: %s", product.getCategory()));
        System.out.println(String.format("Precio Retail: $%.2f", product.getPriceRetail()));
        System.out.println(String.format("Precio Actual: $%.2f", product.getPriceCurrent()));
    }
}
