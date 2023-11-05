public class whileloop1 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1, i = 2;
        System.out.print("Janice sequence up to " + n + " terms: ");
        while (i <= n) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            i++;
        }
    }
} 
