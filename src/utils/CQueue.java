package utils;

import java.util.Stack;

/**
 * Created by Shmily_Z on 2017/9/24.
 */
public class CQueue<T> {

    private Stack<T> stack1;
    private Stack<T> stack2;

    public CQueue() {

        this.stack1=new Stack<T>();
        this.stack2=new Stack<T>();
    }

public void appendTail(T node){

    stack1.push(node);


}
public T  deleteHead(){

    if (stack2.isEmpty()){
        if (stack2.isEmpty()){

            try {
                throw  new Exception("");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        while (stack1.size()>0){

            stack2.push(stack1.pop());

        }

    }
            return stack2.pop();


}
}
