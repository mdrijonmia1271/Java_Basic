public class array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 12;
        numbers[1] = 13;
        numbers[2] = 14;
        numbers[3] = 15;
        numbers[4] = 16;

        int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        System.out.print("The Arry sum =  "+sum);
        int len = numbers.length;
        System.out.print("\nNumber of array length = "+len);

    }
}
