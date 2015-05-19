public class mahasiswa {
    private String nama;
    private int umur;

    public mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilkanbiodata(){
        System.out.println("-----biodata mahasiswa-----");
        System.out.println("nama mahasiswa="+nama);
        System.out.println("umur mahasiswa="+umur);
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;