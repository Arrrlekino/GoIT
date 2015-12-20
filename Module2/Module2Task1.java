/**
 * Created by Arlekino on 12/13/2015.
 */
public Vector  myDirectory;
import java.util.Vector;

public class TextFile {

    public String Path;

    public Integer Size;

    public Vector  myDirectory;

}

public class AudioFile {

    public String Path;

    public Integer Size;

    public String Encoding;

    public Vector  myDirectory;

}

public class Directory {

    public String Path;

    public String Name;

    public Vector  myTextFile;
    public Vector  myImageFile;
    public Vector  myAudioFile;

}
public class File extends TextFile, AudioFile, ImageFile {

    public String Path;

}
import java.util.Vector;

public class ImageFile {

    public String Path;

    public Integer Size;

    public Integer Width;

    public Integer Height;

}
