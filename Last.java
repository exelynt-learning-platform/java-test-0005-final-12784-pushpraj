public class Last {
    public static void main(String[] args) {
        final int PYRAMID_HEIGHT = 5;
        int column = 1;
        int count = 0;
        for(int row = 1; row <= PYRAMID_HEIGHT; row++) {
            count = row + column;
            while(column < count) {
                System.out.print(column++ + " ");
            }
            System.out.println();
        }
    }
}
