package com.ipartek.formacion.dbms.persistence;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.ipartek.formacion.util.Utils;

/**
 * @author Raúl de Roba 14/03/2017
 *
 * <p> Clase Pojo que contendrá al objeto Experiencia Profesional. </p>
 *
 */
public class ExperienciaProfesional 
                              implements Serializable,Comparable<ExperienciaProfesional>{
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
	private Date fDesde;
	private Date fHasta;

	/**
	 * <p>Constructor vacio de la clase pojo Experiencia Profesional.</p>
	 */
	public ExperienciaProfesional() {
		/* Constructor del padre.*/
		super();
		/* Se asigna por defecto identificador nulo.*/
		this.id = CODIGO_NULO;
		/* Se inicializan los atributos.*/
		this.codigo = CODIGO_NULO;
		this.persona = null;
		this.empresa = null; 
		this.descripcion = "";
		this.fDesde = null;	
		this.fHasta = null;	
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
	 * @return fDesde. Se devuelve el atributo "fDesde".
	 */
	public Date getfDesde() {
		/* Se devuelve el valor del atributo "fDesde". */
		return fDesde;
	}

	/**
	 * @param fDesde. Se asigna valor al atributo "fDesde".
	 */
	
	public void setfDesde(Date fDesde) {
		/* Se asigna el valor del atributo "fDesde" pasado por parametro. */
		this.fDesde = fDesde;
	}	
	
	/**
	 * @return fHasta. Se devuelve el atributo "fHasta".
	 */
	public Date getfHasta() {
		/* Se devuelve el valor del atributo "fHasta". */
		return fHasta;
	}

	/**
	 * @param fHasta. Se asigna valor al atributo "fHasta".
	 */
	
	public void setfHasta(Date fHasta) {
		/* Se asigna el valor del atributo "fHasta" pasado por parametro. */
		this.fHasta = fHasta;
	}	

	@Override
	/**
	 * @return String
	 * <p> Metodo que devuelve la clase covertida a cadena de caracteres.</p>
	 * */
	public String toString() {
		/* Se llama a la función del paquete Utils que castea una fecha a String,
		 * para convertir la fecha desde a String.*/
		String fDesde = Utils.parseDateString(this.fDesde);
		/* Se llama a la función del paquete Utils que castea una fecha a String,
		 * para convertir la fecha desde a String.*/
		String fHasta = Utils.parseDateString(this.fHasta);
				
		/* Se devuelve los atributos de la clase.*/
		return " Id " + this.id + " Codigo : " + this.codigo +  
			   " Persona [ : " + this.persona.toString() + " ]" + 
			   " Empresa [ : " + this.empresa.toString() + " ]" + 
		       " F. Desde : " + fDesde + " F. Hasta : " + fHasta + 
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
			 * la clase 'Experiencia Profesional'.*/
			if (obj instanceof ExperienciaProfesional){
				/* Se compara los identificadores de la clase actua y 
				 * la persona recibida por parametro.*/
				resultado =  this.getCodigo()== ((ExperienciaProfesional) obj).getCodigo();
			}
				
		}
		/* Se devuelve el resultado de la comparación.*/			
		return resultado;
	}

	/**
	 * @param experienciaprofesional
	 * @return int
	 * 
	 * <p> Se usa en el caso de ordenamiento de List o Array. </p>
	 * <ul>
	 * 	<li> -1 Indicará que la clase es menor a la experienciaprofesional recibida por parametro. </li>
	 * 	<li> 0 Indicará que la clase es igual a la experienciaprofesional recibida por parametro. </li>
	 * 	<li> 1 Indicará que la clase es mayor a la experienciaprofesional recibida por parametro. </li>
	 * </ul>
	 * 
	 */
	public int compareTo(ExperienciaProfesional experienciaprofesional) {
		/* Se devuelve la comparación del nombre de la clase y 
		 * la persona recibida por parametro.*/
		// TODO es correcta la comparación.
		return String.valueOf(this.getCodigo()).compareToIgnoreCase(String.valueOf(experienciaprofesional.getCodigo()));
	}	
}
