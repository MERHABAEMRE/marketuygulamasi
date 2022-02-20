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
public class Musteri {

    String adi;
    String soyadi;
    int musNo;
    ArrayList<Sepetim1.Tv> sepetTv = new ArrayList();
    ArrayList<Sepetim1.Telefon> sepetTelefon = new ArrayList();
    ArrayList<Sepetim1.Tablet> sepetTablet = new ArrayList();
    ArrayList<Sepetim1.Bilgisayar> sepetBilgisayar = new ArrayList();

    public Musteri(String adi, String soyadi, int musNo) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.musNo = musNo;
    }
}
