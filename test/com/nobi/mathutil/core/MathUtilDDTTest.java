/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nobi.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
//    1. chuẩn bị bộ data, là mảng 2 chiều, 2 cột ứng với Expected và n
//    2.                                      dòng ứng với Testcase
    
//    mảng Object, số thì dùng Wrapper class - class gói các primitive
//    Integer -> int, Long -> long
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][] {{1, 0}, 
                                {1, 1}, 
                                {2, 2}, 
                                {6, 3}, 
                                {24, 4}, 
                                {120, 5}, 
                                {720, 6}};
    }
    
//    ta sẽ map/ánh xạ các cột của mỗi dòng, ví dụ dòng đầu tiên có 2 cột là 1 0 -> ta sẽ ánh xạ 1 vào biến expected, 0 vào biến n
//    tương tự cho các dòng còn lại
    @Parameterized.Parameter(value = 0)
    public long expected;
     
    @Parameterized.Parameter(value = 1)
    public int n;
    
    @Test // kiểm thử các test case với data được trích ra từ mảng map vào 2 biến tương ứng
        
    public void tesFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, getFactorial(n));
    }

    
}

//    Phân tích cách ta viết code cho phần test hàm getF() hôm trước
//    Assert.assertEquals(1, MathUtil.getFactorial());
//    lệnh dùng để test
//    hàm,method. lệnh này lặp đi lặp lại cho các data ta đưa vào để kiểm tra các tình huống xài hàm/test case
//    NẾU TA CÓ ĐƯỢC CÁCH NÀO ĐÓ, MÀ TÁCH ĐÁM DATA RA RIÊNG 1 CHỖ
//    SAU ĐÓ TỪ TỪ NHỒI/MÓM/FEED DATTA NÀY VÀO CÂU LỆNH TEST HÀM Ở TRÊN COI NHƯ CHỈ CẦN 1 LỆNH GỌI TEST HÀM, DATA CỨ THẾ TUẦN TỰ ĐẨY VÀO
//    KỸ THUẬT ĐẨY TÁCH DATA RA KHỎI CÁC CÂU LỆNH TEST, SAU ĐÓ NHỒI NÓ VÔ CÁI HÀM CÂU LỆNH TEST, GIÚP RÚT GỌN SỐ CÂU LỆNH TEST, GIÚP DỄ DÀNG KIỂM TRA TÍNH THIẾU ĐỦ CỦA CÁC TEST CASE => KỸ THUẬT DDT => DATA DRIVEN TESTING
//    VIẾT KIỂM THỬ HƯỚNG THEO TÁCH DATA => CÒN GỌI LÀ KIỂM THỬ THEO KIỂU THAM SỐ HÓA - PARAMETERIZE
    
//    CHƠI VỚI DDT TA CẦN
//    BỘ DATA TEST - TÁCH RIÊNG
//    CÁC THAM SỐ ỨNG VỚI BỘ DATA - CHÍNH LÀ CÁC BIẾN DÙNG TRÍCH DATTA RA
//    GỌI HÀM KIỂM THỬ XÀI CÁC THAM SỐ 

//    TOÀN BỘ CODE TRONG CLASS NÀY ĐƯỢC VIẾT RA DÙNG ĐỂ TEST CODE CHÍNH Ở SRC PACKAGES
//    CODE ĐC VIẾT RA DÙNG ĐỂ ĐI TEST CODE KHÁC
//    1 TEST SCRIPT SẼ CHỨA NHIỀU CODE ĐỂ    TEST HÀM CHÍNH
//    1 TEST SCRIPT SẼ CHỨA NHIỀU TEST CASE
//                                TEST CASE: CÁC TÌNH HUỐNG XÀI HÀM
//    1 TEST SCRIPT CÓ THỂ XÀI DDT ĐỂ BẢO TRÌ CODE TEST
//    VIẾT VIẾT CODE CHÍNH CÓ THỂ XÀI TDD
