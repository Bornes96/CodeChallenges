package Codility;

public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap myApp = new BinaryGap();

        System.out.println(myApp.solution(529));
        System.out.println(myApp.solution(9));
        System.out.println(myApp.solution(5));

    }

    public int solution(int N) {
        // Implement your solution here
        String binaryRep = Integer.toBinaryString(N);
        int currentGap = 0;
        int maxGap = 0;
        boolean counting = false;

        for (int i = 0; i < binaryRep.length(); i++) {
            char c = binaryRep.charAt(i);

            if (c == '1') {
                if (counting && currentGap > maxGap) {
                    maxGap = currentGap;
                }
                counting = true;
                currentGap = 0;
            } else if (counting) {
                currentGap++;
            }
        }

        return maxGap;
    }
}
