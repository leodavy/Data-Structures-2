public class Posicao<E> {

    private E elemento;
    private Posicao<E> pai;

    public Posicao(E elemento, Posicao<E> pai) {
        this.elemento = elemento;
        this.pai = pai;
    }

    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public Posicao<E> getPai() {
        return pai;
    }

    public void setPai(Posicao<E> pai) {
        this.pai = pai;
    }

}
