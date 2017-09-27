package others;

import java.io.UnsupportedEncodingException;

/**
 * Created by Shmily_Z on 2017/9/27.
 */
public class other03 {

    public static void main(String[] args) {

        String str = "我a爱中华abc我爱传智def";
        int num = 0;
        try {
            num = trimGBK(str.getBytes("GBK"),6);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(str.substring(0,num) );
        System.out.println("smiles".substring(1, 5));

    }

    public static int  trimGBK(byte[] buf,int n){
        int num = 0;
        boolean bChineseFirstHalf = false;
        for(int i=0;i<n;i++)
        {
            if(buf[i]<0 && !bChineseFirstHalf){
                bChineseFirstHalf = true;
            }else{
                num++;
                bChineseFirstHalf = false;
            }
        }
        return num;
    }
}
