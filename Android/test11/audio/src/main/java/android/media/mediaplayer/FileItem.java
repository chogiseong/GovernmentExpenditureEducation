package android.media.mediaplayer;

public class FileItem {
    private String name;
    private String filepath;

    public FileItem(String name, String filepath) {
        this.name = name;
        this.filepath = filepath;
    }

    public String getDisplayName() {
        return name;
    }

    public String getFilepath() {
        return filepath;
    }
}
