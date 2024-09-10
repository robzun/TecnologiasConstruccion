package NoRefactor;

public class DropboxFile implements FileInterface{
    private String name;
    private final String ownerUsername;
    private final String ownerGroupName;

    public DropboxFile(String name, String ownerUsername, String ownerGroupName) {
        this.name = name;
        this.ownerUsername = ownerUsername;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void rename(String name){
        this.name = name;
    }
    
    @Override
    public void changeOwner(String user, String group){
        //
    }
}
