//Driver Class

import java.util.Scanner;

public class TesSiswa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("IPK");
        double ipk = in.nextDouble();
        //membuat obyek

        Siswa wildan = new Siswa(id, nama, ipk);
        //nilai diatas 75 lulus
        if (wildan.getIpk() >= 75) {
            System.out.println(wildan.getNama() + "lulus");
        } else {
            System.out.println(wildan.getNama() + "tidak lulus");
        }
        //nilai huruf
        if (wildan.getipk() < 60) {
            System.out.println( "E");
        }else if (wildan.getipk() > 60 && wildan.getipk() <= 70) {
            System.out.println("D");
        }else if (wildan.getipk() > 71 && wildan.getipk() <= 80) {
            System.out.println("C");
        }else if (wildan.getipk() > 81 && wildan.getipk() <= 90) {
            System.out.println("B");
        }else if (wildan.getipk() > 91 && wildan.getipk() <= 100) {
            System.out.println("A");
        }

        in.close();
    }

    
}
