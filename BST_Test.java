import org.junit.*;

public class BST_Test {

    
    @Test
    public void InsertAndSearch() {
        BinarySearchTree<Producto> bst = new BinarySearchTree<>();
        Producto producto1 = new Producto("SKU123", 100.0, 90.0, "Producto A", "Electrónica");
        Producto producto2 = new Producto("SKU456", 200.0, 180.0, "Producto B", "Hogar");

        bst.insert(producto1);
        bst.insert(producto2);

        Assert.assertEquals("El producto SKU123 no fue encontrado en el árbol", producto1, bst.search(new Producto("SKU123", 0, 0, "", "")));
        Assert.assertEquals("El producto SKU456 no fue encontrado en el árbol", producto2, bst.search(new Producto("SKU456", 0, 0, "", "")));
    }

    
    @Test
    public void ProductNotFound() {
        BinarySearchTree<Producto> bst = new BinarySearchTree<>();
        Producto producto1 = new Producto("SKU123", 100.0, 90.0, "Producto A", "Electrónica");
        Producto producto2 = new Producto("SKU456", 200.0, 180.0, "Producto B", "Hogar");

        bst.insert(producto1);
        bst.insert(producto2);

        Assert.assertNull("Se encontró un producto inexistente", bst.search(new Producto("SKU999", 0, 0, "", ""))); // Producto no existe
    }
}
