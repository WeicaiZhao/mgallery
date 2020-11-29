package com.imooc.mgallery.controller;

import com.imooc.mgallery.service.PaintingService;
import com.imooc.mgallery.utils.PageModel;

import java.io.IOException;

public class PaintingController extends javax.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;
    private PaintingService paintingService = new PaintingService();

    public PaintingController(){
        super();
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //get HTTP data
        String page = request.getParameter("p");
        String rows = request.getParameter("r");
        if (page == null){
            page = "1";
        }
        if (rows == null){
            rows = "6";
        }

        //invoke Service method, get results
        PageModel pageModel = paintingService.pagination(Integer.parseInt(page), Integer.parseInt(rows));
        request.setAttribute("pageModel", pageModel);
        //request transfer to JSP(view) to show data
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
}
