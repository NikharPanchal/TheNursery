package com.thenurserysystem.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thenurserysystem.service.CartService;
import com.thenurserysystem.service.impl.CartServiceImpl;

/**
 * Servlet implementation class DeleteCartDetails
 */
public class DeleteCartDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CartService cs=new CartServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCartDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int cartid=Integer.parseInt(request.getParameter("id"));
		
		int ans=cs.deleteCartDetails(cartid);
		
		response.sendRedirect("Cart.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
