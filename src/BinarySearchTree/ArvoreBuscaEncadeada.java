
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArvoreBuscaEncadeada<E extends Comparable<E>> implements ArvoreBinBusca<E> {
    PosicaoArvoreBin<E> raiz;
    int tamanho;

    public ArvoreBuscaEncadeada(PosicaoArvoreBin<E> raiz, int tamanho) {
        this.raiz = raiz;
        this.tamanho = tamanho;
    }

    public void setRaiz(PosicaoArvoreBin<E> raiz) {
        this.raiz = raiz;
    }
    public int tamanho({
        return tamanho;
    }
    public boolean estaVazia(){
        return raiz == null;
    }
    public Iterator<E> iterator(){
        List<E> lista = new ArrayList<>();
        for (Posicao<E> p : posicoes()) {
            lista.add(p.getElemento());
        }
        return lista.iterator();
    }
    public Iterable<Posicao<E>> posicoes(){
        List<Posicao<E>> lista = new ArrayList<>();
        if (!estaVazia()) {
            preOrdem(raiz, lista);
        }
        return lista;

    }
    public E subsitutir(Posicao<E>posicao, E elemento) throws PosicaoInvalidaException {

    }

    public Posicao<E> getRaiz() throws ArvoreVaziaException {
        if(tamanho == 0) throw new ArvoreVaziaException("A arvore esta vazia");
        return raiz;
    }

    public Posicao<E>  pai(Posicao<E> posicao) throws PosicaoInvalidaException, LimiteVioladoException {

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
    public PosicaoArvoreBin<E> filhoDir(PosicaoArvoreBin<E> posicao) throws PosicaoInvalidaException, LimiteVioladoException{

    }
    public boolean existeFilhoEsq(PosicaoArvoreBin<E> posicao) throws PosicaoInvalidaException{

    }

    public boolean existeFilhoDir(PosicaoArvoreBin<E> posicao) throws PosicaoInvalidaException{

    }
    public boolean ehFilhoEsq(PosicaoArvoreBin<E> pai, PosicaoArvoreBin<E> filho) throws PosicaoInvalidaException{

    }
    public boolean ehFilhoDir(PosicaoArvoreBin<E> pai, PosicaoArvoreBin<E> filho) throws PosicaoInvalidaException{

    }
    protected PosicaoArvoreBin<E> maior(PosicaoArvoreBin<E> posicao){

    }
    private void removerComDoisFilhos(PosicaoArvoreBin<E> no) throws PosicaoInvalidaException{

    }
    private void removerFilhoUnico(PosicaoArvoreBin<E> no) throws PosicaoInvalidaException{

    }
    private void removerFolha(PosicaoArvoreBin<E> no) throws PosicaoInvalidaException{

    }
    public PosicaoArvoreBin<E> busca(Posicao<E> posicao) throws ArvoreVaziaException {


    }
    public boolean existe(Posicao<E> posicao){

    }

    @Override
    public boolean inserir(PosicaoArvoreBin posicao) throws ArvoreNaoVaziaException, PosicaoInvalidaException, ArvoreVaziaException {
        if(posicao == null) throw new PosicaoInvalidaException("Posiçao invalida");
        if(raiz != null) throw new ArvoreNaoVaziaException("A arvore ja possui raiz");
        raiz = posicao;
        tamanho++;
        return true;
    }

    @Override
    public boolean remover(PosicaoArvoreBin posicao) throws PosicaoInvalidaException {

    }
    private void preOrdem(PosicaoArvoreBin<E> pos, List<Posicao<E>> lista) {
        if (pos != null) {
            lista.add(pos);
            preOrdem(pos.getEsquerda(), lista);
            preOrdem(pos.getDireita(), lista);
        }
    }
}
