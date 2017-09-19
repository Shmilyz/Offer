package item;

import utils.BinaryTreeNode;

/**
 * Created by Shmily_Z on 2017/9/18.
 * 在讲方法之前，我们先想一下前序遍历和中序遍历的特点，我们通过前序遍历能够得到第一个数字即为我们二叉树的根节点，
 * 而通过中序排列我们通过前序得到的根节点，推出我们左子树和右子树都有谁，都有几个。
 */
public class Item06 {


    public static void main(String[] args) {

        // 二叉树的前序遍历
        int preOrder[] = { 1, 2, 4, 7, 3, 5, 6, 8 };
        // 二叉树的中序遍历
        int inOrder[] = { 4, 7, 2, 1, 5, 3, 8, 6 };

        BinaryTreeNode root = constructTree(preOrder, inOrder);
        printPostOrder(root);
    }

    private static BinaryTreeNode constructTree(int[] preOrder, int[] inOrder) {

        // 我们先根据前序遍历创建我们的根节点。
        BinaryTreeNode root = new BinaryTreeNode(preOrder[0]);
        root.setLeft(null);
        root.setRight(null);

        int leftNum = 0;//左子树的结点个数

        // 在中序中找到根节点
        for (int i = 0; i < inOrder.length; i++) {
            if (inOrder[i] == root.getValue()) {
                break;
            } else {
                leftNum++;
            }
        }
        int rightNum = preOrder.length - 1 - leftNum;
//        我们右子树的个数等于我们树的个数减去我们的根节点和我们求出来的左子树个数。

        // 左子树不为空
        if (leftNum > 0) {
            //构造左子树的前序和中序遍历序列
            int leftPreOrder[] = new int[leftNum];
            int leftInOrder[] = new int[leftNum];
            for (int i = 0; i < leftNum; i++) {
                leftPreOrder[i] = preOrder[i + 1];
                leftInOrder[i] = inOrder[i];
            }
            //递归构造左子树
            BinaryTreeNode leftRoot = constructTree(leftPreOrder, leftInOrder);
            root.setLeft(leftRoot);
        }

        //右子树不为空
        if (rightNum > 0) {
            //构造右子树的前序和中序遍历序列
            int rightPreOrder[] = new int[rightNum];
            int rightInOrder[] = new int[rightNum];
            for (int i = 0; i < rightNum; i++) {
                rightPreOrder[i] = preOrder[leftNum  + 1+ i];
                rightInOrder[i] = inOrder[leftNum  + 1+ i];
            }
            //递归构造右子树
            BinaryTreeNode rightRoot = constructTree(rightPreOrder,
                    rightInOrder);
            root.setRight(rightRoot);
        }
        return root;



    }

    public static void printPostOrder(BinaryTreeNode root) {
        if (root != null) {
            printPostOrder(root.getLeft());
            printPostOrder(root.getRight());
            System.out.print(root.getValue() + "、");
        }
    }


}
