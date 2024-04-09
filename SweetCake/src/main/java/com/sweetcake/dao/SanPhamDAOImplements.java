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
		TypedQuery<SanPham> query = em.createNamedQuery("SanPham.findAll", SanPham.class);
		return query.getResultList();
	}

	@Override
	public SanPham findByID(String maSp) {
		return em.find(SanPham.class, maSp);
	}

	@Override
	public void create(SanPham sanPham) {
		try {
			em.getTransaction().begin();
			em.persist(sanPham);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void update(SanPham sanPham) {
		try {
			em.getTransaction().begin();
			em.merge(sanPham);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void deleteByMaSp(String maSp) {
		try {
			em.getTransaction().begin();
			em.remove(maSp);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public List<SanPham> listSP() {
		String jpql = "select e from SanPham e where e.trangThai = 1";
		TypedQuery<SanPham> query = em.createQuery(jpql, SanPham.class);
		return query.getResultList();
	}

	@Override
	public List<SanPham> findTop3(int index) {
		String jpql = "select o from SanPham o where o.trangThai = 1";
		TypedQuery<SanPham> query = em.createQuery(jpql, SanPham.class).setFirstResult(index).setMaxResults(3);
		return query.getResultList();
	}
}
