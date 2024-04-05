package com.sweetcake.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.sweetcake.entity.NguoiDung;
import com.sweetcake.utils.JpaUtils;

public class NguoiDungDAOImplements implements NguoiDungDAO {
	EntityManager em = JpaUtils.getEntityManager();

	@Override
	public List<NguoiDung> findAll() {
		TypedQuery<NguoiDung> query = em.createNamedQuery("NguoiDung.findAll", NguoiDung.class);
		return query.getResultList();
	}

	@Override
	public NguoiDung findByID(String maNguoiDung) {
		return em.find(NguoiDung.class, maNguoiDung);
	}

	@Override
	public void create(NguoiDung nguoiDung) {
		try {
			em.getTransaction().begin();
			em.persist(nguoiDung);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void update(NguoiDung nguoiDung) {
		try {
			em.getTransaction().begin();
			em.merge(nguoiDung);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void deleteByMaSp(String maNguoiDung) {
		try {
			em.getTransaction().begin();
			em.remove(maNguoiDung);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

}
