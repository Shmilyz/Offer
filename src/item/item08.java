package item;

/**
 * Created by Shmily_Z on 2017/9/24.
 *
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class item08 {

    public static void main(String[] args) {

        int A[] = { 3, 4, 5, 1, 2 };// 数组A是数组{1,2,3,4,5}的旋转数组
        System.out.println(findMin(A));

    }

    private static int findMin(int[] array) {
        int low=0;
        int high=array.length;
        int middle=low;
        while(array[low]>array[high]){

            if (high-low==1){

             middle=high;
             break;

            }
                middle=low+high/2;
            if (array[low]>array[middle]){

                low=middle;


            }else if (array[low]<array[middle]){

                high=middle;

            }



        }

        return array[middle];
    }


}
