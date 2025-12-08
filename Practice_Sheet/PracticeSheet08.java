public class PracticeSheet08 {
    //COUNT VOWELS IN A STRING
    public static void countVowels(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Total vowels = " + count);
    }

    public static void main(String[] args) {

    }
}
