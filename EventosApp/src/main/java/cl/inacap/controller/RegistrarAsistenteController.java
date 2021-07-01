package cl.inacap.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.eventosModel.dao.RegistrosDAOLocal;
import cl.inacap.eventosModel.dto.Registro;

/**
 * Servlet implementation class RegistrarAsistenteController
 */
@WebServlet("/RegistrarAsistenteController.do")
public class RegistrarAsistenteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     @Inject
     private RegistrosDAOLocal registrosDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarAsistenteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/vistas/registrarAsistente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<String> errores = new ArrayList<>();
		String nombre = request.getParameter("nombre-txt").trim();
		if(nombre.isEmpty()) {
			errores.add("debe ingresar su nombre");
			
		}
		String apellido = request.getParameter("apellido-txt").trim();
		if(apellido.isEmpty()) {
			errores.add("debe ingresar su apellido");
		}
		String edadtxt = request.getParameter("edad-txt").trim();
		int edad =0;
		if(edadtxt.isEmpty()) {
			errores.add("ingrese su edad");
		}else {
			if(edadtxt.length()<100 || edadtxt.length()>18) {
				errores.add("debe ser mayor de 18");
				
			}
			try {
				edad = Integer.parseInt(edadtxt);
			}catch(Exception ex) {
				errores.add("El valor debe ser numerico");
			}
		}
		String empresa = request.getParameter("empresa-txt");
		if(empresa.isEmpty()) {
			errores.add("debe ingresar una empresa");
		}else if (empresa.length()<6){
			errores.add("debe tener un minimo de 6 caracteres");
		}
		String estado = request.getParameter("estado-select");
		if(estado.isEmpty()) {
			errores.add("debe escoger el estado");
		}
		String region = request.getParameter("region-select");
		if(region.isEmpty()) {
			errores.add("debe escoger una region");
		}
		if(errores.isEmpty()) {
			Registro registro = new Registro();
			registro.setNombre(nombre);
			registro.setApellido(apellido);
			registro.setEdad(edad);
			registro.setEmpresa(empresa);
			registro.setEstado(estado);
			registro.setRegion(region);
			registrosDAO.save(registro);
			request.setAttribute("mensaje", "registro exitoso");
		}else {
			request.setAttribute("Errores", errores);
		}
		
		doGet(request, response);
	}

}
