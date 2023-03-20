package com.example.peluqueria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.peluqueria.bo.TrabajoPeluqueria;
import com.example.peluqueria.repository.interf.TrabajoPeluqueriaRepository;
import com.example.peluqueria.services.interf.TrabajoServiceInterf;

@Service
@Transactional
public class TrabajoPeluqueriaServiceImpl implements TrabajoServiceInterf{
	
	@Autowired
	private TrabajoPeluqueriaRepository trabajoPeluqueriaRepository;
	
	
	@Override
	public List<TrabajoPeluqueria> listarTrabajos() {
		return trabajoPeluqueriaRepository.listarTrabajos();
	}

}
