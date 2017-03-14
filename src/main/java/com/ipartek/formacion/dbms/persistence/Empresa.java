package com.ipartek.formacion.dbms.persistence;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
* @author Raúl de Roba 13/03/2017
 *
 * <p> Clase Pojo que contendrá al objeto empresa. </p>
 *
 */
public class Empresa implements Serializable,Comparable<Empresa>{
	/* Constate del serial de la clase.*/
	private static final long serialVersionUID = 1L;
	/* Constante para id nulo.*/
	private final int CODIGO_NULO = -1;
	
	/* Atributos de persona.*/
	private int id;
	private int codigo;
	private String nombre;
	private String direccion;
	private String poblacion;
	private String codigoPostal;
	private String provincia;
	private String email;
	private int telefono;
	private String web;

	/**
	 * <p>Constructor vacio de la clase pojo persona.</p>
	 */
	public Empresa() {
		/* Constructor del padre.*/
		super();
		/* Se asigna por defecto identificador nulo.*/
		this.id = CODIGO_NULO;
		/* Se inicializan los atributos.*/
		this.codigo = CODIGO_NULO;
		this.nombre = "";
		this.direccion = "";
		this.poblacion = "";
		this.codigoPostal = "";
		this.provincia = "";
		this.email = "";
		this.telefono = CODIGO_NULO;
		this.web = "";		
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
	 * @return web. Se devuelve el atributo "web".
	 */
	public String getWeb() {
		/* Se devuelve el valor del atributo "web". */
		return this.web;
	}

	/**
	 * @param movil. Se asigna valor al atributo "web".
	 */
	
	public void setWeb(String web) {
		/* Se asigna el valor del atributo "web" pasado por parametro. */
		this.web = web;
	}

	@Override
	/**
	 * @return String
	 * <p> Metodo que devuelve la clase covertida a cadena de caracteres.</p>
	 * */
	public String toString() {
		/* Se devuelve los atributos de la clase.*/
		return " Id " + this.id + " Codigo : " + this.codigo +  
			   " Nombre : " + this.nombre + " Dirección : " + this.direccion + 
			   " Codigo Postal : " + this.codigoPostal + 
			   " Provincia :" + this.provincia + " Email : " + this.email + 
			   " Teléfono :" + this.telefono + " Web : " + this.web;
	}
	
	/** 
	 * <p> Se obtiene la un código Hash para 
	 *     la clase empresa en base a su 'código'.</p>
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
			/* Se comprueba si el objeto pasado por parametro es de la clase 'Empresa'.*/
			if (obj instanceof Empresa){
				/* Se compara los identificadores de la clase actua y 
				 * la persona recibida por parametro.*/
				resultado =  this.getCodigo()== ((Empresa) obj).getCodigo();
			}
				
		}
		/* Se devuelve el resultado de la comparación.*/			
		return resultado;
	}

	/**
	 * @param empresa
	 * @return int
	 * 
	 * <p> Se usa en el caso de ordenamiento de List o Array. </p>
	 * <ul>
	 * 	<li> -1 Indicará que la clase es menor a la empresa recibida por parametro. </li>
	 * 	<li> 0 Indicará que la clase es igual a la empresa recibida por parametro. </li>
	 * 	<li> 1 Indicará que la clase es mayor a la empresa recibida por parametro. </li>
	 * </ul>
	 * 
	 */
	public int compareTo(Empresa empresa) {
		/* Se devuelve la comparación del nombre de la clase y 
		 * la persona recibida por parametro.*/
		return this.getNombre().compareToIgnoreCase(empresa.getNombre());
	}
	
}
