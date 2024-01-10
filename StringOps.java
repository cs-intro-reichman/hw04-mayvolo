import java.util.Arrays;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {      
    }

    public static String capVowelsLowRest (String string) {
        int n = string.length();
        String lowercase = "";
        String newString = "";
        for(int i = 0; i < n; i++) {
            if((string.charAt(i) >= 'A') && (string.charAt(i) <= 'Z')) {
               lowercase += (char)(string.charAt(i) + 32); 
            } else {
                lowercase += string.charAt(i);
            }
        }
        for(int j = 0; j < n; j++) {
            if((lowercase.charAt(j)=='a') || (lowercase.charAt(j)=='e') || (lowercase.charAt(j)=='i') || (lowercase.charAt(j)=='o') || (lowercase.charAt(j)=='u')){
               newString += (char)(lowercase.charAt(j) - 32);
            } else {
                newString += lowercase.charAt(j);
            }
        }
        return newString;
    }

    public static String camelCase (String string) {
        int n = string.length();
        String newString = "";
        int firstLetter = 0;
        int j = 0;
        //check if there are spaces before the first word and delete them
        if(string.charAt(0) == ' ') {
            while(string.charAt(j) == ' '){
                j++;
            }
            firstLetter = j;
        }
        int k = 0;
        //Make sure all the letters in the first word are lowercase
        for(k = firstLetter; (k < n) && (string.charAt(k) != ' '); k++) {
            if((string.charAt(k) >= 'A') && (string.charAt(k) <= 'Z')) {
                newString += (char)(string.charAt(k) + 32);
            } else {
                newString += string.charAt(k);
            }
        }
        //start the loop with the second word (if it exists)
        for(int i = (k + 1); i < n; i++) {
            if(string.charAt(i) != ' ') {
                //If there is a first letter in the word that is in lowercase - make it uppercase
                if((string.charAt(i-1) == ' ') && (string.charAt(i) >= 'a')) {
                newString += (char)(string.charAt(i) - 32);
                } else if((string.charAt(i-1) != ' ') && string.charAt(i) < 'a' ) {
                    //The letters that are not the first in the word should be in lowercase
                 newString += (char)(string.charAt(i) + 32);
                } else {
                newString += string.charAt(i);
                }   
            } //else it space so it should deleted 
        }
        return newString;
    }

    public static int[] allIndexOf (String string, char chr) {
        int stringLength = string.length();
        int arrayLength =0;
        //To determine the size of the array
        for(int i = 0; i < stringLength; i++) {
            if(string.charAt(i) == chr) {
                arrayLength++;
            }
        }
        //Create the array to store index values
        int[] allIndexOf = new int[arrayLength];
        //To populate the array with index values
        int indexArray = 0;
        for(int j = 0; j < stringLength; j++) {
            if(string.charAt(j) == chr) {
                allIndexOf[indexArray] = j;
                indexArray++;
            }
        }
        return allIndexOf;
    }
}
