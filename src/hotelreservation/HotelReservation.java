package hotelreservation;

import java.util.ArrayList;
import java.util.Scanner;
public class HotelReservation {

    public static void main(String[] args) {


       
            Scanner sc = new Scanner(System.in);
            int choice, choice2;
            char con;
            done:
            do {
                System.out.println("\nEnter your choice :"
                        + "\n1.Display room details"
                        + "\n2.Display conference details"
                        + "\n3.Display room availability "
                        + "\n4.Display conference room availability"
                        + "\n5.Book room"
                        + "\n6.Book conference room"
                        + "\n7.Order food"
                        + "\n8.Display room booking details"
                        + "\n9.Display conference booking details"
                        + "\n10.Room checkout"
                        + "\n11.Conference room checkout"
                        + "\n12.Cancel room booking"
                        + "\n13.Cancel conference room booking"
                        + "\n14.Exit\n");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room \n4.Deluxe Single Room\n");
                        choice2 = sc.nextInt();
                        Hotel.roomfeatures(choice2);
                        break;
                    case 2:
                        System.out.println("\nChoose room type :"
                                + "\n1.VVVIP Conference Room "
                                + "\n2.VVIP Conference Room "
                                + "\n3.VIP Conference Room"
                                + "\n4.Gold Type Conference Room\n"
                                + "\n5.Bronze Type Conference Room"
                                + "\n6.Standard Conference Room");
                        choice2 = sc.nextInt();
                        Hotel.conferencefeatures(choice2);
                        break;
                    case 3:
                        System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                        choice2 = sc.nextInt();
                        Hotel.roomavailability(choice2);
                        break;
                    case 4:
                        System.out.println("\nChoose room type :"
                                + "\n1.VVVIP Conference Room "
                                + "\n2.VVIP Conference Room "
                                + "\n3.VIP Conference Room"
                                + "\n4.Gold Type Conference Room\n"
                                + "\n5.Bronze Type Conference Room"
                                + "\n6.Standard Conference Room");
                        choice2 = sc.nextInt();
                        Hotel.conferenceavailability(choice2);
                        break;
                    case 5:
                        System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                        choice2 = sc.nextInt();
                        Hotel.bookroom(choice2);
                        break;
                    case 6:
                        System.out.println("\nChoose room type :"
                                + "\n1.VVVIP Conference Room "
                                + "\n2.VVIP Conference Room "
                                + "\n3.VIP Conference Room"
                                + "\n4.Gold Type Conference Room\n"
                                + "\n5.Bronze Type Conference Room"
                                + "\n6.Standard Conference Room");
                        choice2 = sc.nextInt();
                        Hotel.bookConference(choice2);
                        break;
                    case 7:
                        System.out.print("Enter Room Number ");
                        choice2 = sc.nextInt();
                        if (choice2 > 60) {
                            System.out.println("Room doesn't exist");
                        } else if (choice2 > 40) {
                            Hotel.order(choice2 - 41, 4);
                        } else if (choice2 > 30) {
                            Hotel.order(choice2 - 31, 3);
                        } else if (choice2 > 10) {
                            Hotel.order(choice2 - 11, 2);
                        } else if (choice2 > 0) {
                            Hotel.order(choice2 - 1, 1);
                        } else {
                            System.out.println("Room doesn't exist");
                        }
                        break;
                    case 8:
                        System.out.print("Enter Room Number ");
                        choice2 = sc.nextInt();
                        if (choice2 > 60) {
                            System.out.println("Room doesn't exist");
                        } else if (choice2 > 40) {
                            Hotel.displayRoom(choice2 - 41, 4);
                        } else if (choice2 > 30) {
                            Hotel.displayRoom(choice2 - 31, 3);
                        } else if (choice2 > 10) {
                            Hotel.displayRoom(choice2 - 11, 2);
                        } else if (choice2 > 0) {
                            Hotel.displayRoom(choice2 - 1, 1);
                        } else {
                            System.out.println("Room doesn't exist");
                        }
                        break;
                    case 9:
                        System.out.print("Enter Room Number ");
                        choice2 = sc.nextInt();
                        if (choice2 > 70) {
                            System.out.println("Room doesn't exist");
                        } else if (choice2 > 60) {
                            Hotel.displayCon(choice2 - 61, 6);
                        } else if (choice2 > 50) {
                            Hotel.displayCon(choice2 - 51, 5);
                        } else if (choice2 > 40) {
                            Hotel.displayCon(choice2 - 41, 4);
                        } else if (choice2 > 30) {
                            Hotel.displayCon(choice2 - 31, 3);
                        } else if (choice2 > 10) {
                            Hotel.displayCon(choice2 - 11, 2);
                        } else if (choice2 > 0) {
                            Hotel.displayCon(choice2 - 1, 1);
                        } else {
                            System.out.println("Room doesn't exist");
                        }
                        break;
                    case 10:
                        System.out.print("Enter Room Number ");
                        choice2 = sc.nextInt();
                        if (choice2 > 60) {
                            System.out.println("Room doesn't exist");
                        } else if (choice2 > 40) {
                            Hotel.checkoutRoom(choice2 - 41, 4);
                        } else if (choice2 > 30) {
                            Hotel.checkoutRoom(choice2 - 31, 3);
                        } else if (choice2 > 10) {
                            Hotel.checkoutRoom(choice2 - 11, 2);
                        } else if (choice2 > 0) {
                            Hotel.checkoutRoom(choice2 - 1, 1);
                        } else {
                            System.out.println("Room doesn't exist");
                        }
                        break;
                    case 11:
                        System.out.print("Enter Room Number ");
                        choice2 = sc.nextInt();
                        if (choice2 > 70) {
                            System.out.println("Room doesn't exist");
                        } else if (choice2 > 60) {
                            Hotel.checkoutCon(choice2 - 61, 6);
                        } else if (choice2 > 50) {
                            Hotel.checkoutCon(choice2 - 51, 5);
                        } else if (choice2 > 40) {
                            Hotel.checkoutCon(choice2 - 41, 4);
                        } else if (choice2 > 30) {
                            Hotel.checkoutCon(choice2 - 31, 3);
                        } else if (choice2 > 10) {
                            Hotel.checkoutCon(choice2 - 11, 2);
                        } else if (choice2 > 0) {
                            Hotel.checkoutCon(choice2 - 1, 1);
                        } else {
                            System.out.println("Room doesn't exist");
                        }
                        break;
                    case 12:
                        System.out.print("Enter Room Number ");
                        choice2 = sc.nextInt();
                        if (choice2 > 60) {
                            System.out.println("Room doesn't exist");
                        } else if (choice2 > 40) {
                            Hotel.cancellation(choice2 - 41, 4);
                        } else if (choice2 > 30) {
                            Hotel.cancellation(choice2 - 31, 3);
                        } else if (choice2 > 10) {
                            Hotel.cancellation(choice2 - 11, 2);
                        } else if (choice2 > 0) {
                            Hotel.cancellation(choice2 - 1, 1);
                        } else {
                            System.out.println("Room doesn't exist");
                        }
                        break;
                    case 13:
                        System.out.print("Enter Room Number ");
                        choice2 = sc.nextInt();
                        if (choice2 > 70) {
                            System.out.println("Room doesn't exist");
                        } else if (choice2 > 60) {
                            Hotel.cancelCon(choice2 - 61, 6);
                        } else if (choice2 > 50) {
                            Hotel.cancelCon(choice2 - 51, 5);
                        } else if (choice2 > 40) {
                            Hotel.cancelCon(choice2 - 41, 4);
                        } else if (choice2 > 30) {
                            Hotel.cancelCon(choice2 - 31, 3);
                        } else if (choice2 > 10) {
                            Hotel.cancelCon(choice2 - 11, 2);
                        } else if (choice2 > 0) {
                            Hotel.cancelCon(choice2 - 1, 1);
                        } else {
                            System.out.println("Room doesn't exist");
                        }
                        break;
                    case 14:
                        break done;

                }

                System.out.println("\nWould you like to continue? (y/n)");
                con = sc.next().charAt(0);
                if (!(con == 'y' || con == 'Y' || con == 'n' || con == 'N')) {
                    System.out.println("\nWould you like to continue? (y/n)");
                   con = sc.next().charAt(0);
                }

            } while (con == 'y' || con == 'Y');

            
        }

    }

