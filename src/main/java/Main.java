import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Integer param;
        Integer flag = 1;
        Scanner newScanner = new Scanner(System.in);
        fileManager newFileManager = new fileManager();

        System.out.println("please choose action, or press 0 to exit:");
        param = newScanner.nextInt();

        while (flag > 0) {
            if (param == 1) {
                System.out.println("Create File, please Enter filepath : ");
                String filePath = newScanner.next();
                System.out.println("Enter fileName to create: ");
                String fileName = newScanner.next();
                newFileManager.createNewFile(filePath, fileName);
            }
            else if (param == 2) {
                System.out.println("Delete file, please enter filepath: ");
                String rmFilePath = newScanner.next();
                System.out.println("Enter fileName to delete: ");
                String rmFileName = newScanner.next();
                newFileManager.deleteSomeFile(rmFilePath, rmFileName);
            }
            else if (param == 3) {
                System.out.println("Enter new folder Path to create: ");
                String folderPath = newScanner.next();
                System.out.println("Enter new folder Name to create: ");
                String folderName = newScanner.next();
                newFileManager.createDirectory(folderPath, folderName);
            }
            else
                flag = 0;
            System.out.println("wrong action");
        }
    }
}
