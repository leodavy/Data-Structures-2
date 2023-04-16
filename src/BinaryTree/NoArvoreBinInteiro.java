package BinaryTree;

public class NoArvoreBinInteiro {
     int data;
     NoArvoreBinInteiro left, right;

    public NoArvoreBinInteiro(int data) {
        this.data = data;
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
