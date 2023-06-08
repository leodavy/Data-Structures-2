public class Tree {
    private Node root;

    public void insert(int data){
        root = inserNode(root,data);

    }

    private Node inserNode(Node node, int data){

        if(node == null) return new Node(data);
        if(data < node.data ) node.left = inserNode(node.left, data);
        else if(data > node.data) node.right = inserNode(node.right,data);
        else return node;
        node.height = 1 + Math.max(node.left != null ? node.left.height : 0 , node.right != null ? node.right.height : 0 );

        int balance = getBalance(node);

        if(balance > 1 && data < node.left.data) return  rotateRight(node);
        if(balance < -1 && data > node.right.data) return rotateLeft(node);

        if(balance > 1 && data > node.left.data) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if(balance < -1 && data < node.right.data) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }

    private Node rotateLeft (Node node) {
        Node rightChild = node.right;
        Node leftOfRight = rightChild.left;

        rightChild.left = node;
        node.right = leftOfRight;

        node.height = 1 + Math.max(node.left != null ? node.left.height : 0, node.right != null ? node.right.height : 0);
        rightChild.height = 1 + Math.max(rightChild.left != null ? rightChild.left.height : 0, rightChild.right != null ? rightChild.right.height : 0);
        return rightChild;

    }
    private Node rotateRight (Node node){
        Node leftChild = node.left;
        Node rightOfLeft = leftChild.right;

        leftChild.right = node;
        node.left = rightOfLeft;

        node.height = 1 + Math.max(node.left != null ? node.left.height : 0, node.right != null ? node.right.height : 0);
        leftChild.height = 1 + Math.max(leftChild.left != null ? leftChild.left.height : 0, leftChild.right != null ? leftChild.right.height : 0);
        return leftChild;
    }
    private int getBalance(Node node){
        if(node == null) {
            return 0;
        }
        return (node.left != null ? node.left.height : 0) - (node.right != null ? node.right.height : 0);
    }
    public void preOrderTraversal() {
        preOrder(root);
    }
    private void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void inOrderTraversal() {
        inOrder(root);
    }
    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }
    public void postOrderTraversal() {
        postOrder(root);
    }
    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

}
