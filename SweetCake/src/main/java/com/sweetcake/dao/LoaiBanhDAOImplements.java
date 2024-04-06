package com.sweetcake.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.sweetcake.entity.LoaiBanh;
import com.sweetcake.utils.JpaUtils;

public class LoaiBanhDAOImplements implements LoaiBanhDAO {
	EntityManager em = JpaUtils.getEntityManager();

	@Override
	public List<LoaiBanh> findAll() {
		TypedQuery<LoaiBanh> query = em.createNamedQuery("LoaiBanh.findAll", LoaiBanh.class);
		return query.getResultList();
	}

	@Override
	public LoaiBanh findByID(Integer maLoaiBanh) {
		return em.find(LoaiBanh.class, maLoaiBanh);
	}

	@Override
	public void create(LoaiBanh loaiBanh) {
		try {
			em.getTransaction().begin();
			em.persist(loaiBanh);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void update(LoaiBanh loaiBanh) {
		try {
			em.getTransaction().begin();
			em.merge(loaiBanh);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void deleteByMaSp(String maLoaiBanh) {
		try {
			em.getTransaction().begin();
			em.remove(maLoaiBanh);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

}
