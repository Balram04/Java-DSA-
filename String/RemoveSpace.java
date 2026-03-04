import java.util.*;
class RemoveSpace{
    public static void main(String[] args) {
        String str = "   Hello World from Balram !   ";
        String removedSpace = str.replace(" ",""); // remove all spaces from the string
        // str = str.trim();  remove leading and trailing spaces only first and last space remove
        System.out.println("Original string: '" + str + "'");
        System.out.println("Removed spaces string: '" + removedSpace + "'");
    }
}


//this would be the code if we want to remove the spaces without using the replace method
// String result = "";
// for (int i = 0; i < str.length(); i++) {
//     if (str.charAt(i) != ' ')
//         result += str.charAt(i);
// }