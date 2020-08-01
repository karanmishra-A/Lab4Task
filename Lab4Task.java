/*   Created by IntelliJ IDEA.
 *   Author: Karan Mishra
 *   Date: 01-08-2020
 *   Time: 12:14
 *   File: Lab4Task.java
 */

package course.lab.labTasks.lab4;

import java.util.Scanner;

public class Lab4Task {
    private static final byte TOTAL_PARTICIPANTS = 100;

    private static void sellTicket(String participantName) {
        String message = "Congratulations, " + participantName + ". " + "See you at the conference!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        byte noOfTicketsSold = 0;
        while (noOfTicketsSold <= TOTAL_PARTICIPANTS) {
            System.out.println("Total Tickets Left: " + (TOTAL_PARTICIPANTS - noOfTicketsSold));
            System.out.println("Enter your name: ");
            Scanner scannerObject = new Scanner(System.in);
            String participantName = scannerObject.nextLine();
            sellTicket(participantName);
            noOfTicketsSold++;
            if (noOfTicketsSold == TOTAL_PARTICIPANTS) {
                System.out.println("Sorry, The tickets are sold-out!");
                scannerObject.close();
                break;
            }
        }
    }
}
