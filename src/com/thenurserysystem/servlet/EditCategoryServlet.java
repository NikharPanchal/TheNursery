package com.thenurserysystem.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thenurserysystem.bean.Category;
import com.thenurserysystem.bean.User;
import com.thenurserysystem.service.CategoryService;
import com.thenurserysystem.service.TheNurseryService;
import com.thenurserysystem.service.impl.CategoryServiceImpl;
import com.thenurserysystem.service.impl.TheNurseryServiceImpl;

/**
 * Servlet implementation class EditCategoryServlet
 */
public class EditCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CategoryService ns=new CategoryServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditCategoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cat_Id=request.getParameter("id");
		
		System.out.println(cat_Id);
		
		Category cat=ns.fetchCategoryDetails(cat_Id);
	
		System.out.println("category is "+cat);
		
		request.setAttribute("categoryList",cat);
		
		RequestDispatcher dispatche=request.getRequestDispatcher("EditCategory.jsp");
		
		dispatche.forward(request, response);	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
