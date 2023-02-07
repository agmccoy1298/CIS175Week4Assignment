package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.WordValidator;

/**
 * Servlet implementation class secondWordServlet
 */
@WebServlet("/secondWordServlet")
public class secondWordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public secondWordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String wordTwo = request.getParameter("wordTwo");
		final String whichServlet = "second";
		WordValidator secondValidator = new WordValidator(wordTwo, whichServlet);
		request.setAttribute("secondWordValidator", secondValidator);
		getServletContext().getRequestDispatcher("/resultTwo.jsp").forward(request, response);
	}

}
