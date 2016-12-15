//package model;
//

//import database.DBConnector;
//import model.User;
//
//import java.sql.SQLException;
//import java.util.Scanner;
//import java.util.InputMismatchException;
//
//public class mainView {
//
//    private DBConnector db;
//
//    public mainView(){
//        this.db = new DBConnector();
//    }
//
//    public static void main(String[] args) throws SQLException {
//        mainView go = new mainView();
//        go.mainMenu();
//    }
//
//
//
//    public void mainMenu() throws SQLException {
//
//        Scanner input = new Scanner(System.in);
//        do {
//            try {
//                System.out.println("1: Opret bruger");
//                System.out.println("2: Vis alle brugere");
//                System.out.println("3: Slet bruger");
//                System.out.println("4: Opret ny bog");
//
//                int mainMenu = input.nextInt();
//                switch(mainMenu) {
//
//                    case 1:
//                        try {
//                        System.out.print("Indtast fornavn: ");
//                        String fornavn = input.next();
//                        System.out.print("Indtast efternavn: ");
//                        String efternavn = input.next();
//                        System.out.print("Indtast username: ");
//                        String username = input.next();
//                        System.out.print("Indtast email: ");
//                        String email = input.next();
//                        System.out.print("Indtast password: ");
//                        String password = input.next();
//
//                        User u = new User(fornavn, efternavn, username, email, password, true);
//
//
//                        db.addUser(u);
//
//                }catch (Exception e){
//                    e.printStackTrace();
//                        }
//                        break;
//                    case 2:
//                        db.getUsers();
//                        break;
//                    case 3:
//
//                        break;
//                    case 4:
//
//                        break;
//
//                    default:
//                        System.out.println("Det kan du ikke vælge. Vælg mellem 1 og 4");
//                        break;
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("Du kan ikke indtaste bogstaver");
//                input.nextLine();
//            }
//        } while (true);
//    }
//}