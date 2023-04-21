package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;


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
        if(isEmpty()){
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
    public int higherNumber(NoArvoreBinInteiro currentnode) {
        if (isEmpty()) return 0;
        return currentnode.right != null ? higherNumber(currentnode.right) : currentnode.data;
    }
    public int smallestNumber(NoArvoreBinInteiro currentnode){
        if(isEmpty()) return 0;
        return currentnode.left != null ? smallestNumber(currentnode.left) : currentnode.data;
    }
    public int height(NoArvoreBinInteiro currentnode) {
        if(isEmpty()) return 0;
        int leftHeight = 0, rightHeight = 0;
        if(currentnode.left != null) leftHeight = height(currentnode.left);
        if(currentnode.right != null) rightHeight = height(currentnode.right);
        int height = Math.max(leftHeight, rightHeight);
        return (height + 1);
    }
    public void preOrdem(NoArvoreBinInteiro curentNode) {
        if(curentNode != null){
            System.out.println(curentNode.data);
            preOrdem(curentNode.left);
            preOrdem(curentNode.right);
        }
    }
    public void posOrdem(NoArvoreBinInteiro currentNode) {
        if (currentNode != null) {
            posOrdem(currentNode.left);
            posOrdem(currentNode.right);
            System.out.println(currentNode.data);
        }
    }
    public void simetrico(NoArvoreBinInteiro currentNode){
        if(currentNode != null) {
            simetrico(currentNode.left);
            System.out.println(currentNode.data);
            simetrico(currentNode.right);
        }
    }
    public void levelOrder(){
        Queue<NoArvoreBinInteiro> level = new LinkedList<>();
        if(root!= null) level.add(root);
        while (!level.isEmpty()){
            NoArvoreBinInteiro currentNode = level.poll();
            System.out.println(currentNode.data + " ");
            if(currentNode.left != null) level.add(currentNode.left);
            if(currentNode.right != null) level.add(currentNode.right);
        }
    }
    public void internalNodes(){
        Queue<NoArvoreBinInteiro>queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            NoArvoreBinInteiro currentNode = queue.peek();
            queue.remove();
            boolean internal = false;
            if(currentNode.left != null){
                internal = true;
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                internal= true;
                queue.add(currentNode.right);
            }
            if(internal){
                System.out.println(currentNode.data + " ");
            }
        }
    }
    public void leafNodes(NoArvoreBinInteiro currentNode){
        if(currentNode.left == null && currentNode.right == null) System.out.println(currentNode.data + " ");
        if(currentNode.left != null) leafNodes(currentNode.left);
        if(currentNode.right != null) leafNodes(currentNode.right);
    }
    public boolean findNumber(NoArvoreBinInteiro currentNode,int targetNumber) {
        if(currentNode == null) return false;
        if(currentNode.data == targetNumber) return true;
        if(findNumber(currentNode.left,targetNumber) || findNumber(currentNode.right,targetNumber)){
            System.out.println(currentNode.data + " ");
            return true;
        }
        return false;
    }
    public boolean isEmpty () {
        return root == null;
    }
}






