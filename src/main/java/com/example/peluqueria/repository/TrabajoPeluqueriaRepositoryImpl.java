package com.example.peluqueria.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.peluqueria.bo.TrabajoPeluqueria;
import com.example.peluqueria.repository.interf.TrabajoPeluqueriaRepository;

@Repository
public class TrabajoPeluqueriaRepositoryImpl implements TrabajoPeluqueriaRepository {

	@Autowired
	private EntityManager entityManager;


	@SuppressWarnings("unchecked")
	@Override
	public List<TrabajoPeluqueria> listarTrabajos() {
		return entityManager.createQuery("from TrabajoPeluqueria").getResultList();
	}

}
