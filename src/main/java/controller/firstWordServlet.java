package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.WordValidator;

/**
 * Servlet implementation class firstWordServlet
 */
@WebServlet("/firstWordServlet")
public class firstWordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public firstWordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String wordOne = request.getParameter("wordOne");
		final String whichServlet = "first";
		WordValidator firstValidator = new WordValidator(wordOne, whichServlet);
//		PrintWriter writer = response.getWriter();
//		writer.println(firstValidator.toString());
//		writer.close();
		request.setAttribute("firstWordValidator", firstValidator);
		getServletContext().getRequestDispatcher("/resultOne.jsp").forward(request, response);
	}

}
