package com.sweetcake.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SanPham")
public class SanPham {
	@Id
	@Column(name = "MaSP")
	String maSp;

	@Column(name = "TenSP")
	String tenSp;

	@Column(name = "MoTa")
	String moTa;

	@Column(name = "HanSD")
	@Temporal(TemporalType.DATE)
	Date date;

	@Column(name = "Gia")
	double gia;

	@Column(name = "HinhAnh")
	String hinhAnh;

	@Column(name = "TrangThai")
	Integer trangThai;

	@ManyToOne
	@JoinColumn(name = "maLoaiBanh")
	LoaiBanh loaiBanh;

	public SanPham(String maSp, String tenSp, String moTa, Date date, double gia, String hinhAnh, Integer trangThai,
			LoaiBanh loaiBanh) {
		super();
		this.maSp = maSp;
		this.tenSp = tenSp;
		this.moTa = moTa;
		this.date = date;
		this.gia = gia;
		this.hinhAnh = hinhAnh;
		this.trangThai = trangThai;
		this.loaiBanh = loaiBanh;
	}

	public SanPham() {
		super();
	}

	public String getMaSp() {
		return maSp;
	}

	public void setMaSp(String maSp) {
		this.maSp = maSp;
	}

	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public Integer getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(Integer trangThai) {
		this.trangThai = trangThai;
	}

	public LoaiBanh getLoaiBanh() {
		return loaiBanh;
	}

	public void setLoaiBanh(LoaiBanh loaiBanh) {
		this.loaiBanh = loaiBanh;
	}

}
