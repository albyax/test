package com.alberto.openshift.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alberto.openshift.model.Contatto;

@RestController
public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> serviceTest(){
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Mario", "Rossi", "mario"));
		lista.add(new Contatto("Anna", "Verdi", "anna"));
		lista.add(new Contatto("Paolo", "Neri", "paul"));
		lista.add(new Contatto("Maria", "Arancio", "maria"));
		
		return lista;
	}
}
