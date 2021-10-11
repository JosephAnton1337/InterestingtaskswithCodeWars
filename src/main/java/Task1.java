/*
Task
You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters. Trailing spaces should be removed, and every line must be terminated with a newline character (\n).
Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.
Examples
A size 3 diamond:
 *
***
 *
...which would appear as a string of " *\n***\n *\n"
A size 5 diamond:
  *
 ***
*****
 ***
  *
...that is: " *\n ***\n*****\n ***\n *\n"
 */


public class Task1 {
    public static void main(String[] args) {
        StringBuffer expected  = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");
        expected.toString();
       System.out.print(Diamond.print(3));

    }

    static class Diamond {
        private static String Spaces(int count) {
            StringBuilder sb1 = new StringBuilder();
            for (int j = 1; j <= count; ++j) sb1.append(" ");
            return sb1.toString();
        }

        private static String Stars(int count) {
            StringBuilder sb2 = new StringBuilder();
            for (int j = 1; j <= count; ++j) sb2.append("*");
            return sb2.toString();
        }

        public static String print(int n) {
            if (n % 2 == 0 || n < 0) return null;
            StringBuilder sb = new StringBuilder();

            int countSpaces = n / 2;
            for (int i = 1; i < n; i += 2) {
                sb.append(Spaces(countSpaces--)).append(Stars(i)).append("\n");
            }

            sb.append(Spaces(countSpaces++)).append(Stars(n)).append("\n");

            countSpaces = 1;
            for (int i = n - 2; i >= 1; i -= 2) {
                sb.append(Spaces(countSpaces++)).append(Stars(i)).append("\n");
            }

            return sb.toString();
        }
    }
}
