

    public class Guru {
        //variabel
        private int nip;
        private String nama;
        private String mapel;
        private String status;

        public int getNip() {
            return this.nip;
        }

        public void setNip(int nip) {
            this.nip = nip;
        }

        public String getNama() {
            return this.nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getMapel() {
            return this.mapel;
        }

        public void setMapel(String mapel) {
            this.mapel = mapel;
        }

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    
    //constructor parameter
    public Guru(int i, String n, String k, String f){
        nip = i;
        nama = n;
        mapel = k;
        status = f;
    }
        public void print() {
            System.out.println("ID: "+nip);
            System.out.println("Nama: "+nama);
            System.out.println("Mapel: "+mapel);
            System.out.println("Status: "+status);
        }

}
