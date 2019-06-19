
import java.util.Scanner;
import java.io.PrintStream;

public class Mima {
    public static void da(char zuiDa, char[] mima) {
        int ca = (int) zuiDa - (int) 'I';
        for (int i = 0; i < mima.length; i++) {
            int su = (int) mima[i] - ca;
            if (su<65){
                int dal=65-su;
                su=91-dal;
            }
            char fu = Character.toLowerCase((char) su);
            System.out.print(fu);
        }

    }

    public static void xiao(char zuiDa, char[] mima) {
        int ca = (int) 'I' - (int) zuiDa;
        for (int i = 0; i < mima.length; i++) {
            int su = (int) mima[i] + ca;
            if (su>90){
                int xiaol=su-90;
                su=64+xiaol;
            }
            char fu = Character.toLowerCase((char) su);
            System.out.print(fu);
        }

    }
 
    public static void bubian(char zuiDa, char[] mima) {
        for (int i = 0; i < mima.length; i++) {
            int su = (int) mima[i];
            char fu = Character.toLowerCase((char) su);
            System.out.print(fu);
        }

    }

    public static void jiSanDaXiao(char[] suZi, int[] chiShu) {
        int zuiDa = 0;
        int su = 0;
        for (int i = 0; i < suZi.length; i++) {
            if (su < chiShu[i]) {
                su = chiShu[i];
                zuiDa = i;
            }
        }
        char fu = suZi[zuiDa];
        if ((int) fu == (int) 'I') {
            bubian(fu, suZi);
        }
        if ( fu > 'I') {
            da(fu, suZi);
        }
        if ( fu < 'I') {
            xiao(fu, suZi);
        }
    }

    public static void main(String[] args)
            throws java.io.UnsupportedEncodingException {
        PrintStream ps = new PrintStream(System.out, true, "UTF-8");
        Scanner in = new Scanner(System.in, "UTF-8");

        // 请从下一行开始你的程序
        String miMa = in.nextLine();
        char[] mima = miMa.toCharArray();
        int[] chiShu = new int[mima.length];
        for (int i = 0; i < mima.length; i++) {
            char mid = mima[i];
            for (int j = 0; j < mima.length; j++) {
                if (mid == mima[j])
                    chiShu[i]++;
            }
        }
        jiSanDaXiao(mima, chiShu);

    }

}
