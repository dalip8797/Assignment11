
package javaapplication48;
import java.io.*;

public class JavaApplication48 {

    public static void main(String[] args) throws IOException{
        File obj=new File("C:\\Users\\User\\Desktop\\dalip.txt");
        obj.createNewFile();
        FileOutputStream fout=new FileOutputStream(obj,true);
        String str="my name is dalip prajapati and i am from U.P";
        char arr[]=str.toCharArray();
        int i;
        for(i=0;i<str.length();i++)
        {
            fout.write(arr[i]);
        }
       
        
    }
    
}
