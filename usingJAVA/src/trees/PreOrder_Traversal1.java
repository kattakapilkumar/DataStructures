/*    **    Preorder (Root, Left, Right)  **
 * Algorithm Preorder(tree)
   1. Visit the root.
   2. Traverse the left subtree, i.e., call Preorder(left-subtree)
   3. Traverse the right subtree, i.e., call Preorder(right-subtree) 
 */

package trees;
public class PreOrder_Traversal1 {
	TreeNode root;	
	PreOrder_Traversal1()
	{
		root = null;
	}	
	void preOrder(TreeNode node)
	{	
		if(node == null)
			return;		
		// root
		System.out.println(node.key);		
		//left
		preOrder(node.left);		
		preOrder(node.right);	
	}	
	void preOrder()
	{
		preOrder(root);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreOrder_Traversal1 tree = new PreOrder_Traversal1();
		
		tree.root = new TreeNode(1);
		
		tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        
        
        tree.preOrder();

	}

}
