package com.sweetcake.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.sweetcake.entity.MaGiamGia;
import com.sweetcake.utils.JpaUtils;

public class MaGiamGiaDAOImplements implements MaGiamGiaDAO {
	EntityManager em = JpaUtils.getEntityManager();

	@Override
	public List<MaGiamGia> findAll() {
		TypedQuery<MaGiamGia> query = em.createNamedQuery("MaGiamGia.findAll", MaGiamGia.class);
		return query.getResultList();
	}

	@Override
	public MaGiamGia findByID(String maGiamGia) {
		return em.find(MaGiamGia.class, maGiamGia);
	}

	@Override
	public void create(MaGiamGia maGiamGia) {
		try {
			em.getTransaction().begin();
			em.persist(maGiamGia);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void update(MaGiamGia maGiamGia) {
		try {
			em.getTransaction().begin();
			em.merge(maGiamGia);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void deleteByMaSp(String maGiamGia) {
		try {
			em.getTransaction().begin();
			em.remove(maGiamGia);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

}
