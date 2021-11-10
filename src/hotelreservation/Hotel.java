package hotelreservation;
import java.util.Scanner;
public class Hotel{
    public static int rN = 2;
    public static String c = "name1";
    public static String T = "con1";
    public static String cN = "conference";
    public static String con = "0";
    public static String tim ="1";
    public static String d="1";
    public static String g = "F";
    public static String c2 = "n2";
    public static String T2 = "con2";
    public static String g2 = "f";
    public static char check = 'n';
    public static DoubleRoom arr1[] = new DoubleRoom[10];
    public static DoubleRoom arr2[] = new DoubleRoom[15];
    public static SingleRoom arr3[] = new SingleRoom[15];
    public static SingleRoom arr4[] = new SingleRoom[20];
    public static Conference array1[] = new Conference[3];
    public static Conference array2[] = new Conference[3];
    public static Conference array3[] = new Conference[4];
    public static Conference array4[] = new Conference[5];
    public static Conference array5[] = new Conference[5];
    public static Conference array6[] = new Conference[5];
    static Scanner sc = new Scanner(System.in);
    
    public static void roomfeatures(int i) {
        switch (i) {
            case 1:
                System.out.println("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:4000 ");
                break;
            case 2:
                System.out.println("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:3000  ");
                break;
            case 3:
                System.out.println("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2200  ");
                break;
            case 4:
                System.out.println("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 ");
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
    }
    public static void conferencefeatures(int i) {
        switch (i) {
            case 1:
                System.out.println("Catering : Yes\nCharge per day:6500\n Fits 150 people ");
                break;
            case 2:
                System.out.println("Catering : No\nCharge per day:4000\n Fits 150 people ");
                break;
            case 3:
                System.out.println("Catering : Yes\nCharge per day:5000\n Fits 100 people ");
                break;
            case 4:
                System.out.println("Catering : No\nCharge per day:3500\n Fits 100 people ");
                break;
            case 5:
                System.out.println("Catering : Yes\nCharge per day:2500\n Fits 50 people ");
                break;
            case 6:
                System.out.println("Catering : No\nCharge per day:1500\n Fits 50 people ");
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
    }
    public static void roomavailability(int i) {
        int count=0;
        int j=0;
        switch (i) {
            case 1:
                for (j = 0; j < arr1.length; j++) {
                    if (arr1[j] == null) {
                        count++;
                    }
                }
                
                break;
            case 2:

                for (j = 0; j < arr2.length; j++) {
                    if (arr2[j] == null) {
                        count++;
                    }
                }
                break;
            case 3:
                for (j = 0; j < arr3.length; j++) {
                    if (arr3[j] == null) {
                        count++;
                    }
                }
                break;
            case 4:
        for (SingleRoom arr4 : arr4) {
            if (arr4 == null) {
                count++;
            }
        }
                break;
        
        }
        System.out.println("Number of rooms available : " + count);
    }
    public static void conferenceavailability(int i) {
        int count=0;
        int j=0;
        switch (i) {
            case 1:
                for (j = 0; j < array1.length; j++) {
                    if (array1[j] == null) {
                        count++;
                    }
                }
                
                break;
            case 2:

                for (j = 0; j < array2.length; j++) {
                    if (array2[j] == null) {
                        count++;
                    }
                }
                break;
            case 3:
                for (j = 0; j < array3.length; j++) {
                    if (array3[j] == null) {
                        count++;
                    }
                }
                break;
            case 4:
                for (j = 0; j < array4.length; j++) {
                    if (array4[j] == null) {
                        count++;
                    }
                }
                break;
            case 5:
                for (j = 0; j < array5.length; j++) {
                    if (array5[j] == null) {
                        count++;
                    }
                }
                break;
            case 6:
                for (j = 0; j < array6.length; j++) {
                    if (array6[j] == null) {
                        count++;
                    }
                }
                break;
        
        }
        System.out.println("Number of rooms available : " + count);
    }
    public static void bookroom(int i) {
        int j;
        int rn = rN;
        switch (i) {
            case 1:
                System.out.println("\nChoose room number from : ");
                for (j = 0; j < arr1.length; j++) {
                    if (arr1[j] == null) {
                        System.out.print(j + 1 + ",");
                    }
                }

                System.out.print("\nEnter room number: ");
                rn = sc.nextInt();
                try {
                    int rn2 = rn - 1;
                    if (arr1[rn2] != null) {
                        throw new notAvailable();
                    }
                    CusInfo(i, rn2);
                } catch (Exception e) {

                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 2:
                System.out.println("\nChoose room number from : ");
                for (j = 0; j < arr2.length; j++) {
                    if (arr2[j] == null) {
                        System.out.print(j + 11 + ",");
                    }
                }

                System.out.print("\nEnter room number: ");
                rn = sc.nextInt();
                try {
                    int rn2 = rn - 11;
                    if (arr2[rn2] != null) {
                        throw new notAvailable();
                    }
                    CusInfo(i, rn2);
                } catch (Exception e) {

                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 3:
                System.out.println("\nChoose room number from : ");
                for (j = 0; j < arr3.length; j++) {
                    if (arr3[j] == null) {
                        System.out.print(j + 31 + ",");
                    }
                }

                System.out.print("\nEnter room number: ");
                rn = sc.nextInt();
                try {
                    int rn2 = rn - 31;
                    if (arr3[rn2] != null) {
                        throw new notAvailable();
                    }
                    CusInfo(i, rn2);
                } catch (Exception e) {

                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 4:
                System.out.println("\nChoose room number from : ");
                for (j = 0; j < arr4.length; j++) {
                    if (arr4[j] == null) {
                        System.out.print(j + 41 + ",");
                    }
                }

                System.out.print("\nEnter room number: ");
                rn = sc.nextInt();
                try {
                    int rn2 = rn - 41;
                    if (arr4[rn2] != null) {
                        throw new notAvailable();
                    }
                    CusInfo(i, rn2);
                } catch (Exception e) {

                    System.out.println("Invalid Option");
                    return;
                }
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }

        System.out.println("Room Booked");

    }
    public static void CusInfo(int i, int rn) {

        System.out.print("\nEnter customer name: ");
        c = sc.next();
        System.out.print("Enter contact number: ");
        T = sc.next();
        System.out.print("Enter gender: ");
        g = sc.next();
        if (i < 3) {
            System.out.print("Enter second customer name: ");
            c2 = sc.next();
            System.out.print("Enter contact number: ");
            T2 = sc.next();
            System.out.print("Enter gender: ");
            g2 = sc.next();
            System.out.print("Enter date: (day/month)");
            d = sc.next();
        }

        switch (i) {
            case 1:
                arr1[rn] = new DoubleRoom(c, T, g, c2, T2, g2, d);
                break;
            case 2:
                arr2[rn] = new DoubleRoom(c, T, g, c2, T2, g2, d);
                break;
            case 3:
                arr3[rn] = new SingleRoom(c, T, g, d);
                break;
            case 4:
                arr4[rn] = new SingleRoom(c, T, g, d);
                break;
            default:
                System.out.println("Wrong option");
                break;
        }
    }
    public static void bookConference(int i) {
       int j;
        int rn = rN;
        switch (i) {
            case 1:
                System.out.println("\nChoose room number from : ");
                for (j = 0; j < array1.length; j++) {
                    if (array1[j] == null) {
                        System.out.print(j + 1 + ",");
                    }
                }

                System.out.print("\nEnter room number: ");
                rn = sc.nextInt();
                try {
                    int rn2 = rn - 1;
                    if (array1[rn2] != null) {
                        throw new notAvailable();
                    }
                    ConInfo(i, rn2);
                } catch (Exception e) {

                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 2:
                System.out.println("\nChoose room number from : ");
                for (j = 0; j < array2.length; j++) {
                    if (array2[j] == null) {
                        System.out.print(j + 11 + ",");
                    }
                }

                System.out.print("\nEnter room number: ");
                rn = sc.nextInt();
                try {
                    int rn2 = rn - 11;
                    if (array2[rn2] != null) {
                        throw new notAvailable();
                    }
                    ConInfo(i, rn2);
                } catch (Exception e) {

                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 3:
                System.out.println("\nChoose room number from : ");
                for (j = 0; j < array3.length; j++) {
                    if (array3[j] == null) {
                        System.out.print(j + 31 + ",");
                    }
                }

                System.out.print("\nEnter room number: ");
                rn = sc.nextInt();
                try {
                    int rn2 = rn - 31;
                    if (array3[rn2] != null) {
                        throw new notAvailable();
                    }
                    ConInfo(i, rn2);
                } catch (Exception e) {

                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 4:
                System.out.println("\nChoose room number from : ");
                for (j = 0; j < array4.length; j++) {
                    if (array4[j] == null) {
                        System.out.print(j + 41 + ",");
                    }
                }

                System.out.print("\nEnter room number: ");
                rn = sc.nextInt();
                try {
                    int rn2 = rn - 41;
                    if (array4[rn2] != null) {
                        throw new notAvailable();
                    }
                    ConInfo(i, rn2);
                } catch (Exception e) {

                    System.out.println("Invalid Option");
                    return;
                }
                break;
                case 5:
                System.out.println("\nChoose room number from : ");
                for (j = 0; j < array5.length; j++) {
                    if (array5[j] == null) {
                        System.out.print(j + 51 + ",");
                    }
                }

                System.out.print("\nEnter room number: ");
                rn = sc.nextInt();
                try {
                    int rn2 = rn - 51;
                    if (array5[rn2] != null) {
                        throw new notAvailable();
                    }
                    ConInfo(i, rn2);
                } catch (Exception e) {

                    System.out.println("Invalid Option");
                    return;
                }
                break;
                case 6:
                System.out.println("\nChoose room number from : ");
                for (j = 0; j < array6.length; j++) {
                    if (array6[j] == null) {
                        System.out.print(j + 61 + ",");
                    }
                }

                System.out.print("\nEnter room number: ");
                rn = sc.nextInt();
                try {
                    int rn2 = rn - 61;
                    if (array6[rn2] != null) {
                        throw new notAvailable();
                    }
                    ConInfo(i, rn2);
                } catch (Exception e) {

                    System.out.println("Invalid Option");
                    return;
                }
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }

        System.out.println("Room Booked");     
        }

    public static void ConInfo(int i, int rn) {

        System.out.print("\nEnter customer name: ");
        c = sc.next();

        System.out.print("Enter contact number: ");
        T = sc.next();
        
        System.out.print("Enter conference name: ");
        cN = sc.next();
        
        System.out.print("Enter conference time: (Should be in minutes) ");
        tim = sc.next();
        
        System.out.print("Enter conference date: (day/month) ");
        d = sc.next();
        
        System.out.print("Enter number of people: ");
        con = sc.next();
        
                switch (i) {
            case 1:
                array1[rn] = new Conference(c, T, cN, tim, d, con);
                break;
            case 2:
                array2[rn] = new Conference(c, T, cN, tim, d, con);
                break;
            case 3:
                array3[rn] = new Conference(c, T, cN, tim, d, con);
                break;
            case 4:
                array4[rn] = new Conference(c, T, cN, tim, d, con);
                break;
            case 5:
                array5[rn] = new Conference(c, T, cN, tim, d, con);
                break;
            case 6:
                array6[rn] = new Conference(c, T, cN, tim, d, con);
                break;
            default:
                System.out.println("Wrong option");
                break;
        }
    }

    public static void order(int rn, int rtype) {
        rn=rN;
        int itemNum, quan;
        char wish = 'n';
        try {
            System.out.println("\n==========\n   Menu:  \n==========\n---Sandwiches & Burgers---\n"
                    + "\n1.Chicken Sandwich\t15SAR"
                    + "\n2.Tuna Sandwich\t\t13SAR"
                    + "\n3.Cheese Sandwich\t17SAR"
                    + "\n4.Meet Sandwich\t\t19SAR"
                    + "\n5.Chicken Shawarma\t10SAR"
                    + "\n6.Meat Shawarma\t\t10SAR"
                    + "\n7.Falafel\t\t10SAR"
                    + "\n8.Chicken Burger\t31SAR"
                    + "\n9.Beef Burger\t\t38SAR\n"
                    + "\n---Salad---\n"
                    + "\n10.Ceasar\t\t12SAR"
                    + "\n11.Fatoosh\t\t16SAR"
                    + "\n12.Fatoosh\t\t30SAR\n"
                    + "\n---Pasta & Noodles---\n"
                    + "\n13.Chicken Pasta\t25SAR"
                    + "\n14.Fettuccine\t\t27SAR"
                    + "\n15.Mashroom Risotto\t40SAR"
                    + "\n16.Shrimp Risotto\t37SAR"
                    + "\n17.Korean Noodles\t25SAR"
                    + "\n18.Japanese Noodles\t25SAR"
                    + "\n19.Tai Noodles\t\t20SAR\n"
                    + "\n---Beverages---\n"
                    + "\n20.Coke\t\t\t13SAR"
                    + "\n21.7up\t\t\t12SAR\n"
                    + "\n---Coffee---\n"
                    + "\n22.Cuppicino\t\t17SAR"
                    + "\n23.Double Espresso\t14SAR"
                    + "\n24.Filtered Coffee\t13SAR\n"
                    + "\n---Juices---\n"
                    + "\n25.Orange\t\t15SAR"
                    + "\n26.Lemonade\t\t15SAR"
                    + "\n27.Carrot\t\t15SAR"
                    + "\n28.Pineable\t\t15SAR"
                    + "\n29.Apple\t\t15SAR\n");
            do {
                System.out.println("What would you like to order?");
                itemNum = sc.nextInt();
                System.out.print("Quantity- ");
                quan = sc.nextInt();

                switch (rtype) {
                    case 1:
                        arr1[rn].food.add(new Food(itemNum, quan));
                        break;
                    case 2:
                        arr2[rn].food.add(new Food(itemNum, quan));
                        break;
                    case 3:
                        arr3[rn].food.add(new Food(itemNum, quan));
                        break;
                    case 4:
                        arr4[rn].food.add(new Food(itemNum, quan));
                        break;
                }
                System.out.println("Do you want to order anything else ? (y/n)");
                wish = sc.next().charAt(0);
            } while (wish == 'y' || wish == 'Y');
        } catch (NullPointerException e) {

            System.out.println("\nRoom not booked");
        } catch (Exception e) {
            System.out.println("Cannot be done");
        }
    }
    public static void displayRoom(int rn, int rtype){
        int j;
        char w;
        switch (rtype) {
            case 1:
                if (arr1[rn] != null) {
                    if (arr1[rn] != null) {
                    System.out.println("Room booked by " + arr1[rn].c
                    + "Room Type " +rtype
                    + "Date "+ arr1[rn].d);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                }
                break;
            case 2:
                if (arr2[rn] != null) {
                    if (arr2[rn] != null) {
                    System.out.println("Room booked by " + arr2[rn].c
                    + "Room Type " +rtype
                    + "Date "+ arr2[rn].d);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                }
                break;
            case 3:
                if (arr3[rn] != null) {
                    if (arr3[rn] != null) {
                    System.out.println("Room booked by " + arr3[rn].c
                    + "Room Type " +rtype
                    + "Date "+ arr3[rn].d);
                } else {
                    System.out.println("Empty Already");
                    return;
                    }
                }
                break;
            case 4:
                if (arr4[rn] != null) {
                    System.out.println("Room booked by " + arr4[rn].c
                    + "Room Type " +rtype
                    + "Date "+ arr4[rn].d);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                break;
            default:
                System.out.println("\nEnter valid option : ");
                break;
        }
    }
    public static void displayCon(int rn, int rtype){
        int j;
        char w;
        switch (rtype) {
            case 1:
                if (array1[rn] != null) {
                    System.out.println("Room booked by " + array1[rn].c
                    + "Date "+ array1[rn].d
                    + "Time "+ array1[rn].tim
                    + "Room Type "+rtype);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                break;
            case 2:
                if (array2[rn] != null) {
                    System.out.println("Room booked by " + array2[rn].c
                    + "Date "+ array2[rn].d
                    + "Time "+ array2[rn].tim
                    + "Room Type "+rtype);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                break;
            case 3:
                if (array3[rn] != null) {
                    System.out.println("Room booked by " + array3[rn].c
                    + "Date "+ array3[rn].d
                    + "Time "+ array3[rn].tim
                    + "Room Type "+rtype);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                break;
            case 4:
                if (array4[rn] != null) {
                    System.out.println("Room booked by " + array4[rn].c
                    + "Date "+ array4[rn].d
                    + "Time "+ array4[rn].tim
                    + "Room Type "+rtype);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                break;
            case 5:
                if (array5[rn] != null) {
                    System.out.println("Room booked by " + array5[rn].c
                    + "Date "+ array5[rn].d
                    + "Time "+ array5[rn].tim
                    + "Room Type "+rtype);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                break;
            case 6:
                if (array6[rn] != null) {
                    System.out.println("Room booked by " + array6[rn].c
                    + "Date "+ array6[rn].d
                    + "Time "+ array6[rn].tim
                    + "Room Type "+rtype);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                break;
            default:
                System.out.println("\nEnter valid option : ");
                break;
        }
    }
    public static void checkoutRoom(int rn, int rtype) {
        int j;
        char w;
        switch (rtype) {
            case 1:
                if (arr1[rn] != null) {
                    System.out.println("Room used by " + arr1[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println("Do you want to checkout ?(y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);
                    arr1[rn] = null;
                    System.out.println("Deallocated succesfully");
                }

                break;
            case 2:
                if (arr2[rn] != null) {
                    System.out.println("Room used by " + arr2[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to checkout ?(y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);
                    arr2[rn] = null;
                    System.out.println("Deallocated succesfully");
                }

                break;
            case 3:
                if (arr3[rn] != null) {
                    System.out.println("Room used by " + arr3[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to checkout ? (y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);
                    arr3[rn] = null;
                    System.out.println("Deallocated succesfully");
                }

                break;
            case 4:
                if (arr4[rn] != null) {
                    System.out.println("Room used by " + arr4[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to checkout ? (y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);
                    arr4[rn] = null;
                    System.out.println("Deallocated succesfully");
                }
                break;
            default:
                System.out.println("\nEnter valid option : ");
                break;
        }
    }
    
    public static void bill(int rn, int rtype) {

        double amount = 0;
        String list[] = {"Sandwich", "Pasta", "Noodles", "Coke"};
        System.out.println("\n*******");
        System.out.println("Bill:");
        System.out.println("*******");

        switch (rtype) {
            case 1:
                amount += 4000;
                System.out.println("\nRoom Charge " + 4000);
                System.out.println("\n===============");
                System.out.println("Food Charges: ");
                System.out.println("===============");
                System.out.println("Quantity | Item | Price");
                System.out.println("-------------------------");
                for (Food obb : arr1[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.ite - 1], obb.qu, obb.price);
                }

                break;
            case 2:
                amount += 3000;
                System.out.println("Room Charge - " + 3000);
                System.out.println("\nFood Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for (Food obb : arr2[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.ite - 1], obb.qu, obb.price);
                }
                break;
            case 3:
                amount += 2200;
                System.out.println("Room Charge - " + 2200);
                System.out.println("\nFood Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for (Food obb : arr3[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.ite - 1], obb.qu, obb.price);
                }
                break;
            case 4:
                amount += 1200;
                System.out.println("Room Charge - " + 1200);
                System.out.println("\nFood Charges: ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for (Food obb : arr4[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.ite - 1], obb.qu, obb.price);
                }
                break;
            default:
                System.out.println("Not valid");
        }
        System.out.println("\nTotal Amount " + amount);
    }
    
    public static void checkoutCon(int rn, int rtype) {
        int j;
        char w;
        switch (rtype) {
            case 1:
                if (array1[rn] != null) {
                    System.out.println("Conference room booked by " + array1[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println("Do you want to checkout ?(y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    payment(rn, rtype);
                    array1[rn] = null;
                    System.out.println("Deallocated succesfully");
                }

                break;
            case 2:
                if (array2[rn] != null) {
                    System.out.println("Conference room booked by " + array2[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to checkout ?(y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    payment(rn, rtype);
                    array2[rn] = null;
                    System.out.println("Deallocated succesfully");
                }

                break;
            case 3:
                if (array3[rn] != null) {
                    System.out.println("Conference room booked by " + array3[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to checkout ? (y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    payment(rn, rtype);
                    array3[rn] = null;
                    System.out.println("Deallocated succesfully");
                }

                break;
            case 4:
                if (array4[rn] != null) {
                    System.out.println("Room used by " + array4[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to checkout ? (y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    payment(rn, rtype);
                    array4[rn] = null;
                    System.out.println("Deallocated succesfully");
                }
            case 5:
                if (array5[rn] != null) {
                    System.out.println("Room used by " + array5[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to checkout ? (y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    payment(rn, rtype);
                    array5[rn] = null;
                    System.out.println("Deallocated succesfully");
                }
            case 6:
                if (array6[rn] != null) {
                    System.out.println("Room used by " + array6[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to checkout ? (y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    payment(rn, rtype);
                    array6[rn] = null;
                    System.out.println("Deallocated succesfully");
                }
                break;
            default:
                System.out.println("\nEnter valid option : ");
                break;
        }
    }
    public static void payment(int rn, int rtype) {
        System.out.println("\n*******");
        System.out.println("Bill:");
        System.out.println("*******");

        switch (rtype) {
            case 1:
                System.out.println("\nRoom Charge::: 6500");
                System.out.println("\n===============");
                break;
            case 2:
                System.out.println("\nRoom Charge::: 4000");
                System.out.println("\n===============");
                break;
            case 3:
                System.out.println("\nRoom Charge::: 5000");
                System.out.println("\n===============");
                break;
            case 4:
                System.out.println("\nRoom Charge::: 3500");
                System.out.println("\n===============");
                break;
            case 5:
                System.out.println("\nRoom Charge::: 2500");
                System.out.println("\n===============");
                break;
            case 6:
                System.out.println("\nRoom Charge::: 1500");
                System.out.println("\n===============");
                break;
            default:
                System.out.println("Not valid");
        }
        
    }
    public static void cancellation(int rn, int rtype) {
        int j;
        char cont;
        switch (rtype) {
            case 1:
                if (arr1[rn] != null) {
                    System.out.println("Room booked by " + arr1[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println("Do you want to cancel ?(y/n)");
                cont = sc.next().charAt(0);
                if (cont == 'y' || cont == 'Y') {
                    arr1[rn] = null;
                    System.out.println("Cancellation is successful");
                }

                break;
            case 2:
                if (arr2[rn] != null) {
                    System.out.println("Room used by " + arr2[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to cancel ?(y/n)");
                cont = sc.next().charAt(0);
                if (cont == 'y' || cont == 'Y') {
                    arr2[rn] = null;
                    System.out.println("Cancellation is successful");
                }

                break;
            case 3:
                if (arr3[rn] != null) {
                    System.out.println("Room used by " + arr3[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to cancel ? (y/n)");
                cont = sc.next().charAt(0);
                if (cont == 'y' || cont == 'Y') {
                    arr3[rn] = null;
                    System.out.println("Cancellation is successful");
                }

                break;
            case 4:
                if (arr4[rn] != null) {
                    System.out.println("Room used by " + arr4[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to cancel ? (y/n)");
                cont = sc.next().charAt(0);
                if (cont == 'y' || cont == 'Y') {
                    bill(rn, rtype);
                    arr4[rn] = null;
                    System.out.println("Cancellation is successful");
                }
                break;
            default:
                System.out.println("\nEnter a valid option : ");
                break;
        }
    }
    public static void cancelCon(int rn, int rtype) {
        int j;
        char cont;
        switch (rtype) {
            case 1:
                if (array1[rn] != null) {
                    System.out.println("Room booked by " + array1[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println("Do you want to cancel ?(y/n)");
                cont = sc.next().charAt(0);
                if (cont == 'y' || cont == 'Y') {
                    array1[rn] = null;
                    System.out.println("Cancellation is successful");
                }

                break;
            case 2:
                if (array2[rn] != null) {
                    System.out.println("Room used by " + array2[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to cancel ?(y/n)");
                cont = sc.next().charAt(0);
                if (cont == 'y' || cont == 'Y') {
                    array2[rn] = null;
                    System.out.println("Cancellation is successful");
                }

                break;
            case 3:
                if (array3[rn] != null) {
                    System.out.println("Room used by " + array3[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to cancel ? (y/n)");
                cont = sc.next().charAt(0);
                if (cont == 'y' || cont == 'Y') {
                    array3[rn] = null;
                    System.out.println("Cancellation is successful");
                }

                break;
            case 4:
                if (array4[rn] != null) {
                    System.out.println("Room used by " + array4[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to cancel ? (y/n)");
                cont = sc.next().charAt(0);
                if (cont == 'y' || cont == 'Y') {
                    bill(rn, rtype);
                    array4[rn] = null;
                    System.out.println("Cancellation is successful");
                }
                break;
            case 5:
                if (array5[rn] != null) {
                    System.out.println("Room used by " + array5[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to cancel ? (y/n)");
                cont = sc.next().charAt(0);
                if (cont == 'y' || cont == 'Y') {
                    bill(rn, rtype);
                    array5[rn] = null;
                    System.out.println("Cancellation is successful");
                }
                break;
            case 6:
                if (array6[rn] != null) {
                    System.out.println("Room used by " + array6[rn].c);
                } else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to cancel ? (y/n)");
                cont = sc.next().charAt(0);
                if (cont == 'y' || cont == 'Y') {
                    bill(rn, rtype);
                    array6[rn] = null;
                    System.out.println("Cancellation is successful");
                }
                break;
            default:
                System.out.println("\nEnter a valid option : ");
                break;
        }
    }

}
