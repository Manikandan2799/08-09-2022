// Write a program to compress the given string by using the below rules,
// i) Replace all the consecutive occurrence of a character with that character followed by
// count.
// ii) If the consecutive occurrence not found, then use the character alone.(if the character
// present only once, then don't include the count)
// Examples:
// Input: aaabbcdd
// Output: a3b2cd2
// Input: xyyyzzzabb
// Output: xy3z3ab2

package JavaPractices;


import java.util.Scanner;
public class ConsequetiveOccurenceString {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter String");
        String input = in.next (  );
        int count = 1;
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                if (count == 1) output += input.charAt (i);
                else output += input.charAt (i) + Integer.toString (count);
                count = 1;
            }
        }
        System.out.println(output);
    }
}
