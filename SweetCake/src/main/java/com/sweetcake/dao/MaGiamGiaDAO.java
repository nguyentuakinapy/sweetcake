package com.sweetcake.dao;

import java.util.List;

import com.sweetcake.entity.MaGiamGia;

public interface MaGiamGiaDAO {
	List<MaGiamGia> findAll();

	MaGiamGia findByID(String maGiamGia);

	void create(MaGiamGia maGiamGia);

	void update(MaGiamGia maGiamGia);

	void deleteByMaSp(String maGiamGia);
}
