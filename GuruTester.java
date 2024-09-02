//import java.util.Scanner;

public class GuruTester {
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // System.out.println("Nama : ");
        // String nama = input.nextLine();
        // System.out.println("Mata Pelajaran : ");
        // String mapel = input.nextLine();
        // System.out.println("Status : ");
        // String status = input.nextLine();
        // System.out.println("NIP : ");
        // int nip = input.nextInt();
        // input.close();

        // Guru buLala = new Guru(nip, nama, mapel, status);
        // buLala.print();


        // membuat objek
        Guru buPasha = new Guru(1, "Bu Pasha", "Produktif RPL", "Tetap");
        Guru buAulia = new Guru(2, "Bu Aulia", "Produktif RPL", "Tetap");
        Guru pakTulus = new Guru(3, "Pak Tulus", "IPAS", "Tetap");
        Guru pakFalah = new Guru(4, "Pak Falah", "Bahasa Inddonesia", "Tetap");
        Guru pakThoriq = new Guru(5, "Pak Thoriq", "Olahraga", "Tetap");

        buPasha.setNip(58);
        buPasha.setNama("Bu Pasha");
        buPasha.setMapel("Produktif RPL");
        buPasha.setStatus("Tetap");
        buAulia.setNip(59);
        buAulia.setNama("Bu Aulia");
        buAulia.setMapel("Produktif RPL");
        buAulia.setStatus("Tetap");
        pakTulus.setNip(60);
        pakTulus.setNama("Pak Tulus");
        pakTulus.setMapel("IPAS");
        pakTulus.setStatus("Tetap");
        pakFalah.setNip(61);
        pakFalah.setNama("Pak Falah");
        pakFalah.setMapel("Bahasa Indonesia");
        pakFalah.setStatus("Tetap");
        pakThoriq.setNip(62);
        pakThoriq.setNama("Pak Thoriq");
        pakThoriq.setMapel("Olahraga");
        pakThoriq.setStatus("Tetap");
        

        buPasha.print();
        buAulia.print();
        pakTulus.print();
        pakFalah.print();
        pakThoriq.print();
    }
}
