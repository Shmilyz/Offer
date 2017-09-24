package item;

import utils.CQueue;

/**
 * Created by Shmily_Z on 2017/9/24.
 *
 *     用两个栈实现队列的两个函数appendTail和deleteHead。
 *     我们将第一个栈来存储我们的数据，用第二个栈反向存储我们的数据，这样我们就做出来一个
 *     类似于先进先出的队列来。以实现我们的问题。
 *
 */
public class item07 {
    public static void main(String[] args) {
        CQueue<Integer> cQueue=new CQueue<Integer>();
        // 此次存入
        for (int i = 0; i < 5; i++) {
            cQueue.appendTail(i);
        }
        // 依次取出
        for (int i = 0; i < 5; i++) {
            System.out.print(cQueue.deleteHead() + "、");
        }


    }



}
