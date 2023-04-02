package BinaryTree;
public class ArvoreBinInteiro{
    private NoArvoreBinInteiro root;

    public ArvoreBinInteiro() {
        this.root = null;
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
}
