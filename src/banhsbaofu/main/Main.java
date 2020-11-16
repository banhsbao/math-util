package banhsbaofu.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        //ta test thu ham cua ta
        //dung mat de so sanh ket qua thuc te khi chay va ket qua mong doi
        long expected = 120; //ta mong nhan 120 neu goi ham 5 giai thua
        long actual = banhsbao.util.MathUtility.getFactorial(5);
        System.out.println("5! Expected: " + expected + "Actual: " + actual);

//        //expected : 720 if tinh 6!
//        System.out.println("6! " + banhsbao.util.MathUtility.getFactorial(6));
//        //expected :IlegalArgumentException if tinh 5!
//        System.out.println("6! " + banhsbao.util.MathUtility.getFactorial(-5));
    }
}
