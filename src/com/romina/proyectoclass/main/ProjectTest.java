package com.romina.proyectoclass.main;

public class ProjectTest {
	public static void main(String[]args) {
		//CREANDO INSTANCIAS PARA LOS CONSTRUCTORES
		
		 Project emptyProject = new Project();
	     Project projectNameOnly = new Project("Projecto A");
	     Project projectWithBothParameters = new Project("Projecto B", "Este es el proyecto con ambos parametros");
	     Project projectWithIntialCost = new Project("Proyecto C", "descripcion", 50000.0);
	     
	     //EJECUTANDO METODO elevatorPitch
	     System.out.println("Proyecto vacio" + emptyProject.elevatorPitch());
	     System.out.println(projectWithBothParameters.elevatorPitch());
	     
	     //PROBANDO GETTER Y SETTER
	        
	     projectNameOnly.setDescripcion("Descripcion del Proyecto A");
	     System.out.println( projectNameOnly.elevatorPitch());
	     
	     projectWithIntialCost.setInitialCost(5000.0);
	     System.out.println(projectWithIntialCost.elevatorPitch());
	}

}
