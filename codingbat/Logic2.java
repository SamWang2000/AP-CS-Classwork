/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbat;

/**
 *
 * @author asus
 */
public class Logic2 {
    public static boolean makeBricks(int small, int big, int goal){
        return true;
    }
    public static int loneSum(int a, int b, int c) {
    if (a == b && b == c) return 0;
    if (a == b) return c;
    if (a == c) return b;
    if (b == c) return a;
    return a + b + c;
}
    public static int luckySum(int a, int b, int c) {
    if (a == 13) return 0;
    if (b == 13) return a;
    if (c == 13) return a + b;
    return a + b + c;
}
    
}
