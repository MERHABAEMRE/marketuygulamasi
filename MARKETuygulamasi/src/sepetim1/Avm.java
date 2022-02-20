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
public class Avm {
    ArrayList<Musteri> musterileri = new ArrayList();
    public void musteriEkle(){
        musterileri.add(new Musteri("Emre","Bölükbaşı",0));
        musterileri.add(new Musteri("Ali","Emre",1));
        musterileri.add(new Musteri("Bakkal","Ahmet",2));
        musterileri.add(new Musteri("Pazarcı","Mehmet",3));
        musterileri.add(new Musteri("Boyacı","Hamit",4));
    }
}
