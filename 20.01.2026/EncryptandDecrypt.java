import java.util.Scanner;

public class EncryptandDecrypt {
    
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter the encrypted code : ");
            String encrypt = sc.next();
            String decrypt = "";
            int l = encrypt.length();

            for(int i=0;i<l-1;i+=2){
                
                decrypt += encrypt.charAt(i+1);
                decrypt += encrypt.charAt(i);
                
            }
            if(l%2!=0){
                    decrypt+= encrypt.charAt(l-1);
                }
            System.out.println(decrypt);
        }
    }
}
