
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gesa Rizky Nugraha
 */
public class mekanik {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Nilai Massa Benda (m) ");
        System.out.println(" *************************************************************");

        double m = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai Gravitasi (g) ");
        System.out.println(" ************************************************************* ");

        double g = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai Ketinggian Benda (h) ");
        System.out.println(" ************************************************************* ");

        double h = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai Kecepatan (v) ");
        System.out.println(" ************************************************************* ");

        double v = sc.nextInt();

        double em = (m * g * h) + (0.5 * m * (v * v));

        System.out.println(" *********************************************************** ");
        System.out.println(" *Maka Nilai Energi Mekanik = " + em);
        System.out.println(" ********************************************************** ");
    }
}
