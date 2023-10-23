package br.com.fiap.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.app.Forca;


@WebServlet("/ForcaSetup")
public class ForcaSetup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ForcaSetup() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Forca forca = new Forca();
		if (forca.getPalavraAberta().contains(" ")) {
			forca.chuta(' ');
		}
		
		HttpSession sessao = request.getSession();
		sessao.setAttribute("forca", forca);
	
		request.getRequestDispatcher("chuta.jsp").forward(request, response);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
