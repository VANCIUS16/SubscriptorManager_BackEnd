package com.sm.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm.modelos.Sub;
import com.sm.repositorio.InterfaceSub;

@RestController
@RequestMapping("/Sub")
public class SubControlador {

	@Autowired
	private InterfaceSub interfaceSub;
	
	@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
	@GetMapping
	public List<Sub> usuarios(){
		return (List<Sub>) interfaceSub.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Sub us) {
		interfaceSub.save(us);
	}
	
	@PutMapping
	public void modificar(@RequestBody Sub us) {
		interfaceSub.save(us);
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		interfaceSub.deleteById(id);
	}
	
	/*@GetMapping(value="/{id}")
	public void usuariosId(@PathVariable ("id") Integer id) {
		interfaceSub.findById(id);
		//System.out.println("Hola MUNDO");
		//System.out.println(id);
	}	*/
}
