package Refactor;

public class DropboxFile implements SupportsRename {
    private String name;
    private final String ownerUsername;
    private final  String ownerGroupName;

    public DropboxFile(String name, String ownerUsername, String ownerGroupName) {
        this.name = name;
        this.ownerUsername = ownerUsername;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void rename(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
