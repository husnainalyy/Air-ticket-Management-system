package com.example.myfx;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import java.awt.*;
import java.io.*;
import java.net.URI;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;


public class HelloApplication extends Application {
    Random random = new Random();//////
    Scene scn0, scn1, scn2, scn3, scn4, scn5, scn6, scn8, scn9, scn10, scn11, scn12, scn13, scn14, scn15, scn16, scn17, scn18;
    Login login = new Login();
    Button reservations = new Button("Reservations");
    Button payments = new Button("Payment");
    ComboBox flightNumberCombo = new ComboBox<>();
    String selectedFlightNumber;
    ArrayList<Flight> flightlist = new ArrayList<>();
    ArrayList<Passenger> passengersList = new ArrayList<>();
    ArrayList<Ticket> TicketList = new ArrayList<>();
    ArrayList<Reservation> ReservationList = new ArrayList<>();

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Bcatatic Air Booking System");
////////////////////Scene 1/////////////////////////////////////////////////////////
        Button button0 = new Button();
        Button button1 = new Button("Booking");
        Button button2 = new Button("Flight Schedule");
        Button button3 = new Button("Give Feedback");
        Button button4 = new Button("Our reviews");
        Button button5 = new Button("About Us ");
        Button button6 = new Button("Our Destination");
        Button button7 = new Button("Contact Us");
        Button button8 = new Button("Cargo");

        GridPane pane1 = new GridPane();
        pane1.add(button0, 0, 0);
        pane1.add(button1, 1, 0);
        pane1.add(button2, 2, 0);
        pane1.add(button3, 3, 0);
        pane1.add(button4, 4, 0);

        scn1 = new Scene(pane1, 1300, 690);




        button1.setOnAction(e -> {
            displayForm(stage);

        });
        //scene0///////////
        ImageView imageView0 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/top-view-frame-with-plane-sweets.jpg"));
        ImageView imageview01 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/bookback.jpg"));
        imageview01.setFitWidth(400);
        imageview01.setFitHeight(600);
        Button passenger = new Button("Passenger Console");
        Button manager = new Button("Manager Console");
        manager.setPrefHeight(70);
        manager.setPrefWidth(400);
        passenger.setPrefWidth(400);
        passenger.setPrefHeight(70);
        Button button01 = new Button();
        button01.setStyle(
                "-fx-background-image: url('file:///C:/Users/IT%20LAND/Desktop/Bacatatic/myfx/bcatatic-air-high-resolution-logo.png');" +
                        "-fx-background-size: cover;"
        );


        button01.setPrefWidth(400);
        button01.setPrefHeight(250);

        GridPane gridPane0 = new GridPane();
        Label label0 = new Label("Choose User");
        gridPane0.add(button01, 1, 0);

        gridPane0.add(passenger, 1, 2);
        gridPane0.add(manager, 1, 3);
        gridPane0.setAlignment(Pos.CENTER);
        StackPane stackPane0 = new StackPane();
        stackPane0.getChildren().addAll(imageView0, imageview01, gridPane0);
        scn0 = new Scene(stackPane0, 1300, 708);
        imageView0.fitWidthProperty().bind(scn0.widthProperty());
        imageView0.fitHeightProperty().bind(scn0.heightProperty());
        passenger.setOnAction(e -> stage.setScene(scn1));
        setHoverEffect(passenger);
        setHoverEffect(manager);
        label0.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 40px;");
        gridPane0.setVgap(10);
        //manager login scene scn14
        ImageView imageView140 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/top-view-frame-with-plane-sweets.jpg"));
        ImageView imageview141 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/bookback.jpg"));
        imageview141.setFitWidth(400);
        imageview141.setFitHeight(600);
        Label label14 = new Label("Manager Login");
        label14.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 40px;");
        Label label140 = new Label("User Name");
        TextField text140 = new TextField();
        Label label141 = new Label("Enter Password");
        PasswordField text141 = new PasswordField();
        Button forgotPass = new Button("Forgot Password");
        setHoverCustomEffect(forgotPass);
        GridPane gridPane141 = new GridPane();
        gridPane141.add(label14, 1, 0);
        gridPane141.add(label140, 1, 1);
        gridPane141.add(text140, 1, 2);
        gridPane141.add(label141, 1, 3);
        gridPane141.add(text141, 1, 4);
        StackPane stackPane14 = new StackPane();
        gridPane141.setVgap(5);

        Button submit140 = new Button("Submit");
        gridPane141.add(submit140, 1, 5);
        Button back14 = new Button("Back");
        setHoverCustomEffect(back14);
        Button forgetPass = new Button("Forgot Password");
        gridPane141.add(forgetPass, 1, 6);
        setHoverCustomEffect(forgetPass);
        gridPane141.setAlignment(Pos.CENTER);

        ///scene16 forgot password
        ImageView imageView160 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/top-view-frame-with-plane-sweets.jpg"));
        ImageView imageview161 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/bookback.jpg"));
        imageview161.setFitHeight(600);
        imageview161.setFitWidth(400);
        Label label160 = new Label("Enter ID ");
        setDefaultFont(label160);
        TextField textField160 = new TextField();
        Label label161 = new Label("Enter Pet name ");
        setDefaultFont(label161);
        TextField textField161 = new TextField();
        Label newpassword = new Label("New Password");
        setDefaultFont(newpassword);
        PasswordField textField162 = new PasswordField();
        Label confirmpassword = new Label("Confirm Password");
        setDefaultFont(confirmpassword);
        PasswordField textField163 = new PasswordField();
        GridPane gridpane16 = new GridPane();
        Label label16000 = new Label("Change Password");
        label16000.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 20px;");
        gridpane16.add(label16000, 1, 0);

        gridpane16.add(label160, 1, 1);
        gridpane16.add(textField160, 1, 2);
        gridpane16.add(label161, 1, 3);
        gridpane16.add(textField161, 1, 4);
        gridpane16.add(newpassword, 1, 5);
        gridpane16.add(textField162, 1, 6);
        gridpane16.add(confirmpassword, 1, 7);
        gridpane16.add(textField163, 1, 8);
        textField160.setPromptText("Enter id");
        textField161.setPromptText("Enter Pet Name");
        textField162.setPromptText("Enter New Password (10 Characters long)");
        textField163.setPromptText("Confirm Password");
        Button back16 = new Button("Back");
        Button submit16 = new Button("Submit");
        setHoverCustomEffect(back16);
        setHoverCustomEffect(submit16);
        gridpane16.add(submit16, 1, 9);
        gridpane16.add(back16, 1, 10);
        Label label1600 = new Label("Password has been successfully Changed !");
        setDefaultFont(label1600);
        gridpane16.add(label1600, 1, 11);
        label1600.setVisible(false);
        gridpane16.setVgap(5);
        gridpane16.setAlignment(Pos.CENTER);
        StackPane stackPane16 = new StackPane(imageView160, imageview161, gridpane16);
        scn16 = new Scene(stackPane16, 1300, 705);
        imageView160.fitWidthProperty().bind(scn16.widthProperty());
        imageView160.fitHeightProperty().bind(scn16.heightProperty());
        forgetPass.setOnAction(o -> {
            text140.setText("");
            text141.setText("");

            stage.setScene(scn16);
        });
        back16.setOnAction(e -> stage.setScene(scn14));
        submit16.setOnAction(e -> {
            try {
                String id = textField160.getText();
                String petname = textField161.getText();
                String newpassword1 = textField162.getText();
                String confpassword = textField163.getText();


                if (!id.equals(login.getId())) {
                    throw new InvalidIdException("Invalid ID");
                } else if (!petname.equalsIgnoreCase(login.getSecurity())) {
                    throw new InvalidSecurityAnswerException("Invalid pet name");
                } else if (newpassword1.length()!=10) {
                    throw new PasswordLengthExceedException("Password should be 10 characters long");
                } else if (!newpassword1.equals(confpassword)) {
                    throw new PasswordMismatchException("Passwords don't match");
                } else {

                    Login.changepassword(newpassword1);
                    System.out.println("Password changed successfully");
                    textField160.setText("");
                    textField161.setText("");
                    textField162.setText("");
                    textField163.setText("");
                }
                label1600.setVisible(true);

            } catch (InvalidIdException ex) {
                ErrorAlertMethod("Error !", "Invalid Id");

            }catch (InvalidSecurityAnswerException ex){
                ErrorAlertMethod("Error ! ","Invalid Answer");
            }catch (PasswordLengthExceedException ex){
                ErrorAlertMethod("Error ! ","Invalid password Length");
            }catch (PasswordMismatchException ex){
                ErrorAlertMethod("Error !","Password does not match ");
            }





        textField160.setText("");
        textField161.setText("");
        textField162.setText("");
        textField163.setText("");
        });




        /////////////////////
        gridPane141.add(back14, 1, 7);
        gridPane141.setAlignment(Pos.CENTER);
        setDefaultFont(label140);
        setDefaultFont(label141);

        back14.setOnAction(e -> {
            text140.setText("");
            text141.setText("");
            stage.setScene(scn0);
        });
        stackPane14.getChildren().addAll(imageView140, imageview141, gridPane141);
        scn14 = new Scene(stackPane14, 1340, 708);
        imageView140.fitWidthProperty().bind(scn14.widthProperty());
        imageView140.fitHeightProperty().bind(scn14.heightProperty());
        manager.setOnAction(e -> stage.setScene(scn14));
        setHoverCustomEffect(submit140);
        /////////scene15
        submit140.setOnAction(e -> {


            try {
                String username = text140.getText();
                String password = text141.getText();
                Login login = new Login();
                if (username.equals(login.getUsername())&&password.equals(login.getPassword())) {


                    if (username.equals(login.getUsername()) && password.equals(login.getPassword())) {
                        ImageView imageView15 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/top-view-frame-with-plane-sweets.jpg"));


                        reservations.setPrefSize(300, 150);
                        reservations.setStyle("-fx-background-color: black; -fx-text-fill: yellow;");
                        reservations.setOnMouseEntered(o -> {
                            reservations.setStyle("-fx-background-color: purple; -fx-text-fill: yellow;");
                        });
                        reservations.setOnMouseExited(o -> {
                            reservations.setStyle("-fx-background-color: black; -fx-text-fill: yellow;");
                        });


                        Button back15 = new Button("Back");
                        payments.setPrefSize(300, 150);
                        payments.setStyle("-fx-background-color: black; -fx-text-fill: yellow;");
                        back15.setStyle("-fx-background-color: black; -fx-text-fill: yellow;");
                        payments.setOnMouseEntered(o -> {
                            payments.setStyle("-fx-background-color: purple; -fx-text-fill: yellow;");
                        });
                        payments.setOnMouseExited(o -> {
                            payments.setStyle("-fx-background-color: black; -fx-text-fill: yellow;");
                        });

                        back15.setOnMouseEntered(o -> {
                            back15.setStyle("-fx-background-color: purple; -fx-text-fill: yellow;");
                        });
                        back15.setOnMouseExited(o -> {
                            back15.setStyle("-fx-background-color: black; -fx-text-fill: yellow;");
                        });

                        back15.setPrefSize(300, 150);
                        back15.setOnAction(o -> stage.setScene(scn14));

                        GridPane gridPane111 = new GridPane();
                        gridPane111.add(reservations, 1, 1);
                        gridPane111.add(payments, 1, 2);
                        gridPane111.add(back15, 1, 3);
                        gridPane111.setVgap(7);

                        gridPane111.setAlignment(Pos.CENTER);
                        gridPane111.setHgap(10);
                        StackPane stackpane15 = new StackPane();
                        stackpane15.getChildren().addAll(imageView15, gridPane111);
                        scn15 = new Scene(stackpane15, 1300, 708);
                        imageView15.fitWidthProperty().bind(scn15.widthProperty());
                        imageView15.fitHeightProperty().bind(scn15.heightProperty());
                        stage.setScene(scn15);
                        text140.setText("");
                        text141.setText("");


                    }
                }else {
                    try {
                        throw  new Exception("Invalid user name or password");



                    }catch (Exception o){
                        o.printStackTrace();
                        ErrorAlertMethod("Error !" , "Please enter a valid username or password");
                    }
                }

            } catch (NumberFormatException l) {
                ErrorAlertMethod("Error!", "Invalid information - Number format issue");
                l.printStackTrace();

            } catch (Exception l) {
                ErrorAlertMethod("Error!", "Invalid information - General exception occurred");
                l.printStackTrace();
            }
        });
//////////////////scene 17 Reservations
        ImageView imageView170 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/top-view-frame-with-plane-sweets.jpg"));

        Label label170 = new Label("Flight Number");
        Label label171 = new Label("Departure Airport");
        Label label172 = new Label("Arrival Airport");
        Label label173 = new Label("Reservation Number");
        Label label174 = new Label("Passenger Name");
        Label label175 = new Label("Departure Time");
        Label label176 = new Label("Arrival  Time");
        Label label177 = new Label("Ticket Class");
        String labelStyle = "-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 14;";
        label170.setStyle(labelStyle);
        label171.setStyle(labelStyle);
        label172.setStyle(labelStyle);
        label173.setStyle(labelStyle);
        label174.setStyle(labelStyle);
        label175.setStyle(labelStyle);
        label176.setStyle(labelStyle);
        label177.setStyle(labelStyle);

        GridPane gridPane17 = new GridPane();
        Label label178 = new Label("Reservation Record");
        gridPane17.add(label178, 1, 0);
        String labelStylenew = "-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 20;";
        label178.setStyle(labelStylenew);

        gridPane17.setVgap(5);
        gridPane17.add(label170, 1, 1);
        gridPane17.add(label171, 2, 1);
        gridPane17.add(label172, 3, 1);
        gridPane17.add(label173, 4, 1);
        gridPane17.add(label174, 5, 1);
        gridPane17.add(label175, 6, 1);
        gridPane17.add(label176, 7, 1);
        gridPane17.add(label177, 8, 1);
        Button back17 = new Button("Back");
        setHoverCustomEffect(back17);
        gridPane17.add(back17, 12, 4);

        try (Scanner resReader = new  Scanner(Paths.get("C:/Users/IT LAND/Desktop/Bacatatic/Reservations.txt"))) {
            int counter = 2;
            while (resReader.hasNext()) {
                String line = resReader.nextLine().trim(); // Trim to handle empty lines
                if (line.isEmpty()) {
                    continue;
                }
                try (Scanner resreader1 = new Scanner(line)) {
                    // Ensure that there are enough tokens in the line
                    if (resreader1.hasNext()) {
                        String flightnum = resreader1.next();
                        String depair = resreader1.next();
                        String arrair = resreader1.next();
                        String resnum = resreader1.next();
                        String passname = resreader1.next();
                        String deptime = resreader1.next();
                        String arrtime = resreader1.next();
                        String tickclass = resreader1.next();

                        Label lb170 = new Label(flightnum);
                        Label lb171 = new Label(depair);
                        Label lb172 = new Label(arrair);
                        Label lb173 = new Label(resnum);
                        Label lb174 = new Label(passname);
                        Label lb175 = new Label(deptime);
                        Label lb176 = new Label(arrtime);
                        Label lb177 = new Label(tickclass);
                        gridPane17.add(lb170, 1, counter);
                        gridPane17.add(lb171, 2, counter);
                        gridPane17.add(lb172, 3, counter);
                        gridPane17.add(lb173, 4, counter);
                        gridPane17.add(lb174, 5, counter);
                        gridPane17.add(lb175, 6, counter);
                        gridPane17.add(lb176, 7, counter);
                        gridPane17.add(lb177, 8, counter);

                        back17.setOnAction(e -> {
                            System.out.println("Back17 button clicked! Setting scene to scn15.");
                            stage.setScene(scn15);
                        });
                        counter++;
                    } else {
                        System.out.println("Skipping line: " + line + " (not enough tokens)");
                    }
                } catch (Exception o) {
                    o.printStackTrace();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



        StackPane stackPane17 = new StackPane();
        stackPane17.getChildren().addAll(imageView170, gridPane17);
        Scene scn17 = new Scene(stackPane17, 1305, 705);
        imageView170.fitWidthProperty().bind(scn17.widthProperty());
        imageView170.fitHeightProperty().bind(scn17.heightProperty());
        reservations.setOnAction(e -> stage.setScene(scn17));


        //////////////////////////////////////

        TableView tableView5 = new TableView<>();
        TableColumn<Flight, String> flightno = new TableColumn<>("Flight Number");
        flightno.setCellValueFactory(new PropertyValueFactory<>("flightNumber"));

        TableColumn<Flight, String> DestinationAirport = new TableColumn<>("Destination Airport");
        DestinationAirport.setCellValueFactory(new PropertyValueFactory<>("destinationAirport"));

        TableColumn<Flight, String> DepartureAirport = new TableColumn<>("Departure Airport");
        DepartureAirport.setCellValueFactory(new PropertyValueFactory<>("departueAirport"));

        TableColumn<Flight, Date> ArrivalTime = new TableColumn<>("Arrival Time");
        ArrivalTime.setCellValueFactory(new PropertyValueFactory<>("arrivalTime"));

        TableColumn<Flight, Date> DepartureTime = new TableColumn<>("Departure Time");
        DepartureTime.setCellValueFactory(new PropertyValueFactory<>("departureTime"));
        ArrayList<Airport> ArrivalAirportList = Airport.getArrivalAirports();
        ArrayList<Airport> DepartueAirportList = Airport.getDepartureAirports();
        Date df = new Date();
        int flightNumberCounter = 100;
        double[] flightDuration = {1.5, 2.6, 3.8, 9.8, 15.6, 17.9, 20.2, 5.7, 5.9, 8.34};
        for (int i = 0; i < ArrivalAirportList.size(); i++) {// Assigning unique flight number and flight duration to eacg flight
            for (int j = 0; j < DepartueAirportList.size(); j++) {
                double duration = flightDuration[flightNumberCounter % flightDuration.length];
                flightNumberCounter++;
                String flightNumber = "LH" + flightNumberCounter;
                flightlist.add(new Flight(flightNumber, df, df, duration, ArrivalAirportList.get(i).getAirportName(), DepartueAirportList.get(j).getAirportName()));
            }
        }
        Button printSchedule = new Button("Print Schedule");
        printSchedule.setOnAction(e -> {
            try {
                FileWriter writer = new FileWriter("C:/Users/IT LAND/Desktop/Bacatatic/Schedule.txt");

                for (Flight flight : flightlist) {
                    writer.write("Flight Number: " + flight.getFlightNumber() + "\n");
                    for (Airport a : ArrivalAirportList) {
                        writer.write("Arrival Airport: " + a.getAirportName() + "\n");
                    }
                    for (Airport d : DepartueAirportList) {
                        writer.write("Departure Airport: " + d.getAirportName() + "\n");
                    }
                    writer.write("Departure Time: " + flight.getDepartureTime() + "\n");
                    writer.write("Arrival Time: " + flight.getArrivalTime() + "\n");
                    writer.write("\n");
                }
                writer.close();
            } catch (IOException k) {
                System.out.println("print unsuccessfull!");
                k.printStackTrace();
            }


        });

        tableView5.getColumns().addAll(flightno, DestinationAirport, DepartureAirport, ArrivalTime, DepartureTime);
        tableView5.setItems(FXCollections.observableArrayList(flightlist));

        Button back2 = new Button("Back");
        back2.setOnAction(e -> stage.setScene(scn1));
        VBox vBox5 = new VBox(tableView5, back2, printSchedule);
        vBox5.setStyle("-fx-background-color:  #FFD700;");
        setHoverCustomEffect(printSchedule);
        setHoverCustomEffect(back2);


        scn5 = new Scene(vBox5, 1366, 705);


        button2.setOnAction(e -> {
            stage.setScene(scn5);
            System.out.println(flightlist.size());
        });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //scene 6 feedback
        Label feedL1 = new Label(" Passenger Name");
        TextField tx1 = new TextField();
        Label feedL2 = new Label(" Rating");
        TextField tx2 = new TextField();
        Label feedL3 = new Label(" Content");
        TextField tx3 = new TextField();
        Label feedL4 = new Label();
        GridPane pane6 = new GridPane();
        Label feedL0 = new Label("FeedBack");
        feedL0.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 40px;");


        pane6.add(feedL0, 1, 0);
        pane6.add(feedL1, 1, 1);
        pane6.add(tx1, 1, 2);
        pane6.add(feedL2, 1, 3);
        pane6.add(tx2, 1, 4);
        pane6.add(feedL3, 1, 5);
        pane6.add(tx3, 1, 6);
        pane6.add(feedL4, 1, 7);
        setDefaultFont(feedL1);
        setDefaultFont(feedL2);
        setDefaultFont(feedL3);
        setDefaultFont(feedL4);

        ImageView imageView3 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/scene3.jpg"));
        ImageView imageview31 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/bookback.jpg"));
        imageview31.setFitWidth(300);
        imageview31.setFitHeight(600);
        pane6.setVgap(6);
        Button back3 = new Button("Back");
        back3.setOnAction(e -> stage.setScene(scn1));
        setHoverCustomEffect(back3);
        back3.setPrefWidth(200);
        pane6.add(back3, 1, 9);
        StackPane st00 = new StackPane();
        st00.getChildren().addAll(imageView3, imageview31, pane6);
        scn6 = new Scene(st00, 1366, 705);
        button3.setOnAction(e -> stage.setScene(scn6));
        Button feedsub = new Button("Submit");
        setHoverEffect(feedsub);
        feedsub.setPrefWidth(200);

        TableView<Feedback> tableView = new TableView<>();
        ArrayList<Feedback> feedbackList = new ArrayList<>();

        Label label61 = new Label("     Your feedback is valuable for us!");
        pane6.add(label61, 1, 7);
        pane6.setAlignment(Pos.CENTER);

        setHoverEffect(feedsub);
        feedsub.setOnAction(e -> {
            try {
                String name = tx1.getText();
                int rating = Integer.parseInt(tx2.getText());
                String content = tx3.getText();
                Date d1 = new Date();
                String dd1 = d1.toString();
                feedbackList.add(new Feedback(name, content, rating, dd1));
                FileOutputStream obj = new FileOutputStream("C:\\Users\\IT LAND\\Desktop\\Bacatatic\\Feedback.txt", true);
                Formatter myfile = new Formatter(obj);
                myfile.format("\n%s, %s, %d, %s", name, content, rating, dd1);
                myfile.close();


                label61.setText("        Thank you for your feedback !");

                System.out.println(feedbackList.size());
                tableView.setItems(FXCollections.observableArrayList(feedbackList));


                tx1.setText("");
                tx2.setText("");
                tx3.setText("");

            } catch (NumberFormatException ex) {
                ErrorAlertMethod("Error", "Invalid rating. Please enter a valid rating.");

                tx1.setText("");
                tx2.setText("");
                tx3.setText("");

            } catch (Exception ex) {
                ErrorAlertMethod("Error", "An unexpected error occurred.");
                ex.printStackTrace();
            }
        });


        /////feedback

        pane6.add(feedsub, 1, 8);


        imageView3.fitWidthProperty().bind(scn6.widthProperty());
        imageView3.fitHeightProperty().bind(scn6.heightProperty());

        setHeight(back3);
        setHoverCustomEffect(back3);


        setHeight(feedsub);

        setHoverCustomEffect(feedsub);


        //scene 7 reviews
        try {
            Scanner scanner = new Scanner(Paths.get("C:/Users/IT LAND/Desktop/Bacatatic/Feedback.txt"));

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                Scanner obj = new Scanner(line);
                obj.useDelimiter(",\\s");
                try {
                    String passengerName = obj.next();
                    String feedbackContent = obj.next();
                    int rating = obj.nextInt();
                    String dateString = obj.nextLine().trim();

                    Feedback feedback = new Feedback(passengerName, feedbackContent, rating, dateString);
                    feedbackList.add(feedback);
                    tableView.getItems().add(feedback);

                } catch (NoSuchElementException e) {
                    e.getMessage();
                } finally {
                    obj.close();
                }
            }
            System.out.println("feedback list size :" + feedbackList.size());
        } catch (IOException e) {
            e.getMessage();
        } catch (NoSuchElementException e) {
            e.getMessage();
        }
        TableColumn<Feedback, String> nameColumn = new TableColumn<>("Passenger Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("passengerName"));

        TableColumn<Feedback, String> contentColumn = new TableColumn<>("Feedback Content");
        contentColumn.setCellValueFactory(new PropertyValueFactory<>("feedbackContent"));

        TableColumn<Feedback, Integer> ratingColumn = new TableColumn<>("Rating");
        ratingColumn.setCellValueFactory(new PropertyValueFactory<>("rating"));

        TableColumn<Feedback, Date> dateColumn = new TableColumn<>("Submission Date");
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("submissionDate"));
        Button back7 = new Button("Back");
        tableView.getColumns().addAll(nameColumn, contentColumn, ratingColumn, dateColumn);
        tableView.getItems().addAll(feedbackList);
        VBox vbox = new VBox(tableView, back7);
        vbox.setStyle("-fx-background-color: #FFD700;");
        Scene scn7 = new Scene(vbox, 1366, 705);
        button4.setOnAction(e -> stage.setScene(scn7));
        setHeight(back7);
        back7.setPrefWidth(200);
        setHoverCustomEffect(back7);
        back7.setOnAction(e -> stage.setScene(scn1));
        tableView.setItems(FXCollections.observableArrayList(feedbackList));
        //scene 8

        ImageView imageView8 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/top-view-frame-with-plane-sweets.jpg"));
        Text text80 = new Text("About us ");
        text80.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 50;");
        Text airlineInfo1 = new Text(" Welcome aboard our airline!  We're all about making your travel experience extraordinary .");
        Text airlineInfo2 = new Text(" From the moment you step onto our planes,we're here to take you on a journey filled with ");
        Text airlineInfo3 = new Text("convenience, and a  touch of adventure. At our airline, we believe that flying should be");
        Text airlineInfo4 = new Text(" more than just a means of transportation . It should be a opportunity to explore new");
        Text airlineInfo5 = new Text("It should be a opportunity to explore new  horizons, connect with loved ones,and create");
        Text airlineInfo6 = new Text(" unforgettable memories. That's why we're committed to  providing top-notch service that");
        Text airlineInfo7 = new Text(" goes above and beyond your expectations.With a fleet of modern and reliable aircraft, we");
        Text airlineInfo8 = new Text(" prioritize your safety above all.");
        airlineInfo1.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 12;");
        airlineInfo2.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 12;");
        airlineInfo3.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 12;");
        airlineInfo4.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 12;");
        airlineInfo5.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 12;");
        airlineInfo6.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 12;");
        airlineInfo7.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 12;");
        airlineInfo8.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 12;");


        text80.setFont(Font.font("Serif", 50));
        text80.setY(150);
        text80.setX(700);
        airlineInfo1.setX(700);
        airlineInfo1.setY(190);
        airlineInfo2.setX(700);
        airlineInfo2.setY(210);
        airlineInfo3.setX(700);
        airlineInfo3.setY(230);
        airlineInfo4.setX(700);
        airlineInfo4.setY(250);
        airlineInfo5.setX(700);
        airlineInfo5.setY(270);
        airlineInfo6.setX(700);
        airlineInfo6.setY(290);
        airlineInfo7.setX(700);
        airlineInfo7.setY(310);
        airlineInfo8.setX(700);
        airlineInfo8.setY(330);


        Pane pane8 = new Pane();
        ImageView imageView8back = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/left-arrow.png"));
        imageView8back.setFitWidth(30);
        imageView8back.setFitHeight(30);
        Button back8 = new Button("Back", imageView8back);
        Button next8 = new Button("Next");
        setHoverCustomEffect(next8);
        back8.setGraphicTextGap(90);
        pane8.getChildren().addAll(imageView8, back8, next8, text80, airlineInfo1, airlineInfo2, airlineInfo3, airlineInfo4, airlineInfo5, airlineInfo6, airlineInfo7, airlineInfo8);
        scn8 = new Scene(pane8, 1366, 705);
        imageView8.fitWidthProperty().bind(scn8.widthProperty());
        imageView8.fitHeightProperty().bind(scn8.heightProperty());
        back8.setOnAction(e -> stage.setScene(scn1));
        setHeight(back8);
        back8.setPrefWidth(200);
        back8.setLayoutX(700);
        back8.setLayoutY(400);
        next8.setPrefWidth(200);
        next8.setPrefHeight(70);
        next8.setLayoutX(1000);
        next8.setLayoutY(400);
        setHoverCustomEffect(back8);
        next8.setOnAction(e -> stage.setScene(scn12));


        button5.setOnAction(e -> stage.setScene(scn8));
        //scene9

        ImageView imageView91 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/top-view-frame-with-plane-sweets.jpg"));

        ImageView imageView91back = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/left-arrow.png"));
        imageView91back.setFitWidth(30);
        imageView91back.setFitHeight(30);
        Button back91 = new Button("Back", imageView8back);
        back91.setGraphicTextGap(90);
        setHoverCustomEffect(back91);
        setHeight(back91);
        Button citybt1 = new Button();
        Button citybt2 = new Button();
        Button citybt3 = new Button();
        Button citybt4 = new Button();
        Button citybt5 = new Button();
        //doha
        ImageView cityView1 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/360_F_529734392_X8tZTZQHxV35rfShpAbyJ5gzQXxCFzlo.jpg"));
        //islamabad
        ImageView cityView2 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/islamabad-skyline-horizontal-banner-black-260nw-2034188513.jpg"));
        //dubai
        ImageView cityView3 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/dubai.jpg/"));
        //new york
        ImageView cityView4 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/newyork.jpg"));
        //london
        ImageView cityView5 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/london.jpg"));

        cityView1.setFitWidth(200);
        cityView1.setFitHeight(200);
        cityView2.setFitWidth(200);
        cityView2.setFitHeight(200);
        cityView3.setFitWidth(200);
        cityView3.setFitHeight(200);
        cityView4.setFitWidth(200);
        cityView4.setFitHeight(200);
        cityView5.setFitWidth(200);
        cityView5.setFitHeight(200);

        // Adding ImageViews to buttons
        citybt1.setGraphic(cityView1);
        citybt2.setGraphic(cityView2);
        citybt3.setGraphic(cityView3);
        citybt4.setGraphic(cityView4);
        citybt5.setGraphic(cityView5);

        Text text91 = new Text("Click for Details ");
        text91.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 50;");

        text91.setY(150);
        text91.setX(700);

        Pane pane9 = new Pane();
        pane9.getChildren().addAll(imageView91, back91, text91, citybt1, citybt2, citybt3, citybt4, citybt5);
        scn9 = new Scene(pane9, 1366, 705);
        imageView91.fitHeightProperty().bind(scn9.heightProperty());
        imageView91.fitWidthProperty().bind(scn9.widthProperty());
        button6.setOnAction(e -> stage.setScene(scn9));
        back91.setPrefWidth(200);
        citybt1.setPrefHeight(100);
        citybt1.setPrefWidth(200);
        citybt2.setPrefHeight(100);
        citybt2.setPrefWidth(200);
        citybt3.setPrefHeight(100);
        citybt3.setPrefWidth(200);
        citybt4.setPrefHeight(100);
        citybt4.setPrefWidth(200);
        citybt5.setPrefHeight(100);
        citybt5.setPrefWidth(200);
        back91.setLayoutX(300);
        back91.setLayoutY(400);
        citybt1.setLayoutX(720);
        citybt1.setLayoutY(420);
        citybt2.setLayoutX(980);
        citybt2.setLayoutY(420);
        citybt3.setLayoutX(600);
        citybt3.setLayoutY(200);
        citybt4.setLayoutX(850);
        citybt4.setLayoutY(200);
        citybt5.setLayoutX(1100);
        citybt5.setLayoutY(200);
        back91.setOnAction(e -> stage.setScene(scn1));
        iconButton(back91);
        citybt1.setOnAction(e -> openWebpage("https://en.wikipedia.org/wiki/Doha"));
        citybt2.setOnAction(e -> openWebpage("https://en.wikipedia.org/wiki/Islamabad"));
        citybt3.setOnAction(e -> openWebpage("https://en.wikipedia.org/wiki/Dubai"));
        citybt4.setOnAction(e -> openWebpage("https://en.wikipedia.org/wiki/New_York_City"));
        citybt5.setOnAction(e -> openWebpage("https://en.wikipedia.org/wiki/London"));
        ///scene18

        ImageView imageView18=new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/top-view-frame-with-plane-sweets.jpg"));
        Label label180= new Label("Fare");
        Label label181= new Label("Reciept number");
        setDefaultFont(label180);
        setDefaultFont(label181);
        GridPane gridPane18=  new GridPane();
        gridPane18.add(label180,1,1);
        gridPane18.add(label181,2,1);
        Button back18= new Button("Back");
        gridPane18.add(back18,3,5);
        setHoverCustomEffect(back18);
        back18.setOnAction(e->stage.setScene(scn15
        ));
        Scanner paymentread= new Scanner(Paths.get("C:/Users/IT LAND/Desktop/Bacatatic/payment.txt"));
        int count=2;
        while (paymentread.hasNext()){
            Label farelabel= new Label();
            Label recieptlabel= new Label();
            String fare= paymentread.next();
            if (paymentread.hasNext()) {
                String recieptno= paymentread.next();
                farelabel.setText(fare);
                recieptlabel.setText(recieptno);
                gridPane18.add(farelabel,1,count);
                gridPane18.add(recieptlabel,2,count);
                count++;
                // Process the token or do whatever you need to do with it
            } else {
                // Handle the case where there are no more tokens
                System.out.println("No more tokens in the scanner.");
            }
        }
        paymentread.close();
        StackPane stackPane18= new StackPane();
        stackPane18.getChildren().addAll(imageView18,gridPane18);
        scn18= new Scene(stackPane18,1300,705);
        payments.setOnAction(e->stage.setScene(scn18));
        imageView18.fitWidthProperty().bind(scn18.widthProperty());
        imageView18.fitHeightProperty().bind(scn18.heightProperty());
        gridPane18.setVgap(5);
        gridPane18.setHgap(5);







        //scn10 contact us

        ImageView imageView101 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/top-view-frame-with-plane-sweets.jpg"));
        Text text101 = new Text("Contact Us ");
        text101.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 50;");
        text101.setY(150);
        text101.setX(700);
        Pane pane101 = new Pane();

        Button back101 = new Button("Back", imageView8back);
        back8.setGraphicTextGap(90);
        iconButton(back8);


        ImageView facebookImageView = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/5305154_fb_facebook_facebook logo_icon.png"));
        ImageView twitterImageView = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/11053969_x_logo_twitter_new_brand_icon.png"));
        ImageView instagramImageView = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/5279112_camera_instagram_social media_instagram logo_icon.png"));
        ImageView emailImageView = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/134147_mail_email_icon.png"));

        Button facebook = new Button();
        Button twitter = new Button();
        Button instagram = new Button();
        Button email = new Button();
        facebook.setGraphic(facebookImageView);
        twitter.setGraphic(twitterImageView);
        instagram.setGraphic(instagramImageView);
        email.setGraphic(emailImageView);
        facebookImageView.setFitHeight(15);
        facebookImageView.setFitWidth(15);
        twitterImageView.setFitHeight(15);
        twitterImageView.setFitWidth(15);
        instagramImageView.setFitHeight(15);
        instagramImageView.setFitWidth(15);
        emailImageView.setFitHeight(15);
        emailImageView.setFitWidth(15);
        facebook.setOnAction(e -> openWebpage("https://www.facebook.com/"));
        twitter.setOnAction(e -> openWebpage("https://twitter.com/home?lang=en"));
        instagram.setOnAction(e -> openWebpage("https://www.instagram.com/"));
        email.setOnAction(e -> openWebpage("https://mail.google.com/mail/u/0/#inbox"));


        Label facebookLabel = new Label("Facebook: facebook.com/BacataticAir");
        Label twitterLabel = new Label("Twitter: twitter.com/Bacatatic");
        Label instagramLabel = new Label("Instagram: instagram.com/Bacatatic");
        Label emailLabel = new Label("Email: BacataticAir@gmail.com");
        facebookLabel.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 10;");
        twitterLabel.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 10;");
        instagramLabel.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 10;");
        emailLabel.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 10;");


        facebook.setLayoutX(680);
        facebook.setLayoutY(160);
        facebookLabel.setLayoutX(720);
        facebookLabel.setLayoutY(165);

        twitter.setLayoutX(680);
        twitter.setLayoutY(190);
        twitterLabel.setLayoutX(720);
        twitterLabel.setLayoutY(195);

        instagram.setLayoutX(680);
        instagram.setLayoutY(220);
        instagramLabel.setLayoutX(720);
        instagramLabel.setLayoutY(225);

        email.setLayoutX(680);
        email.setLayoutY(250);
        emailLabel.setLayoutX(720);
        emailLabel.setLayoutY(255);


        pane101.getChildren().addAll(imageView101, text101, back101, facebook, twitter, instagram, email,
                facebookLabel, twitterLabel, instagramLabel, emailLabel);
        scn10 = new Scene(pane101, 1366, 705);
        imageView101.fitWidthProperty().bind(scn10.widthProperty());
        imageView101.fitHeightProperty().bind(scn10.heightProperty());
        back101.setOnAction(e -> stage.setScene(scn1));
        setHeight(back101);
        back101.setPrefWidth(200);
        back101.setLayoutX(700);
        back101.setLayoutY(400);

        setHoverCustomEffect(back101);
        button7.setOnAction(e -> stage.setScene(scn10));

        //Scene 11

        ImageView imageView111 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/top-view-frame-with-plane-sweets.jpg"));
        Label l000 = new Label("");
        Label l001 = new Label("Calculate Fare");
        Label l002 = new Label("Select Category");

        Label l111 = new Label("Enter Parcel Weight ");
        TextField t111 = new TextField();
        ObservableList<String> destination = FXCollections.observableArrayList();
        destination.add("islamabad");
        destination.add("london");
        destination.add("newyork");
        destination.add("doha");
        destination.add("dubai");

        ObservableList<String> origin = FXCollections.observableArrayList();
        origin.add("lahore");
        origin.add("faisalabad");
        origin.add("karachi");
        origin.add("multan");

        ComboBox comboBox111 = new ComboBox(destination);
        ComboBox comboBox112 = new ComboBox(origin);
        comboBox112.setPromptText("Select Origin");
        comboBox111.setPromptText("Select Destination");
        RadioButton r111 = new RadioButton("Fast Track");
        RadioButton r112 = new RadioButton("Regular");
        ToggleGroup tg111 = new ToggleGroup();
        r111.setToggleGroup(tg111);
        r112.setToggleGroup(tg111);
        GridPane pane111 = new GridPane();
        Text t1113 = new Text("Bacatatic Cargo");
        Text t1114 = new Text("Batwings Beyond , Lunacy Unbound");
        t1113.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 70;");
        t1114.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 20;");
        pane111.add(t1113, 4, 6);
        pane111.add(t1114, 4, 7);

        pane111.add(l000, 5, 8);
        pane111.add(l001, 7, 9);
        pane111.add(l002, 6, 12);
        setDefaultFont(l002);

        setDefaultFont(l001);
        l001.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 20;");
        pane111.add(l111, 6, 10);
        setDefaultFont(l111);
        pane111.add(t111, 7, 10);
        pane111.add(r111, 7, 12);
        pane111.add(r112, 7, 14);
        pane111.add(comboBox111, 7, 16);
        pane111.add(comboBox112, 7, 18);

        Button back111 = new Button("Back");
        Button submit111 = new Button("Calculate");
        pane111.add(back111, 7, 19);
        pane111.add(submit111, 7, 25);


        setHoverCustomEffect(back111);
        StackPane sp111 = new StackPane();
        sp111.getChildren().addAll(imageView111, pane111);
        Label l113 = new Label("Visit our offices to book ");
        l113.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 20;");
        Label l114 = new Label("> Lahore");
        Label l115 = new Label("> Islamabad");
        Label l116 = new Label("> Karachi");
        Label l117 = new Label("> Multan");
        Label l118 = new Label("> New York");
        Label l119 = new Label("> London ");
        Label l1110 = new Label("> Faisalabad");
        Label l1111 = new Label("> Doha");
        Label l1112 = new Label("> Dubai");

        pane111.add(l113, 17, 1);
        pane111.add(l114, 18, 2);
        pane111.add(l115, 18, 3);
        pane111.add(l116, 18, 4);
        pane111.add(l117, 18, 5);
        pane111.add(l118, 18, 6);
        pane111.add(l119, 18, 7);
        pane111.add(l1110, 18, 8);
        pane111.add(l1111, 18, 9);
        pane111.add(l1112, 18, 10);

        setDefaultFont(l1111);
        setDefaultFont(l1112);

        setDefaultFont(l114);
        setDefaultFont(l115);
        setDefaultFont(l116);
        setDefaultFont(l117);
        setDefaultFont(l118);
        setDefaultFont(l119);
        setDefaultFont(l1110);
        pane111.setVgap(5);


        scn11 = new Scene(sp111, 1366, 705);
        setHoverCustomEffect(submit111);
        imageView111.fitHeightProperty().bind(scn11.heightProperty());
        imageView111.fitWidthProperty().bind(scn11.widthProperty());
        back111.setOnAction(e -> stage.setScene(scn1));
        Label l112 = new Label();
        Text fare = new Text();
        submit111.setOnAction(e -> {
            String dest = null;
            double weight = 0;
            boolean type = false;
            String origi = null;


            try {
                l112.setText("");
                fare.setText("");
                weight = Double.parseDouble(t111.getText());
                dest = comboBox111.getValue().toString();
                origi = comboBox112.getValue().toString();
                RadioButton selectedtype = (RadioButton) tg111.getSelectedToggle();
                type = Boolean.parseBoolean(selectedtype.getText());

                l112.setText("Your Fare will be ");
                l112.setFont(Font.font("Arial",16));
                double f = Cargo.cargofare(weight, dest, type, origi);
                fare.setText(Double.toString(f));
                fare.setFont(Font.font("Arial",16));
                pane111.add(l112, 7, 20);
                pane111.add(fare, 7, 22);
                if (t111.getText().equals("")) {
                    throw new EmptyFieldException();
                }

                if (weight < 1 || weight > 100) {
                    throw new InvalidWeightException("Weight must be between 1-100kg");
                }
                t111.setText("");
                comboBox111.setValue(null);
                comboBox112.setValue(null);
                tg111.selectToggle(null);


            } catch (NumberFormatException | InvalidWeightException o) {
                ErrorAlertMethod("Error !", "Enter valid weight (1-100kg)");
                o.printStackTrace();
                t111.setText("");
            } catch (EmptyFieldException eo) {
                ErrorAlertMethod("Error", "fill all the field please");

            }


        });
        //scene12


        ImageView hitlerview = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/hitler.jpg"));
        Button hitler = new Button("Back");
        setHoverCustomEffect(hitler);

        hitlerview.setFitWidth(300);
        hitlerview.setFitHeight(500);

        Text t121 = new Text("Our Founder's Vision");
        Text t122 = new Text("Today our world suffers from a cancer called Zionism . It is my dream to create an Airline ");
        Text t123 = new Text("named Bacatatic Air . This airline will provide safe and comfortable airtravel to anti-semites .");
        Text t124 = new Text("Special discounts will be provided to anti-semites and jews are not welcome here . I am not ashamed ");
        Text t125 = new Text("of my action against the jews . what i did is a blessing to all mankind . Killing the jews in the gas ");
        Text t126 = new Text("Chamber was the best part of it . So grab your nearest jew and gas him !");
        Text t127 = new Text("----Adolf Hitler (late) ");
        Text t128 = new Text("Disclaimer ! No jews were hurt in the development of the System (except Kanz-ul-Eman)");
        t121.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 30;");
        t122.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 15;");
        t123.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 15;");
        t124.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 15;");
        t125.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 15;");
        t126.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 15;");
        t127.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 12;");
        t128.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 15; -fx-text-fill: red;");///////////////
        t128.setFill(Color.RED);

        t121.setX(500);
        t121.setY(190);
        t122.setX(500);
        t122.setY(210);
        t123.setX(500);
        t123.setY(230);
        t124.setX(500);
        t124.setY(250);
        t125.setX(500);
        t125.setY(270);
        t126.setX(500);
        t126.setY(290);
        t127.setX(500);
        t127.setY(310);
        t128.setX(500);
        t128.setY(330);
        hitler.setLayoutY(370);
        hitler.setLayoutX(500);
//
        StackPane.setMargin(hitlerview, new Insets(0, 750, 0, 0));
        hitler.setOnAction(e -> stage.setScene(scn1));


        Pane pane121 = new Pane(t121, t122, t123, t124, t125, t126, t127, t128, hitler);
        StackPane sp121 = new StackPane(hitlerview, pane121);
        scn12 = new Scene(sp121, 1366, 705);
        scn12.getRoot().setStyle("-fx-background-color: #FFD700;");

//scene 13 payment
        ImageView imageView131 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/top-view-frame-with-plane-sweets.jpg"));
        ImageView imageView132 = new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/qr_code_barcode.jpg"));
        imageView131.setFitHeight(100);
        imageView131.setFitWidth(100);
        Label l131 = new Label("Enter reciept Number");
        TextField t131 = new TextField();

        t131.setPromptText("Number should be 10 digits long atleast");
        setDefaultFont(l131);
        Button print = new Button("Show Ticket");
        Button back131 = new Button("Back");


        print.setOnAction(e -> {
            String receipt = t131.getText();
            Long recieptNum;
            try {
                recieptNum = Long.parseLong(receipt);
                String recieptnumber = String.valueOf(recieptNum);
                if (recieptnumber.length() == 10) {
                    try {
                        FileWriter reciept = new FileWriter("C:/Users/IT LAND/Desktop/Bacatatic/payment.txt", true);
                        reciept.write(recieptnumber + ", ");
                        reciept.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                }
                    t131.setText("");
                    if (recieptnumber.length() != 10) {
                        ErrorAlertMethod("Invalid Reciept Number", "Please enter a valid reciept number(10 digit).");
                        return;

                    }
                } catch(NumberFormatException ex){
                    ErrorAlertMethod("Invalid Reciept Number", "Please enter a valid reciept number (non-negative integer).");
                    return;
                }


            printTicket(stage);
            stage.setScene(scn4);

        });
        setHoverCustomEffect(print);
        GridPane pane131 = new GridPane();
        pane131.add(l131, 1, 1);
        pane131.add(t131, 1, 2);
        pane131.add(print, 1, 3);
        Label l132 = new Label("Scan this Qr code and Pay for Your ticket");
        Label l133 = new Label("Enter the Reciept Number after Payment to confirm your ticket");
        pane131.add(l132, 1, 4);
        pane131.add(l133, 1, 5);
        pane131.add(back131, 1, 6);
        setHoverCustomEffect(back131);
        back131.setOnAction(e -> stage.setScene(scn1));

        setDefaultFont(l132);
        setDefaultFont(l133);
        pane131.setVgap(10);


        StackPane stackPane131 = new StackPane();
        stackPane131.getChildren().addAll(imageView131, imageView132, pane131);
        scn13 = new Scene(stackPane131, 1366, 705);
        imageView131.fitHeightProperty().bind(scn13.heightProperty());
        imageView131.fitWidthProperty().bind(scn13.widthProperty());


        //styling
        DropShadow shadow = new DropShadow();
        Text text10 = new Text("Bcatatic Air");
        Text text11 = new Text("Batwings Beyond , Lunacy Unbound");
        text10.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 70;");
        text11.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 20;");

        text10.setX(310);
        text11.setX(320);
        text10.setY(400);
        text11.setY(430);
        button5.setLayoutX(1000);
        button6.setLayoutX(1000);
        button7.setLayoutX(1000);
        button5.setLayoutY(300);
        button6.setLayoutY(400);
        button7.setLayoutY(500);
        button8.setLayoutY(600);
        button8.setLayoutX(1000);
        setHoverCustomEffect(button8);
        setHeight(button8);
        button8.setPrefWidth(314);
        button8.setOnAction(e -> stage.setScene(scn11));


        Image image = new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/top-view-frame-with-plane-sweets.jpg");
        ImageView imageView = new ImageView(image);

        Pane pane = new Pane();
        Button back = new Button("Back");
        setHoverCustomEffect(back);


        pane.getChildren().addAll(imageView, text11, text10, button5, button6, button7, button8, back, pane1);
        back.setOnAction(e -> stage.setScene(scn0));
        back.setLayoutX(100);
        back.setLayoutY(600);
        scn1 = new Scene(pane, 1366, 705);
        imageView.fitWidthProperty().bind(scn1.widthProperty());
        imageView.fitHeightProperty().bind(scn1.heightProperty());
        //new
        stage.getIcons().add(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/631546_bat_batman_hero_man_saver_icon.png"));
        button0.setStyle(
                "-fx-background-image: url('file:///C:/Users/IT%20LAND/Desktop/Bacatatic/myfx/bcatatic-air-high-resolution-logo.png');" +
                        "-fx-background-size: cover;"
        );
        System.out.println("Absolute path to image: " + new File("C:/Users/IT LAND/Desktop/Bacatatic/myfx/bcatatic-air-high-resolution-logo.png").getAbsolutePath());





        setHeight(button0);
        setHeight(button1);
        setHeight(button2);
        setHeight(button3);
        setHeight(button4);
        setHeight(button5);
        setHeight(button6);
        setHeight(button7);
        button0.setPrefSize(113, 70);

        button1.setPrefWidth(314);
        button2.setPrefWidth(313);
        button3.setPrefWidth(313);
        button4.setPrefWidth(314);
        button5.setPrefWidth(314);
        button6.setPrefWidth(314);
        button7.setPrefWidth(314);
        button1.toFront();
        button2.toFront();
        button3.toFront();


        setHoverEffect(button1);
        setHoverEffect(button2);
        setHoverEffect(button3);
        setHoverEffect(button4);
        setHoverCustomEffect(button5);
        setHoverCustomEffect(button6);
        setHoverCustomEffect(button7);

        stage.setScene(scn0);
        stage.show();

    }




    private void setHoverEffect(Button button) {

        button.setStyle("-fx-background-color: black; -fx-text-fill: yellow; -fx-background-radius: 0; -fx-font-size: 20px;");

        button.setOnMouseEntered(event -> {

            button.setStyle("-fx-background-color: purple;  -fx-background-color: yellow; -fx-background-radius: 0; -fx-font-size: 20px;");
        });

        button.setOnMouseExited(event -> {

            button.setStyle("-fx-background-color: black; -fx-text-fill: yellow; -fx-background-radius: 0; -fx-font-size: 20px;");
        });
    }
    private void iconButton(Button button) {
        Image backIcon = new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/left-arrow.png");
        ImageView imageView = new ImageView(backIcon);


        double graphicTextGap = 90;

        // Set the width and height for the ImageView
        imageView.setFitWidth(24);
        imageView.setFitHeight(24);

        button.setGraphic(imageView);
        button.setGraphicTextGap(graphicTextGap);

        // Set the width and height for the button
        button.setPrefWidth(200);
        button.setPrefHeight(70);
    }
    private void setHoverCustomEffect(Button button) {

        button.setStyle("-fx-background-color: black; -fx-text-fill: yellow; -fx-background-radius: 15; -fx-border-radius: 15; -fx-font-size: 20px;");

        button.setOnMouseEntered(event -> {

            button.setStyle("-fx-background-color: purple; -fx-text-fill: yellow; -fx-background-radius: 15; -fx-border-radius: 15; -fx-font-size: 20px;");
        });

        button.setOnMouseExited(event -> {

            button.setStyle("-fx-background-color: black; -fx-text-fill: yellow; -fx-background-radius: 15; -fx-border-radius: 15; -fx-font-size: 20px;");
        });
    }
    private void openWebpage(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void setHeight(Button button) {
        button.setPrefHeight(70);
    }


    public static void main(String[] args) {
        launch(args);
    }

    private Flight getSelectedFlight(String flightNumber) {
        for (Flight flight : this.flightlist) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        return null;
    }
    private void ErrorAlertMethod(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText("Error!");
        alert.setContentText(content);
        alert.show();
    }

    public void displayForm(Stage stage){

        Label label1 = new Label("Name :");
        TextField tf1 = new TextField();
        Label label2 = new Label("Age :");
        TextField tf2 = new TextField();
        Label label3 = new Label("Email:");
        TextField tf3 = new TextField();
        Label label4 = new Label("Phone:");
        TextField tf4 = new TextField();
        Label label5 = new Label("Ticket Class:");
        RadioButton rbt1 = new RadioButton("Economy");
        RadioButton rbt2 = new RadioButton("FirstClass");
        RadioButton rbt3 = new RadioButton("Business");
        ToggleGroup toggleGroup = new ToggleGroup();
        rbt1.setToggleGroup(toggleGroup);
        rbt2.setToggleGroup(toggleGroup);
        rbt3.setToggleGroup(toggleGroup);
        Label label6 = new Label("Enter Departure Airport:");
        String[] departureList = {"Allama Iqbal Airport", "Jinnah International", "Multan International", "Faisalabad International"};
        ComboBox combo_box = new ComboBox(FXCollections.observableArrayList(departureList));
        combo_box.setPromptText("Select Airport");
        Button submitForm = new Button("Submit form"); // submit 1 of combobox
        Button backForm = new Button("Back form");
        setHoverCustomEffect(submitForm);
        setHoverCustomEffect(backForm);


        GridPane pane2= new GridPane();
        pane2.getChildren().clear();
        pane2.setVgap(5);
        pane2.setHgap(5);
        Label label10= new Label("Booking Form");
        label10.setStyle("-fx-font-family: 'Lucida Handwriting'; -fx-font-size: 40px;");
        pane2.add(label10,0,0);
        pane2.add(label1, 0, 1);
        pane2.add(tf1, 1, 1);
        pane2.add(label2, 0, 2);
        pane2.add(tf2, 1, 2);
        pane2.add(label3, 0, 3);
        pane2.add(tf3, 1, 3);
        pane2.add(label4, 0, 4);
        pane2.add(tf4, 1, 4);
        pane2.add(label5, 0, 5);
        pane2.add(rbt1, 1, 5);
        pane2.add(rbt2, 2, 5);
        pane2.add(rbt3, 3, 5);
        pane2.add(label6, 0, 6);
        pane2.add(combo_box, 1, 6);
        pane2.add(submitForm, 1, 7);
        pane2.add(backForm, 0, 7);
        Label l21= new Label(">Only 24 KG Luggage Allowed Per Ticket");
        Label l22= new Label(">To Refund The Ticket Please Contact Us ");
        Label l23= new Label(">On  Email Or Visit Our Nearest Offices");

        pane2.add(l21,0,8);
        pane2.add(l22,0,9);
        pane2.add(l23,0,10);

        setDefaultFont(l21);
        setDefaultFont(l22);
        setDefaultFont(l23);
        pane2.setAlignment(Pos.CENTER);




        backForm.setOnAction(e ->{
            pane2.getChildren().clear();
            stage.setScene(scn1);
        });

        submitForm.setOnAction(e -> {
            String name = tf1.getText();
            String ageText = tf2.getText();
            String email = tf3.getText();
            String phoneText = tf4.getText();

            if (name.isEmpty() || ageText.isEmpty() || email.isEmpty() || phoneText.isEmpty()) {
                ErrorAlertMethod("Empty Fields", "Please fill in all the required fields.");
                return;
            }

            int age;
            try {
                age = Integer.parseInt(ageText);
                if (age < 18) {
                    ErrorAlertMethod("Invalid Age", "Please enter a valid age (age should be greater than 18.");
                    return;
                }
            } catch (NumberFormatException ex) {
                ErrorAlertMethod("Invalid Age", "Please enter a valid age.");
                return;
            }

            Long phone;
            try {
                phone = Long.parseLong(phoneText);
                String PhoneNumber = String.valueOf(phone);
                if (PhoneNumber.length()!=11 ) {
                    ErrorAlertMethod("Invalid Phone Number", "Please enter a valid phone number(11 digit).");
                    return;
                }
            } catch (NumberFormatException ex) {
                ErrorAlertMethod("Invalid Phone Number", "Please enter a valid phone number (non-negative integer).");
                return;
            }
            displayDepartureSchedule(stage,combo_box,toggleGroup,tf1,tf2,tf3,tf4);
        });
        Image image2 = new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/lastbak.jpg");
        ImageView imageView2 = new ImageView(image2);
        ImageView imageview21= new ImageView(new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/bookback.jpg"));
        imageview21.setFitWidth(700);
        imageview21.setFitHeight(500);


        StackPane pane21 = new StackPane();
        pane21.getChildren().addAll(imageView2,imageview21,pane2);
        setDefaultFont(label1);
        setDefaultFont(label2);
        setDefaultFont(label3);
        setDefaultFont(label4);
        setDefaultFont(label5);
        setDefaultFont(label6);


        scn2 = new Scene(pane21, 1366, 705);
//        scn2.getRoot().setStyle("-fx-background-color: #FFD700;");
        imageView2.fitWidthProperty().bind(scn2.widthProperty());
        imageView2.fitHeightProperty().bind(scn2.heightProperty());
        stage.setScene(scn2);
    }

    public void displayDepartureSchedule(Stage stage,ComboBox combo_box,ToggleGroup toggleGroup,TextField tf1,TextField tf2,TextField tf3,TextField tf4){

        GridPane pane3 = new GridPane();
        pane3.setVgap(10);
        pane3.setHgap(10);
        Label l51 = new Label("Flight number");
        Label l52 = new Label("Flight Departure");
        Label l53 = new Label("Flight Destination");
        Label l54 = new Label("Flight Departure Time");
        Label l55 = new Label("Flight Arrival Time");
        pane3.add(l51,0,0);
        pane3.add(l52,1,0);
        pane3.add(l53,2,0);
        pane3.add(l54,3,0);
        pane3.add(l55,4,0);

        int counter = 1;
        for (int i = 0; i < flightlist.size(); i++) {
            if (flightlist.get(i).getDepartueAirport().equals(combo_box.getValue().toString())) {
                System.out.println(i);
                String flightNumber = flightlist.get(i).getFlightNumber();
                System.out.println(flightNumber);
                String destinationAirport = flightlist.get(i).getDestinationAirport();
                Date arrivalTime = flightlist.get(i).getArrivalTime();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String formattedDate1 = dateFormat.format(arrivalTime);
                Date departureTime = flightlist.get(i).getDepartureTime();
                String formattedDate2 = dateFormat.format(departureTime);
                Label lbl0 = new Label();
                Label lbl1 = new Label();
                Label lbl2 = new Label();
                Label lbl3 = new Label();
                Label lbl4 = new Label();

                lbl0.setText(flightNumber);
                lbl1.setText(flightlist.get(i).getDepartueAirport());
                lbl2.setText(destinationAirport);
                lbl3.setText(formattedDate1);
                lbl4.setText(formattedDate2);

                pane3.add(lbl0, 0, counter);
                pane3.add(lbl1, 1, counter);
                pane3.add(lbl2, 2, counter);
                pane3.add(lbl3, 3, counter);
                pane3.add(lbl4, 4, counter);
                counter++;
            }
        }
        Label l56 = new Label("Enter Flight Number you want :");
        ///////////////
        String[] flightNumberArray = new String[5];
        int index = 0;

        for (int i = 0; i < flightlist.size(); i++) {
            if (flightlist.get(i).getDepartueAirport().equals(combo_box.getValue().toString())) {
                flightNumberArray[index] = flightlist.get(i).getFlightNumber();
                index++;
            }
        }

        flightNumberCombo = new ComboBox<>(FXCollections.observableArrayList(flightNumberArray));
        flightNumberCombo.setPromptText("Select Flight Number");







        ///////////////

        pane3.add(l56,0,counter+1);
        pane3.add(flightNumberCombo,1,counter+1);
        ////////////


        Button backFlight = new Button("Back flight");
        Button  submitFlight = new Button("submit flight");
        pane3.add(backFlight, 0, counter+2);
        pane3.add(submitFlight, 1, counter+2);

        Label l57 = new Label("Flight Duration: ");//display flight duration
        Label l58= new Label("Total Fare: ");///display fare

        pane3.add(l57,0,counter+5);
        pane3.add(l58,0,counter+6);
        Button pay= new Button("Pay");
        setHoverCustomEffect(pay);
        pane3.add(pay,0,counter+7);
        l57.setVisible(false);
        l58.setVisible(false);
        pay.setVisible(false);
        pay.setOnAction(e->stage.setScene(scn13));//////////addtion of payment

        backFlight.setOnAction(e -> {
            pane3.getChildren().clear();
            displayForm(stage);
        });

        int finalCounter = counter;
        submitFlight.setOnAction(e -> {

            String passname = tf1.getText();
            int ageText = Integer.parseInt(tf2.getText());
            String email = tf3.getText();
            Long phone = Long.valueOf(tf4.getText());
            RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();
            String ticketClass = selectedRadioButton.getText();

            String selectedFlightNumber = flightNumberCombo.getSelectionModel().getSelectedItem().toString();

            String selectedDepartureAirport = combo_box.getValue().toString();
            if (selectedDepartureAirport == null || selectedDepartureAirport.isEmpty()) {
                ErrorAlertMethod("Invalid Departure Airport", "Please select a departure airport first.");
                return;
            }
            Flight selectedFlight = getSelectedFlight(selectedFlightNumber);
            if (selectedFlight == null || !selectedFlight.getDepartueAirport().equalsIgnoreCase(selectedDepartureAirport)) {
                ErrorAlertMethod("Invalid Flight Number", "Please enter a valid flight number for the selected departure airport.");
                return;
            }

            Passenger newPassenger = new Passenger(passname,email,phone,ageText,ticketClass);
            passengersList.add(newPassenger);
            Ticket newTicket = new Ticket("LH"+Integer.toString(random.nextInt(10000,99999)),passengersList,flightlist);

            TicketList.add(newTicket);

            selectedFlight = getSelectedFlight(selectedFlightNumber);
            if (selectedFlight != null) {

                double fare = Ticket.handleTicketClass(passname, email, phone, ageText, ticketClass, selectedFlight.getFlightDuration());
                try {
                    FileWriter payment= new FileWriter("C:/Users/IT LAND/Desktop/Bacatatic/payment.txt",true);
                    String fareString = String.valueOf(fare);
                    payment.write(fare +", ");
                    payment.close();

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
//                    ex.printStackTrace();
                }

                pay.setVisible(true);
                l57.setVisible(true);
                l58.setVisible(true);

                Label lblDuration = new Label();
                String flightduration = String.valueOf(selectedFlight.getFlightDuration());
                lblDuration.setText(flightduration);
                pane3.add(lblDuration, 1, finalCounter +5);
                Label lblFare = new Label();
                lblFare.setText("PKR "+(fare));
                pane3.add(lblFare, 1, finalCounter +6);

            } else {
                // Handle case where the selected flight is not found
                System.out.println("Selected flight not found");
            }


        });



        Image image312 = new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/WhatsApp Image 2023-12-07 at 8.21.22 PM.jpeg");
        ImageView imageView312 = new ImageView(image312);
        StackPane pane31 = new StackPane();
        pane31.getChildren().addAll(imageView312,pane3);
        scn3= new Scene(pane31,1366, 705);
        imageView312.fitHeightProperty().bind(scn3.heightProperty());
        imageView312.fitWidthProperty().bind(scn3.widthProperty());
        setHoverCustomEffect(backFlight);
        setHoverCustomEffect(submitFlight);

        stage.setScene(scn3);

    }
    private void setDefaultFont(Label label) {
        String defaultFontFamily = "Lucida Handwriting";
        double defaultFontSize = 13;

        label.setStyle(
                "-fx-font-family: '" + defaultFontFamily + "'; " + "-fx-font-size: " + defaultFontSize + "px;"
        );
    }

    public void printTicket(Stage stage){
        Label lf0= new Label("");
        Label lf1= new Label("");
        Label lb1 = new Label();
        Label lf2= new Label("");
        Label lb2 = new Label();
        Label lf3= new Label("");
        Label lb3 = new Label();
        Label lf4= new Label("");
        Label lb4 = new Label();
        Label lf5= new Label("");
        Label lb5 = new Label();
        Label lf6= new Label("");
        Label lb6 = new Label();
        Label lf7 = new Label("");
        Label lb7 = new Label();
        Label lf8 = new Label("");
        Label lb8 = new Label();
        Label lf9 = new Label("");
        Label lb9 = new Label();
        setDefaultFont(lf1);
        setDefaultFont(lf2);
        setDefaultFont(lf3);
        setDefaultFont(lf4);
        setDefaultFont(lf5);
        setDefaultFont(lf6);
        setDefaultFont(lf7);
        setDefaultFont(lf8);
        setDefaultFont(lf9);
        Reservation newReservation = new Reservation("LH"+Integer.toString(random.nextInt(10000,99999)), flightlist, passengersList, TicketList);

        ReservationList.add(newReservation);
        for (Reservation res : ReservationList) {
            for (Passenger passenger : res.getPassengersList()) {
                for (Flight flight : res.getFlightList()) {
                    selectedFlightNumber= flightNumberCombo.getSelectionModel().getSelectedItem().toString();
                    if (selectedFlightNumber.equalsIgnoreCase(flight.getFlightNumber())) {
                        lb1.setText(flight.getFlightNumber());
                        lb3.setText(flight.getDepartueAirport());
                        lb4.setText(flight.getDestinationAirport());
                        lb5.setText(newReservation.getReservationNumber());
                        lb6.setText(passenger.getName());
                        LocalDate currentDate = LocalDate.now();
                        lb7.setText(currentDate.toString());
                        lb8.setText(currentDate.toString());
                        lb9.setText(passenger.getTicketClass());
                        String fnum=flight.getFlightNumber();
                        String dair=flight.getDepartueAirport();
                        String aair =flight.getDestinationAirport();
                        String resnum=newReservation.getReservationNumber();
                        String name=passenger.getName();
                        String ddate=currentDate.toString();
                        String adate=currentDate.toString();
                        String tclass=passenger.getTicketClass();
                        try {
                            Formatter myfile = new Formatter("C:/Users/IT LAND/Desktop/Bacatatic/Ticket.txt");
                            FileOutputStream obj = new FileOutputStream("C:/Users/IT LAND/Desktop/Bacatatic/Reservations.txt", true);
                            Formatter myfile1 = new Formatter(obj);
                            myfile.format("\n %s %s %s %s %s %s %s %s ", fnum, dair, aair, resnum, name, ddate, adate, tclass);
                            myfile1.format("\n%s, %s, %s, %s, %s, %s, %s, %s ", fnum, dair, aair, resnum, name, ddate, adate, tclass);
                            myfile1.close();
                            myfile.close();
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        }

                    }
                }
            }
        }

        GridPane pane4= new GridPane();
        pane4.setVgap(5);
        pane4.setHgap(10);
        pane4.add(lf0,0,0);
        pane4.add(lf1,0,1);
        pane4.add(lb1,28,21);
        pane4.add(lf2,0,3);
        pane4.add(lb2,0,4);
        pane4.add(lf3,0,5);
        pane4.add(lb3,19,26);
        pane4.add(lf4,0,0);
        pane4.add(lb4,19,31);
        pane4.add(lf5,0,9);
        pane4.add(lb5,40,21);
        pane4.add(lf6,0,11);
        pane4.add(lb6,19,21);
        pane4.add(lf7,0,13);
        pane4.add(lb7,36,31);
        pane4.add(lf8,0,15);
        pane4.add(lb8,36,26);
        pane4.add(lf9,0,17);
        pane4.add(lb9,36,21);
        Button exit = new Button("Exit");
        pane4.add(exit,0,30);
        setDefaultFont(lf0);


        setHoverCustomEffect(exit);
        Image image4 = new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/WhatsApp Image 2023-12-07 at 8.21.22 PM.jpeg");
        ImageView imageView4= new ImageView(image4);
        Image image42= new Image("file:C:/Users/IT LAND/Desktop/Bacatatic/myfx/42192421 (1).jpg");
        ImageView imageView42= new ImageView(image42);

        StackPane pane41= new StackPane();
        pane41.getChildren().addAll(imageView4,imageView42,pane4);
        scn4 = new Scene(pane41,1366, 705);


        exit.setOnAction(e ->{
            pane4.getChildren().clear();
            stage.setScene(scn1);
        });


    }
}
