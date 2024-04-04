package com.sweetcake.dao;

import java.util.List;

import com.sweetcake.entity.LoaiBanh;

public interface LoaiBanhDAO {
	List<LoaiBanh> findAll();

	LoaiBanh findByID();

	void create(LoaiBanh loaiBanh);

	void update(LoaiBanh loaiBanh);

	void deleteByMaSp(String maLoaiBanh);
}
