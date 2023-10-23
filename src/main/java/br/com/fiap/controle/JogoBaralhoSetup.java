package br.com.fiap.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.jogo.model.Baralho;

@WebServlet("/JogoBaralhoSetup")
public class JogoBaralhoSetup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public JogoBaralhoSetup() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Baralho bar = new Baralho();
		HttpSession sessao = request.getSession();
		sessao.setAttribute("baralho", bar);
		
		request.getRequestDispatcher("mesa.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
