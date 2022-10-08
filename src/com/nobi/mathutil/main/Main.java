/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.nobi.mathutil.main;

import com.nobi.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        tryTDDFirst();
          testFactorialGivenWrongArgumentThrowsException();
    }
    
    public static void testFactorialGivenWrongArgumentThrowsException() {
//        Test case #3: đưa data cà chớn, n âm, n quá lớn
//                      hàm được thiết kế ném về ngoại lệ!
//        Thấy ngoại lệ mừng rơi nước mắt khi đưa vào âm 5
//        Thấy ngoại lệ xuất hiện như kì vọng -> passed cái test -> màu xanh
          System.out.println("Hope to see the Exception | Illegal Argument Exception");
          MathUtil.getFactorial(-5);
    }
    
//    Hàm này được viết ra để dùng thử kỹ thuật viết code kiểu TDD
//    Dùng thử chính bên trong code/bên MathUtil xem nó sai đúng ra sao, ở ngay bước khởi đầu viết hàm
    public static void tryTDDFirst() {
//      Test case #1
//      Input: n = 1
//      Gọi hàm trả về 1, vì 1! = 1
        long expected = 1;
        
        long actual = MathUtil.getFactorial(1);
//      So sánh expected vs actual coi chúng giống nhau hem?
//      Giống -> hàm đúng với case đang test
//      Sai -> Bug rồi!!! với case đang test
        System.out.println("Test 1! | status: " + (expected == actual) + " | Expected: " + expected + " | Actual: " + actual);
    }
}
