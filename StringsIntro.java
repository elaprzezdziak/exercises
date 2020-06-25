import java.util.*;

//input: two strings
//output: line 1 - length of both strings combined
//        line 2 - "yes" if first string is lexicographically first, else "no"
//        line 3 - capitalize first letter
public class StringsIntro {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = scan.nextLine();

        scan.close();

        //getting length
        String getLen = A + B;
        int length = getLen.length();
        System.out.println(length);

        if (A.compareTo(B) > 0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

        //upper case
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capA + ' ' + capB);

    }
}
