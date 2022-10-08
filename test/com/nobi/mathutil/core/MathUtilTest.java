/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nobi.mathutil.core;

public class MathUtilTest {
//    Ta đi test ngoại lệ, tức là so sánh/đo lường xem ngoại lệ
//    có xuất hiện hay ko khi ta đưa data cà chớn, n < 0 || n > 20
//    thay vì so sánh expected value vs actual value lúc này ta sẽ đi so sánh/ước lượng xem ngoại lệ có xuất hiện như kì vọng hay ko, nếu xuất hiện như kỳ vọng => app yummi
//    nếu ngoại lệ xuất hiện như kì vọng
    @Test(expected = IllegalArgumentException.class)             
    public void testFactorialGivenWrongArgumentThrowsException() {
//        Test case #3: đưa data cà chớn, n âm, n quá lớn
//                      hàm được thiết kế ném về ngoại lệ!
//        Thấy ngoại lệ mừng rơi nước mắt khi đưa vào âm 5
//        Thấy ngoại lệ xuất hiện như kì vọng -> passed cái test -> màu xanh
          System.out.println("Hope to see the Exception | Illegal Argument Exception");
          MathUtil.getFactorial(-5);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {
//        Test case số #4: n = 3, hy vọng hàm trả về 6
//                                thực tế hàm trả về mấy. đoán xem!!!
        Assert.assertEqual(6, MathUtil.getFactorial(3));
//        Test case số #5: n = 4, hy vọng hàm trả về 24
//                                thực tế hàm trả về mấy. đoán xem!!!
        Assert.assertEqual(24, MathUtil.getFactorial(4));
//        Test case số #5: n = 5, hy vọng hàm trả về 120
//                                thực tế hàm trả về mấy. đoán xem!!!

        Assert.assertEqual(120, MathUtil.getFactorial(5));
    }
    
     // Coding convention - quy tắc viết code
     // Tên hàm kiểm thử/test script phải nói lên ý nghĩa của việc kiểm thử, tình huống này, ta mún test hàm getF() tham số tử tế
     // n = 0..20!!!
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
//        Test case số #1: n = 0, hy vọng hàm trả về 1
//                                thực tế hàm trả về mấy. đoán xem!!!
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
//        so sánh giữa expected vs actual, máy tự so, ko cần sout khổ cực
        Assert.assertEqual(expected, actual);
//        Test case số #2: n = 1, hy vọng hàm trả về 1
//                                thực tế hàm trả về mấy. đoán xem!!!
        Assert.assertEqual(1, MathUtil.getFactorial(1));
//        Test case số #3: n = 2, hy vọng hàm trả về 2
//                                thực tế hàm trả về mấy. đoán xem!!!
        Assert.assertEqual(2, MathUtil.getFactorial(2));    
    }
    
//    @Test ra lệnh cho thư viện JUnit mình đã add/import tự động generate ra cái hàm public static void main()
//    biến hàm tryJUnitComparision() thành hàm main()
//    và gửi main này cho JVM chạy - Java Virtual Machine
//    @Test ~~~ main()
//    ko @Test thì class ko có main(), lấy gì mà chạy no runable method
    @Test
    public void tryJUnitComparision() {
        // hàm này thử nghiệm việc so sánh expected với actual
        // coi sai đúng ra màu thế nào
        // ta đang xài hàm của thư viện JUnit nhưng ko xài bừa bãi mà phải viết theo quy tắt định trước
        // quy tắc định trước nằm ở @ - anotation
        Assert.assertEquals(100, 200);
    }
}

//CLASS NÀY DEV SẼ VIẾT NHỮNG CÂU LỆNH DÙNG ĐỂ TEST HÀM CỦA CODE CHÍNH, TEST CÁC HÀM CỦA CLASS MATHUTIL
//TRONG CLASS NÀY SẼ CÓ NHỮNG LỜI GỌI HÀM getFactorial()
//CÓ NHỮNG LỆNH SO SÁNH GIỮA ỄPCTED VÀ ACTUAL GIỐNG MÌNH ĐÃ LÀM TEST Ở BÊN MAIN()
//MẮT KO CẦN NHÌN CÁC DÒNG OUPUT TỪ HÀM System.out CHO MẤT SỨC
//MUỐN CÓ ĐƯỢC ĐIỀU NÀY TA SẼ DÙNG THÊM CÁC UNIT TESTING FRAMWORK
//VÍ DỤ: JUnit, Testing (Java)
//       xUnit, MSTest, NUnit (C#)
//       PHPUnit (PHP)
//       ...

// VIỆC VIẾT CODE ĐỂ TEST CODE GỌI LÀ UNIT TESTING
// ĐOẠN CODE TRONG CLASS NÀY DÙNG JUNIT/UNIT TESTING FRAMEWORK ĐỂ KIỂM THỬ HÀM CỦA CODE CHÍNH
// ĐOẠN CODE KIỂM THỬ NÀY ĐƯỢC GỌI LÀ: TEST SCRIPTS
// CODE DÙNG ĐỂ TEST CODE chính() GỌI LÀ TEST SCRIPT
// TEST SCRIPT LÀ CÁC ĐOẠN CODE ĐƯỢC VIẾT RA ĐỂ TEST CODE CHÍNH (DAO, DTO, CONTROLLER, API...)
// MUỐN TEST THÌ CẦN PHẢI PHÁC THẢO CÁC TEST CASE
// VÍ DỤ: VIẾT CODE ĐỂ TEST HÀM getFactorial() VỚI CÁC CASE (n = -5, 0, 1, ...)
// QUY TẮC XANH ĐỎ:
// MÀU XANH KHI TẤT CẢ CÁC TEST CASE PHẢI CÙNG LÀ MÀU XANH => EXPECTED == ACTUAL FOR ALL
// MÀU ĐỎ CHỈ CẦN 1 TRONG NHỮNG TEST CASE EPXECTED != ACTUAL => FAIL
// ý NGHĨA CỦA QUY TẮC: NẾU DÃ TEST, NẾU ĐÃ LIỆT KÊ CÁC TEST CASE THÌ CHÚNG PHẢI ĐÚNG HẾT, CÒN CHỈ CẦN 1 THẰNG SAI, HÀM KO ỔN ĐỊNH => FAIL
// EXPECTED == ACTUAL CASE ĐÚNG, TEST CASE PASSED
// EXPECTED != ACTUAL -> CASE FAILED
//        NẾU EXPECTED LÀ CHÍNH XÁC, HÀM ĐÃ XỬ LÍ SAI, BUG
//        CŨNG CÓ KHI EXPECTED, CÁI TA KÌ VỌNG BỊ SAI!!! LỖI DO DÂN QC TÍNH TOÁN