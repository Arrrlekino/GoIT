class File {
    private String type;
    private int size;
    }
//создаем классы-наследники

class ImageFile extends File{
    public String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
class TextFile extends File{
    public String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
class AudioFile extends File {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Directory {
    //public IllegalStateException()
    //используем отношение has-a
    private TextFile textfile;

    public Directory() {
        this.textfile = new TextFile();
        textfile.setName("Hello");
    }
    //IllegalStateException(String s)
    public String getName()
    {
        return textfile.getName();
    }
    private AudioFile audiofile;
    private ImageFile imagefile;
    try {
        throw new NullPointerException("Такого файла не существует");
    } catch (NullPointerException e) {
        Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
    }
}