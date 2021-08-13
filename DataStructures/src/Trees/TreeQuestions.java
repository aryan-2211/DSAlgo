package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left = null,right =null;
	
	Node(int data){
		this.data = data;
	}
}

public class TreeQuestions {
	
	//Level OrderTraversal
	
	static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        if(node == null){
            return list;
        }
    
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            Node temp = q.poll();
            list.add(temp.data);
            
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
            
        }
        
        return list;
        
        
    }
	//Check if a binary tree is a BST
	
	 public static boolean isBST(Node root)
    {
        boolean flag = true;
        
        if(root == null)return true;
       
        ArrayList<Integer> ll = new ArrayList<>();
        
        inorder(root,ll);
        
        for(int i =1;i<ll.size();i++){
            
            if(ll.get(i-1) >= ll.get (i) ){
                flag = false;
                break;
            }
        }
        return flag;
    }
    
    private static void inorder(Node root,ArrayList<Integer> ll){
        
        if(root == null)return;
        
        inorder(root.left,ll);
        ll.add(root.data);
        inorder(root.right,ll);
        
    }
    
    //Height of a Binary Tree
    
    public static int height(Node node) 
    {
        if(node == null ){
            return 0;
        }
        return 1 + Math.max(height(node.left) , height(node.right));
    }
    
    //Diameter of the Binary Tree
    
    public static int diameter(Node root) {
        
        if( root == null)return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        int dia = 1 + lh + rh ;
        
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        
        return Math.max(dia, Math.max(ld,rd));
    }
    
     static int heightUtil(Node root){
        
        if(root == null)return 0;
        
        return 1 + Math.max( height(root.left) , height(root.right) );
    }
     
      

}
