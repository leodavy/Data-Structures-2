public class Test {
    public static void main(String[] args) {
        Tree redBlackTree = new Tree();

        redBlackTree.insert(10);
        redBlackTree.insert(5);
        redBlackTree.insert(15);
        redBlackTree.insert(3);
        redBlackTree.insert(7);
        redBlackTree.insert(20);
        redBlackTree.remove(3);

        System.out.println("Pré-Ordem: ");
        redBlackTree.preOrder();
        System.out.println();
        System.out.println("Em Ordem: ");
        redBlackTree.inOrder();
        System.out.println();
        System.out.println("Pós-Ordem: ");
        redBlackTree.postOrder();
        System.out.println();
    }
}
