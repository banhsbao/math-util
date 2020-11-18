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
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalAccessError("n must be between 0..20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }//không sài else
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i; //nhan dồn vào result
//        }
//        return result;
//    }
    //muốn kết luận hàm mình ngon , thì ta phải bằng mắt kết quả chạy của hàm
    //và so sánh cới kì vọng
    //làm từng trường hop chạy hàm 0 trst case
    // cách này ổn, nhưng mất sức
    //Nâng cao: DÙNG MÀU SẮC, XANH, ĐỎ ĐỂ KẾT LUẬN
    //TA THẤY MÀU XANH, HÀM Ý MỌI TÌNH HUỐNG ỔN
    //TA THẤY ĐỎ, CHỈ MỘT THẰNG ĐỎ COI NHƯ TOANG
    // Minh hoaj cho khai nieemj Refatoring - tối ưu, chihr sử lại code 
    // cho tốt hơn
    // và minh họa khai niệm Regresstion Test, test hồi quy, test lại những
    //gì đã từng test Xanh, để chekc xem code còn XANH như ngàu xưa không
    //sauk ho đã sửa code
//        public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalAccessError("n must be between 0..20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }//không sài else
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i; //nhan dồn vào result
//        }
//        return result;
//    }
    //Viết đẹ qui cho hoành tráng
    //gọi là chính mình với 1 quy mô khác
    //5! =5x4!, bắt tính 5!, khoan đi tính 4! rồi tính tiếp
    //4! =4x3!, bắt tính 4!, khoan đi tính 3! rồi tính tiếp
    //3! =3x2!, bắt tính 3!, khoan đi tính 2! rồi tính tiếp
    //2! =2x1!, bắt tính 2!, khoan đi tính 1! rồi tính tiếp
    // đệ tuy phải có điểm dừng, không đi miết à
    //rất dễ bị lặp vô tận nêu không có dừng
    //1! = 1 quy ước rồi, dừng, hồi ngược lại lên trên ra 5
    //kết luận n!=m*(n-1)!
    public static long getFactorial(int n) {
        if (n < -0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        //n>1 & n<=20, raps coong thuc de qui
        return n*getFactorial(n-1);
    }

}
