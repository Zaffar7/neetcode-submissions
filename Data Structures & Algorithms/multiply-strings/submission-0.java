class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] res = new int[num1.length() + num2.length()];
        int cnt = 0;

        for (int i = num1.length() - 1; i >= 0; i--) {
            int carry = 0;
            int k = res.length - 1 - cnt;

            for (int j = num2.length() - 1; j >= 0; j--) {
                int prod = (num1.charAt(i) - '0') *
                           (num2.charAt(j) - '0') +
                           carry + res[k];

                res[k] = prod % 10;
                carry = prod / 10;
                k--;
            }

            res[k] += carry;

            // propagate carry if needed
            while (k > 0 && res[k] > 9) {
                res[k - 1] += res[k] / 10;
                res[k] %= 10;
                k--;
            }

            cnt++;
        }

        StringBuilder sb = new StringBuilder();

        int idx = 0;
        while (idx < res.length - 1 && res[idx] == 0) {
            idx++;
        }

        for (; idx < res.length; idx++) {
            sb.append(res[idx]);
        }

        return sb.toString();
    }
}