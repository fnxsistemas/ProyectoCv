/**
 * 
 */
package com.ipartek.formacion.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Raúl de Roba 13/03/2017
 * 
 * <p> clase que contiene diferentes metodos que pueden ser de utilidad en
 *     diferentes paquetes. </p>
 *
 */
public final class Utils {

	public Utils() {
	}
	
	public static String parseDateString(Date date){
		/* Se declara una variable String para devolver el resultado del casteo. */
		String resultado = "";
		/* Se declara e instancia la clase gregoriana para trabajar con la fecha.*/
		GregorianCalendar calendar = null;
		/* Se asigna las fechas desde y hasta de la clase al gregoriaono.*/
		calendar.setTime(date);	
		/* Se monta la fecha en una variable String 
		   (Enero lo interpreta como mes 0,por lo que se ha de sumar 1).*/
		resultado = calendar.get(Calendar.DAY_OF_MONTH) + "/" + 
		              (calendar.get(Calendar.MONTH) + 1) + "/" + 
		              calendar.get(Calendar.YEAR); 
		/* Se devuelve el resultado del casteo. */
		return resultado;
		
	}

}
