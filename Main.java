import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner s = new Scanner(System.in);

        System.out.println("Enter an array index: ");
        int index = s.nextInt();

        try {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index. Please enter a value between 0 and " + (arr.length - 1));
        } 
        finally {
            System.out.println("Array access operation concluded.");
        }
    }
}