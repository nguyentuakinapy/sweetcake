package com.sweetcake.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.sweetcake.entity.HoaDonChiTiet;
import com.sweetcake.utils.JpaUtils;

public class HoaDonChiTietDAOImplements implements HoaDonChiTietDAO {
	EntityManager em = JpaUtils.getEntityManager();

	@Override
	public List<HoaDonChiTiet> findAll() {
		TypedQuery<HoaDonChiTiet> query = em.createNamedQuery("HoaDonChiTiet.findAll", HoaDonChiTiet.class);
		return query.getResultList();
	}

	@Override
	public void create(HoaDonChiTiet hoaDonChiTiet) {
		try {
			em.getTransaction().begin();
			em.persist(hoaDonChiTiet);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void update(HoaDonChiTiet hoaDonChiTiet) {
		try {
			em.getTransaction().begin();
			em.merge(hoaDonChiTiet);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

}
