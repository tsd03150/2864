import java.util.Scanner;

class Main {

    public int trans5(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '6') {
                ch[i] = '5';
            }
        }
        return Integer.parseInt(String.valueOf(ch));
    }

    public int trans6(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '5') {
                ch[i] = '6';
            }
        }
        return Integer.parseInt(String.valueOf(ch));
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        char[] a = kb.next().toCharArray();
        char[] b = kb.next().toCharArray();

        System.out.print((T.trans5(a) + T.trans5(b)) + " " + (T.trans6(a) + T.trans6(b)));
    }
}
