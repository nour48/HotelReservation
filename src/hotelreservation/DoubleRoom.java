package hotelreservation;
import java.util.ArrayList;

public class DoubleRoom{
  public static String c="cus";
  public static String T="1";
  public static String d="1";
  public String g;
  public String c2;
  public String T2;
  public String g2;
  public ArrayList<Food> food =new ArrayList<>();
  
  public  DoubleRoom(String cu,String Te,String dat, String gen,String cu2,String te2,String gen2){
        this.c=cu;
        this.T=Te;
        this.d=dat;
        this.g=gen;
        this.c2=cu2;
        this.T2=te2;
        this.g2=gen2;
        
    }
}
