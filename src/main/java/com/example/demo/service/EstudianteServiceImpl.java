package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.to.EstudianteTO;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.actualizar(estudiante);
	}

	@Override
	public Estudiante consultar(Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionar(id);
	}

	@Override
	public List<Estudiante> consultarTodos() {
		// TODO Auto-generated method stub
		return this.estudianteRepository.seleccionarTodos();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteRepository.eliminar(id);
	}

	@Override
	public void insertarTO(EstudianteTO estudiante) {
		// TODO Auto-generated method stub
		this.guardar(this.convertir(estudiante));
	}

	@Override
	public void actualizarTO(EstudianteTO estudiante) {
		// TODO Auto-generated method stub
		this.actualizar(this.convertir(estudiante));
	}

	@Override
	public EstudianteTO seleccionarTO(Integer id) {
		// TODO Auto-generated method stub
		return this.convertirTO(this.consultar(id));
	}

	@Override
	public List<EstudianteTO> seleccionarTodosTO() {
		// TODO Auto-generated method stub
		List<Estudiante> lista = this.consultarTodos();
		List<EstudianteTO> listaFInal = new ArrayList<>();
		for (Estudiante e : lista) {
			listaFInal.add(this.convertirTO(e));
		}
		return listaFInal;
	}

	public Estudiante convertir(EstudianteTO estudianteTO) {
		Estudiante estudiante = new Estudiante();
		estudiante.setNomre(estudianteTO.getNomre());
		estudiante.setApellido(estudianteTO.getApellido());
		estudiante.setCedula(estudianteTO.getCedula());
		estudiante.setId(estudianteTO.getId());
		return estudiante;
	}

	public EstudianteTO convertirTO(Estudiante estudiant) {
		EstudianteTO estudiante = new EstudianteTO();
		estudiante.setNomre(estudiant.getNomre());
		estudiante.setApellido(estudiant.getApellido());
		estudiante.setCedula(estudiant.getCedula());
		estudiante.setId(estudiant.getId());
		return estudiante;
	}
}
