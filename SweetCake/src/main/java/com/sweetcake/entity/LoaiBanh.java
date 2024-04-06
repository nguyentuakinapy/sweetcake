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

@NamedQueries({ @NamedQuery(name = "LoaiBanh.findAll", query = "SELECT o FROM LoaiBanh o") })
@Entity
@Table(name = "LoaiBanh")
public class LoaiBanh {
	@Id
	@Column(name = "MaLoaiBanh")
	Integer maLoaiBanh;

	@Column(name = "TenLoaiBanh")
	String tenLoaiBanh;

	@OneToMany
	@JoinColumn(name = "maLoaiBanh")
	List<SanPham> spList;

	public LoaiBanh(Integer maLoaiBanh, String tenLoaiBanh, List<SanPham> spList) {
		super();
		this.maLoaiBanh = maLoaiBanh;
		this.tenLoaiBanh = tenLoaiBanh;
		this.spList = spList;
	}

	public LoaiBanh() {
		super();
	}

	public Integer getMaLoaiBanh() {
		return maLoaiBanh;
	}

	public void setMaLoaiBanh(Integer maLoaiBanh) {
		this.maLoaiBanh = maLoaiBanh;
	}

	public String getTenLoaiBanh() {
		return tenLoaiBanh;
	}

	public void setTenLoaiBanh(String tenLoaiBanh) {
		this.tenLoaiBanh = tenLoaiBanh;
	}

	public List<SanPham> getSpList() {
		return spList;
	}

	public void setSpList(List<SanPham> spList) {
		this.spList = spList;
	}

}
