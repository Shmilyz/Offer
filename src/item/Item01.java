package item;

/**
 * Created by Shmily_Z on 2017/9/17.
 *
 *  解题思路，我们重新排列这个数组，首先比较这个数字是不是等于i，如果是，则接着扫描下一个数字，如果不是则再拿出它和第m个数字进行比较，
 *  如果他和第m个数字相等，就找到了一个重复的数字。
 *
 *
 */
public class Item01 {

    public static void main(String[] args) {

        int[] A={2,3,1,0,4,5,0};
        System.out.println(find(A));

    }

    private static String find(int[] array) {

        if (array!=null){
            if (array.length<=0){

                return "请为二维数组插入值";

            }else {

                for (int i=0;i<array.length;i++){

                    if (array[i]<0||array[i]>array.length-1)
                    {

                        return "您输入的数字不符合题目要求";
                    }

                }


                for (int i=0;i<array.length;i++){

                    while (array[i]!=i){

                        if (array[i]==array[array[i]]){

                            return "存在重复数字"+array[i];

                        }

                        int swap=array[i];
                        array[i]=array[swap];
                        array[swap]=swap;
                    }


                }



            }


        }else {

            return "请输入一个数组";
        }


        return "数组中没有重复值";
    }


}
