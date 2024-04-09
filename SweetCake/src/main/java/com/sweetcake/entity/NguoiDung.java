package com.sweetcake.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@NamedQueries({ @NamedQuery(name = "NguoiDung.findAll", query = "SELECT o FROM NguoiDung o") })
@Entity
@Table(name = "NguoiDung")
public class NguoiDung {
	@Id
	@Column(name = "MaNguoiDung")
	String maNguoiDung;

	@Column(name = "MatKhau")
	String matKhau;

	@Column(name = "HoTen")
	String hoTen;

	@Column(name = "GioiTinh")
	Integer gioiTinh=1;

	@Column(name = "Email")
	String email;

	@Column(name = "SDT")
	String soDienThoai;

	@Column(name = "VaiTro")
	Integer vaiTro=0;

	@Column(name = "DiaChi")
	String diaChi;

	@OneToMany
	@JoinColumn(name = "maNguoiDung")
	List<HoaDon> hdList;

	public NguoiDung(String maNguoiDung, String matKhau, String hoTen, Integer gioiTinh, String email,
			String soDienThoai, Integer vaiTro, String diaChi, List<HoaDon> hdList) {
		super();
		this.maNguoiDung = maNguoiDung;
		this.matKhau = matKhau;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.vaiTro = vaiTro;
		this.diaChi = diaChi;
		this.hdList = hdList;
	}

	public NguoiDung() {
		super();
	}

	public String getMaNguoiDung() {
		return maNguoiDung;
	}

	public void setMaNguoiDung(String maNguoiDung) {
		this.maNguoiDung = maNguoiDung;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Integer getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(Integer gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public Integer getVaiTro() {
		return vaiTro;
	}

	public void setVaiTro(Integer vaiTro) {
		this.vaiTro = vaiTro;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public List<HoaDon> getHdList() {
		return hdList;
	}

	public void setHdList(List<HoaDon> hdList) {
		this.hdList = hdList;
	}

}
