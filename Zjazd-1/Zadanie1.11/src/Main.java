import java.util.Scanner;
import java.lang.String;

public class Main {
    final static int alphabet_length = 26;
    public static String getInput(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextLine()){
            System.out.println("BŁĄD, Podaj poprwane dane:");
            scanner.nextLine();
        }
        String phrase = scanner.nextLine();
        return phrase;
    }
    public static boolean isPangrame(String phrase){
        char[] letters = new char[phrase.length()];
        for (int i = 0; i < phrase.length(); i++){
            letters[i] = phrase.charAt(i);
        }
        for (int i = 1; i <= alphabet_length; i++){
            for (int n = 0; n <=` phrase.length(); n++){
                if (letters[n] == (0x0041+i) || letters[n] == (0x0061+i) || letters[n] == 0x0020){
                    break;
                }  else {
                    if(!(n == phrase.length())){
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Podaj wyrazenie:");
        String phrase = getInput();
        if (isPangrame(phrase)){
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}