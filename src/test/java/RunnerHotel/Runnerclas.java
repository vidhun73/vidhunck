package RunnerHotel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

import com.hotel.com.Booked;
import com.hotel.com.Hotelclass;
import com.hotel.com.Payment;
import com.hotel.com.Searchrooms;
import com.hotel.com.SelectHotel;

public class Runnerclas extends com.Baseclass.com.Mini_baseclass{
public static WebDriver driver;
public static void main(String[] args) throws IOException, InterruptedException {
	driver= browserlaunch("chrome");
	urlLaunch("https://adactinhotelapp.com/");
	
	Hotelclass login = new Hotelclass(driver);
  
	SendValues(login.getUsername(),"vidhunck");
   SendValues(login.getPassword(), "IFP065");
   click(login.getLogin());
   System.out.println("logindone");
  
 Searchrooms sr = new Searchrooms(driver);
   
   Singledrop(sr.getLocation(),"visible","Sydney");
   Singledrop(sr.getHotels(),"visible", "Hotel Creek");
   Singledrop(sr.getRoomtype(), "visible", "Double");
   Singledrop(sr.getRoomno(), "visible", "2 - Two");
   SendValues(sr.getDate(), "15/03/2022");
   SendValues(sr.getDateout(), "17/03/2022");
   Singledrop(sr.getAdult(), "visible", "3 - Three");
   Singledrop(sr.getChild(), "visible","1 - One");
   click(sr.getSubmit());
  
   SelectHotel select = new SelectHotel(driver);
  
   RadioButton(select.getRadiobtn()); 
   click(select.getCont());
  
  
  Payment pay = new Payment(driver);
  
  SendValues(pay.getFirstname(),"vidhun");
  SendValues(pay.getLastname(),"ck");
  SendValues(pay.getAddress(),"6/8 mutharunissa begium st");
  SendValues(pay.getCardno(), "1234567891234567");
  Singledrop(pay.getCardtype(), "visible","VISA");
  Singledrop(pay.getMonth(), "visible", "May");
  Singledrop(pay.getYear(), "visible", "2022");
  SendValues(pay.getCvv(), "7354");
  click(pay.getConform());
  
  Booked book= new Booked(driver);
  Scrolldown();
  click(book.getMyitine());
 Thread.sleep(2000);
  RadioButton(book.getIds());
  click(book.getLogout());
  
  Screenshot();
  
  
   
   
   
}

}
