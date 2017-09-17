package item;

/**
 * Created by Shmily_Z on 2017/9/17.
 *
 * 一个二维数组，每一行按照从左到右递增，每一列按照从上到下递增，查找数组中是否存在某个数。
 *
 * 我们观察此二维数组，发现数组的左下角和右上角符合行或列总有一个在增一个在减的规律。我们这里使用右上角，如果要查的数字小则往左移
 * 如果要查的数字大，则往下移。
 *
 *
 */
public class Item03 {



    public static void main(String[] args) {


        int A[][] ={ { 1, 2, 8, 9 },
                     { 2, 4, 9, 12 },
                     { 4, 7, 10, 13 },
                     { 6, 8, 11, 15 } };
        System.out.println(Arrayfind(A, 7));
    }


    public static String Arrayfind(int array[][],int number){
        String result = "您要查找的数字不存在";

        if (array!=null) {
            if (array.length>0){
                int rows=array.length;
//            rows指代二维数组的行数
                int columns=array[0].length;
//          columns指代二维数组的列数
                int row=0;
                int column=columns-1;
//           我们从右上角开始遍历
                while (row<rows && column>=0){

                    if (array[row][column]==number){
                        result="您要查找的数字"+number+"存在于该二维数组";
                        break;
                    }
                    else if (array[row][column]>number){
                        column--;
                    }else {

                        row++;
                    }

                }



                return result;
            }else {

                return "请为二维数组插入值";
            }


        }
        else {


            return "请输入一个二维数组";

        }



    }


}
