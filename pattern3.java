/*
1
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
 */

 class Solution {

    void printTriangle(int n) {
        // code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}