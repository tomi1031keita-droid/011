import java.util.Scanner;

public class bug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int count = 0; 

        for (int i = 0; i < n; i++) {
            int operation = sc.nextInt();
            if (operation == x) {
                count = count + 1;
            }
        }

        System.out.println(count);
    }
}