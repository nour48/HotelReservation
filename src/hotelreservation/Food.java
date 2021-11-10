package hotelreservation;
import java.util.Scanner;

public class Food{
    public int ite;
    public int qu;
    public double price;

   public Food(int it,int quantity)
    {
        this.ite=it;
        this.qu=quantity;
        switch(it)
        {
            case 1:price=quantity*15;
                break;
            case 2:price=quantity*13;
                break;
            case 3:price=quantity*17;
                break;
            case 4:price=quantity*19;
                break;
            case 5:price=quantity*10;
                break;
            case 6:price=quantity*10;
                break;
            case 7:price=quantity*10;
                break;
            case 8:price=quantity*31;
                break;
            case 9:price=quantity*38;
                break;
            case 10:price=quantity*12;
                break;
            case 11:price=quantity*16;
                break;
            case 12:price=quantity*30;
                break;
            case 13:price=quantity*25;
                break;
            case 14:price=quantity*27;
                break;
            case 15:price=quantity*40;
                break;
            case 16:price=quantity*37;
                break;
            case 17:price=quantity*25;
                break;
            case 18:price=quantity*25;
                break;
            case 19:price=quantity*20;
                break;
            case 20:price=quantity*13;
                break;
            case 21:price=quantity*12;
                break;
            case 22:price=quantity*14;
                break;
            case 23:price=quantity*14;
                break;
            case 24:price=quantity*17;
                break;
            case 25:price=quantity*15;
                break;
            case 26:price=quantity*15;
                break;
            case 27:price=quantity*15;
                break;
            case 28:price=quantity*15;
                break;
            case 29:price=quantity*15;
                break;
        }
    }


   public String toString(){
       String it=null;
    switch(ite)
        {
            case 1:
                it="Chicken Sandwich";
                break;
            case 2:
                it="Tuna Sandwich";
                break;
            case 3:
                it="Cheese Sandwich";
                break;
            case 4:
                it="Meat Sandwich";
                break;
            case 5:
                it="Chicken Shawarma";
                break;
            case 6:
                it="Meat Shawarma";
                break;
            case 7: 
                it="Falafel";
                break;
            case 8:
                it="Chicken Burger";
                break;
            case 9:
                it="Meat Burger";
                break;
            case 10:
                it="Ceasar Salad";
                break;
            case 11:
                it="Fatoosh";
                break;
            case 12:
                it="Fruit-Viggie Salad";
                break;
            case 13:
                it="Chicken Pasta";
                break;
            case 14:
                it="Fettuccine";
                break;
            case 15:
                it="Mushroom Risotto";
                break;
            case 16:
                it="Shrimp Risotto";
                break;
            case 17:
                it="Korean Noodles";
                break;
            case 18:
                it="Japanese Noodles";
                break;
            case 19:
                it="Tai Noodles";
                break;
            case 20:
                it="coke";
                break;
            case 21:
                it="7up";
                break;
            case 22:
                it="cuppicino";
                break;
            case 23:
                it="double espresso";
                break;
            case 24:
                it="filtered coffee";
                break;
            case 25:
                it="orange juice";
                break;
            case 26:
                it="lemonade";
                break;
            case 27:
                it="carrot juice";
                break;
            case 28:
                it="pineable juice";
                break;
            case 29:
                it="apple juice";
                break;
        }
        return it;
   }
}

