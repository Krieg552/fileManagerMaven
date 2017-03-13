import java.io.File;
import java.io.IOException;

public class fileManager {


    public void createNewFile(String path, String fileName) throws IOException {
        File newFile = new File(path + fileName);
        if (newFile.createNewFile()) {
            System.out.println("file was successfully created");
            System.out.println(newFile.getAbsolutePath());
        } else
            System.out.println("file was not created");
    }

    public void deleteSomeFile(String path, String fileName) throws IOException {
        File rmFile = new File(path + fileName);
        if (rmFile.delete()) {
            System.out.println("file was successfully deleted");
        } else
            System.out.println("file was not deleted");
    }

    public void createDirectory(String folderPath, String folderName) {
        File directory = new File(folderPath + folderName);
        if (directory.mkdir()) {
            System.out.println("directory was successfully created");
            System.out.println(directory.getAbsolutePath());
        } else
            System.out.println("directory was not created");
    }
}