/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepetim1;

import java.util.ArrayList;

/**
 *
 * @author legom
 */
public class Stok {

    ArrayList<Sepetim1.Tv> Tev = new ArrayList();
    ArrayList<Sepetim1.Telefon> Telefon = new ArrayList();
    ArrayList<Sepetim1.Tablet> Tablet = new ArrayList();
    ArrayList<Sepetim1.Bilgisayar> Bilgisayar = new ArrayList();

    public void ciro() {
        double toplam = 0;

        for (int i = 0; i < Bilgisayar.size(); i++) {
            toplam += Bilgisayar.get(i).fiyat;
        }
        for (int i = 0; i < Tablet.size(); i++) {
            toplam += Tablet.get(i).fiyat;
        }
        for (int i = 0; i < Tev.size(); i++) {
            toplam += Tev.get(i).fiyat;
        }
        for (int i = 0; i < Telefon.size(); i++) {
            toplam += Telefon.get(i).fiyat;
        }
        System.out.println("Stoktaki ürünlerin toplam cirosu: " + toplam);
    }

    public void sil(int urunid, int tur) {
        if (tur == 1) {
            Tev.remove(urunid);
        }
        if (tur == 2) {
            Telefon.remove(urunid);
        }
        if (tur == 3) {
            Tablet.remove(urunid);
        }
        if (tur == 4) {
            Bilgisayar.remove(urunid);
        }

    }
}
