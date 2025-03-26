public class BinarySearchTree<E extends Comparable<E>> {
    private Nodo<E> root;

    // Insertar un elemento en el BST
    public void insert(E data) {
        root = insertRec(root, data);
    }

    private Nodo<E> insertRec(Nodo<E> root, E data) {
        if (root == null) return new Nodo<>(data);
        if (data.compareTo(root.data) < 0) 
            root.left = insertRec(root.left, data);
        else if (data.compareTo(root.data) > 0) 
            root.right = insertRec(root.right, data);
        return root;
    }

    // Buscar un elemento en el BST
    public E search(E data) {
        return searchRec(root, data);
    }

    private E searchRec(Nodo<E> root, E data) {
        if (root == null) return null;  // No encontrado
        if (root.data.equals(data)) return root.data; // Encontrado

        // Buscar en la rama izquierda o derecha
        return data.compareTo(root.data) < 0 ? searchRec(root.left, data) : searchRec(root.right, data);
    }
}

