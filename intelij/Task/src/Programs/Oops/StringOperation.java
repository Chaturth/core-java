package Programs.Oops;

class StringOperation {

    void search(String str, char ch) {
        System.out.println(str.indexOf(ch));
    }

    void search(String str, String sub) {
        System.out.println(str.indexOf(sub));
    }

    void search(String str, String sub, int start) {
        System.out.println(str.indexOf(sub, start));
    }
}

class StringManipulation extends StringOperation {

    @Override
    void search(String str, char ch) {
        System.out.println("Character found at: " + str.indexOf(ch));
    }

    @Override
    void search(String str, String sub) {
        System.out.println("Substring found at: " + str.indexOf(sub));
    }

    @Override
    void search(String str, String sub, int start) {
        System.out.println("Substring found at: " + str.indexOf(sub, start));
    }
}

