class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class Main{
    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"-->");
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"-->");
        inorder(root.right);
    }
    static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"-->");
    }
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.right.left = new Node(80);
        root.right.right = new Node(90);
        root.left.right = new Node(50);
        root.left.right.left =new Node(60);
        root.left.right.right = new Node(100);
        System.out.print("\n preorder ");
        preorder(root);
        System.out.print("\n inorder ");
        inorder(root);
        System.out.print("\n postorder ");
        postorder(root);
        
    
        
    }
}
