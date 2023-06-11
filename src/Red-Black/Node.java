public class Node {
    int data;
    Node left, right;
    boolean color;
    Node(int data){
        this.data = data;
        this.color = Tree.red;
    }
}