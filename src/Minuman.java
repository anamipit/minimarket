import java.util.HashMap;

/**
 * Created by Toshiba on 5/1/2017.
 */
public class Minuman extends Produk {
    int idProduk;
    String namaMinuman;
    String jenisMinuman;
    int stock;
    int hargabeli;
    int hargajual;

    private HashMap<Integer,Minuman> Minuman = new HashMap<>();

    public void addStock(Minuman mk) {
        Minuman.put(mk.idProduk,mk);
    }



    public Minuman(int idProduk, String namaMinuman, String jenisMinuman, int hargabeli, int stock,int hargajual){
        this.idProduk = idProduk;
        this.namaMinuman = namaMinuman;
        this.jenisMinuman = jenisMinuman;
        this.stock = stock;
        this.hargabeli = hargabeli;
        this.hargajual = hargajual;
    }

    public Minuman cariBarang(int idProduk) {
        return Minuman.get(idProduk);
    }

    @Override
    public void print() {
        System.out.println("Nama Minuman: "+namaMinuman);
        System.out.println("Harga Beli: "+hargabeli);
        System.out.println("Harga Jual: "+hargajual);
        System.out.println("Stok: "+stock);
        System.out.println("Jumlah Stok: "+hitungJumlahProduk());
        System.out.println("Jumlah Harga Beli: "+hargaBeli());
        System.out.println("Jumlah Harga Jual: "+hargaJual());
    }

    public void inputMinuman(){
        Minuman mk;

        mk = new Minuman( 1, "Ultramilk","Susu",2000,10,2300);
        addStock(mk);
        mk = new Minuman( 2, "Teh Kotak","Teh",3500,20,4500);
        addStock(mk);
    }

    @Override
    public double hitungJumlahProduk() {
        double total = 0;
        total = total + stock;
        return total;
    }

    @Override
    public double hargaBeli() {
        double total = 0;
        total = total + hargabeli;
        return total;
    }

    @Override
    public double hargaJual() {
        double total = 0;
        total = total + hargajual;
        return total;
    }

    public static void main(String[] args) {
        Minuman dataMinuman = new Minuman(1, "null","null",0,0,0);
        dataMinuman.inputMinuman();
        dataMinuman.print();
        Minuman pr = dataMinuman.cariBarang(2);
        pr.print();
//        pr.);
    }

}
