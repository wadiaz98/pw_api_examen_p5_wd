package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {

	// CRUD
	public void insertar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	public Estudiante seleccionar(Integer id);

	public List<Estudiante> seleccionarTodos();

	public void eliminar(Integer id);

}
