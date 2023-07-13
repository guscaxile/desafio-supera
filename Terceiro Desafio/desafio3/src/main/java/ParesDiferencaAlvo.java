import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParesDiferencaAlvo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira um valor: ");
        int n = scanner.nextInt();

        System.out.println("Insira um valor: ");
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithTargetDifference(arr, k);
        System.out.println(count);
    }

    public static int countPairsWithTargetDifference(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int num : arr) {
            if (set.contains(num - k)) {
                count++;
            }
            if (set.contains(num + k)) {
                count++;
            }
            set.add(num);
        }
        return count;
    }
}
