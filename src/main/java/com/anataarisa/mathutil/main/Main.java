/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.anataarisa.mathutil.main;

import com.anataarisa.mathutil.core.MathUtility;

/**
 *
 * @author AnataArisa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected: " + expected + " | actual = " + actual);
        n = 1; 
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected: " + expected + " | actual = " + actual);
        
        n = 5; 
        expected = 120;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected: " + expected + " | actual = " + actual);
    }
    // MINH LA DEV, MINH PHAI TEST CODE CUA MINH  NGON TRUOC DA
    // MUON TEST CODE (DEV) HAY TEST APP (QC/TESTER) THI CAN PHAI CHUAN BI
    // TEST CASE - TINH HUONG KIEM THU, TRUONG HOP KIEM THU - CACH TA KIEM THU TRONG 1 NGU CANH NAO DO - BAN VE BO DATA
}
// ID | Description | Step/Procedures | Expected Result | Status (Passed/Failed)
// DEV EM MUN KIEM THU COI HAM CHINH EM VIET GET FACTORIAL DUNG HAY SAI THI E PHAI THIET KE CAC TEST CASE

//#TEST  CASE #1: VARIFY GETFACTORIAL(WITH N = 0)
//STEP-PROCEDURE:
//1. GIVEN N = 0
//2.EXECURE/CALL/INVOKE FUNCTION GETFACTORIAL(0)
// EXPECTED RESULT: THE FUNCTION MUST RETURN 1 (STANDING FOR 0! = 1) 
    // Status: PASSED, OR FAILED,  DUA TEST DATA VAO, DUOC GOI LA TEST RUN

//#TEST CASE #2 VARIFFY GET FACTORIAL (WITH N = 1)
//STEPS/PROCEDURES: 
// 1 GIVE N = 1
// 2 CALL/INVOKE GETFACTORIAL(N = 1)
//EXPECTED RESULT:  THE METHOD MUST RETURN 1 IN CASE OF 1!

//