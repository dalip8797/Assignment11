/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filecopy;
import java.io.*;
import static java.lang.System.in;
public class Filecopy {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\User\\Desktop\\program\\program\\javaApplication31.txt");
        File file2 = new File("C:\\Users\\User\\Desktop\\pf7 \\FileReadProgram.txt");
       
        FileWriter out;
        try (FileReader in = new FileReader(file1)) {
            out = new FileWriter(file2);
            int c;
            while((c=in.read())!=-1)
            {
                out.write((char)c);
                
            }
        }
        in.close();
        out.close();
        
        
    }
    
}
