package com.sweetcake.dao;

import java.util.List;

import com.sweetcake.entity.NguoiDung;

public interface NguoiDungDAO {
	List<NguoiDung> findAll();

	NguoiDung findByID(String maNguoiDung);

	void create(NguoiDung nguoiDung);

	void update(NguoiDung nguoiDung);

	void deleteByMaSp(String maNguoiDung);
}
