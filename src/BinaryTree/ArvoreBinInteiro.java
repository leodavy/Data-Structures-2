package BinaryTree;
public class ArvoreBinInteiro{
    private NoArvoreBinInteiro root;

    public ArvoreBinInteiro() {
        this.root = null;
    }
    public NoArvoreBinInteiro getRoot() {
        return root;
    }
    public void inserir(int data){
        NoArvoreBinInteiro newNode = new NoArvoreBinInteiro(data);
            if(root == null){
                this.root = newNode;
        }else{
            NoArvoreBinInteiro currentNode = this.root;
            while (true){
                if(newNode.getData() < currentNode.getData()){
                    if (currentNode.getLeft() != null){
                        currentNode = currentNode.getLeft();
                    } else {
                        currentNode.setLeft(newNode);
                        break;
                    }
                }else{
                    if (currentNode.getRight() != null){
                        currentNode = currentNode.getRight();
                    } else {
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
            preOrdem(curentNode.getLeft());
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
    public int higherNumber(NoArvoreBinInteiro currentNode){
        if(root == null){
            System.out.println("A lista está vazia");
            return 0;
        }
        int higher = currentNode.getData();
        int leftHigher = higherNumber(currentNode.getLeft());
        int rightHigher = higherNumber(currentNode.getRight());

        if(leftHigher > higher){
            higher = leftHigher;
        }

        if(rightHigher > higher){
            higher = rightHigher;
        }
        return higher;
    }
}




