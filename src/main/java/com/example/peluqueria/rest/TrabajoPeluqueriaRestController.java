package com.example.peluqueria.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.peluqueria.bo.TrabajoPeluqueria;
import com.example.peluqueria.rest.dto.TrabajoPeluqueriaDto;
import com.example.peluqueria.services.interf.TrabajoServiceInterf;

@RestController
@RequestMapping("/api")
public class TrabajoPeluqueriaRestController {

	@Autowired
	private TrabajoServiceInterf trabajoPeluqueriaService;
	
	@GetMapping("/trabajos")
	public List<TrabajoPeluqueriaDto> listarTrabajos(){
		List<TrabajoPeluqueria> trabajosBo = trabajoPeluqueriaService.listarTrabajos();
		List<TrabajoPeluqueriaDto> trabajosDto = new ArrayList<TrabajoPeluqueriaDto>();
		for (TrabajoPeluqueria trabajo : trabajosBo) {
			trabajosDto.add(new TrabajoPeluqueriaDto(trabajo));
		}
		return trabajosDto;
	}
}
