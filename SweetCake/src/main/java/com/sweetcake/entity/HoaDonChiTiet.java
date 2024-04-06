package com.sweetcake.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({ @NamedQuery(name = "HoaDonChiTiet.findAll", query = "SELECT o FROM HoaDonChiTiet o") })
@Entity
@Table(name = "HoaDonChiTiet")
public class HoaDonChiTiet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "SoLuong")
	Integer soLuong;
	
	@Column(name = "Gia")
	double gia;
	
	@ManyToOne
	@JoinColumn(name = "maHd")
	HoaDon hoaDon;

	@ManyToOne
	@JoinColumn(name = "maSp")
	SanPham sanPham;

	
	public HoaDonChiTiet(Long id, Integer soLuong, double gia, HoaDon hoaDon, SanPham sanPham) {
		super();
		this.id = id;
		this.soLuong = soLuong;
		this.gia = gia;
		this.hoaDon = hoaDon;
		this.sanPham = sanPham;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public HoaDonChiTiet() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
}
