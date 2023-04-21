public interface ArvoreBinBusca<E extends Comparable> extends ArvoreBinaria<E> {
    public boolean inserir(PosicaoArvoreBin<E> posicao) throws ArvoreNaoVaziaException, PosicaoInvalidaException, ArvoreVaziaException;
    public  boolean remover(PosicaoArvoreBin<E> posicao) throws PosicaoInvalidaException;

}
