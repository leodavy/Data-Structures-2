package BinaryTree;

public class NoArvoreBinInteiro {
    private int data;
    private NoArvoreBinInteiro left, right;

    public NoArvoreBinInteiro(int newdata) {
        this.data = newdata;
        this.left = null;
        this.right = null;

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NoArvoreBinInteiro getLeft() {
        return left;
    }

    public void setLeft(NoArvoreBinInteiro left) {
        this.left = left;
    }

    public NoArvoreBinInteiro getRight() {
        return right;
    }

    public void setRight(NoArvoreBinInteiro right) {
        this.right = right;
    }
}
