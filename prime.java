import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int s = sc.nextInt();
        boolean res=true;
        for(int i=2;i<s/2;i++){
            if(s%i==0){
                res=false;
            }
        }
        System.out.println(res);
    }

}
