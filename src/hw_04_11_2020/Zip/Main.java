package hw_04_11_2020.Zip;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        File dir = new File("c:\\zip_task");
        dir.mkdir();
        Files.createFile(Path.of("c:\\zip_task\\txt1.txt"));
        Files.createFile(Path.of("c:\\zip_task\\txt2.txt"));
        Files.createFile(Path.of("c:\\zip_task\\txt3.txt"));

        Zip("c:\\zip_task", "c:\\zip.zip");
        File newDir = new File("c:\\zip_task_rename");
        dir.renameTo(newDir);
        Path path = Path.of("c:\\zip_task_rename");
        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            for (Path path1 : files)
                System.out.println(path1);
        }

        delete(newDir);
        System.out.println("Directory deleted");
    }

    private static void Zip(String dir, String zip) throws Exception {
        FileOutputStream fout = new FileOutputStream("c:\\zip_task\\zip.zip");
        ZipOutputStream zout = new ZipOutputStream(fout);
        {
            ZipEntry ze = new ZipEntry("txt1.txt");
            ZipEntry ze1 = new ZipEntry("txt2.txt");
            ZipEntry ze2 = new ZipEntry("txt3.txt");
            zout.putNextEntry(ze);
            zout.putNextEntry(ze1);
            zout.putNextEntry(ze2);
            zout.closeEntry();
        }
        zout.close();
    }

    private static void delete(File file) {
        File[] cont = file.listFiles();
        if (cont != null) {
            for (File f : cont) {
                if (!Files.isSymbolicLink(f.toPath())) {
                    delete(f);
                }
            }
        }
        file.delete();
    }
}
