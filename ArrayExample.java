public class ArrayExample {
    public static void main(String[] args) {
        int[] num1Array = new int[5];
        int[] numbers = {12, 4, 5, 2, 5};
        System.out.println("First Element:" + numbers[0]);
        System.out.println("Second Element:" + numbers[1]);
        numbers[1] = 10;
        System.out.println("Modified Second Element:" + numbers[1]);
    }
}