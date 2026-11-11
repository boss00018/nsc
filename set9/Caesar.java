import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Plain Text: ");
        String text = sc.nextLine().toUpperCase();

        System.out.print("Enter Key: ");
        int key = sc.nextInt();

        String enc = "";
        String dec = "";

        // Encryption
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                enc += (char) ((ch - 'A' + key) % 26 + 'A');
            } else {
                enc += ch;
            }
        }

        // Decryption
        for (int i = 0; i < enc.length(); i++) {
            char ch = enc.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                dec += (char) ((ch - 'A' - key + 26) % 26 + 'A');
            } else {
                dec += ch;
            }
        }

        System.out.println("Encrypted Text: " + enc);
        System.out.println("Decrypted Text: " + dec);

        sc.close();
    }
}
