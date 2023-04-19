import java.util.Iterator;
public class ArvoreBuscaEncadeada<E extends Comparable<E>> implements ArvoreBinBusca<E> {
    @Override
    public boolean inserir(PosicaoArvoreBin<Comparable> posicao) throws ArvoreNaoVaziaException, PosicaoInvalidaException, ArvoreVaziaException {
        return false;
    }
    @Override
    public boolean remover(PosicaoArvoreBin<Comparable> posicao) throws PosicaoInvalidaException {
        return false;
    }
    public int tamanho(){
        return 0;
    }
    public boolean estaVazia(){
        return true;
    }
    public Iterator<E> iterator(){
    }
    public Iterable<Posicao<E>> posicoes(){
    }
    public E subsitutir(Posicao<E>posicao, E elemento) throws PosicaoInvalidaException {
    }

    public Posicao<E> getRaiz() throws ArvoreVaziaException{
    }

    public Posicao<E>  pai(Posicao<E> posicao) throws PosicaoInvalidaException, LimiteVioladoException{

    }
    public Iterable<Posicao<E>>filhos(Posicao<E> posicao) throws PosicaoInvalidaException{

    }
    public boolean ehInterno(Posicao<E> posicao) throws PosicaoInvalidaException{

    }
    public boolean ehFolha(Posicao<E> posicao) throws PosicaoInvalidaException{

    }
    public boolean ehRaiz(Posicao<E> posicao) throws PosicaoInvalidaException{

    }

    public PosicaoArvoreBin<E> filhoEsq(PosicaoArvoreBin<E> posicao) throws PosicaoInvalidaException, LimiteVioladoException {

    }
    public PosicaoArvoreBin<E> filhoEsq(PosicaoArvoreBin<E> posicao) throws PosicaoInvalidaException, LimiteVioladoException{

    }
    public boolean existeFilhoEsq(PosicaoArvoreBin<E> posicao) throws PosicaoInvalidaException{

    }
    public boolean existeFilhoDir(PosicaoArvoreBin<E> posicao) throws PosicaoInvalidaException{

    }
    public boolean ehFilhoEsq(PosicaoArvoreBin<E> pai, PosicaoArvoreBin<E> filho) throws PosicaoInvalidaException{

    }
    public boolean ehFilhoDir(PosicaoArvoreBin<E> pai, PosicaoArvoreBin<E> filho) throws PosicaoInvalidaException{

    }
    public boolean inserir(PosicaoArvoreBin<E> posicao) throws ArvoreNaoVaziaException, PosicaoInvalidaException, ArvoreVaziaException{

    }
    public boolean remover(PosicaoArvoreBin<E> posicao) throws PosicaoInvalidaException{

    }
    protected PosicaoArvoreBin<E> maior(PosicaoArvoreBin<E> posicao){

    }
    private void removerComDoisFilhos(PosicaoArvoreBin<E> no) throws PosicaoInvalidaException{

    }
    private void removerFilhoUnico(PosicaoArvoreBin<E> no) throws PosicaoInvalidaException{

    }
    private void removerFolha(PosicaoArvoreBin<E> no) throws PosicaoInvalidaException{

    }
    public PosicaoArvoreBin<E> busca(Posicao<E> posicao){

    }
    public boolean existe(Posicao<E> posicao){

    }

}
