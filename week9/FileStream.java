import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileStream {
    public static void main(String[] args) {
        File f1=new File("/home/saivenkat/Documents/Programs/fin.txt");
        File f2=new File("/home/saivenkat/Documents/Programs/fout.txt");
        FileInputStream fin;
        FileOutputStream fout;
        try{
            fin=new FileInputStream(f1);
            fout=new FileOutputStream(f2);
            try {
                System.out.println(fin.available());
                int i;
                while ((i=fin.read())!=-1) {
                    fout.write(i);
                }
                //fin.close();
                //fout.close();
            } catch (IOException e) {
                System.out.println("An error occured while performing input/.");
            }
        }catch(FileNotFoundException e){
            System.out.println("The File is not found here");
        }
    }
}
