package controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Order;
import service.OrderService;

/**
 * Servlet implementation class DoOrder
 */
@WebServlet("/doOrder")
public class DoOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String[] orders = new String[9];  //파라미터를 배열로 받음

		// OrderService service = new OrderService();
		orders[0] = request.getParameter("cardNumber");
		String cardNum2 = request.getParameter("cardNumber2");
		orders[1] = request.getParameter("creditCard");
		orders[2] = request.getParameter("price");
		orders[3] = request.getParameter("middleInitial");
		orders[4] = request.getParameter("itemNumber");
		orders[5] = request.getParameter("shippingAddress");
		orders[6] = request.getParameter("firstName");
		orders[7] = request.getParameter("description");
		orders[8] = request.getParameter("lastName");

		for (int i = 0; i < orders.length; i++) {
			if (orders[i].equals("")) {  //공백이 들어오면 No Value로
				orders[i] = "NO Value";
			}
		}

		// Perform business logic. Return a bean as a result
		Order order = new Order(orders[0], orders[1], orders[2], orders[3], orders[4], orders[5], orders[6], orders[7],
				orders[8]);
		OrderService service = new OrderService(order);

		request.setAttribute("order", order);  

		String page = "/view/order.jsp";

		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}
