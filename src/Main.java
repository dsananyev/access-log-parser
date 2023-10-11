import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pathCount = 0;

        while (true) {
            System.out.println("Укажите путь к файлу");
            String path = sc.nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (isDirectory) {
                System.out.println("Указан путь к папке, а не к файлу\n");
                continue;
            } else if (!fileExists) {
                System.out.println("Указан путь до несуществующего файла\n");
                continue;
            } else if (fileExists) {
                pathCount += 1;
                System.out.println("Путь указан верно. Это файл N:" + pathCount + "\n");
                continue;
            }
        }
    }
}
