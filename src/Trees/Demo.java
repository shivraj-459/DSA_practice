package Trees;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo {

    public static class Node  {

       int Data;
       Node left;
       Node right;

         Node(int data) {
            this.Data = data;
            this.left=null;
            this.right=null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "Data=" + Data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    static class BinaryTree{

        static int idx=-1;
        public static Node buildTree(int[] nodes){

        idx++;

        if(nodes[idx]==-1){

            return null;
        }

        Node newNode=new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);

           return newNode;

        }
    }


    public static void preorder(Node root){

        if(root==null){

            return;
        }

        System.out.print(root.Data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){

        if(root==null){

            return;
        }

        inorder(root.left);
        System.out.print(root.Data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){

        if(root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.Data+" ");
    }


    public static void levelOrder(Node root){

        if(root==null){
            return;
        }

        Queue<Node> q=new LinkedList<>();
         List<Integer> list=new ArrayList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){

            Node curr=q.remove();

            if(curr ==null){
                System.out.println(list);
                list=new ArrayList<>();

                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }else{
                  list.add(curr.Data);
                //System.out.println(q);
                //System.out.print(curr.Data+" ");

                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }

        }

    }


    public static int countNodes(Node root){

        if(root==null){
            return 0;
        }

        int left=countNodes(root.left);
        int right=countNodes(root.right);

        return (left+right)+1;
    }

    public static int sumOfNodes(Node root){

        if(root==null){
            return 0;
        }

        int sumLeft=sumOfNodes(root.left);
        int sumRight=sumOfNodes(root.right);

        return sumLeft + sumRight + root.Data;

    }

    public static int heightOfTree(Node root){

        if(root==null){
            return 0;
        }

        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);

        return Math.max(leftHeight,rightHeight) + 1;

    }

    public static int diameterOfTree(Node root){

        if(root==null){

            return 0;
        }

        int dia1=diameterOfTree(root.left);
        int dia2=diameterOfTree(root.right);
        int dia3= heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(dia3,Math.max(dia1,dia2));

    }

    static class TreeInfo{

        int ht;
        int dia;


        public TreeInfo(int ht, int dia) {
            this.ht = ht;
            this.dia = dia;
        }
    }

    public static TreeInfo diameter2(Node root){

        if(root==null){

            return new TreeInfo(0,0);
        }

        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);

        int myHeight=Math.max(left.ht, right.ht) + 1;

        int dia1= left.dia;
        int dia2= right.dia;
        int dia3= left.ht + right.ht + 1;

        int myDia= Math.max(dia3,Math.max(dia1,dia2));

         TreeInfo myInfo=new TreeInfo(myHeight,myDia);

         return myInfo;
    }


    public static void main(String[] args) {


        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tr=new BinaryTree();

        Node root=tr.buildTree(nodes);
System.out.println(root);
        //preorder(root);
       //inorder(root);
        //postorder(root);

        //levelOrder(root);

//       int count= countNodes(root);
//
//       System.out.println(count);

//        int sum=sumOfNodes(root);
//        System.out.println(sum);

//        int height=heightOfTree(root);
//        System.out.println(height);

//        int diameter=diameterOfTree(root);
//        System.out.println(diameter);

//        TreeInfo ti=diameter2(root);
//
//        System.out.println(ti.dia);

    }
}
