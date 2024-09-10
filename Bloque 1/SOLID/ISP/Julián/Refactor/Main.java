package Refactor;

public class Main {
    public static void main(String[] args) {
        LocalFile local = new LocalFile("Archivo Local", "Usuario 1", "Grupo 1");
        DropboxFile dropbox = new DropboxFile("Archivo Dropbox", "Usuario 2", "Grupo 2");

        FileImporter fileImporter = new FileImporter();
        FilePermissionManager filePermissionManager = new FilePermissionManager();

        fileImporter.importFile(local, "Archivo local importado");
        System.out.println(local.getName());

        fileImporter.importFile(dropbox, "Archivo dropbox importado");
        System.out.println(dropbox.getName());

        filePermissionManager.transferOwnership(local, "Nuevo usuario", "Nuevo grupo");
        //filePermissionManager.transferOwnership(dropbox, "Nuevo usuario 2", "Nuevo grupo 2");
    }
}