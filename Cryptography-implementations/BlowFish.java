import java.util.*;
import java.io.*;
import javax.crypto.*;
import javax.crypto.spec.*;
public class BlowFish {
private SecretKeySpec KS;
private Cipher cipher;
byte[] keyAsBytes;
private String myEncryptionKey;
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public BlowFish() throws Exception
{
myEncryptionKey="MySecretKey";
keyAsBytes=myEncryptionKey.getBytes("UTF8");
KS = new SecretKeySpec(keyAsBytes, "Blowfish");
cipher = Cipher.getInstance("Blowfish");
}
public String encrypt(String unencryptedString)
{ String encryptedString = null;
try {
cipher.init(Cipher.ENCRYPT_MODE, KS);
byte[] plainText = unencryptedString.getBytes("UTF8");
byte[] encryptedText = cipher.doFinal(plainText);
encryptedString = Base64.getEncoder().encodeToString(encryptedText);
}
catch (Exception e)
{
e.printStackTrace();
}
return encryptedString;
}
public String decrypt(String encryptedString)
{ String decryptedText=null;
String dt="";
try {
cipher.init(Cipher.DECRYPT_MODE, KS);
byte[] encryptedText = Base64.getDecoder().decode(encryptedString);
byte[] plainText = cipher.doFinal(encryptedText);
decryptedText=new String(plainText);
}
catch (Exception e)
{
e.printStackTrace();
}
return decryptedText;
}
public static void main(String args []) throws Exception
{
BlowFish myEncryptor= new BlowFish();
System.out.print("Enter the string: ");
String stringToEncrypt = br.readLine();
String encrypted = myEncryptor.encrypt(stringToEncrypt);
String decrypted = myEncryptor.decrypt(encrypted);
System.out.println("\nString To Encrypt: " +stringToEncrypt);
System.out.println("\nEncrypted Value : " +encrypted);
System.out.println("\nDecrypted Value : " +decrypted);
}
}