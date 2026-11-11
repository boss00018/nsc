import java.math.BigInteger;

public class RSA {
    public static void main(String[] args) {

        BigInteger p = BigInteger.valueOf(61);
        BigInteger q = BigInteger.valueOf(53);

        BigInteger n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE)
                          .multiply(q.subtract(BigInteger.ONE));

        BigInteger e = BigInteger.valueOf(17);
        BigInteger d = e.modInverse(phi);

        BigInteger msg = BigInteger.valueOf(65);

        BigInteger cipher = msg.modPow(e, n);
        BigInteger decrypt = cipher.modPow(d, n);

        System.out.println("Original Message: " + msg);
        System.out.println("Encrypted Message: " + cipher);
        System.out.println("Decrypted Message: " + decrypt);
    }
}