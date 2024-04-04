package com.sweetcake.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "HoaDon")
public class HoaDon {
	@Id
	@Column(name = "MaHD")
	String maHd;

	@Column(name = "NgayMua")
	@Temporal(TemporalType.DATE)
	Date ngayMua;

	@Column(name = "TongTien")
	double tongTien;

	@Column(name = "TrangThai")
	int trangThai;

	@ManyToOne
	@JoinColumn(name = "maGiamGia")
	MaGiamGia maGiamGia;

	@ManyToOne
	@JoinColumn(name = "maNguoiDung")
	NguoiDung nguoidung;

	@OneToMany
	@JoinColumn(name = "maHd")
	List<HoaDonChiTiet> hdctList;

	public HoaDon(String maHd, Date ngayMua, double tongTien, int trangThai, MaGiamGia maGiamGia, NguoiDung nguoidung,
			List<HoaDonChiTiet> hdctList) {
		super();
		this.maHd = maHd;
		this.ngayMua = ngayMua;
		this.tongTien = tongTien;
		this.trangThai = trangThai;
		this.maGiamGia = maGiamGia;
		this.nguoidung = nguoidung;
		this.hdctList = hdctList;
	}

	public HoaDon() {
		super();
	}

	public String getMaHd() {
		return maHd;
	}

	public void setMaHd(String maHd) {
		this.maHd = maHd;
	}

	public Date getNgayMua() {
		return ngayMua;
	}

	public void setNgayMua(Date ngayMua) {
		this.ngayMua = ngayMua;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	public MaGiamGia getMaGiamGia() {
		return maGiamGia;
	}

	public void setMaGiamGia(MaGiamGia maGiamGia) {
		this.maGiamGia = maGiamGia;
	}

	public NguoiDung getNguoidung() {
		return nguoidung;
	}

	public void setNguoidung(NguoiDung nguoidung) {
		this.nguoidung = nguoidung;
	}

	public List<HoaDonChiTiet> getHdctList() {
		return hdctList;
	}

	public void setHdctList(List<HoaDonChiTiet> hdctList) {
		this.hdctList = hdctList;
	}

}
