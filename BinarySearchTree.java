public class BinarySearchTree<E extends Comparable<E>> {
    private Nodo<E> root;

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

    public E search(E data) {
        return searchRec(root, data);
    }

    /*
     * @param root
     * @param data
     * @return
     */
    private E searchRec(Nodo<E> root, E data) {
        if (root == null || root.data.equals(data)) 
        return (root != null) ? root.data : null;
        return data.compareTo(root.data) < 0 ? searchRec(root.left, data) : searchRec(root.right, data);
    }

    //Se utilizó como base : https://javarush.com/es/groups/posts/es.3111.estructuras-de-datos-rbol-binario-en-java?utm_source=
}
