


public class ArbolBinario {

    private Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value){
        if (node == null) {
            return new Node(value);
        }
        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        }else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        }
        return null;
    }

    public void printTree() {
        printTree(root, " ",true);
    }

    private void printTree(Node root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.getValue());
            if (root.getLeft() != null || root.getRight() != null) {
                if (root.getLeft() != null) {
                    printTree(root.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
                }else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "└── null");
                }

                if (root.getRight() != null) {
                    printTree(root.getRight(), prefix + (isLeft ? "│   " : "    "), false);
                }else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "└── null");
                }
            }
        }
    }

}