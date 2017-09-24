package item;

/**
 * Created by Shmily_Z on 2017/9/24.
 *菲波那切数列是每一个学C语言的人都特别熟悉的一个问题。
 *
 * 用递归实现的过程中会出现重复计算的情况，此时，可以利用动态规划的思想，保存中间结果，这样可以避免不必要的计算。
 *
 */
public class item09 {

    public static void main(String[] args) {

        int n = 3;
        System.out.println(fibonacci(n));

    }

    private static int fibonacci(int n) {


        if (n==0){
            return 0;
        }else if(n==1){

            return 1;

        }else {
            int zero=0;
            int one=1;
            int all=0;

            for (int i=2;i<n;i++){

                    all=zero+one;
                    zero=one;
                    one=all;
            }

            return all;
        }





    }


}
