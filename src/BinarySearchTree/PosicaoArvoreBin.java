public class PosicaoArvoreBin<E> extends Posicao<E> {

    private PosicaoArvoreBin<E> esquerda;
    private PosicaoArvoreBin<E> direita;

    public PosicaoArvoreBin(E elemento, PosicaoArvoreBin<E> pai) {
        super(elemento, pai);
    }

    public PosicaoArvoreBin<E> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(PosicaoArvoreBin<E> esquerda) {
        this.esquerda = esquerda;
    }

    public PosicaoArvoreBin<E> getDireita() {
        return direita;
    }

    public void setDireita(PosicaoArvoreBin<E> direita) {
        this.direita = direita;
    }

}