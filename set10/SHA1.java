
import java.security.MessageDigest;
import java.util.Scanner;

public class SHA1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        MessageDigest md = MessageDigest.getInstance("SHA-1");

        byte[] hash = md.digest(text.getBytes("UTF-8"));

        StringBuilder result = new StringBuilder();

        for (byte b : hash) {
            result.append(String.format("%02x", b & 0xff));
        }

        System.out.println("SHA-1 Digest: " + result);

        sc.close();
    }
}
