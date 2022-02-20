/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepetim1;

/**
 *
 * @author legom
 */
public class Sepetim1 {

    Stok stok = new Stok();
    Avm avm = new Avm();

    public void urunEkle() {
        stok.Tev.add(new Tv(0, "LG", " lg2030", 2000, 100));
        stok.Tev.add(new Tv(1, "Sony", "sony219", 1600, 96));
        stok.Tev.add(new Tv(2, "Toshiba", "toshiba2188", 2100, 110));
        stok.Tev.add(new Tv(3, "Philips", "philips2100", 2400, 140));
        stok.Tev.add(new Tv(4, "Vestel", "vestel120", 1100, 80));
        stok.Telefon.add(new Telefon(0, "Huawei", "P20", 1500, 5));
        stok.Telefon.add(new Telefon(1, "Samsung", "S4", 1000, 4));
        stok.Telefon.add(new Telefon(2, "Nokia", "3310", 99500, 3));
        stok.Telefon.add(new Telefon(3, "Iphone", "X", 11500, 6));
        stok.Telefon.add(new Telefon(4, "Xiaomi", "Redmi Note 8", 2000, 6));
        stok.Tablet.add(new Tablet(0, "GeneralMobile", "G10", 700, 10));
        stok.Tablet.add(new Tablet(1, "Moba", "100", 300, 10));
        stok.Tablet.add(new Tablet(2, "Piranha", "p200", 400, 8));
        stok.Tablet.add(new Tablet(3, "Mac", "Os", 1000, 7));
        stok.Tablet.add(new Tablet(4, "Emre", "v1", 3000, 9));
        stok.Bilgisayar.add(new Bilgisayar(0, "Msi", "Stealth", 10000, 17));
        stok.Bilgisayar.add(new Bilgisayar(1, "Casper", "10", 100, 15));
        stok.Bilgisayar.add(new Bilgisayar(2, "Lenovo", "G100", 6000, 15));
        stok.Bilgisayar.add(new Bilgisayar(3, "Acer", "Emin1000", 2000, 13));
        stok.Bilgisayar.add(new Bilgisayar(4, "Monster", "Abra", 8000, 17));

    }

    public void urunSat(int tur, int urunid, int musno) {
        if (tur==1) {
            avm.musterileri.get(musno).sepetTv.add(stok.Tev.get(urunid));
        }
        if (tur==2) {
            avm.musterileri.get(musno).sepetTelefon.add(stok.Telefon.get(urunid));
        }
        if (tur==3) {
            avm.musterileri.get(musno).sepetTablet.add(stok.Tablet.get(urunid));
        }
        if (tur==4){
            avm.musterileri.get(musno).sepetBilgisayar.add(stok.Bilgisayar.get(urunid));
        }
    }

    public class Tv {

        int id;
        String marka;
        String model;
        double fiyat;
        int boyut;

        public Tv(int id, String marka, String model, double fiyat, int boyut) {
            this.id = id;
            this.marka = marka;
            this.model = model;
            this.fiyat = fiyat;
            this.boyut = boyut;
        }
    }

    public class Telefon {

        int id;
        String marka;
        String model;
        double fiyat;
        int boyut;

        public Telefon(int id, String marka, String model, double fiyat, int boyut) {
            this.id = id;
            this.marka = marka;
            this.model = model;
            this.fiyat = fiyat;
            this.boyut = boyut;
        }
    }

    public class Tablet {

        int id;
        String marka;
        String model;
        double fiyat;
        int boyut;

        public Tablet(int id, String marka, String model, double fiyat, int boyut) {
            this.id = id;
            this.marka = marka;
            this.model = model;
            this.fiyat = fiyat;
            this.boyut = boyut;
        }
    }

    public class Bilgisayar {

        int id;
        String marka;
        String model;
        double fiyat;
        int boyut;

        public Bilgisayar(int id, String marka, String model, double fiyat, int boyut) {
            this.id = id;
            this.marka = marka;
            this.model = model;
            this.fiyat = fiyat;
            this.boyut = boyut;
        }
    }
}
