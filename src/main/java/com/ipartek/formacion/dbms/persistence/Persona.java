package com.ipartek.formacion.dbms.persistence;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Raúl de Roba 14/03/2017
 *
 * <p> Clase Pojo que contendrá al objeto persona. </p>
 *
 */
public class Persona implements Serializable,Comparable<Persona>{
	/* Constate del serial de la clase.*/
	private static final long serialVersionUID = 1L;
	/* Constante para id nulo.*/
	private final int CODIGO_NULO = -1;
	
	/* Atributos de persona.*/
	private int id;
	private int codigo;
	private String nombre;
	private Date fNacimiento;
	private String direccion;
	private String poblacion;
	private String codigoPostal;
	private String provincia;
	private String email;
	private int telefono;
	private int movil;

	/**
	 * <p>Constructor vacio de la clase pojo persona.</p>
	 */
	public Persona() {
		/* Constructor del padre.*/
		super();
		/* Se asigna por defecto identificador nulo.*/
		this.id = CODIGO_NULO;
		/* Se inicializan los atributos.*/
		this.codigo = CODIGO_NULO;
		this.nombre = "";
		this.fNacimiento = null; //new Date();
		this.direccion = "";
		this.poblacion = "";
		this.codigoPostal = "";
		this.provincia = "";
		this.email = "";
		this.telefono = CODIGO_NULO;
		this.movil = CODIGO_NULO;		
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
	 * @return nombre. Se devuelve el atributo "nombre".
	 */
	public String getNombre() {
		/* Se devuelve el valor del atributo "nombre". */
		return nombre;
	}

	/**
	 * @param nombre. Se asigna valor al atributo "nombre".
	 */
	
	public void setNombre(String nombre) {
		/* Se asigna el valor del atributo "nombre" pasado por parametro. */
		this.nombre = nombre;
	}

	/**
	 * @return fNacimiento. Se devuelve el atributo "fNacimiento".
	 */
	public Date getfNacimiento() {
		/* Se devuelve el valor del atributo "fNacimiento". */
		return fNacimiento;
	}

	/**
	 * @param fNacimiento. Se asigna valor al atributo "fNacimiento".
	 */
	
	public void setfNacimiento(Date fNacimiento) {
		/* Se asigna el valor del atributo "fNacimiento" pasado por parametro. */
		this.fNacimiento = fNacimiento;
	}

	/**
	 * @return direccion. Se devuelve el atributo "direccion".
	 */
	public String getDireccion() {
		/* Se devuelve el valor del atributo "direccion". */
		return direccion;
	}

	/**
	 * @param direccion. Se asigna valor al atributo "direccion".
	 */
	
	public void setDireccion(String direccion) {
		/* Se asigna el valor del atributo "direccion" pasado por parametro. */
		this.direccion = direccion;
	}

	/**
	 * @return poblacion. Se devuelve el atributo "poblacion".
	 */
	public String getPoblacion() {
		/* Se devuelve el valor del atributo "poblacion". */
		return poblacion;
	}

	/**
	 * @param poblacion. Se asigna valor al atributo "poblacion".
	 */
	
	public void setPoblacion(String poblacion) {
		/* Se asigna el valor del atributo "poblacion" pasado por parametro. */
		this.poblacion = poblacion;
	}

	/**
	 * @return codigoPostal. Se devuelve el atributo "codigoPostal".
	 */
	public String getCodigoPostal() {
		/* Se devuelve el valor del atributo "codigoPostal". */
		return codigoPostal;
	}

	/**
	 * @param codigoPostal. Se asigna valor al atributo "codigoPostal".
	 */
	
	public void setCodigoPostal(String codigoPostal) {
		/* Se asigna el valor del atributo "codigoPostal" pasado por parametro. */
		this.codigoPostal = codigoPostal;
	}

	/**
	 * @return provincia. Se devuelve el atributo "provincia".
	 */
	public String getProvincia() {
		/* Se devuelve el valor del atributo "provincia". */
		return provincia;
	}

	/**
	 * @param provincia. Se asigna valor al atributo "provincia".
	 */
	
	public void setProvincia(String provincia) {
		/* Se asigna el valor del atributo "provincia" pasado por parametro. */
		this.provincia = provincia;
	}

	/**
	 * @return email. Se devuelve el atributo "email".
	 */
	public String getEmail() {
		/* Se devuelve el valor del atributo "email". */
		return email;
	}

	/**
	 * @param email. Se asigna valor al atributo "email".
	 */
	
	public void setEmail(String email) {
		/* Se asigna el valor del atributo "email" pasado por parametro. */
		this.email = email;
	}

	/**
	 * @return telefono. Se devuelve el atributo "telefono".
	 */
	public int getTelefono() {
		/* Se devuelve el valor del atributo "telefono". */
		return telefono;
	}

	/**
	 * @param telefono. Se asigna valor al atributo "telefono".
	 */
	
	public void setTelefono(int telefono) {
		/* Se asigna el valor del atributo "telefono" pasado por parametro. */
		this.telefono = telefono;
	}

	/**
	 * @return movil. Se devuelve el atributo "movil".
	 */
	public int getMovil() {
		/* Se devuelve el valor del atributo "movil". */
		return movil;
	}

	/**
	 * @param movil. Se asigna valor al atributo "movil".
	 */
	
	public void setMovil(int movil) {
		/* Se asigna el valor del atributo "movil" pasado por parametro. */
		this.movil = movil;
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
		/* Se asigna le fecha de nacimiento de la clase al gregoriaono.*/
		calendar.setTime(fNacimiento);
		/* Se monta la fecha en una variable String 
		   (Enero lo interpreta como mes 0,por lo que se ha de sumar 1).*/
		String fNacimiento = calendar.get(Calendar.DAY_OF_MONTH) + "/" + 
		              (calendar.get(Calendar.MONTH) + 1) + "/" + 
		              calendar.get(Calendar.YEAR); 
				
		/* Se devuelve los atributos de la clase.*/
		return " Id " + this.id + " Codigo : " + this.codigo +  
			   " Nombre : " + this.nombre + "F. Nacimiento : " + fNacimiento + 
			   " Dirección : " + this.direccion + 
			   " Codigo Postal : " + this.codigoPostal + 
			   " Provincia :" + this.provincia + " Email : " + this.email + 
			   " Teléfono :" + this.telefono + " movil : " + this.movil;
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
		/* Se comprueba que el objeto pasado por paramtro no sea nulo.*/
		if (obj != null){
			/* Se comprueba si el objeto pasado por parametro es de la clase 'Persona'.*/
			if (obj instanceof Persona){
				/* Se compara los identificadores de la clase actua y 
				 * la persona recibida por parametro.*/
				resultado =  this.getCodigo()== ((Persona) obj).getCodigo();
			}
				
		}
		/* Se devuelve el resultado de la comparación.*/			
		return resultado;
	}

	/**
	 * @param persona
	 * @return int
	 * 
	 * <p> Se usa en el caso de ordenamiento de List o Array. </p>
	 * <ul>
	 * 	<li> -1 Indicará que la clase es menor a la persona recibida por parametro. </li>
	 * 	<li> 0 Indicará que la clase es igual a la persona recibida por parametro. </li>
	 * 	<li> 1 Indicará que la clase es mayor a la persona recibida por parametro. </li>
	 * </ul>
	 * 
	 */
	public int compareTo(Persona persona) {
		/* Se devuelve la comparación del nombre de la clase y 
		 * la persona recibida por parametro.*/
		return this.getNombre().compareToIgnoreCase(persona.getNombre());
	}
	
}
