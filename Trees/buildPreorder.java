package Trees;

import java.util.*;

public class buildPreorder {

    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;

        public static node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1) return null;

            node newNode=new node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }

        public static void PreOrder(node root){
            if(root==null) return;

            System.out.print(root.data+" ");
            PreOrder(root.left);
            PreOrder(root.right);
        }

        public static void InOrder(node root){
            if(root==null) return;

            InOrder(root.left);
            System.out.print(root.data+" ");
            InOrder(root.right);
        }

        public static void PostOrder(node root){
            if(root==null) return;

            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data+" ");
        }

        public static void LevelOrder(node root){
            if(root==null) return;

            Queue<node>q=new LinkedList<>();

            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                node curr=q.remove();
                if(curr==null){
                    // System.out.println(); traingle jevu
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curr.data+" ");
                    if(curr.left!=null) q.add(curr.left);
                    if(curr.right!=null) q.add(curr.right);
                }
            }
        }

        public static int height(node root){
            if(root==null) return 0;

            int lh=height(root.left);
            int rh=height(root.right);

            return Math.max(lh,rh)+1;
        }

        public static int countNodes(node root){
            if(root==null) return 0;

            int lc=countNodes(root.left);
            int rc=countNodes(root.right);

            return lc+rc+1;
        }

        public static int sumNodes(node root){
            if(root==null) return 0;

            int ls=sumNodes(root.left);
            int rs=sumNodes(root.right);

            return ls+rs+root.data;
        }
        
    }
    public static void main(String[] args) {
        int[] preOrder={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        BinaryTree tree=new BinaryTree();
        node root=tree.buildTree(preOrder);
     
        System.out.println(root.data);

        tree.PreOrder(root);
        System.out.println();
        tree.InOrder(root);
        System.out.println();
        tree.PostOrder(root);
        System.out.println();
        tree.LevelOrder(root);
        System.out.println();
        System.out.println(tree.height(root));
        System.out.println(tree.countNodes(root));
        System.out.println(tree.sumNodes(root));
    }
}