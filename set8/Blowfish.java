import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Blowfish {
    public static void main(String[] args) throws Exception {

        String msg = "Hello World";
        String key = "MySecretKey";

        SecretKeySpec secret =
            new SecretKeySpec(key.getBytes(), "Blowfish");

        Cipher cipher = Cipher.getInstance("Blowfish");

        // Encryption
        cipher.init(Cipher.ENCRYPT_MODE, secret);
        byte[] encrypted = cipher.doFinal(msg.getBytes());

        // Decryption
        cipher.init(Cipher.DECRYPT_MODE, secret);
        byte[] decrypted = cipher.doFinal(encrypted);

        System.out.println("Original: " + msg);
        System.out.println("Encrypted: " +
            java.util.Base64.getEncoder().encodeToString(encrypted));
        System.out.println("Decrypted: " +
            new String(decrypted));
    }
}
