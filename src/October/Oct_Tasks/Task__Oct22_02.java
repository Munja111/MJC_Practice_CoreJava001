package October.Oct_Tasks;

import java.util.Scanner;

public class Task__Oct22_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string: ");

        String inputString = scanner.nextLine();
        String lowerCaseInput= inputString.toLowerCase();
        System.out.println("length of the string is: "+lowerCaseInput.length());
        int v_count=0;
        int c_count=0;


        for (int i=0;i<lowerCaseInput.length();i++){
            char c = lowerCaseInput.charAt(i);

            if(Character.isLetter(c)){
                if (c =='a'|| c=='e' ||c =='i'|| c=='o'||c =='u') {
                    v_count++;
                }else {
                    c_count++;
                }
            }
        }
        System.out.println("Number of vowels is: "+v_count);
        System.out.println("Number of consonants is: "+c_count);
        scanner.close();
    }
}
