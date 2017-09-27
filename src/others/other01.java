package others;

import utils.FileManger;

import java.io.FileWriter;

/**
 * Created by Shmily_Z on 2017/9/27.
 *
 * 编写一个程序，将 a.txt 文件中的单词与 b.txt 文件中的
 单词交替合并到 c.txt 文件中，a.txt 文件中的单词用回车符
 分隔，b.txt 文件中用回车或空格进行分隔。
 *
 *
 *
 */
public class other01 {


    public static void main(String[] args) throws Exception{

        FileWriter ra = new FileWriter("F:\\a.txt");//字符流
        ra.write("a\nb\nc\nd\ne\n");
        ra.close();

        FileWriter rb = new FileWriter("F:\\b.txt");
        rb.write("1 2 3\n4 5\n");
        rb.close();

        FileManger a = new FileManger("F:\\a.txt", new char[]{'\n'});
        FileManger b = new FileManger("F:\\b.txt", new char[]{'\n',' '});
        FileWriter c = new FileWriter("F:\\c.txt");
        String aWord = null;
        String bWord = null;
        //交替写入
        while((aWord=a.nextWord())!=null){
            c.write(aWord+"\n");
            bWord = b.nextWord();
            if(bWord!=null){
                c.write(bWord+"\n");
            }
        }
        //如果b还有
        while((bWord=b.nextWord())!=null){
            c.write(bWord+"\n");
        }
        c.close();

    }


}
