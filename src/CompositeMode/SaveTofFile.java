package CompositeMode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashSet;

public class SaveTofFile {
    public static void saveFile(HashSet<String> randomArith) throws IOException {
        File file =new File(ConstVariable.SAVE_FILE_PATHNAME);
        Writer out =new FileWriter(file);
        for(String s : randomArith){
            out.write(s+"\n");
        }
        out.close();
    }
}
