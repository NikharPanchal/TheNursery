package com.thenurserysystem.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thenurserysystem.bean.Product;
import com.thenurserysystem.service.ProductService;
import com.thenurserysystem.service.TheNurseryService;
import com.thenurserysystem.service.impl.ProductServiceImpl;
import com.thenurserysystem.service.impl.TheNurseryServiceImpl;

/**
 * Servlet implementation class DisplayProductServlet
 */
public class DisplayProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductService ps=new ProductServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Product>product=ps.selectProductDetails();
		
		request.setAttribute("ProductData", product);
		
//		RequestDispatcher dispatche=request.getRequestDispatcher("ProductList.jsp");
		
//		dispatche.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
