package br.com.fiap.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.app.Forca;

/**
 * Servlet implementation class ForcaProcessa
 */
@WebServlet("/ForcaProcessa")
public class ForcaProcessa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForcaProcessa() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String letra = request.getParameter("letra");
		HttpSession sessao = request.getSession();
		Forca f = (Forca)sessao.getAttribute("forca");
		f.chuta(letra.charAt(0));
		
		request.getRequestDispatcher("chuta.jsp").forward(request, response);
		
		
	}

}
