package fx_tutorial;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Demo");



        /* ------------------------------------------------- */
        /* ----------------- Switch scenes ----------------- */
        /* ------------------------------------------------- */
//        Label label = new Label("Welcome to the first scene!");
//        Button button1 = new Button("Go to scene 2");
//        button1.setOnAction(event -> window.setScene(scene2));
//
//        //Layout 1 - children are laid in vertical column
//        VBox layout1 = new VBox(20);
//        layout1.getChildren().addAll(label, button1);
//        scene1 = new Scene(layout1, 200, 200);
//
//        //Button 2
//        Button button2 = new Button("Go back to scene 1");
//        button2.setOnAction(event -> window.setScene(scene1));
//
//        //Layout
//        StackPane layout2 = new StackPane();
//        layout2.getChildren().add(button2);
//        scene2 = new Scene(layout2, 600, 300);
//
//        window.setScene(scene1);
//        window.show();



        /* ------------------------------------------------- */
        /* --------------- Create Alert box ---------------- */
        /* ------------------------------------------------- */
//        Button bt1 = new Button("Click me");
//        bt1.setOnAction(event -> AlertBox.display("Alert 1", "This is alert box"));
//
//        //create layout
//        StackPane layout = new StackPane();
//        layout.getChildren().add(bt1);
//
//        Scene sc1 = new Scene(layout, 300, 250);
//        window.setScene(sc1);
//        window.show();



        /* ------------------------------------------------- */
        /* ------------ Windows communicating -------------- */
        /* ------------------------------------------------- */
//        Button bt1 = new Button("Click me");
//        bt1.setOnAction(event -> {
//            boolean result = ConfirmBox.display("Confirm box", "Are you sure?");
//            System.out.println(result);
//        });
//
//        //create layout
//        StackPane layout = new StackPane();
//        layout.getChildren().add(bt1);
//
//        Scene sc1 = new Scene(layout, 300, 250);
//        window.setScene(sc1);
//        window.show();



        /* ------------------------------------------------- */
        /* ---------------- Close program ------------------ */
        /* ------------------------------------------------- */
//        window.setOnCloseRequest(event -> {
//            event.consume(); //User send close request but we consume it (We are telling java we will take it from here) -> the close event stop
//            closeProgram();
//        });
//
//        Button bt1 = new Button("Close program");
//        bt1.setOnAction(event -> closeProgram());
//
//        //create layout
//        StackPane layout = new StackPane();
//        layout.getChildren().add(bt1);
//
//        Scene sc1 = new Scene(layout, 300, 250);
//        window.setScene(sc1);
//        window.show();



        /* ------------------------------------------------- */
        /* --------------- Embedding layout ---------------- */
        /* ------------------------------------------------- */
//        HBox topMenu = new HBox();
//        Button buttonA = new Button("File");
//        Button buttonB = new Button("Save");
//        Button buttonC = new Button("View");
//        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);
//
//        VBox leftMenu = new VBox();
//        Button buttonD = new Button("First");
//        Button buttonE = new Button("Second");
//        Button buttonF = new Button("Third");
//        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);
//
//        BorderPane borderPane = new BorderPane();
//        borderPane.setTop(topMenu);
//        borderPane.setLeft(leftMenu);
//
//        Scene scene = new Scene(borderPane, 300, 250);
//        window.setScene(scene);
//        window.show();



        /* ------------------------------------------------- */
        /* ------------------- Grid pane ------------------- */
        /* ------------------------------------------------- */
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        //Name label
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 0,0);

        //Name input
        TextField nameInput = new TextField("Bucky");
        GridPane.setConstraints(nameInput,1,0);

        //Password label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel, 0,1);

        //Password input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Log in");
        GridPane.setConstraints(loginButton, 1, 2);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);

        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);
        window.show();

    }

    private void closeProgram() {
        boolean answer = ConfirmBox.display("Close program", "Are you sure to exit?");
        if (answer) {
            System.out.println("File is saved");
            window.close();
        }
    }
}
