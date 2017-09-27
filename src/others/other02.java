package others;

import java.io.*;

/**
 * Created by Shmily_Z on 2017/9/27.
 */
public class other02 {

    public static void main(String[] args) throws IOException {

        File file1=new File("d:\\java");
        File file2=new File("d:\\jad");
        String[] strArr=file1.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                return new File(dir,name).isFile() && name.endsWith(".java");

            }
        });

        for (String str:strArr){
        //FileReader和BufferedReader区别，BufferedReader有一个缓存区，我们要加上flush，而且BufferedReader有一个方法为readline
            BufferedReader br=new BufferedReader(new FileReader(new File(file1,str)));
            BufferedWriter bw=new BufferedWriter(new FileWriter(new File(file2,str.replace(".java",".jad"))));

            String line=null;
            while ((line=br.readLine())!=null){

                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            br.close();
            bw.close();

        }


    }

}
