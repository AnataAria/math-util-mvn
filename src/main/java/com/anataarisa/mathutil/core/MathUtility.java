/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anataarisa.mathutil.core;

/**
 *
 * @author AnataArisa
 */

// class này sẽ chứa 1 loạt các hàm static dùng để làm thư viện cho các nơi khác xài.
public class MathUtility {
    public static final double PI = 3.14;
    // Hàm tính n!
    //0! =  1! = 1 - quy ước
    //Không tính được giai thừa số âm
    //n! tăng rất nhanh, 20! vừa đủ full kiểu long 18 con số 0
    //Quy ước <0 và >20! ném ngoại lệ 
    public static long getFactorial(int n){
        if(n< 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be 0..20");
        if(n==0 || n==1) return 1;//Ket thuc som ham
        long result = 1;
        for(int i = 2; i <= n; i++) result *= i;
        return result;
    }
}
