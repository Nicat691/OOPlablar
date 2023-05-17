public class Main {
    public static void main(String[] args) {
        int[] evenArr = {2, 4, 6, 8, 10};
        int[] oddArr = new int[4];
        try {
            for (int i = 0; i < evenArr.length; i++) {
                oddArr[i] = evenArr[i] - 1;
            }
        } catch (ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
        }
    }
}