package model;

import database.DBConnector;

import java.util.Scanner;

/**
 * Created by RuneKockLind on 01/12/2016.
 */
public class mainView {
    public static void main(String []args){

    public void mainView(){
        DBConnector db;
        Scanner input = new Scanner(System.in);

        do {
            {
                try{
                    System.out.println("(1) Vis alle brugere");
                    System.out.println("(2) Opret bruger");
                    System.out.println("(3) Slet bruger");
                    System.out.println("(4) Opret ny bog");

                    int mainView = input.nextInt();

                    switch (mainView){

                        case 1:
                            db.getUsers();
                            break;;
                        case 2:
                            System.out.println("Indtast fornavn");
                    }

                }
            }
        }

    }
    }
}
