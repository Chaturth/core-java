class Palindrome {
    public static void main(String... args) {
        String num = "121";   
        String reversed = "";

    
        for (int i = num.length() - 1; i >= 0; i--) {
            reversed = reversed + num.charAt(i);
        }
        if (num.equals(reversed)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}


class PalindromeInteger {
    public static void main(String... args) {
        
        int num = 121;
        int original=num;
        int result = 0;

        while (num > 0) {
            int digit = num % 10;         
            result = result * 10 + digit; 
            num = num / 10;               
        }

        if (original == result) {
            System.out.println(original+ " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}wwwwwww
		  
