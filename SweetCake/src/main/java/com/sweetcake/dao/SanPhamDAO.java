package com.sweetcake.dao;

import java.util.List;

import com.sweetcake.entity.SanPham;

public interface SanPhamDAO {
	List<SanPham> findAll();

	SanPham findByID(String maSp);

	void create(SanPham sanPham);

	void update(SanPham sanPham);

	void deleteByMaSp(String maSp);

	List<SanPham> listSP();

	List<SanPham> findTop3(int index);

}
