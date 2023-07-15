public class Tree{

    public static final boolean RED = true;
    private static final boolean BLACK = false;

    Node root;

    public void insert(int data) {
        root = insert(root,data);

        root.color = BLACK;

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

        return  node.color == RED;

    }
    private Node rotateLeft(Node node){
        Node tmp = node.right;
        node.right = tmp.left;
        tmp.left = node;
        tmp.color = node.color;

        node.color = RED;

        return tmp;
    }
    private Node rotateRight(Node node){
        Node tmp = node.left;
        node.left = tmp.right;
        tmp.right = node;
        tmp.color = node.color;

        node.color = RED;
        return tmp;
    }
    private void flipColors(Node node){
        node.color = RED;
        node.left.color = BLACK;
        node.right.color = BLACK;
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

        postOrder(root);

    }
    private void postOrder(Node node){
        if(node != null){
            inOrder(node.left);
            inOrder(node.right);
            System.out.println(node.data + " ");
        }
    }

    public void remove(int data) {
        if (!search(data)) {
            System.out.println("O valor " + data + " não está presente na árvore.");
            return;
        }

        root = remove(root, data);
        if (root != null) {
            root.color = BLACK;
        }
    }

    private Node remove(Node node, int data) {
        if (data < node.data) {
            if (!isRed(node.left) && !isRed(node.left.left)) {
                node = moveRedLeft(node);
            }
            node.left = remove(node.left, data);
        } else {
            if (isRed(node.left)) {
                node = rotateRight(node);
            }
            if (data == node.data && (node.right == null)) {
                return null;
            }
            if (!isRed(node.right) && !isRed(node.right.left)) {
                node = moveRedRight(node);
            }
            if (data == node.data) {
                Node minNode = findMinimum(node.right);
                node.data = minNode.data;
                node.right = deleteMinimum(node.right);
            } else {
                node.right = remove(node.right, data);
            }
        }
        return node;
    }


    private Node moveRedLeft(Node node) {
        flipColors(node);
        if (isRed(node.right.left)) {
            node.right = rotateRight(node.right);
            node = rotateLeft(node);
            flipColors(node);
        }
        return node;
    }

    private Node moveRedRight(Node node) {
        flipColors(node);
        if (isRed(node.left.left)) {
            node = rotateRight(node);
            flipColors(node);
        }
        return node;
    }

    private Node balance(Node node) {
        if (isRed(node.right)) {
            node = rotateLeft(node);
        }
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
        }
        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }
        return node;
    }

    private Node deleteMinimum(Node node) {
        if (node.left == null) {
            return null;
        }
        if (!isRed(node.left) && !isRed(node.left.left)) {
            node = moveRedLeft(node);
        }
        node.left = deleteMinimum(node.left);
        return balance(node);
    }

    private Node findMinimum(Node node) {
        if (node.left == null) {
            return node;
        }
        return findMinimum(node.left);
    }

}

