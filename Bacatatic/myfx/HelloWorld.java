package com.example.myfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    Scene scn1, scn2, scn3, scn4,scn5,scn6;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Airline Management System");

        // Scene 1
        Button button1 = new Button("Flight Schedule");
        Button button2 = new Button("Book ticket");
        Button button3 = new Button("Give Feedback");

        GridPane pane1 = new GridPane();
        GridPane pane3 = new GridPane();
        GridPane pane2 = new GridPane();
        pane1.add(button1, 0, 0);
        pane1.add(button2, 0, 1);
        pane1.add(button3, 0, 2);

        scn1 = new Scene(pane1, 300, 200);

        // Scene 2 (Booking)
        Label label1 = new Label(" Name :");
        TextField tf1 = new TextField();
        Label label2 = new Label("Age :");
        TextField tf2 = new TextField();
        Label label3 = new Label("Email:");
        TextField tf3 = new TextField();
        Label label4 = new Label("Phone:");
        TextField tf4 = new TextField();
        Label label5 = new Label("Ticket Class:");
        TextField tf5 = new TextField();
        Label label6 = new Label("Enter Departure Airport:");
        TextField tf6 = new TextField();
        Button btn1 = new Button("Submit");
        btn1.setOnAction(e ->primaryStage.setScene(scn5));


        pane2.add(label1, 0, 0);
        pane2.add(tf1, 1, 0);
        pane2.add(label2, 0, 1);
        pane2.add(tf2, 1, 1);
        pane2.add(label3, 0, 2);
        pane2.add(tf3, 1, 2);
        pane2.add(label4, 0, 3);
        pane2.add(tf4, 1, 3);
        pane2.add(label5, 0, 4);
        pane2.add(tf5, 1, 4);
        pane2.add(label6, 0, 5);
        pane2.add(tf6, 1, 5);
        pane2.add(btn1, 1, 6);
        pane2.setVgap(5);
        pane2.setHgap(5);
        Button back1= new Button("Back");
        pane2.add(back1,0,7);
        back1.setOnAction(e ->primaryStage.setScene(scn1));

        scn2 = new Scene(pane2, 300, 200);

        // Set button actions for scene transitions
        button1.setOnAction(e -> primaryStage.setScene(scn2));
        button2.setOnAction(e -> primaryStage.setScene(scn3)); // assuming scn3 is created
        button3.setOnAction(e -> primaryStage.setScene(scn4)); // assuming scn4 is created
        // Scene 3 (Flight Details)
        Label l1 = new Label("Flight number :");
        Label l2 = new Label("Flight Departure :");
        Label l3 = new Label("Flight Destination :");
        Label l4 = new Label("Flight Duration :");
        Button back2 = new Button("Back");
        back2.setOnAction(e ->primaryStage.setScene(scn1));
        pane3.add(l1, 1, 0);
        pane3.add(l2, 1, 1);
        pane3.add(l3, 1, 2);
        pane3.add(l4, 1, 3);
        pane3.add(back2,1,4);

        pane3.setVgap(5);
        pane3.setHgap(5);
        scn3 = new Scene(pane3, 300, 200);
        //Scene 4
        Label feedL1 =  new Label("Passenger Name");
        TextField tx1= new TextField();
        Label feedL2 =  new Label("Rating");
        TextField tx2= new TextField();
        Label feedL3 =  new Label("Content");
        TextField tx3= new TextField();
        GridPane pane4 = new GridPane();
        pane4.add(feedL1,1,0);
        pane4.add(tx1,1,1);
        pane4.add(feedL2,1,2);
        pane4.add(tx2,1,3);
        pane4.add(feedL3,1,4);
        pane4.add(tx3,1,5);
        pane4.setHgap(5);
        pane4.setVgap(5);
        Button back3= new Button("Back");
        back3.setOnAction(e ->primaryStage.setScene(scn1));
        pane4.add(back3,2,6);
        scn4= new Scene(pane4,300,200);

        //scene 5
        GridPane pane5 = new GridPane();
        //departure airport schedule displayed after entering departure airport
        Label l51 = new Label("Flight number :");
        Label l52 = new Label("Flight Departure :");
        Label l53 = new Label("Flight Destination :");
        Label l54 = new Label("Flight Departure Time :");
        Label l55 = new Label("Flight Arrival Time :");
        Label l56 = new Label("Enter Flight Number you want :");
        TextField txt56=new TextField();
        Button btn56= new Button("Submit");///if flight number exists show another button to print ticket
        Label l57 = new Label("Flight Duration :");//display flight duration
        Label l58= new Label("Total Fare");///display fare
        Button print= new Button("Print Ticket");
        pane5.add(l51,0,1);
        pane5.add(l52,0,2);
        pane5.add(l53,0,3);
        pane5.add(l54,0,4);
        pane5.add(l55,0,5);
        pane5.add(l56,0,6);
        pane5.add(txt56,0,7);
        pane5.add(btn56,0,8);
        pane5.add(l57,0,9);
        pane5.add(l58,0,10);
        pane5.add(print,0,11);
        scn5= new Scene(pane5,200,300);

        btn56.setOnAction(e ->{
            print.setVisible(true);
        });
        print.setOnAction(e ->primaryStage.setScene(scn6));
        //scene 6
        Label lf1= new Label("Flight Number:");
        Label lf2= new Label("Flight Duration");
        Label lf3= new Label("Departure Airport:");
        Label lf4= new Label("Destination Airport");
        Label lf5= new Label("Ticket Number");
        Label lf6= new Label("Reservation Number");
        Label lf7 = new Label("Age");
        Label lf8 = new Label("Contact Number");
        Label lf9 = new Label("Ticket Class");
        GridPane pane6= new GridPane();
        pane6.add(lf1,0,1);
        pane6.add(lf2,0,2);
        pane6.add(lf3,0,3);
        pane6.add(lf4,0,4);
        pane6.add(lf5,0,5);
        pane6.add(lf6,0,6);
        pane6.add(lf7,0,7);
        pane6.add(lf8,0,8);
        pane6.add(lf9,0,9);
        pane6.add(lf9,0,9);
        scn6 = new Scene(pane6,200,300);
        //
        primaryStage.setScene(scn1);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}