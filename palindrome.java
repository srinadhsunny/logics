import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String res="palindrome";
        int n=s.length();
        int right=n-1;
        for(int left=0;left<right;left++){
            if(s.charAt(left)!=s.charAt(right)){
                res="notPalindrome";
            }
            right--;

        }
        System.out.println(res);
    }

}
