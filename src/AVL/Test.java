public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        System.out.println("Pré-ordem: ");
        tree.preOrderTraversal();
        System.out.println(" ");
        System.out.println("Em ordem: ");
        tree.inOrderTraversal();
        System.out.println(" ");
        System.out.println("Pós-ordem: ");
        tree.postOrderTraversal();

    }
}
