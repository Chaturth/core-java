//take a array of words ,print length of each word,print words which have length>4..

class Wordlength {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date"};

        for (String word : words) {
            if (word.length() > 4) {
                System.out.println("Long word: " + word + " -> " + word.length());
            }
        }
    }
}
