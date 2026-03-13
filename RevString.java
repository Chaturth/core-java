//Program to find Reverse of a String

class RevString {
    
    public static void main(String args[]) {
        String text = "Sringeri";
        
        String reverse = "";
        
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }
        
      
        System.out.println("Reversed: " + reverse);
    }
}
