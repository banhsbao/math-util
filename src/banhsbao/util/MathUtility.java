/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banhsbao.util;

/**
 *
 * @author Admin
 */
public class MathUtility {

    public static final double PI = 3.1415;

    //giai thua trong gioi han dau vao tu 0..20
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalAccessError("n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }//không sài else
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i; //nhan dồn vào result
        }
        return result;
    }
    //muốn kết luận hàm mình ngon , thì ta phải bằng mắt kết quả chạy của hàm
    //và so sánh cới kì vọng
    //làm từng trường hop chạy hàm 0 trst case
    // cách này ổn, nhưng mất sức
    
    //Nâng cao: DÙNG MÀU SẮC, XANH, ĐỎ ĐỂ KẾT LUẬN
    //TA THẤY MÀU XANH, HÀM Ý MỌI TÌNH HUỐNG ỔN
    //TA THẤY ĐỎ, CHỈ MỘT THẰNG ĐỎ COI NHƯ TOANG
}
