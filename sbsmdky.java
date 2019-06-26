import java.util.Scanner;
import java.io.PrintStream;

public class QiMoKaoSi {
    public static void main(String[] args) throws java.io.UnsupportedEncodingException {
        PrintStream ps = new PrintStream(System.out, true, "UTF-8");
        Scanner in = new Scanner(System.in, "UTF-8");

        // 请从下一行开始你的程序
        double beiSu;
        int renSu=in.nextInt();
        String[] mingZi=new String[renSu];
        double[] fenSu=new double[renSu];
        for (int i=0;i<renSu;i++){
            mingZi[i]=in.next();
            fenSu[i]=in.nextInt();
        }
        int n=0;
        for (int i=1;i<renSu;i++){
            if (fenSu[i]>fenSu[n]){
                n=i;
            }
        }
        beiSu=100/fenSu[n];
        for (int i=0;i<renSu;i++){
            ps.print(mingZi[i]+":");
            ps.println((int)(fenSu[i]*beiSu));
        }
    }
}
                                   
                                   

                                   
                                   
import java.util.Scanner;
import java.io.PrintStream;

public class ziuxshh {
    public static void main(String[] args) throws java.io.UnsupportedEncodingException {
        PrintStream ps = new PrintStream(System.out, true, "UTF-8");
        Scanner in = new Scanner(System.in, "UTF-8");

        // 请从下一行开始你的程序
        double jieguo;
        String[] fan = new String[5];
        int a = 0;
        double suan = 0.0;
        String su;
        String qiandan = "1";
        fan[0] = in.next();
        int v = fan[0].length();
        if (Character.isDigit(fan[0].charAt(v - 1))) {
            fan[1] = in.next();
            fan[2] = in.next();
            fan[3] = in.next();
            fan[4] = in.next();
            suan = Double.valueOf(fan[0]);
            qiandan = fan[1];

        } else {
            for (int i = 0; i < fan[0].length(); ) {
                for (; i < fan[0].length(); i++) {
                    if (Character.isLetter(fan[0].charAt(i))) {
                        su = fan[0].substring(0, i);
                        suan = Double.valueOf(su);
                        a = i;
                        break;
                    }
                }
                for (; i < fan[0].length(); i++) {
                    if (Character.isLetter(fan[0].charAt(i)) == false) {
                        qiandan = fan[0].substring(a, i);
                        break;
                    }
                }
                break;
            }

        }
        if (qiandan.equals("lb")) {
            jieguo = (suan / 2.20462262);
            ps.println((int) jieguo);
        }
        if (qiandan.equals("km")) {
            jieguo = (suan / 1.609344);
            ps.println((int) jieguo);
        }
        if (qiandan.equals("mile")) {
            jieguo = (suan * 1.609344);
            ps.println((int) jieguo);
        }
        if (qiandan.equals("kg")) {
            jieguo = (suan * 2.20462262);
            ps.println((int) jieguo);
        }

    }
}
