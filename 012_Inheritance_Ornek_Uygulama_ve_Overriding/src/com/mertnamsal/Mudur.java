package com.mertnamsal;

public class Mudur extends Personel{
	
	private String makamAdi;
	private long telSeriNo;
	private Muhendis[] bagliMuhendisler;
	
	public Mudur(String ad,String soyad,String tcKimlik, int yas, int maas,int kidemBilgisi,long cepTelNo,String makamAdi , long telSeriNo) {
		super(ad,soyad,tcKimlik,yas,maas,kidemBilgisi,cepTelNo);
		this.setMakamAdi(makamAdi);
		this.setTelSeriNo(telSeriNo);

	}
	//Method overriding : Ust sınıfta tanımlanan metodu alt sınıfta tekrar tanımlamak
	public int getZamKatsayisi() {
		return 5;
	}

	public String getMakamAdi() {
		return makamAdi;
	}
	public void setMakamAdi(String makamAdi) {
		this.makamAdi = makamAdi;
	}
	public long getTelSeriNo() {
		return telSeriNo;
	}
	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}
	public Muhendis[] getBagliMuhendisler() {
		return bagliMuhendisler;
	}
	public void setBagliMuhendisler(Muhendis[] bagliMuhendisler) {
		this.bagliMuhendisler = bagliMuhendisler;
	}
	
	
}
