package LW_01;
import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an odd length word: ");
        String word= scanner.nextLine();

        if (word.length() % 2 == 1){
            int middle=word.length()/2;
            System.out.println("Middle character: "+word.charAt(middle));
        }
        else {
            System.out.println("word length is not odd. re enter word");
        }
        scanner.close();
    }
}
