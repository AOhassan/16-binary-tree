public class BinaryTree {
    TreeNode root;

    public void preOrder(TreeNode current) {
        if(current != null){
            System.out.println(current.data);
                preOrder(current.left);
                preOrder(current.right);
        }
    }

    public void inOrder(TreeNode current){
        if(current != null){
                inOrder(current.left);
            System.out.println(current.data);
                inOrder(current.right);
        }
    }

    public void postOrder(TreeNode current){
        if(current != null){
                postOrder(current.left);
                postOrder(current.right);
            System.out.println(current.data);
        }
    }

    public String toString(TreeNode current){
        if (current == null) {
            return "";
        }
        return current.toString() + " " + this.toString(current.left) + " " + this.toString(current.right);
    }

    public int size() {
        return size(this.root);
    }

    public int size(TreeNode current){
        if (current == null) {
            return 0;
        }
        return 1 + this.size(current.left) + this.size(current.right);
    }

    public int min(){
        TreeNode current = this.root;

        while(current.left != null){
            current = current.left;
        }
        return current.data;
    }

    public boolean contains(int value) {
        return contains(value, this.root );
    }

    public boolean contains(int value, TreeNode node){
        if (node == null) {
            return false;
        }
        if (node.data == value) {
            return true;
        }
        boolean left = contains(value, node.left);
        boolean right = contains(value, node.right);
        return left || right;
    }
}


