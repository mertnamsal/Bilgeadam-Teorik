package com.mertnamsal.threadsizListeYazici;

public class Main {

	public static void main(String[] args) {

		ThreadsizListeYazici threadsizListeYazici = new ThreadsizListeYazici();
		long baslangic = System.currentTimeMillis();
		threadsizListeYazici.listelereDegerEkle();
		long bitis = System.currentTimeMillis();
		System.out.println("Toplam süre: " + (bitis - baslangic));
	}

}
