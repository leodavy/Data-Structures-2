package BinaryTree;
public class ArvoreBinInteiro{
    public NoArvoreBinInteiro root;

    public ArvoreBinInteiro() {
        this.root = null;
    }

    public NoArvoreBinInteiro getRoot() {
        return root;
    }
    public void inserir(int value) {
        NoArvoreBinInteiro newNode = new NoArvoreBinInteiro(value);

        if(root == null){
            root = newNode;
        }else{
            NoArvoreBinInteiro currentNode = root;
            while (true){
                if(newNode.data < currentNode.data){
                    if(currentNode.left != null){
                        currentNode = currentNode.left;
                    } else {
                        currentNode.setLeft(newNode);
                        break;
                    }
                }else {
                    if (currentNode.right != null){
                        currentNode = currentNode.right;
                    }else {
                        currentNode.setRight(newNode);
                        break;
                    }
                }

            }
        }

    }
    public void preOrdem(NoArvoreBinInteiro curentNode) {
        if (curentNode != null) {
            System.out.println(curentNode.getData());
            preOrdem(curentNode.getLeft());
            preOrdem(curentNode.getRight());
        }
    }
    public void posOrdem(NoArvoreBinInteiro currentNode) {
        if (currentNode != null) {
            posOrdem(currentNode.getLeft());
            posOrdem(currentNode.getRight());
            System.out.println(currentNode.getData());
        }
    }
    public void simetrico(NoArvoreBinInteiro currentNode){
        if(currentNode != null) {
            simetrico(currentNode.getLeft());
            System.out.println(currentNode.getData());
            simetrico(currentNode.getRight());
        }
    }

    public int higherNumber(NoArvoreBinInteiro currentnode) {
        return currentnode.right != null ? higherNumber(currentnode.right) : currentnode.data;
    }

    public int deepestLevel(NoArvoreBinInteiro currentnode) {
        if(root == null){
            System.out.println("A árvore está vazia");
            return 0;
        }
        int lDeep = deepestLevel(currentnode.getLeft());
        int rDeep = deepestLevel(currentnode.getRight());

        if (lDeep > rDeep) return lDeep + 1;
        else return  rDeep + 1;

    }
    public boolean isEmpty (){
        return root == null;
    }

}




