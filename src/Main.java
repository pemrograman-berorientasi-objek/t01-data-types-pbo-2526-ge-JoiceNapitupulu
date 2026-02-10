import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        if (sc.hasNext()) {
            String command = sc.next();

            switch (command) {
                case "Soal1":
                    solveSoal1(sc);
                    break;
                case "Soal2":
                    solveSoal2(sc);
                    break;
                case "Soal3":
                    solveSoal3(sc);
                    break;
                case "Soal4":
                    solveSoal4(sc);
                    break;
                case "Soal5":
                    solveSoal5(sc);
                    break;
            }
        }
        sc.close();
    }

    // --- Soal 1: Integer Overflow Detection ---
    private static void solveSoal1(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        boolean overflow = false;
        
        // Cek overflow (Positif+Positif=Negatif atau Negatif+Negatif=Positif)
        if (a > 0 && b > 0 && sum < 0) overflow = true;
        else if (a < 0 && b < 0 && sum > 0) overflow = true;

        if (overflow) System.out.println("OVERFLOW");
        else System.out.println(sum);
    }

    // --- Soal 2: Float vs Double Precision Trap ---

    private static void solveSoal2(Scanner sc) {

        String s1 = sc.next();
        String s2 = sc.next();

        float sumFloat = Float.parseFloat(s1) + Float.parseFloat(s2);
        double sumDouble = Double.parseDouble(s1) + Double.parseDouble(s2);

        double diff = Math.abs(sumFloat - sumDouble);

        System.out.printf("%.6f%n", diff);
    }

    // --- Soal 3: Primitive vs Wrapper Comparison ---
    private static void solveSoal3(Scanner sc) {
        int N = sc.nextInt();
        Integer a = N;
        Integer b = a; 
        a = a + 1;
        System.out.println("==: " + (a == b));       
        System.out.println("equals: " + a.equals(b)); 
    }

    // --- Soal 4: String Immutability & Reference ---
    private static void solveSoal4(Scanner sc) {
        String S = sc.next();
        String a = S;
        String b = new String(S);
        a = a + "X"; 
        System.out.println("==: " + (a == b));       
        System.out.println("equals: " + a.equals(b)); 
    }

    // --- Soal 5: Parsing & Type Safety ---
    private static void solveSoal5(Scanner sc) {
        int iVal = sc.nextInt();
        double dVal = sc.nextDouble();
        boolean bVal = sc.nextBoolean();

        double result = iVal * dVal;
        if (!bVal) result = result * -1;

        System.out.printf("%.2f%n", result);
    }
}