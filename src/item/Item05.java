package item;

import utils.ListNode;

import java.util.Stack;

/**
 * Created by Shmily_Z on 2017/9/17.
 *输入一个链表的头结点，从尾到头反过来打印出每个节点的值。
 * 我们这里实现了递归和栈两种实现方式。其中应注意栈的相关类及相关方法。
 */
public class Item05 {



    public static void main(String[] args) {

        //    构建一个简单的链表
        ListNode node_head=new ListNode(0);
        ListNode node_one=new ListNode(1);
        ListNode node_two=new ListNode(2);
        ListNode node_three=new ListNode(3);
        ListNode node_four=new ListNode(4);


        node_head.setNext(node_one);
        node_one.setNext(node_two);
        node_two.setNext(node_three);
        node_three.setNext(node_four);
        node_four.setNext(null);
        System.out.println("递归实现：");
        print_list_recursion(node_head);
        System.out.println("栈的实现：");
        print_list_stack(node_head);




    }

    private static void print_list_stack(ListNode node_head) {

        Stack<Integer> stack=new Stack<>();
//        栈是Vector的一个子类，它实现了一个标准的后进先出的栈。
        ListNode array=node_head;
        while (array!=null){
            stack.push(array.getValue());
//            stack.push()---把项压入堆栈顶部。
            array=array.getNext();
        }
        while (!stack.isEmpty()){
//            stack.isEmpty()---测试堆栈是否为空。
            System.out.println(stack.pop());
//            stack.pop()---移除堆栈顶部的对象，并作为此函数的值返回该对象。

        }

    }

    private static void print_list_recursion(ListNode node_head) {

        if (node_head.getNext()!=null){
                print_list_recursion(node_head.getNext());
    //我们进行递归，最后在一个一个返回。
        }
        System.out.println(node_head.getValue());



    }


}
