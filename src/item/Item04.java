package item;

/**
 * Created by Shmily_Z on 2017/9/17.
 *本篇题目要求将字符串的空格转化为'%20'
 * 这里我们使用了时间复杂度为O(n)的思路。我们不在按正常思路从前往后遍历我们字符串，找到空格替换他，并将后面的字符串往后移动
 * 我们这里采用从后往前的方式，我们知道我们有几个空格我们相应的长度将增加空格的二倍，我们先获取到我们得空格总数后，获得我们替换完之后
 * 的长度，而且我们要知道原字符串数组的总长度，两者之间差的就是空格的二倍，我们要做的就是进行while循环，当指针指向我们的空格我，我们第二个指针就
 * 向前移动三个字符，并赋值，如果不是空格，我们则将第一个指针的值赋值给第二个指针，不论第一个指针对应的是不是空格，我们都将第一个指针减一。
 *
 */
public class Item04 {


    public static void main(String[] args) {

        String space = "We are happy.";
        char space_char[]=space.toCharArray();
        char space_char_new[]=new char[100];
        for (int i=0;i<space_char.length;i++){

            space_char_new[i]=space_char[i];

        }
            int space_char_length=space_char.length;
        System.out.println(replaceSpace(space_char_new,space_char_length));


    }

    private static String replaceSpace(char[] space_char_new, int space_char_length) {

        int space=0;
        for(int i=0;i<space_char_length;i++){
//我们通过循环得到我们字符串的空格数
            if (space_char_new[i]==' '){
                space++;
            }


        }

        int last_length=space_char_length+space*2;

        while (space_char_length>=0 && last_length>=0){

            if (space_char_new[space_char_length]!=' '){
                    space_char_new[last_length--]=space_char_new[space_char_length];
            }
            else {
                space_char_new[last_length--]='%';
                space_char_new[last_length--]='2';
                space_char_new[last_length--]='0';
            }
                space_char_length--;

        }


            return new String(space_char_new);

    }
}
