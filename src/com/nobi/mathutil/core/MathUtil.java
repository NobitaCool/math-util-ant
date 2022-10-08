/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nobi.mathutil.core;

/**
 *
 * @author Admin
 */
// đây là class mô phỏng lại các hàm tiện ích/dùng chung cho mọi class khác
// mô phỏng lại các class tiện ích java.Math của JDK
// Phàm cái gì là đồ dùng chung, thường được thiết kế là static

public class MathUtil {
    
    public static final double PI = 3.141592653589793;
    
    public static long getFactorial(int n) {
        
        if(n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be in 1..20");
        
        if(n <= 0) return 1;
        
//      CẤM KHÔNG XÀI ELSE NỮA KHI HÀM ĐÃ CÓ RETURN
        
        return n * getFactorial(n - 1);
    }
}

//TA SẼ HỌC SỞ VỀ KHÁI NIỆM TDD - TEST DRIVEN DEVELOPMENT
//LÀ KỸ THUẬT LẬP TRÌNH/ÁP DỤNG CHO DÂN DEV ĐỂ GIA TĂNG CHẤT LƯỢNG CODE/GIẢM THIỂU CÔNG SỨC TÌM BUG/PHÁT HIỆN BUG TỪ SỚM
//TDD YÊU CẦU DEV KHI VIẾT CODE/FUNCTION/CLASS PHẢI VIẾT LUÔN CÁCH SỬ DỤNG CÁI HÀM NÀY/VIẾT LUÔN CÁC BỘ KIỂM THỬ/VIẾT LUÔN CÁC TEST CASE VIẾT LUÔN CÁC ĐOẠN CODE DÙNG THỬ HÀM
//VIÉT CODE KÈM VỚI VIẾT TEST CASES
//VIẾT CODE CÓ Ý THỨC VIẾT LUÔN PHẦN KIỂM THỬ HÀM/CODE/CLASS
//   DEV DRIVEN                            TEST
//SAU KHI CÓ ĐƯỢC TÊN HÀM THÌ VIẾT LUÔN CÁC TÌNH HUỐNG XÀI HÀM CHẤP NHẬN KHI CHẠY HÀM CHẠY SAI -> CODE CHƯA XONG
//SAU ĐÓ TA TỐI ƯU/CHỈNH SỬA CODE ĐỂ ĐẢM BẢO CODE ĐÚNG
//QUÁ TRÌNH SAI - ĐÚNG - SAI - ĐÚNG DIỄN RA LIÊN TỤC      
