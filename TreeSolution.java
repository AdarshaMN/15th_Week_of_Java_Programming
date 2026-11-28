public class TreeSolution {
    
    public static void main(String[] args) {
        
        TreeNode root = createBinaryTree();
        System.out.println("\nPre-Order Traversal");
        preOrderPrintTree(root);

        System.out.println("\nInOrder Traversal");
        InOrderPrintTree(root);

        System.out.println("\nPost-Order Traversal");
        postOrderPrintTree(root);

        System.out.println();
        int finalAns = getCountNode(root);
        System.out.println("\nCount of Nodes are: " + finalAns);

        boolean result = isKeyFoundInTree(root, 20);
        System.out.println("The result is Found: " + result);

        int maxValue = getMaxValueInTree(root);
        System.out.println(maxValue);

        int minValue = getMinValueInTree(root);
        System.out.println(minValue);

        int sumOfValue = getSumOfValuesInTree(root);
        System.out.println(sumOfValue);
    }

    public static TreeNode createBinaryTree()
    {
        TreeNode root = new TreeNode(10);

        //this are root of childern -1st level
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        //children of first left child of root
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        //childern of right child of root
        root.right.left = new TreeNode(70);
        root.right.right = new TreeNode(90);

        return root;
    }

    public static void preOrderPrintTree(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");

        preOrderPrintTree(root.left);
        preOrderPrintTree(root.right);
    }

    public static void InOrderPrintTree(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        InOrderPrintTree(root.left);
        System.out.print(root.data + " ");
        InOrderPrintTree(root.right);
    }

    public static void postOrderPrintTree(TreeNode root)
    {
        if(root == null)
            return;

        postOrderPrintTree(root.left);
        postOrderPrintTree(root.right);
        System.out.print(root.data + " ");
    }

    public static int getCountNode(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftCountNumber = getCountNode(root.left);
        int rightCountNumber = getCountNode(root.right);

        int myOwnCount = 1;
        int result = myOwnCount + leftCountNumber + rightCountNumber;

        return result;
    }

    public static int getCountBadCode(TreeNode root)
    {
        if(root == null) return 0;
        return getCountBadCode(root.left) + getCountBadCode(root.right) + 1;
    }

    public static boolean isKeyFoundInTree(TreeNode root, int key) 
    {
        if (root == null) 
            return false;
        
        if (root.data == key) 
            return true;
 
        boolean isLeftValue = isKeyFoundInTree(root.left, key);
        boolean isRightValue = isKeyFoundInTree(root.right, key);
        
        boolean isFoundValues = isLeftValue || isRightValue;

        return isFoundValues;

    }

    public static int getMaxValueInTree(TreeNode root)
    {
        if(root == null)
        {
            return Integer.MIN_VALUE;
        }

        int leftMaxValue = getMaxValueInTree(root.left);
        int rightMAxValue = getMaxValueInTree(root.right);

        return Math.max(root.data, Math.max(leftMaxValue, rightMAxValue));
    }

    public static int getMinValueInTree(TreeNode root)
    {
        if(root == null)
        {
            return Integer.MAX_VALUE;
        }

        int leftMinValue = getMinValueInTree(root.left);
        int rightMinValue = getMinValueInTree(root.right);

        return Math.min(root.data, Math.min(leftMinValue, rightMinValue));
    }

    public static int getSumOfValuesInTree(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }

        int sumOfValues = 0;
        int leftSumOfValues = getSumOfValuesInTree(root.left);
        int rightSumOfValues = getSumOfValuesInTree(root.right);

        sumOfValues = sumOfValues + root.data + leftSumOfValues + rightSumOfValues;

        return sumOfValues;
    }
}
