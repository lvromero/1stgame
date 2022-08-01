import java.util.Scanner;

public class Input {
    int readInt(){
        Scanner keyboard = new Scanner(System.in);
        int myint = keyboard.nextInt();
        return myint;
    }
    char readChar(){
        Scanner keyboard = new Scanner(System.in);
        String mystr = keyboard.next();
        return mystr.charAt(0);
    }
}
