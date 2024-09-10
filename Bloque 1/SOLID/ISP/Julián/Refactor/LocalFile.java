package Refactor;

public class LocalFile implements SupportsRename, SupportsChangeOfOwnership {
    private String name;
    private String ownerUsername;
    private String ownerGroupName;

    public LocalFile(String name, String ownerUsername, String ownerGroupName) {
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
        this.ownerUsername = user;
        this.ownerGroupName = group;
    }

    public String getName() {
        return name;
    }
}
