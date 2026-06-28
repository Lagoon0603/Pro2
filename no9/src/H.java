import java.util.*;
import java.io.*;

class H {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;
            int n = Integer.parseInt(line);
            if (n == 0) break;
            String s = br.readLine().trim();
            System.out.println(solve(n, s));
        }
    }

    private static long solve(int n, String s) {
        List<Integer> P_plus = new ArrayList<>();
        List<Integer> P_minus = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == '(' && s.charAt(i) == '(') P_plus.add(i);
            if (s.charAt(i - 1) == ')' && s.charAt(i) == ')') P_minus.add(i);
        }

        if (P_plus.isEmpty() && P_minus.isEmpty()) {
            long u_count = 0, v_count = 0;
            for (int i = 1; i <= n; i++) {
                if (s.charAt(i - 1) == '(') u_count++;
                else v_count++;
            }
            return u_count * v_count;
        }

        int[] L_plus = new int[n + 1];
        int[] R_plus = new int[n + 2];
        int[] L_minus = new int[n + 1];
        int[] R_minus = new int[n + 2];

        int last_plus = -1;
        int last_minus = -1;
        for (int i = 1; i <= n; i++) {
            L_plus[i] = last_plus;
            L_minus[i] = last_minus;
            if (i < n && s.charAt(i - 1) == '(' && s.charAt(i) == '(') last_plus = i;
            if (i < n && s.charAt(i - 1) == ')' && s.charAt(i) == ')') last_minus = i;
        }

        int next_plus = n + 2;
        int next_minus = n + 2;
        for (int i = n; i >= 1; i--) {
            R_plus[i] = next_plus;
            R_minus[i] = next_minus;
            if (i > 1 && s.charAt(i - 2) == '(' && s.charAt(i - 1) == '(') next_plus = i - 1;
            if (i > 1 && s.charAt(i - 2) == ')' && s.charAt(i - 1) == ')') next_minus = i - 1;
        }

        boolean[] Up = new boolean[n + 1];
        boolean[] Down = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) == '(') {
                Up[i] = (L_plus[i] > L_minus[i]) || (R_plus[i] < R_minus[i]);
            } else {
                Down[i] = (L_minus[i] > L_plus[i]) || (R_minus[i] < R_plus[i]);
            }
        }

        long ans = 0;
        long u_even = 0, u_odd = 0;
        long d_even = 0, d_odd = 0;
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) == '(' && Up[i]) {
                if (i % 2 == 0) u_even++;
                else u_odd++;
            }
            if (s.charAt(i - 1) == ')' && Down[i]) {
                if (i % 2 == 0) d_even++;
                else d_odd++;
            }
        }
        ans += u_even * d_odd + u_odd * d_even;

        int[] count_u_even = new int[n + 2];
        int[] count_u_odd = new int[n + 2];
        int[] count_v_even = new int[n + 2];
        int[] count_v_odd = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            count_u_even[i] = count_u_even[i - 1] + (s.charAt(i - 1) == '(' && i % 2 == 0 ? 1 : 0);
            count_u_odd[i] = count_u_odd[i - 1] + (s.charAt(i - 1) == '(' && i % 2 != 0 ? 1 : 0);
            count_v_even[i] = count_v_even[i - 1] + (s.charAt(i - 1) == ')' && i % 2 == 0 ? 1 : 0);
            count_v_odd[i] = count_v_odd[i - 1] + (s.charAt(i - 1) == ')' && i % 2 != 0 ? 1 : 0);
        }

        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) == '(' && !Up[i]) {
                int left = L_minus[i] == -1 ? 1 : L_minus[i] + 1;
                int right = R_minus[i] == n + 2 ? n : R_minus[i];
                if (left <= right) {
                    if (i % 2 == 0) ans += count_v_odd[right] - count_v_odd[left - 1];
                    else ans += count_v_even[right] - count_v_even[left - 1];
                }
            }
            if (s.charAt(i - 1) == ')' && !Down[i]) {
                int left = L_plus[i] == -1 ? 1 : L_plus[i] + 1;
                int right = R_plus[i] == n + 2 ? n : R_plus[i];
                if (left <= right) {
                    if (i % 2 == 0) ans += count_u_odd[right] - count_u_odd[left - 1];
                    else ans += count_u_even[right] - count_u_even[left - 1];
                }
            }
        }
        return ans;
    }
}
