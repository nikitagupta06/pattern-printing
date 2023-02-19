/*
    *
   ***  
  *****
 *******
*********
 */

class Solution {

    void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}