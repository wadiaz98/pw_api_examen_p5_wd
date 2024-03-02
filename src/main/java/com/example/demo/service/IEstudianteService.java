package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.to.EstudianteTO;

public interface IEstudianteService {
	// CRUD
	public void guardar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	public Estudiante consultar(Integer id);

	public List<Estudiante> consultarTodos();

	public void eliminar(Integer id);

	// TO
	public void insertarTO(EstudianteTO estudiante);

	public void actualizarTO(EstudianteTO estudiante);

	public EstudianteTO seleccionarTO(Integer id);

	public List<EstudianteTO> seleccionarTodosTO();

}
