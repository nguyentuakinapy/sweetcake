package com.sweetcake.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.sweetcake.entity.HoaDon;
import com.sweetcake.utils.JpaUtils;

public class HoaDonDAOImplements implements HoaDonDAO {
	EntityManager em = JpaUtils.getEntityManager();

	@Override
	public List<HoaDon> findAll() {
		TypedQuery<HoaDon> query = em.createNamedQuery("HoaDon.findAll", HoaDon.class);
		return query.getResultList();
	}

	@Override
	public HoaDon findByID(String maHoaDon) {
		return em.find(HoaDon.class, maHoaDon);
	}

	@Override
	public void create(HoaDon hoaDon) {
		try {
			em.getTransaction().begin();
			em.persist(hoaDon);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void update(HoaDon hoaDon) {
		try {
			em.getTransaction().begin();
			em.merge(hoaDon);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void deleteByMaSp(String maHd) {
		try {
			em.getTransaction().begin();
			em.remove(maHd);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

}
