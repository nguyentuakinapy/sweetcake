package com.sweetcake.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries({ @NamedQuery(name = "MaGiamGia.findAll", query = "SELECT o FROM MaGiamGia o") })
@Entity
@Table(name = "MaGiamGia")
public class MaGiamGia {
	@Id
	@Column(name = "MaGiamGia")
	String maGiamGia;

	@Column(name = "PhanTramGiam")
	Integer phanTramGiam;

	@Column(name = "HanSuDung")
	@Temporal(TemporalType.DATE)
	Date hanSuDung;

	@Column(name = "SoLuong")
	Integer soLuong;

	@OneToMany
	@JoinColumn(name = "maGiamGia")
	List<HoaDon> hdList;

	public MaGiamGia(String maGiamGia, Integer phanTramGiam, Date hanSuDung, Integer soLuong, List<HoaDon> hdList) {
		super();
		this.maGiamGia = maGiamGia;
		this.phanTramGiam = phanTramGiam;
		this.hanSuDung = hanSuDung;
		this.soLuong = soLuong;
		this.hdList = hdList;
	}

	public MaGiamGia() {
		super();
	}

	public String getMaGiamGia() {
		return maGiamGia;
	}

	public void setMaGiamGia(String maGiamGia) {
		this.maGiamGia = maGiamGia;
	}

	public Integer getPhanTramGiam() {
		return phanTramGiam;
	}

	public void setPhanTramGiam(Integer phanTramGiam) {
		this.phanTramGiam = phanTramGiam;
	}

	public Date getHanSuDung() {
		return hanSuDung;
	}

	public void setHanSuDung(Date hanSuDung) {
		this.hanSuDung = hanSuDung;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public List<HoaDon> getHdList() {
		return hdList;
	}

	public void setHdList(List<HoaDon> hdList) {
		this.hdList = hdList;
	}

}
