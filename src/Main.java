public class Main {
    public static void main(String[] args) {
        MatrrixMath matrrixMath = new MatrrixMath();
        SimpleMath simpleMath = new SimpleMath();
        TrigMath trigMath = new TrigMath();

        System.out.println("Sum = " + simpleMath.getSumm(3,5));
        System.out.println("Circle square = " + trigMath.getCircleSquare(32));
        int[][] array = new int[][] {
            {
                4, 5, 6
            },
            {
                2, 8, 11
            },
            {
                0, 1, 3
            }
        };

        System.out.println(matrrixMath.getSumMainDiagonal(array));
    }
}