import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Findthewinner {

    public static void main(String[] args) throws IOException {
        ArrayList<String> result = new ArrayList<String>();
        int ar[] = new int[100001];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            ar[i] = sc.nextInt();
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x < y && ar[x + 1] == 0) {
                result.add("Odd");
                continue;
            }

            if (ar[x] % 2 == 0) {
                result.add("Even");
            } else {
                result.add("Odd");
            }
        }

        for (String el : result) {
            System.out.println(el);
        }
    }
}