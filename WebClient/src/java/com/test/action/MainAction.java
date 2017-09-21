package com.test.action;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.EJB;

import com.test.ejb.OperationSessionBeanRemote;

@WebServlet(name="Result", urlPatterns={"/Result"})
public class MainAction extends HttpServlet {

    @EJB
    private OperationSessionBeanRemote bean;

    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        double result = 0;
        String ca = request.getParameter("currentAssets");
        String cl = request.getParameter("currentLiabilities");
        String operation = request.getParameter("group1");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            if(operation.equals("currentRatio")){
                result = bean.currentRatio(Double.parseDouble(ca), Double.parseDouble(cl));
            }
            else{
                result = bean.workingCapital(Double.parseDouble(ca), Double.parseDouble(cl));
            }
            out.println("<html>");
            out.println("<head>");
            out.println("<title>EJB JSP Example</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("Result: "+result);
            out.println("</body>");
            out.println("</html>");
            
        } finally {
           out.close();
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
         execute(request, response);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        execute(request, response);
    }

}
