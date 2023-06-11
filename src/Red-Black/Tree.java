public class Tree{
    public static final boolean red = true;
    private static final boolean black = false;
    Node root;

    public void insert(int data) {
        root = insert(root,data);
        root.color = black;
    }
    private Node insert(Node node, int data) {
        if (node == null) return new Node(data);
        if(data < node.data) node.left = insert(node.left,data);
        else if (data > node.data) node.right = insert(node.right,data);
        else return node;
        if(isRed(node.right) && !isRed(node.left)) node = rotateLeft(node);
        if(isRed(node.left) && isRed(node.left.left)) node = rotateRight(node);
        if(isRed(node.left) && isRed(node.right)) flipColors(node);
        return node;
    }
    private boolean isRed(Node node) {
        if(node == null) return false;
        return  node.color == red;
    }
    private Node rotateLeft(Node node){
        Node tmp = node.right;
        node.right = tmp.left;
        tmp.left = node;
        tmp.color = node.color;
        node.color = red;
        return tmp;
    }
    private Node rotateRight(Node node){
        Node tmp = node.left;
        node.left = tmp.right;
        tmp.right = node;
        tmp.color = node.color;
        node.color = red;
        return tmp;
    }
    private void flipColors(Node node){
        node.color = red;
        node.left.color = black;
        node.right.color = black;
    }

    public boolean search(int data){
        return search(root,data);
    }

    private boolean search(Node node, int data){
        if(node == null) return false;
        if(data < node.data) return search(node.left,data);
        else if(data > node.data) return search(node.right,data);
        else return true;
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node != null) {
            System.out.println(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.data + " ");
            inOrder(node.right);
        }
    }
    public void postOrder(){
        inOrder(root);
    }
    private void postOrder(Node node){
        if(node != null){
            inOrder(node.left);
            inOrder(node.right);
            System.out.println(node.data + " ");
        }
    }
}

