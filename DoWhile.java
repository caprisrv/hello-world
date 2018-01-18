import java.util.*;
class DoWhile
{

public static void main(String args[])
{

Scanner scanner = new Scanner(System.in);
String guess;
do {
    System.out.print("Guess my name: ");
    guess = scanner.nextLine();
}
while (!"Daffy Duck".equals(guess));
System.out.println("Congratulations, you guessed my name correctly!");

}

}