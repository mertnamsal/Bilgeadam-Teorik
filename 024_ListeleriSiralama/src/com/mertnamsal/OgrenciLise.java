package com.mertnamsal;

public class OgrenciLise implements Comparable<OgrenciLise> {
	
	private String ad;
	private int id;
	private double notOrtalamasi;
	
	public double getNotOrtalamasi() {
		return notOrtalamasi;
	}
	public void setNotOrtalamasi(double notOrtalamasi) {
		this.notOrtalamasi = notOrtalamasi;
	}
	public OgrenciLise(String ad, int id,double notOrtalamasi) {
		super();
		this.ad = ad;
		this.id = id;
		this.notOrtalamasi = notOrtalamasi;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int compareTo(OgrenciLise ogrenci) {
		//Şuanki öğrencimizle parametre olarak gelen öğrenci nesnesini karşılaştırmamız lazım
		if(this.notOrtalamasi<ogrenci.notOrtalamasi) {
			return -1;
		}else if(this.notOrtalamasi > ogrenci.notOrtalamasi) {
			return 1;
		}else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "OgrenciLise [ad=" + ad + ", id=" + id + ", notOrtalamasi=" + notOrtalamasi + "]";
	}
	
	
	
	

}
