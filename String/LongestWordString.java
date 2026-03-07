//method 1 using split method tcs o(n) and sc o(n) beacause we are storing the words in an array
import java.util.*;
class LongestWordString {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);  //taking input
        String Sentence = sc.nextLine();    //taking sting 
        String words[]= Sentence.split(" ");    //spliting by space  into words
        String longest="";                       
        for(String word:words){
            if(word.length()>longest.length()){
                longest=word;
            }
        }
        System.out.println(longest);
    }
}

//method 2 without using split  tcs o(n) and sc o(1)
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String longest = "";
        String current = "";

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) != ' '){
                current += s.charAt(i);
            }
            else{
                if(current.length() > longest.length()){
                    longest = current;
                }
                current = "";
            }
        }

        if(current.length() > longest.length()){
            longest = current;
        }

        System.out.println(longest);
    }
}