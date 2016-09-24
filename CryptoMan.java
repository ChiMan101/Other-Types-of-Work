import java.util.Scanner;
public class work {
    public static void main (String[] args) {
    
        System.out.println("Welcome to Cryptoman the movie. Please input your code that you would like to be encrypted.");
        String inputStr1 = new Scanner(System.in).nextLine();
        String inputStr2 = new Scanner(System.in).nextLine();
        String inputStr3 = new Scanner(System.in).nextLine();
        String inputStr4 = new Scanner(System.in).nextLine();
        
        
        String strippedString1A = removeWord(inputStr1, "the ");
        String strippedString1B = removeWord(strippedString1A, "and ");
        String strippedString2A = removeWord(inputStr2, "the ");
        String strippedString2B = removeWord(strippedString2A, "and ");
        String strippedString3A = removeWord(inputStr3, "the ");
        String strippedString3B = removeWord(strippedString3A, "and ");
        String strippedString4A = removeWord(inputStr4, "the ");
        String strippedString4B = removeWord(strippedString4A, "and "); 
        
        System.out.println("Your first stripped string is:"+strippedString1B);
        System.out.println("Your second stripped string is:"+strippedString2B);
        System.out.println("Your third stripped string is:"+strippedString3B);
        System.out.println("Your fourth stripped string is:"+strippedString4B);
        
        String codedString1 = codeString(strippedString1B);
        String codedString2 = codeString(strippedString2B);
        String codedString3 = codeString(strippedString3B);
        String codedString4 = codeString(strippedString4B);
        
        System.out.println(codedString1);
        System.out.println(codedString2);
        System.out.println(codedString3);
        System.out.println(codedString4);
        
        System.out.println(decodeString(codedString1));
        System.out.println(decodeString(codedString2));
        System.out.println(decodeString(codedString3));
        System.out.println(decodeString(codedString4));
        
    }
    
    public static String removeWord(String stringX, String word) {
        int index = 100;
        while(index >= 0) {
            index = stringX.indexOf(word);
            
            if(index >= 0) {
                stringX = stringX.substring(0, index) +
                stringX.substring(index + word.length());
            }
            
            return stringX;
        }
        return stringX;
    }
    
    public static String codeString(String string1) {
        //put your codes and your switch statement in here...
        int length1 = string1.length();
        String[] codes = { "C", "E", "H", "K", "M", "O", "D", "S", "Q", "U", "T",
                           "P", "A", "Z", "W", "Y", "V", "N", "I", "X", "R", "F", "L",
                           "B", "J", "G" }; //Make a new blank String
        
        String codedString1 = ""; //Make a new blank String
        String aCharacter = "";
        for(int index1 = 0; index1 < length1; index1++) {
            //Get one character from "string1"
            aCharacter = string1.substring(index1, index1 + 1);
            switch (aCharacter) { //replace each letter with a different letter from our code list 
                case "a":
                case "A":
                    codedString1 = codedString1 + codes[0];
                    break;

                case "b":
                case "B":
                    codedString1 = codedString1 + codes[1]; //other letters not shown, follow the same pattern for other symbols...
                    break;

                case "c":
                case "C":
                    codedString1 = codedString1 + codes[2];
                    break;

                case "d":
                case "D":
                    codedString1 = codedString1 + codes[3];
                    break;

                case "e":
                case "E":
                    codedString1 = codedString1 + codes[4];
                    break;

                case "f":
                case "F":
                    codedString1 = codedString1 + codes[5];
                    break;

                case "g":
                case "G":
                    codedString1 = codedString1 + codes[6];
                    break;

                case "h":
                case "H":
                    codedString1 = codedString1 + codes[7];
                    break;

                case "i":
                case "I":
                    codedString1 = codedString1 + codes[8];
                    break;

                case "j":
                case "J":
                    codedString1 = codedString1 + codes[9];
                    break;

                case "k":
                case "K":
                    codedString1 = codedString1 + codes[10];
                    break;

                case "l":
                case "L":
                    codedString1 = codedString1 + codes[11];
                    break;

                case "m":
                case "M":
                    codedString1 = codedString1 + codes[12];
                    break;

                case "n":
                case "N":
                    codedString1 = codedString1 + codes[13];
                    break;

                case "o":
                case "O":
                    codedString1 = codedString1 + codes[14];
                    break;

                case "p":
                case "P":
                    codedString1 = codedString1 + codes[15];
                    break;

                case "q":
                case "Q":
                    codedString1 = codedString1 + codes[16];
                    break;

                case "r":
                case "R":
                    codedString1 = codedString1 + codes[17];
                    break;

                case "s":
                case "S":
                    codedString1 = codedString1 + codes[18];
                    break;

                case "t":
                case "T":
                    codedString1 = codedString1 + codes[19];
                    break;

                case "u":
                case "U":
                    codedString1 = codedString1 + codes[20];
                    break;

                case "v":
                case "V":
                    codedString1 = codedString1 + codes[21];
                    break;

                case "w":
                case "W":
                    codedString1 = codedString1 + codes[22];
                    break;

                case "x":
                case "X":
                    codedString1 = codedString1 + codes[23];
                    break;

                case "y":
                case "Y":
                    codedString1 = codedString1 + codes[24];
                    break;

                case "z":
                case "Z":
                    codedString1  = codedString1 + codes[25];
                    break;

                default:
                    codedString1 = codedString1 + "."; //Use something for non-letters
            }
        } //end of loop
        //Get the very last character from "string1" and repeat the switch statement...


        //Second switch statement not shown for last character...
        return codedString1;
    }
    /*
     * { "C", "E", "H", "K", "M", "O", "D", "S", "Q", "U", "T",
                           "P", "A", "Z", "W", "Y", "V", "N", "I", "X", "R", "F", "L",
                           "B", "J", "G" };
     */
    public static String decodeString(String string1) {
        //put your reverse codes and a second switch statement in here to undo what you did...
        int length1 = string1.length();
        String[] codes = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }; //Make a new blank String
        
        String codedString1 = ""; //Make a new blank String
        String aCharacter = "";
        for(int index1 = 0; index1 < length1; index1++) {
            //Get one character from "string1"
            aCharacter = string1.substring(index1, index1 + 1);
            switch (aCharacter) { //replace each letter with a different letter from our code list 
                case "c":
                case "C":
                    codedString1 = codedString1 + codes[0];
                    break;

                case "e":
                case "E":
                    codedString1 = codedString1 + codes[1]; //other letters not shown, follow the same pattern for other symbols...
                    break;

                case "h":
                case "H":
                    codedString1 = codedString1 + codes[2];
                    break;

                case "k":
                case "K":
                    codedString1 = codedString1 + codes[3];
                    break;
                    
                case "m":
                case "M":
                    codedString1 = codedString1 + codes[4];
                    break;

                case "o":
                case "O":
                    codedString1 = codedString1 + codes[5];
                    break;

                case "d":
                case "D":
                    codedString1 = codedString1 + codes[6];
                    break;

                case "s":
                case "S":
                    codedString1 = codedString1 + codes[7];
                    break;

                case "q":
                case "Q":
                    codedString1 = codedString1 + codes[8];
                    break;

                case "u":
                case "U":
                    codedString1 = codedString1 + codes[9];
                    break;

                case "t":
                case "T":
                    codedString1 = codedString1 + codes[10];
                    break;

                case "p":
                case "P":
                    codedString1 = codedString1 + codes[11];
                    break;

                case "a":
                case "A":
                    codedString1 = codedString1 + codes[12];
                    break;

                case "z":
                case "Z":
                    codedString1 = codedString1 + codes[13];
                    break;

                case "w":
                case "W":
                    codedString1 = codedString1 + codes[14];
                    break;

                case "y":
                case "Y":
                    codedString1 = codedString1 + codes[15];
                    break;

                case "v":
                case "V":
                    codedString1 = codedString1 + codes[16];
                    break;

                case "n":
                case "N":
                    codedString1 = codedString1 + codes[17];
                    break;

                case "i":
                case "I":
                    codedString1 = codedString1 + codes[18];
                    break;

                case "x":
                case "X":
                    codedString1 = codedString1 + codes[19];
                    break;

                case "r":
                case "R":
                    codedString1 = codedString1 + codes[20];
                    break;

                case "f":
                case "F":
                    codedString1 = codedString1 + codes[21];
                    break;

                case "l":
                case "L":
                    codedString1 = codedString1 + codes[22];
                    break;

                case "b":
                case "B":
                    codedString1 = codedString1 + codes[23];
                    break;

                case "j":
                case "J":
                    codedString1 = codedString1 + codes[24];
                    break;

                case "g":
                case "G":
                    codedString1 = codedString1 + codes[25];
                    break;

                default:
                    codedString1 = codedString1 + " "; //Use something for non-letters
            }
        } //end of loop
        //Get the very last character from "string1" and repeat the switch statement
        aCharacter = string1.substring(length1);
        //Second switch statement not shown for last character...
        return codedString1;
    }
}
