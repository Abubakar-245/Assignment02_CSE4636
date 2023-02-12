import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ProductPage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        String user = null;

        if (cookies==null)
        {
            response.sendRedirect("login.html");
        }
        else
        {
            for (Cookie cookie:cookies)
            {
                if (cookie.getName().equals("currentUser"))
                {
                    user = cookie.getValue();
                }
            }
        }

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Shop items</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<h2>Shop items</h2>");
        out.println("<form method=\"post\" action=\"CartController\"> ");
        out.println("<div>");
        out.println("Shirts <br>");
        out.println(" Quantity : <input type=\"number\" name=\"priceShirts\" required> <br>");
        out.println("Price: tk.150 <br>");
        out.println("</div>");
        out.println("<br>");
        out.println("<div>");
        out.println("Shorts <br>");
        out.println(" Quantity : <input type=\"number\" name=\"priceShorts\" required> <br>");
        out.println("Price: tk.120 <br>");
        out.println("</div>");
        out.println("<br>");
        out.println("<div>");
        out.println("Skirts <br>");
        out.println(" Quantity : <input type=\"number\" name=\"priceSkirts\" required> <br>");
        out.println("Price: tk.180 <br>");
        out.println("</div>");
        out.println("<br>");
        out.println("<div>");
        out.println("Pants <br>");
        out.println(" Quantity : <input type=\"number\" name=\"pricePants\" required> <br>");
        out.println("Price: tk.250 <br>");
        out.println("</div>");
        out.println("<br>");
        out.println("<br>");
        out.println("Finished shopping? <input type=\"submit\" value=\"Add all to Cart\">");
        out.println("<br>");
        out.println("<br>");
        out.println("</form>");
        out.println("<form method=\"post\" action=\"Logout\"> <input type=\"submit\" value=\"Log Out\"> </form>");
        out.println("</BODY>");
        out.println("</HTML>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
