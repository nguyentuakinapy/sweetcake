package com.sweetcake.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.sweetcake.entity.SanPham;
import com.sweetcake.utils.JpaUtils;

public class SanPhamDAOImplements implements SanPhamDAO {
	EntityManager em = JpaUtils.getEntityManager();

	@Override
	public List<SanPham> findAll() {
		TypedQuery<SanPham> query = em.createQuery("SELECT o FROM SanPham o", SanPham.class);
		return query.getResultList();
	}

	@Override
	public SanPham findByID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(SanPham sanPham) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(SanPham sanPham) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByMaSp(String maSp) {
		// TODO Auto-generated method stub

	}

}
