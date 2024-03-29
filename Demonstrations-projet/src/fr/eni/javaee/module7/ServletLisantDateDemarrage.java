package fr.eni.javaee.module7;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLisantDateDemarrage
 */
@WebServlet("/modules/module7/ServletLisantDateDemarrage")
public class ServletLisantDateDemarrage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLisantDateDemarrage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		out.println("La date du dernier démarrage est le : ");
		out.println(sdf.format(ListenerDemarrageAgent.getDateDemarrage()));
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
