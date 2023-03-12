package prog2.exercise5.flight.booking.system;

import java.time.LocalDate;

public class FlightBooking {
    
    private String flightID;
    private String passengerFullName[] = new String[3];
    private String flightCompany;
    private TripSource tripSource;
    private SourceAirport sourceAirport;
    private TripDestination tripDestination;
    private DestinatationAirport destinationAirport;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;
    private double departingTicketPrice;
    private double returnTicketPrice;
    private double totalTicketPrice;
    private String ticketNumber[] = new String[3];
    private int random1=1000;
    private String f;
    private String m;
    private String n;
    private double base;
    private double taxes;
    private double fees;
    private double charge;
    private BookingClass bookingClass;
    private TripType tripType;
    public static int size;
    private String passengerGender[] = new String[3];
    private int passengerAge[] = new int[3];

    public FlightBooking(int size){
        FlightBooking.size = size;
    }
    public void setFlightCompany(String flightCompany){
        this.flightCompany = flightCompany;
    }
    public String getFlightCompany(){
        return flightCompany;
    }
    public String getFilghtID(){
        this.flightID="FOF"+Integer.toString(random1)+"IN";
        random1++;
        return this.flightID;
    }

    public void setPassengerFullName(int size,String passengerFullName){
        this.passengerFullName[size] = passengerFullName;
    }
    public String getPassengerFullName(int size){
        return passengerFullName[size];
    }

    public void setTripSource(String c){
        while(true){
        switch(c){
            case "1":
            this.tripSource = TripSource.NANJING;
            this.sourceAirport = SourceAirport.NanjingLukouInternationalAirport;
            break;
            case "2":
            this.tripSource = TripSource.BEIJING;
            this.sourceAirport = SourceAirport.BeijingCapitalInternationalAirport;
            break;
            case "3":
            this.tripSource = TripSource.OULU;
            this.sourceAirport = SourceAirport.OuluAirport;
            break;
            case "4":
            this.tripSource = TripSource.HELSINKI;
            this.sourceAirport = SourceAirport.HelsinkiAirport;
            break;
            case "5":
            this.tripSource = TripSource.PARIS;
            this.sourceAirport = SourceAirport.ParisCharlesDeGaulleAirport;
            break;
            case "6":
            this.tripSource = TripSource.Shanghai;
            default:
            System.out.println("Worry!Try again!");
            continue;
        }
        break;
    }
    }
    public TripSource getTripSource(){
        return tripSource;
    }

    public void setSourceAirport(String c){
        while(true){
            switch(c){
                case "1":
                
                this.sourceAirport = SourceAirport.NanjingLukouInternationalAirport;
                break;
                case "2":
                
                this.sourceAirport = SourceAirport.BeijingCapitalInternationalAirport;
                break;
                case "3":
                
                this.sourceAirport = SourceAirport.OuluAirport;
                break;
                case "4":
                
                this.sourceAirport = SourceAirport.HelsinkiAirport;
                break;
                case "5":
                
                this.sourceAirport = SourceAirport.ParisCharlesDeGaulleAirport;
                break;
                case "6":
                this.sourceAirport = SourceAirport.ShanghaiPudongInternationalAirport;
                default:
                System.out.println("Worry!Try again!");
                continue;
            }
            break;
        }
    }
    public SourceAirport getSourceAirport(){
        return sourceAirport;
    }

    public void setTripDestination(String e,String c){
        while(true){
        switch(e){
            case "1":
            if(e.equalsIgnoreCase(c)){
                System.out.println("Trip desitination is same as trip source!Try again!");
                break;
            }
            this.tripDestination = TripDestination.NANJING;
            this.destinationAirport = DestinatationAirport.NanjingLukouInternationalAirport;
            break;
            case "2":
            if(e.equalsIgnoreCase(c)){
                System.out.println("Trip desitination is same as trip source!Try again!");
                break;
            }
            this.tripDestination = TripDestination.BEIJING;
            this.destinationAirport = DestinatationAirport.BeijingCapitalInternationalAirport;
            break;
            case "3":
            if(e.equalsIgnoreCase(c)){
                System.out.println("Trip desitination is same as trip source!Try again!");
                break;
            }
            this.tripDestination = TripDestination.OULU;
            this.destinationAirport = DestinatationAirport.OuluAirport;
            break;
            case "4":
            if(e.equalsIgnoreCase(c)){
                System.out.println("Trip desitination is same as trip source!Try again!");
                break;
            }
            this.tripDestination = TripDestination.HELSINKI;
            this.destinationAirport = DestinatationAirport.HelsinkiAirport;
            break;
            case "5":
            if(e.equalsIgnoreCase(c)){
                System.out.println("Trip desitination is same as trip source!Try again!");
                break;
            }
            this.tripDestination = TripDestination.PARIS;
            this.destinationAirport = DestinatationAirport.ParisCharlesDeGaulleAirport;
            break;
            case "6":
            if(e.equalsIgnoreCase(c)){
                System.out.println("Trip desitination is same as trip source!Try again!");
                break;
            }
            this.tripDestination = TripDestination.Shanghai;
            this.destinationAirport = DestinatationAirport.ShanghaiPudongInternationalAirport;
            break;
            default:
            System.out.println("Worry!Try again!");
            continue;
        }
    
    break;
    }
    }
    public TripDestination getTripDestination(){
        return tripDestination;
    }

    public void setDestinationAirport(String e,String c){
        while(true){
            switch(e){
                case "1":
                if(e.equalsIgnoreCase(c)){
                    System.out.println("Trip desitination is same as trip source!Try again!");
                    break;
                }
                
                this.destinationAirport = DestinatationAirport.NanjingLukouInternationalAirport;
                break;
                case "2":
                if(e.equalsIgnoreCase(c)){
                    System.out.println("Trip desitination is same as trip source!Try again!");
                    break;
                }
                
                this.destinationAirport = DestinatationAirport.BeijingCapitalInternationalAirport;
                break;
                case "3":
                if(e.equalsIgnoreCase(c)){
                    System.out.println("Trip desitination is same as trip source!Try again!");
                    break;
                }
                
                this.destinationAirport = DestinatationAirport.OuluAirport;
                break;
                case "4":
                if(e.equalsIgnoreCase(c)){
                    System.out.println("Trip desitination is same as trip source!Try again!");
                    break;
                }
                
                this.destinationAirport = DestinatationAirport.HelsinkiAirport;
                break;
                case "5":
                if(e.equalsIgnoreCase(c)){
                    System.out.println("Trip desitination is same as trip source!Try again!");
                    break;
                }
                
                this.destinationAirport = DestinatationAirport.ParisCharlesDeGaulleAirport;
                break;
                case "6":
                if(e.equalsIgnoreCase(c)){
                    System.out.println("Trip desitination is same as trip source!Try again!");
                    break;
                }
                
                this.destinationAirport = DestinatationAirport.ShanghaiPudongInternationalAirport;
                break;
                default:
                System.out.println("Worry!Try again!");
                continue;
            }
        
        break;
        }
        }
    
    public DestinatationAirport getDestinationAirport(){
        return destinationAirport;
    }

    public void setDepartureDate(LocalDate departureDate){
        this.departureDate = departureDate;
    }
    public LocalDate getDepartureDate(){
        return departureDate;
    }

    public void setReturnDate(LocalDate returnDate){
        long days = returnDate.toEpochDay() - departureDate.toEpochDay();
        if(days == 1){
            returnDate = returnDate.plusDays(1);
            this.returnDate = returnDate;
        }
        if(days == 0){
            returnDate = returnDate.plusDays(2);
            this.returnDate = returnDate;
        }
    }
    public LocalDate getReturnDate(){
        return returnDate;
    }

    public void setChildPassengers(int childPassengers){
        this.childPassengers = childPassengers;
    }
    public int getChildPassengers(){
        return childPassengers;
    }

    public void setAdultPassengers(int adultPassengers){
        this.adultPassengers = adultPassengers;
    }
    public int getAdultPassengers(){
        return adultPassengers;
    }

    public void setTotalPassengers(int adultPassengers,int childPassengers){
        this.totalPassengers = adultPassengers + childPassengers;
    }
    public int getTotalPassengers(){
        return totalPassengers;
    }

    public void setDepartingTicketPrice(int adults,int child){
        if((((tripSource == TripSource.BEIJING)||(tripSource == TripSource.NANJING)||(tripSource == TripSource.Shanghai))&&((tripDestination == TripDestination.BEIJING)||(tripDestination == TripDestination.NANJING)||(tripDestination == TripDestination.Shanghai)))||(((tripSource == TripSource.OULU)||(tripSource == TripSource.HELSINKI))&&(tripDestination == TripDestination.OULU)||(tripDestination == TripDestination.HELSINKI))){
            base = 300.0;
            taxes = base*0.10;
            fees = base*0.05;
            if(bookingClass == BookingClass.FIRST){
               charge = 250.0; this.departingTicketPrice = (base + taxes + fees + charge)*(adults+child);}
                if(bookingClass == BookingClass.BUSINESS){
                    charge = 150.0;this.departingTicketPrice = (base + taxes + fees + charge)*(adults+child);} 
                    if(bookingClass == BookingClass.ECONOMY){
                        charge = 50.0;this.departingTicketPrice = (base + taxes + fees + charge)*(adults+child);} 
        }else{
            base = 300.0;
            taxes = base*0.15;
            fees = base*0.10;
            if(bookingClass == BookingClass.FIRST){
                charge = 250.0; this.departingTicketPrice = (base + taxes + fees + charge)*(adults+child);}
                if(bookingClass == BookingClass.BUSINESS){
                    charge = 150.0;this.departingTicketPrice = (base + taxes + fees + charge)*(adults+child);} 
                    if(bookingClass == BookingClass.ECONOMY){
                        charge = 50.0;this.departingTicketPrice = (base + taxes + fees + charge)*(adults+child);} 
        }
        
        
    }
    public double getDepartingTicketPrice(){
        return departingTicketPrice;
    }

    public void setReturnTicketPrice(){
        this.returnTicketPrice = departingTicketPrice;
    }
    public double getReturnTicketPrice(){
        return returnTicketPrice;
    }
    public void setTotalTicketPrice(){
        
            if(tripType == TripType.ONE_WAY){
            this.totalTicketPrice = departingTicketPrice ;
            }
            if(tripType == TripType.RETURN){
                this.totalTicketPrice = departingTicketPrice + returnTicketPrice;
            }
        
        
    }
    public double getTotalTicketPrice(){
        return totalTicketPrice;
    }
    public void setTicketNumber(int size){
        if(tripType == TripType.ONE_WAY){
            f = "11";
        }
        if(tripType == TripType.RETURN){
            f = "22";
        }
        if(bookingClass == BookingClass.FIRST){
            m = "F";
        }
        if(bookingClass == BookingClass.BUSINESS){
            m = "B";
        }
        if(bookingClass == BookingClass.ECONOMY){
            m = "E";
        }
        if((((tripSource == TripSource.BEIJING)||(tripSource == TripSource.NANJING)||(tripSource == TripSource.Shanghai))&&((tripDestination == TripDestination.BEIJING)||(tripDestination == TripDestination.NANJING)||(tripDestination == TripDestination.Shanghai)))||(((tripSource == TripSource.OULU)||(tripSource == TripSource.HELSINKI))&&(tripDestination == TripDestination.OULU)||(tripDestination == TripDestination.HELSINKI))){
            n = "DOM";
        }else{
            n = "INT";
        }
        this.ticketNumber[size] = f + m + "ASDF" + n;
    }
    public String getTicketNumber(int size){
        
        return this.ticketNumber[size];
    }
    public void setBookingClass(String a){

        while(true){
        switch(a){
            case "1":
            this.bookingClass = BookingClass.FIRST;
            break;
            case "2":
            this.bookingClass = BookingClass.BUSINESS;
            break;
            case "3":
            this.bookingClass = BookingClass.ECONOMY;
            break;
            default:
            System.out.println("Worry!Try again!");
        }
        break;
   }
}
    public BookingClass getBookingClass(){
        return bookingClass;
    }
    public void setTripType(String b){
        while(true){
        switch(b){
            case "1":
            this.tripType = TripType.ONE_WAY;
            break;
            case "2":
            this.tripType = TripType.RETURN;
            break;
            default:
            System.out.println("Worry!Try again!");
        }
        break;
    }
    }
    public TripType getTripType(){
        return tripType;
    }
    public void setPassengerGender(int size,String passengerGender){
        this.passengerGender[size] = passengerGender;
    }
    public String getPassengerGender(int size){
        return passengerGender[size];
    }
    public void setPassengerAge(int size,int passengerAge){
        this.passengerAge[size] = passengerAge;
    }
    public int getPassengerAge(int size){
        return passengerAge[size];
    }
    public enum BookingClass{
        FIRST,BUSINESS,ECONOMY;
    }
    public enum TripType{
        ONE_WAY,RETURN;
    }
    public enum TripSource{
        NANJING,BEIJING,Shanghai,OULU,HELSINKI,PARIS;
    }
    public enum TripDestination{
        NANJING,BEIJING,Shanghai,OULU,HELSINKI,PARIS;
    }
    public enum SourceAirport{
        NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport, OuluAirport, HelsinkiAirport, ParisCharlesDeGaulleAirport;
    }
    public enum DestinatationAirport{
        NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport, OuluAirport, HelsinkiAirport, ParisCharlesDeGaulleAirport;
    }
   
    }

    
