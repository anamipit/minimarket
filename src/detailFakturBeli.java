import java.util.ArrayList;

/**
 * Created by Rima Yuliana on 01/05/2017.
 */
public class DetailFakturBeli extends FakturBeli {
    String no_fakturbeli;
    int jumlah_fakturbeli;
    String tgl_masuk;
    ArrayList<Produk> daftarProduk = new ArrayList<>();

    public DetailFakturBeli(String no_fakturbeli, int jumlah_fakturbeli, String tgl_masuk){
        this.no_fakturbeli=no_fakturbeli;
        this.jumlah_fakturbeli=jumlah_fakturbeli;
        this.tgl_masuk=tgl_masuk;
    }

    @Override
    public double totalFakturbeli() {
        int total=0;

        return total+jumlah_fakturbeli;

    }


    public void print() {
        System.out.println("No. Faktur Beli : "+no_fakturbeli);
        System.out.println("Jumlah Faktur Beli : "+jumlah_fakturbeli);
        System.out.println("Tanggal Masuk : "+tgl_masuk);

    }

    public static void main(String[] args){
        DetailFakturBeli dfb = new DetailFakturBeli("FB001",250,"02-04-2017");
        dfb.print();
    }
}
