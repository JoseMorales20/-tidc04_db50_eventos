package cl.inacap.controller;

import java.io.IOException;
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
 * Servlet implementation class ResumenAsistenteController
 */
@WebServlet("/ResumenAsistenteController.do")
public class ResumenAsistenteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private RegistrosDAOLocal registrosDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResumenAsistenteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Registro> registros = registrosDAO.getAll();
		String filtro = request.getParameter("filtro-txt");
		
		if(filtro != null && !filtro.isEmpty()) {
			registros = registrosDAO.getByEstado(filtro);
		}else {
			registros = registrosDAO.getAll();
		}
		
		request.setAttribute("registros", registros);
		request.getRequestDispatcher("WEB-INF/vistas/resumenAsistente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
