import java.io.File;
import java.util.Scanner;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Tester {
    public static void main(String[] args) throws Exception {
        JarFile jarFile = new JarFile("lib.jar");
        JarEntry entry = (JarEntry) jarFile.getEntry("Main.java");
        byte[] bytes = jarFile.getInputStream(entry).readAllBytes();
        String content = new String(bytes);
        System.out.println(content);
    }

}
