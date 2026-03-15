public class Last {
    public static void main(String[] args) {
        final int PYRAMID_HEIGHT = 5;
        int count = 1;
        for(int i = 1; i <= PYRAMID_HEIGHT; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
