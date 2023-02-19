/*
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
*/

class Solution {

    void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}