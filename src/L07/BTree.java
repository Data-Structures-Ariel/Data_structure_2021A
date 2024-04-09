package L07;

public class BTree {

    public static void main(String[] args) {
//        BTree bt = new BTree(17);
//        bt.root.setLeft(new BinNode(36));
//        bt.root.setRight(new BinNode(12));
        BTree bt = new BTree(8);
        bt.root.setLeft(new BinNode(4));
        bt.root.getLeft().setRight(new BinNode(7));
        bt.root.getLeft().getRight().setLeft(new BinNode(6));
        bt.root.getLeft().getRight().getLeft().setLeft(new BinNode(1));
        bt.root.getLeft().setLeft(new BinNode(5));
        bt.root.getLeft().getLeft().setRight(new BinNode(8));
        bt.root.setRight(new BinNode(2));
        bt.root.getRight().setLeft(new BinNode(3));
        bt.root.getRight().getLeft().setLeft(new BinNode(7));
        bt.root.getRight().getLeft().getLeft().setLeft(new BinNode(0));
        bt.root.getRight().getLeft().setRight(new BinNode(1));
        bt.root.getRight().getLeft().getRight().setRight(new BinNode(2));
        bt.root.getRight().setRight(new BinNode(6));
        bt.root.getRight().getRight().setLeft(new BinNode(9));
        // 36 17 12
        bt.inOrder();
        System.out.println("");
        System.out.println("\n" + bt.inOrder2());

    }

    public BinNode root;

    public BTree() {
        this.root = null;
    }

    public BTree(int rootValue) {
        this.root = new BinNode(rootValue);
    }

    private void inOrder() {
        inOrder(root);
    }

    private int inOrder2() {
        return inOrder2(root);
    }

    private void inOrder(BinNode root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.printf("%d ", root.getValue());
            inOrder(root.getRight());
        }
    }

    private int inOrder2(BinNode root) {
        int sum = 0;
        if (root != null) {
            sum += inOrder2(root.getLeft());
            if (root.getRight() != null) {
                sum += root.getRight().getValue();
                System.out.println(root.getRight().getValue());
            }
            sum += inOrder2(root.getRight());
        }
        return sum;
    }

}
