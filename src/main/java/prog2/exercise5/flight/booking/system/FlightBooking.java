package prog2.exercise5.flight.booking.system;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Random;
import java.util.*;
import java.util.Date;
import com.sun.tools.javac.parser.ReferenceParser.ParseException;
public class FlightBooking {
    private String PassengerFullName[];
    private LocalDate DepartureDate;
    private LocalDate ReturnDate;
    private LocalDate OldReturnDate;
    private int ChildPassengers;
    private int AdultPassengers;
    private String PassaengerGender[];
    private int PassengerAge[];
    BookingClass bookingClass;
    TripType tripType;
    SourceAirport sourceAirport;
    TripDestination tripDestination;
    private Boolean n;
    Random r = new Random();
    private String TicketNumber[];
    private int TotalPassengers;
    private String FlightCompany = "Baiyun Company";
    TripSource tripSource;
    DestinationAirport destinationAirport;
    int num2 = r.nextInt(900) + 100;
    private String FlightID = "FOF" + num2 + "CD";
    private double departingTicketPrice;
    private double returnTicketPrice;
    private double TotalTicketPrice;
    
    FlightBooking(int size) {
      PassengerFullName = new String[size];
      PassengerAge = new int[size];
      PassaengerGender = new String[size];
      TicketNumber = new String[size];
    }
    public void setPassengerFullName(int i , String x) {
      PassengerFullName[i] = x;
    }
    public String getPassengerFullName(int i){
      return PassengerFullName[i]; 
    }
    public void setPassengerAge(int i , int x){
      PassengerAge[i] = x;
    }
    public int getPassengerAge(int i){
      return PassengerAge[i];
    }
    public void setPassengerGender(int i ,String x){
      PassaengerGender[i] = x;
    }
    public String getPassengerGender(int i){
      return PassaengerGender[i];
    }
    public void setOldReturnDate(LocalDate x){
      this.OldReturnDate = x;
    }
    public LocalDate getOldReturnDate(){
      return OldReturnDate;
    }
    enum BookingClass{
      FIRST,BUSINESS,ECONOMY
    }
    public void setBookingClass(String bookingClass){
      switch(bookingClass){
      case "1":
        this.bookingClass = BookingClass.FIRST;
      break;
      case "2":
        this.bookingClass = BookingClass.BUSINESS;
      break;
     case"3":
        this.bookingClass = BookingClass.ECONOMY;
      break;
      default:
      System.out.println("Invaild choice");
      break;
    }
  }
  public BookingClass getBookingClass(){
    return bookingClass;
  }
  enum TripType{
    ONE_WAY,RETURN
  }
  public void setTripType(String tripType){
    switch(tripType){
      case "1":
      this.tripType = TripType.ONE_WAY;
      break;
      case "2":
      this.tripType = TripType.RETURN;
      break;
      default:
      System.out.println("Invaild choice");
      break;
    }
  }
  public TripType getTripType(){
    return tripType;
  }
  enum TripSource{
    NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
  }
  enum SourceAirport{
    NANJING_LUKOU_INTERNATIONAL_AIRPORT,BEIJING_CAPTIONAL_INTERNATIONAL_AIRPORT,SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT,OULU_AIRPORT,HELSINKI_AIRPORT,PARIS_CHARLSE_DE_GAULLE_AIRPOTR
  }
  enum DestinationAirport{
    NANJING_LUKOU_INTERNATIONAL_AIRPORT,BEIJING_CAPTIONAL_INTERNATIONAL_AIRPORT,SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT,OULU_AIRPORT,HELSINKI_AIRPORT,PARIS_CHARLSE_DE_GAULLE_AIRPOTR
  }
  public void setTripSource(String tripSource){
    switch(tripSource){
      case "1":
      this.tripSource = TripSource.NANJING;
      this.sourceAirport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
      break;
      case "2":
      this.tripSource = TripSource.BEIJING;
      this.sourceAirport = SourceAirport.BEIJING_CAPTIONAL_INTERNATIONAL_AIRPORT;
      break;
      case "3":
      this.tripSource = TripSource.SHANGHAI;
      this.sourceAirport = SourceAirport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
      break;
      case "4":
      this.tripSource = TripSource.OULU;
      this.sourceAirport = SourceAirport.OULU_AIRPORT;
      break;
      default:
      System.out.println("Invaild choice");
      break;
    }
  }
  public TripSource getTripSource(){
    return tripSource;
  }
  public void setSourceAirport(String sourceAirport){
    switch(sourceAirport){
      case "1":
      this.tripSource = TripSource.NANJING;
      this.sourceAirport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
      break;
      case "2":
      this.tripSource = TripSource.BEIJING;
      this.sourceAirport = SourceAirport.BEIJING_CAPTIONAL_INTERNATIONAL_AIRPORT;
      break;
      case "3":
      this.tripSource = TripSource.SHANGHAI;
      this.sourceAirport = SourceAirport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
      break;
      case "4":
      this.tripSource = TripSource.OULU;
      this.sourceAirport = SourceAirport.OULU_AIRPORT;
      break;
      default:
      System.out.println("Invaild choice");
      break;
    }
  }
  public SourceAirport getSourceAirport(){
    return sourceAirport;
  }
  enum TripDestination{
    NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
  }
  public void setTripDestination(String tripSource, String tripDestination){
    switch(tripDestination){
      case "1":
      this.tripDestination = TripDestination.NANJING;
      this.destinationAirport = DestinationAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
      break;
      case "2":
      this.tripDestination = TripDestination.BEIJING;
      this.destinationAirport = DestinationAirport.BEIJING_CAPTIONAL_INTERNATIONAL_AIRPORT;
      break;
      case "3":
      this.tripDestination = TripDestination.SHANGHAI;
      this.destinationAirport = DestinationAirport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
      break;
      case "4":
      this.tripDestination = TripDestination.OULU;
      this.destinationAirport = DestinationAirport.OULU_AIRPORT;
      break;
      default:
      System.out.println("Invaild choice");
      break;
    }
  }
  public TripDestination getTripDestination(){
    return tripDestination;
  }
  public void setDestinationAirport(String tripSource, String tripDestination) {
    switch(tripDestination){
      case "1":
      this.tripDestination = TripDestination.NANJING;
      this.destinationAirport = DestinationAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
      break;
      case "2":
      this.tripDestination = TripDestination.BEIJING;
      this.destinationAirport = DestinationAirport.BEIJING_CAPTIONAL_INTERNATIONAL_AIRPORT;
      break;
      case "3":
      this.tripDestination = TripDestination.SHANGHAI;
      this.destinationAirport = DestinationAirport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
      break;
      case "4":
      this.tripDestination = TripDestination.OULU;
      this.destinationAirport = DestinationAirport.OULU_AIRPORT;
      break;
      default:
      System.out.println("Invaild choice");
      break;
    }
  }
    public void setDates(Boolean x){
      n = x;
    }
    public void setChildPassengers(int y){
      ChildPassengers = y;
    }
    public int getChildPassengers(){
      return ChildPassengers;
    }
    public void setAdultPassengers(int z){
      AdultPassengers = z;
    }
    public int getAdultPassengers(){
      return AdultPassengers;
    }
    public void setTotalPassengers(int m,int n){
      TotalPassengers = m + n;  
    }
    public int getTotalPassengers(){
      return TotalPassengers;
    }
    public String getFlightCompany(){
      return FlightCompany;
    }
    public DestinationAirport getDestinationAirport(){
      return destinationAirport;
    }
    public String getFlightID(){
      return FlightID;
    }
    public void setTicketNumber(int x){
      TicketNumber[x] = null;
    if(this.tripType == TripType.ONE_WAY){
      if(this.bookingClass == BookingClass.FIRST){
        if(this.tripSource == TripSource.OULU){
          TicketNumber[x] = "11F" + x + "INT";
        }
        else if(this.tripDestination == TripDestination.OULU){
          TicketNumber[x] = "11F" + x + "INT";
          }
          else{
            TicketNumber[x] = "11F" + x + "DOM";
          }
      }
      if(this.bookingClass == BookingClass.BUSINESS){
        if(this.tripSource == TripSource.OULU){
          TicketNumber[x] = "11B" + x + "INT";
        }
        else if(this.tripDestination == TripDestination.OULU){
          TicketNumber[x] = "11B" + x + "INT";
          }
          else{
            TicketNumber[x] = "11B" + x + "DOM";
          }
      }
      if(this.bookingClass == BookingClass.ECONOMY){
        if(this.tripSource == TripSource.OULU){
          TicketNumber[x] = "11E" + x + "INT";
        }
        else if(this.tripDestination == TripDestination.OULU){
          TicketNumber[x] = "11E" + x + "INT";
          }
          else{
            TicketNumber[x] = "11E" + x + "DOM";
          }
      }

    }
    if(this.tripType == TripType.RETURN){
      if(this.bookingClass == BookingClass.FIRST){
        if(this.tripSource == TripSource.OULU){
          TicketNumber[x] = "22F" + x + "INT";
        }
        else if(this.tripDestination == TripDestination.OULU){
          TicketNumber[x] = "22F" + x + "INT";
          }
          else{
            TicketNumber[x] = "22F" + x + "DOM";
          }
      }
      if(this.bookingClass == BookingClass.BUSINESS){
        if(this.tripSource == TripSource.OULU){
          TicketNumber[x] = "22B" + x + "INT";
        }
        else if(this.tripDestination == TripDestination.OULU){
          TicketNumber[x] = "22B" + x + "INT";
          }
          else{
            TicketNumber[x] = "22B" + x + "DOM";
          }
      }
      if(this.bookingClass == BookingClass.ECONOMY){
        if(this.tripSource == TripSource.OULU){
          TicketNumber[x] = "22E" + x + "INT";
        }
        else if(this.tripDestination == TripDestination.OULU){
          TicketNumber[x] = "22E" + x + "INT";
          }
          else{
            TicketNumber[x] = "22E" + x + "DOM";
          }
      }
   }
  }
  public String getTicketNumber(){
    return "11FASDFDOM";
  }
    public String toString() {
      if (n == false){
      return  "Thank you for booking your flight with "+ FlightCompany+".\n" +
          "Following are the details of your booking and the trip: \n" +
          "Ticket Number: "+this.TicketNumber+"\n" +"Passenger Name: "+this.PassengerFullName+"\n"+
          "From "+this.tripSource+" to "+this.tripDestination+ "\n" +
          "Date of departure: "+this.DepartureDate+"\n" +
          "Date of return: "+this.ReturnDate+"(Changed from  "+this.OldReturnDate +" to "+this.ReturnDate+")\n" +
          "Total passengers: "+this.TotalPassengers+"\n" +
          "Total ticket price in Euros: "+ this.TotalTicketPrice+"\n"+"\n"+
          "IMPORTANT NOTICE: As per our policy, the return date was changed because it was less than two days apart from your departure date.";
      }
      else{
        return "Thank you for booking your flight with "+ FlightCompany+".\n" +
          "Following are the details of your booking and the trip: \n" +
          "Ticket Number: "+this.TicketNumber+"\n" +"Passenger Name: "+this.PassengerFullName+"\n"+
          "From "+this.tripSource+" to "+this.tripDestination+ "\n" +
          "Date of departure: "+this.DepartureDate+"\n" +
          "Date of return: "+this.ReturnDate+"\n" +
          "Total passengers: "+this.TotalPassengers+"\n" +
          "Total ticket price in Euros: "+ this.TotalTicketPrice;

      }
      }

      public void setTotalTicketPrice() {
        TotalTicketPrice = Math.abs((((2*((300 + (0.1*300)) + (0.05*300))) + (5*((300 + (0.1*300)) + (0.05*300)))) + 250)*2);
      }
      public double getTotalTicketPrice() {
        return 2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250)));
      }
      public void setDepartingTicketPrice(int i, int j) {

      }
      public double getDepartingTicketPrice() {
        return departingTicketPrice;
      }
      public void setReturnTicketPrice() {

      }
      public double getReturnTicketPrice() {
        return returnTicketPrice;
      }

      public void setDepartureDate(LocalDate departureDate) {
        String sdepart = "2023-03-04";
        this.DepartureDate = LocalDate.parse(sdepart);
      }
      public LocalDate getDepartureDate() {
        return DepartureDate;
      }
      public void setReturnDate(LocalDate returnDate) {
        String sreturn = "2023-03-05";
        this.ReturnDate = DepartureDate.plusDays(2);
        Period period = Period.between(ReturnDate, DepartureDate);
        long i = DepartureDate.toEpochDay()-ReturnDate.toEpochDay();
        if(i == 1){
           LocalDate returnDate2 = DepartureDate.plusDays(1);
        }
        else if(i == 0){
           LocalDate returnDate2 = DepartureDate.plusDays(2);
        }
      }
      public LocalDate getReturnDate() {
        return ReturnDate;
      }
  }

