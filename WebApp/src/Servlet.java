
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletResponse response, String result) throws ServletException, IOException {
		response.getWriter().append(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String date_1 = request.getParameter("Java_d1");
		String date_2 = request.getParameter("Java_d2");
		String date_3 = request.getParameter("Java_d3");
		
		int day = Integer.parseInt(date_1);// TODO Auto-generated method stub
		int month = Integer.parseInt(date_2);
		int year = Integer.parseInt(date_3);
		
		String result = "No";
		
		if (month < 1|| month > 12) //check the month
		{ 
			 result = "Invalid date - Month is not valid. 1";//prints to screen
		}
		
		else {
			if (day <= 0 || day >= 32) //check the day more than 1 and less than 31
			{
				result = "Invalid date - Day is not valid. 2"; //prints to screen
			}			
			else {
				if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 31) { //check if the month should have 30 days
					result = "Invalid date - Day is not valid. 3"; //prints to screen
				}				
				else 
					if (year % 4 != 0 && (month == 2 && day == 29)) //check leap day every 4 year
					{
						result = "Invalid date - Day is not valid. 4.1";//prints to screen// check if leap day
					}
					else if (year % 100 == 0 && (month == 2 && day == 29) && year % 400 != 0)// check leap day every 100 year except 400 800 1200 1600 2000 2400
					{
						result = "Invalid date - Day is not valid. 4.2"; //prints to screen - check if leap day
					}
					else // date is valid
					{
						if (month == 1 || month == 2) 
						{
							month += 12;
							year--;
						}
						int h = (day + ((13 * (month + 1))/5) + (year % 100) + (year % 100)/4 + ((year/100)/4) + (5 * (year/100))) % 7;
						
						if (h == 0) 
				            result = "Day of the week is Saturday";
				        else if (h == 1)
				        	result = "Day of the week is Sunday";
				        else if (h == 2)
				        	result = "Day of the week is Monday";
				        else if (h == 3)
				            result = "Day of the week is Tuesday";
				        else if (h == 4)
				        	result = "Day of the week is Wednesday";
				        else if (h == 5)
				            result = "Day of the week is Thursday";
				        else
				            result = "Day of the week is Friday";
					}
				}
			}
			
		
		doGet(response, result);
	}
}


