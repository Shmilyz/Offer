package utils;

import java.io.File;
import java.io.FileReader;

/**
 * Created by Shmily_Z on 2017/9/27.
 */
public class FileManger {

    String[] words=null;
    int pos=0;

    public FileManger(String filename,char[] seperators) throws Exception {

        File f=new File(filename);
        FileReader reader=new FileReader(filename);
        char[] buf=new char[(int) f.length()];
        System.out.println((int) f.length());
        int len=reader.read(buf);
        System.out.println(len);
        String results=new String(buf,0,len);
        String regex=null;
        if (seperators.length>1){

            regex=""+seperators[0]+"|"+seperators[1];

        }
        else{
            regex=""+seperators[0];
        }
        words=results.split(regex);
        reader.close();

    }

    public String nextWord(){
        if(pos==words.length){
            return null;
        }
        return words[pos++];

    }

}
