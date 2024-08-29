package com.controladormatricula.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carro.entities.Vehiculo;
import com.circulacion.validacion.ValidacionMatricula;

@RestController
public class ControladorMatricula {

	@GetMapping("/auto")
	public String puedeCircular(@RequestParam("matricula")String Matricula
			,@RequestParam("fechaActual")String fechaActual) {
		
		LocalDate FechaActual = LocalDate.parse(fechaActual,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		Vehiculo vehiculo = new Vehiculo(Matricula, fechaActual);
		ValidacionMatricula validacionMatricula = new ValidacionMatricula();
		
		if (validacionMatricula.puedeCircular(vehiculo, FechaActual)) {
			return "El vehículo puede circular.";
		} else {
			return "El vehículo no puede circular.";
		}
		
	
	}
	
}
