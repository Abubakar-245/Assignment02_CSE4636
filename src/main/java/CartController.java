import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CartController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int shirts=0, shorts=0, skirts=0, pants=0;

        shirts = Integer.parseInt(request.getParameter("priceShirts"));
        shorts = Integer.parseInt(request.getParameter("priceShorts"));
        skirts = Integer.parseInt(request.getParameter("priceSkirts"));
        pants = Integer.parseInt(request.getParameter("pricePants"));

        int shirtPrice = 150;
        int shortPrice = 120;
        int skirtPrice = 180;
        int pantsPrice = 250;

        int totalshirts= shirtPrice * shirts;
        int totalshorts= shortPrice * shorts;
        int totalskirts= skirtPrice * skirts;
        int totalpants= pantsPrice * pants;

        int totalAllproducts = totalshirts + totalshorts + totalskirts + totalpants;

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>E-commerce Page</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println(" Shirts ");
        out.println("Shirts Selected: " + shirts );
        out.println("<br>");
        out.println("Total price of Shirts: tk." + totalshirts );
        out.println("<br>");
        out.println("<br>");
        out.println("Shorts Selected: " + shorts );
        out.println("<br>");
        out.println("Total price of shorts: tk." + totalshorts );
        out.println("<br>");
        out.println("<br>");
        out.println("Skirts Selected: " + skirts );
        out.println("<br>");
        out.println("Total price of skirts: tk." + totalskirts );
        out.println("<br>");
        out.println("<br>");
        out.println("Pants Selected: " + pants );
        out.println("<br>");
        out.println("Total price of pants: tk." + totalpants );
        out.println("<br>");
        out.println("<br>");
        out.println("Total price: tk." + totalAllproducts);
        out.println("<br>");
        out.println("<br>");
        out.println("<form method=\"post\" action=\"ProductPage\"> ");
        out.println("<input type=\"submit\" value=\"Update Cart\">");
        out.println("</form>");
        out.println("<br>");
        out.println("<br>");
        out.println("<form method=\"post\" action=\"CheckOutPage\"> ");
        out.println("<input type=\"submit\" value=\"Check Out\">");
        out.println("</form>");
        out.println("</BODY>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
