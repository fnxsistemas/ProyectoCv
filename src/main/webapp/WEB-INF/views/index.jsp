<!-- Se indica que en la página index.jsp no se usará sesión. -->
<%@ page session="false" %>
<!-- Se declara la libreria de JSTL. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!-- Se declara la libreria de SPRING. --> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!-- Se asigna en la variable 'seccion' el nombre de la sección(opción del menu) 
     recogido del fichero i18n.-->
<spring:message var="seccion" code="home.titulo" />
<!-- Se asigna la variable 'seccion' a la página actual una vez que se haya montado 
     los includes, ya que la variable se usa en el include 'header.jsp' y 
     de esta manera se asigna la variable a la página completa incluyendo 
     el 'header.jsp'.  -->
<c:set scope="request" var="seccion" value="${seccion}"/>
<!-- Se asigna las variables de los metas a la página actual.  -->
<c:set scope="request" var="autorMeta" value="Raúl de Roba"/>
<c:set scope="request" var="fechaRevision" value="13/07/17"/>

<!-- Se incluye la cabecera del include 'header.jsp' -->
<jsp:include page="includes/header.jsp" />


<!-- Se incluye el pie del include 'footer.jsp' -->
<jsp:include page="includes/footer.jsp" />
