package Codility;

public class OddOccurencesInArrays {

    public static void main(String[] args) {
        OddOccurencesInArrays myApp = new OddOccurencesInArrays();
        int[] A = {3};
        int[] B = {3, 9, 3, 4, 4};
        int[] C = {3, 4, 3, 5, 5};

        System.out.println(myApp.solution(A));
        System.out.println(myApp.solution(B));
        System.out.println(myApp.solution(C));

    }

    public int solution(int[] A) {
        // Implement your solution here
        int N = A.length;
        int odd = 0;
        if (N % 2 != 0) {
            if(N < 2){
                return A[0];
            }
            for (int value : A) {
                odd ^= value;
            }
        }
        return odd;
    }
}
