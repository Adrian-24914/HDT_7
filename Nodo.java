//Representa un nodo del BST
class Nodo<E> {
    E data;
    Nodo<E> left, right;

    public Nodo(E data) {
        this.data = data;
        this.left = this.right = null;
    }
}
