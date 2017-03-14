package com.ipartek.formacion.dbms.persistence;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Raúl de Roba 14/03/2017
 *
 * <p> Clase Pojo que contendrá al objeto Dato Academico. </p>
 *
 */
public class DatoAcademico implements Serializable,Comparable<DatoAcademico>{
	/* Constate del serial de la clase.*/
	private static final long serialVersionUID = 1L;
	/* Constante para id nulo.*/
	private final int CODIGO_NULO = -1;
	
	/* Atributos de persona.*/
	private int id;
	private int codigo;
	private Persona persona;
	private Empresa empresa;
	private String descripcion;
	private Date fTitulacion;

	/**
	 * <p>Constructor vacio de la clase pojo Dato Academico.</p>
	 */
	public DatoAcademico() {
		/* Constructor del padre.*/
		super();
		/* Se asigna por defecto identificador nulo.*/
		this.id = CODIGO_NULO;
		/* Se inicializan los atributos.*/
		this.codigo = CODIGO_NULO;
		this.persona = null;
		this.empresa = null; 
		this.descripcion = "";
		this.fTitulacion = null;	
	}

	/**
	 * @return id. Se devuelve el atributo "id".
	 */
	public int getId() {
		/* Se devuelve el valor del atributo "id". */
		return id;
	}

	/**
	 * @return codigo. Se devuelve el atributo "codigo".
	 */
	public int getCodigo() {
		/* Se devuelve el valor del atributo "codigo". */
		return codigo;
	}

	/**
	 * @param codigo. Se asigna valor al atributo "codigo".
	 */
	
	public void setCodigo(int codigo) {
		/* Se asigna el valor del atributo "codigo" pasado por parametro. */
		this.codigo = codigo;
	}

	/**
	 * @return persona. Se devuelve el atributo "persona".
	 */
	public Persona getPersona() {
		/* Se devuelve el valor del atributo "persona". */
		return this.persona;
	}

	/**
	 * @param persona. Se asigna valor al atributo "persona".
	 */
	
	public void setPersona(Persona persona) {
		/* Se asigna el valor del atributo "persona" pasado por parametro. */
		this.persona = persona;
	}
	
	/**
	 * @return empresa. Se devuelve el atributo "empresa".
	 */
	public Empresa getEmpresa() {
		/* Se devuelve el valor del atributo "empresa". */
		return this.empresa;
	}

	/**
	 * @param empresa. Se asigna valor al atributo "empresa".
	 */
	
	public void setEmpresa(Empresa empresa) {
		/* Se asigna el valor del atributo "empresa" pasado por parametro. */
		this.empresa = empresa;
	}
	
	/**
	 * @return descripcion. Se devuelve el atributo "descripcion".
	 */
	public String getDescripcion() {
		/* Se devuelve el valor del atributo "descripcion". */
		return descripcion;
	}

	/**
	 * @param descripcion. Se asigna valor al atributo "descripcion".
	 */
	
	public void setDescripcion(String descripcion) {
		/* Se asigna el valor del atributo "descripcion" pasado por parametro. */
		this.descripcion = descripcion;
	}

	/**
	 * @return fTitulacion. Se devuelve el atributo "fTitulacion".
	 */
	public Date getfTitulacion() {
		/* Se devuelve el valor del atributo "fTitulacion". */
		return fTitulacion;
	}

	/**
	 * @param fTitulacion. Se asigna valor al atributo "fTitulacion".
	 */
	
	public void setfTitulacion(Date fTitulacion) {
		/* Se asigna el valor del atributo "fTitulacion" pasado por parametro. */
		this.fTitulacion = fTitulacion;
	}	

	@Override
	/**
	 * @return String
	 * <p> Metodo que devuelve la clase covertida a cadena de caracteres.</p>
	 * */
	public String toString() {
		// TODO Usar libreria Casteo de Utils.
		/* Se declara e instancia la clase gregoriana para trabajar con la fecha.*/
		GregorianCalendar calendar;
		calendar = new GregorianCalendar();
		/* Se asigna le fecha de titulacion de la clase al gregoriaono.*/
		calendar.setTime(fTitulacion);
		/* Se monta la fecha en una variable String 
		   (Enero lo interpreta como mes 0,por lo que se ha de sumar 1).*/
		String fTitulacion = calendar.get(Calendar.DAY_OF_MONTH) + "/" + 
		              (calendar.get(Calendar.MONTH) + 1) + "/" + 
		              calendar.get(Calendar.YEAR); 
				
		/* Se devuelve los atributos de la clase.*/
		return " Id " + this.id + " Codigo : " + this.codigo +  
			   " Persona [ : " + this.persona.toString() + " ]" + 
			   " Empresa [ : " + this.empresa.toString() + " ]" + 
		       " F. Titulación : " + fTitulacion + 
			   " Descripción : " + this.descripcion;
	}
	
	/** 
	 * <p> Se obtiene la un código Hash para 
	 *     la clase persona en base a su 'código'.</p>
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	/** 
	 * <p> Metodo que compara si dos objetos son iguales. </p>
	 */
	@Override
	public boolean equals(Object obj) {
		
		/* Se declara e inicializa una variable para devolver 
		 * el resultado de la comparación.*/
		boolean resultado = false;
		/* Se comprueba que el objeto pasado por parametro no sea nulo.*/
		if (obj != null){
			/* Se comprueba si el objeto pasado por parametro es de 
			 * la clase 'Dato Academico'.*/
			if (obj instanceof DatoAcademico){
				/* Se compara los identificadores de la clase actua y 
				 * la persona recibida por parametro.*/
				resultado =  this.getCodigo()== ((DatoAcademico) obj).getCodigo();
			}
				
		}
		/* Se devuelve el resultado de la comparación.*/			
		return resultado;
	}

	/**
	 * @param datoacademico
	 * @return int
	 * 
	 * <p> Se usa en el caso de ordenamiento de List o Array. </p>
	 * <ul>
	 * 	<li> -1 Indicará que la clase es menor al 
	 *       datoacademico recibida por parametro. </li>
	 * 	<li> 0 Indicará que la clase es igual al 
	 *       datoacademico recibida por parametro. </li>
	 * 	<li> 1 Indicará que la clase es mayor al 
	 *       datoacademico recibida por parametro. </li>
	 * </ul>
	 * 
	 */
	public int compareTo(DatoAcademico datoacademico) {
		/* Se devuelve la comparación del nombre de la clase y 
		 * la persona recibida por parametro.*/
		// TODO es correcta la comparación.
		return String.valueOf(this.getCodigo()).compareToIgnoreCase(String.valueOf(datoacademico.getCodigo()));
	}	
}
