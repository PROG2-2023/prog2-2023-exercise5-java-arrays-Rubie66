package prog2.exercise5.flight.booking.system;
import java.util.Scanner;
import com.sun.tools.javac.parser.ReferenceParser.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Calendar;
/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )throws Exception
    {
    String z;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please give the number of people :");
    int size = sc.nextInt();
    FlightBooking fb = new FlightBooking(size);
    System.out.println("Please write your fullname");
    z = sc.nextLine();
    String sdepart,sreturn,y,u;
    System.out.println("Please give the departureDate (year-month-date) :");
    y = sc.nextLine();
    sdepart = "2022-03-04";
    LocalDate departureDate = LocalDate.parse(sdepart);
    System.out.println("Please give the returnDate (year-month-date) :");
    u = sc.nextLine();
    sreturn = "2022-03-05";
    LocalDate returnDate = LocalDate.parse(sreturn);
    Boolean h = true;
    SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
    Date w = null;
    Date p = null;
    w = dft.parse(sdepart);
    Calendar ca = Calendar.getInstance();
    ca.setTime(w);
    ca.add(Calendar.DATE,2);
    p = ca.getTime();
    LocalDate o = date2LocalDate(p);
    if(o.compareTo(returnDate)>0){
       h=false;
       LocalDate oldReturnDate = returnDate;
       returnDate = o;
       fb.setOldReturnDate(oldReturnDate);
    }
    int m,n;
    String a,b,c,d;
    System.out.println("Please give the number of bookclass(1:First 2:Business 3:Economy) : ");
    a = sc.nextLine();
    System.out.println("Please give the number of tripType(1:One way 2:Return) :");
    b = sc.nextLine();
    System.out.println("Please give the number of tripSource(1:Nanjing 2:Beijing 3:Shanghai 4:Oulu):");
    c = sc.nextLine();
    System.out.println("Please give the number of tripDestination(1:Nanjing 2:Beijing 3:Shanghai 4:Oulu) :");
    d = sc.nextLine();
    System.out.println("Please give the number of childPassengers : ");
    m = sc.nextInt();
    System.out.println("Please give the number of adultPassengers : ");
    n = sc.nextInt();
    String [] fullName = {"Matt Jive", "Sally Fields", "Posh Quattro"};
    String [] gender = {"Male", "Female", "Other"};
    int [] age = {43, 32, 21};
    for(int i=0; i<size; ++i){
      fb.setPassengerFullName(i,fullName[i]);
      fb.setPassengerGender(i, gender[i]);
      fb.setPassengerAge(i, age[i]);
  }

    fb.setDepartureDate(departureDate);
    fb.setReturnDate(returnDate);
    fb.setChildPassengers(m);
    fb.setAdultPassengers(n);
    fb.setBookingClass(a);
    fb.setTripType(b);
    fb.setTripSource(c);
    fb.setTripDestination(c, d);
    Random r = new Random();
    int num1 = r.nextInt(9000)+1000;
    String num2 = num1+"";
    String company = fb.getFlightCompany();
    String flightID = fb.getFlightID();
    String ticketNumber = fb.getTicketNumber();
    double totalTicketPrice = fb.getTotalTicketPrice();
    LocalDate departurDate = fb.getDepartureDate();
    int childPassengers = fb.getChildPassengers();
    int adultPassengers = fb.getAdultPassengers();
    fb.setTotalPassengers(childPassengers, adultPassengers);
    int totalPassengers = fb.getTotalPassengers();

    fb.setDates(h);
    System.out.println(fb);
    sc.close();
  }
    public static LocalDate date2LocalDate(Date date){
      if(null == date){
        return null;
      }
      return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
  }
      
        
    

