public class Posicao<E> {
    E elemento;
    Posicao<E> left,right;

    public Posicao(E elemento) {
        this.elemento = elemento;
    }public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public Posicao<E> getLeft() {
        return left;
    }

    public void setLeft(Posicao<E> left) {
        this.left = left;
    }

    public Posicao<E> getRight() {
        return right;
    }

    public void setRight(Posicao<E> right) {
        this.right = right;
    }
}
