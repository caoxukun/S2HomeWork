package 第五章;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 异常 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数：");
        try {
            int num1 = in.nextInt();
            System.out.print("请输入除数：");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
        }catch (InputMismatchException e){
            System.err.println("您的输入有误，请从新输入");
        }finally {
            System.out.println("感谢使用本程序！");
        }
    }
}
