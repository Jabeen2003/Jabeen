public class Sort {
    public static void main(String[] args) {
        int numbers[] = {5, 7, 3, 1, 6, 8};
        int temp = numbers[0];
        for(int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i+1] < temp) {
                temp = numbers[i+1];
            }
        }
        System.out.println(temp);
    }
}
