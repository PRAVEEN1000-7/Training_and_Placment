import java.util.Scanner;

class FirstOccurrence {
    public static void main(String arg[]) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the word : ");
            String word = sc.next();
            
            String result ="";
            
            for (char w : word.toCharArray()) {
                if (!result.contains(""+w)) {
                    result+=w;
                }
            }
            System.out.println("result word : "+result);
        }
    }   
}