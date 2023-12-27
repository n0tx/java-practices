package text_block;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        String wordLowerCase = word.toLowerCase();
        String reverse = new StringBuilder(wordLowerCase).reverse().toString();
        return wordLowerCase.equals(reverse);

    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}

