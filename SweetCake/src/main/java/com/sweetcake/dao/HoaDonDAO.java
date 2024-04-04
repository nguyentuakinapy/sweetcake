package com.sweetcake.dao;

import java.util.List;

import com.sweetcake.entity.HoaDon;

public interface HoaDonDAO {
	List<HoaDon> findAll();

	HoaDon findByID();

	void create(HoaDon hoaDon);

	void update(HoaDon hoaDon);

	void deleteByMaSp(String maHd);
}
