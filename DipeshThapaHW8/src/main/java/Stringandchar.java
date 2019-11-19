/**
 * Dipesh Thapa 
 * CSCI 295
 * Homework 8 String and char
 * 
 */
public class Stringandchar {

    public static void main(String[] args) {

        countVowelsTester();
        addDigitsTester();

    }

    static int countVowels(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'e' || ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'E' || ch == 'A' || ch == 'I' || ch == 'O' || ch == 'U') 
            {
                count++;
            }

        }
        return count;
// int count =0;
// char ch; 
// for (int i =0; i < s.length(); i++) {
    // ch = s.charAt(i);
    // switch (ch) {
    // case 'a':
    
    
    //count++;
    
    //}
    
    //}
    }

    static void countVowelsTester() {

        String message;
        int voweles;
        //  message = " aeiou AEIOU ";  
        message = "Dipesh";
        voweles = countVowels(message);
        System.out.println(" The Total voule is " + voweles);
    }

    static int addDigits(String s) {

        int count = 0;
 char ch;
        for (int i = 0; i < s.length(); i++) {
             ch = s.charAt(i);

            if ('0' <= ch && ch <= '9') {

                count += (int) (ch - '0');
                //count += ch - '0';
            }

        }
        return count;
    }

    static void addDigitsTester() {
        String message;
        int total;
        //message = " St. Ambrose University";
        message = " A-B-C, 1-2-3";
        total = addDigits(message);
        System.out.println(" The Total digit is " + total);
        
        
        
        /// Write a hello world program

    }
}
