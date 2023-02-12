import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CartController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int laptop = Integer.parseInt(request.getParameter("priceLaptop"));
        int mobile = Integer.parseInt(request.getParameter("priceMobile"));

        int singlePriceLaptop = 100;
        int singlePriceMobile = 10;

        int totalPriceLaptop= singlePriceLaptop * laptop;
        int totalPriceMobile= singlePriceMobile * mobile;

        int totalPriceLaptopAndMobile = totalPriceLaptop + totalPriceMobile;

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>E-commerce Page</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println(" Laptop ");
        out.println("Laptop Selected: " + laptop );
        out.println("<br>");
        out.println("Total price of laptop: " + totalPriceLaptop+"$" );
        out.println("<br>");
        out.println("mobile Selected: " + mobile );
        out.println("<br>");
        out.println("Total price of mobile: " + totalPriceMobile+"$" );
        out.println("<br>");
        out.println("<br>");
        out.println("Total price: " + totalPriceLaptopAndMobile+"$" );
        out.println("<br>");
        out.println("<br>");
        out.println("<form method=\"post\" action=\"ProductPage\"> ");
        out.println("<input type=\"submit\" value=\"Update Cart\">");
        out.println("</form>");
        out.println("<br>");
        out.println("<br>");
        out.println("<form method=\"post\" action=\"CheckOut\"> ");
        out.println("<input type=\"submit\" value=\"Check Out\">");
        out.println("</BODY>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
