public interface ArvoreBinBusca<E extends Comparable> extends ArvoreBinaria<E> {
    boolean inserir(PosicaoArvoreBin<E> posicao) throws ArvoreNaoVaziaException, PosicaoInvalidaException, ArvoreVaziaException;

    boolean remover(PosicaoArvoreBin<E> posicao) throws PosicaoInvalidaException;

}
