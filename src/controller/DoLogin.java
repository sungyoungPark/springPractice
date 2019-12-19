package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String customerId = request.getParameter("customerId");
		String customerPWD = request.getParameter("customerPWD");

		// Perform business logic. Return a bean as a result
		CustomerService service = new CustomerService();
		Customer customer = service.findCustomer(customerId,customerPWD); // �α��� Ȯ��
		request.setAttribute("customer", customer);

		String page;
		if (customer == null)
			page = "/view/error.jsp"; //�α��� ���н� error.jsp��
		else
			page = "/view/form.jsp"; //�α��� ������ form.jsp��

		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);

	}

}
