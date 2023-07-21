package com.romina.proyectoclass.main;

public class Project {
	private String nombre;
	private String descripcion;
	private double initialCost;
	
//CONSTRUCTORES SOBRECARGADOS
	public Project(){
		this.nombre = "";
		this.descripcion = "";
		this.initialCost = 0.0;
	}
	
	public Project(String name) {
	    this.nombre = name;
	    this.descripcion = "";
	    this.initialCost = 0.0;
	}
	
	public Project(String name, String description) {
	    this.nombre = name;
	    this.descripcion = description;
	    this.initialCost = 0.0;
	}
	public Project(String name, String description, double intialCost) {
		this.nombre = name;
		this.descripcion = description;
		this.initialCost = intialCost;
	}
	
	public String elevatorPitch() {
        return this.nombre + ":" + this.descripcion + ":" + this.initialCost; 
    }
	
//GETTERS Y SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getInitialCost() {
	    return initialCost;
	}

	public void setInitialCost(double initialCost) {
	    this.initialCost = initialCost;
	}

	
}
