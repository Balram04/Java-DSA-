class CheckOnlyDigit {
    public static void main(String[] args) {
        String str = "12345";
        boolean isOnlyDigits = true;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))==false) {
                isOnlyDigits = false;
                break;
            }
        }
 
        if (isOnlyDigits) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains characters other than digits.");
        }
    }
}