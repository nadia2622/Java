public class ContohSwitch {
    public static void main(String[] args) {
        int hari = 3;
        String namaHari;
//Nadia Tambunan, 103122400005
        switch (hari) {
            case 1:
            namaHari = "Senin";
            break;
            case 2:
            namaHari = "Selasa";
            break;
            case 3:
            namaHari = "Rabu";
            break;
            case 4:
            namaHari = "Kamis";
            break;
            case 5:
            namaHari = "Jumat";
            break;
            case 6:
            namaHari = "Sabtu";
            break;
            case 7:
            namaHari = "Minggu";
            break;
            default:
            namaHari = "Hari tidak valid";
            break;
        }
        System.out.println("hari ke- " + hari + " adalah " + namaHari);

    }
}