import java.util.Scanner;
public class main {
    static boolean isPalindrom(int sayi){
        int temp,palidromNumber,digits;
        temp=sayi;
        palidromNumber=0;
        while (temp !=0){
            digits=temp%10;
            temp /=10;
            palidromNumber =(palidromNumber*10)+digits;
        }
        if (sayi == palidromNumber){
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        number=input.nextInt();
        System.out.println(isPalindrom(number));

    }
}
