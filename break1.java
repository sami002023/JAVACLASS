public class break1 {
    public static void main(String[] args) {
        for (int marks = 50; marks <= 100; marks++) {
            boolean Pass = true;
            for (int j = 2; j < marks; j++) {
                if (marks % j == 0) {
                    Pass = false;
                    break;
                }
            }
            if (Pass) {
                System.out.println("The pass mark is: " + marks);
                break;
            }
        }
    }
}