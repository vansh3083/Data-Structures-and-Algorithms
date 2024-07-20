import java.util.Scanner;
public class SearchInString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str  = "Vermithor";
        System.out.print("Enter the character to search: ");
        char target = input.next().trim().charAt(0);
        System.out.println(search(str, target));
    }

    static boolean search(String str, char target){
       if(str.length() == 0){
           return false;
       }
        for(int i =0; i<str.length(); i++){
           if (target == str.charAt(i)){
               return true;
           }

       }
       return false;
    }
}
