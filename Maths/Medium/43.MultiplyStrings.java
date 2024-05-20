class Solution {
    public String multiply(String num1, String num2) {
        char[] ans = new char[num1.length() + num2.length()];

        for (int i = num1.length()-1; i >= 0; i--) {
            for (int j = num2.length()-1; j >= 0; j--) {
                int product = (num1.charAt(i)- '0') * (num2.charAt(j) - '0');
                int sum = ans[i+j+1] + product;
                ans[i+j+1] = (char) (sum % 10);
                ans[i+j] += (char) (sum / 10);

            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ans.length; i++) {
            if (!(sb.length() == 0 && ans[i] == 0)) {
                sb.append((char) (ans[i] + '0'));
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
