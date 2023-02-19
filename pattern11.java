/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */

class Solution {

    void printTriangle(int n) {
        int flag = 1; 
        int bigFlag = 0;
        for (int i = 0; i < n; i++) {
            flag = bigFlag == 1 ? 0 : 1;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(flag + " ");
                flag = flag == 1 ? 0 : 1;
            }
            bigFlag = bigFlag == 1 ? 0 : 1;
            System.out.println();
        }
    }
}