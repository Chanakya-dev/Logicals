package Strings;
import java.util.*;
public class reverse1 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter String");
	String sentence = in.nextLine();
	String[] words = sentence.split(" ");
	String reversedSentence = "";

	for (int i = words.length - 1; i >= 0; i--) {
	    reversedSentence += words[i] + " ";
	}
	reversedSentence = reversedSentence.trim();
	System.out.println(reversedSentence);
}
}
