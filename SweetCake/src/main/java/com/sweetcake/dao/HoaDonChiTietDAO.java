package com.sweetcake.dao;

import java.util.List;

import com.sweetcake.entity.HoaDonChiTiet;

public interface HoaDonChiTietDAO {
	List<HoaDonChiTiet> findAll();

	HoaDonChiTiet findByID();

	void create(HoaDonChiTiet hoaDonChiTiet);

	void update(HoaDonChiTiet hoaDonChiTiet);
}
