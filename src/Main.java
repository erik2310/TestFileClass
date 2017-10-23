import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("assets/test.txt");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes.");
    }
}
