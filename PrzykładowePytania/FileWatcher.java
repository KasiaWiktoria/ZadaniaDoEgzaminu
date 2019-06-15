import java.io.File;
import java.util.*;

public class FileWatcher extends Thread {
    private String path;
    private boolean foundFile;

    public FileWatcher(String path){
        this.path = path;
        this.foundFile = false;
    }

    @Override
    public void run(){
        try{
            File file = new File(path);
            while(!foundFile){
                Thread.sleep(10000);
                if(file.canRead())
                    foundFile = true;
            }
        } catch(InterruptedException e){
            System.out.print("Przerwano wątek.\n");
        }
    }
}
