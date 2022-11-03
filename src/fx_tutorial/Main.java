package fx_tutorial;

import com.sun.crypto.provider.HmacMD5KeyGenerator;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    Scene scene1, scene2;
    Button button;

    ComboBox<String> comboBox;

    ListView<String> listView;

    TreeView<String> tree;

    TableView<Product> table;
    TextField nameInput, priceInput, quantityInput;


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
//        GridPane grid = new GridPane();
//        grid.setPadding(new Insets(10, 10, 10, 10));
//        grid.setVgap(8);
//        grid.setHgap(10);
//
//        //Name label
//        Label nameLabel = new Label("Username:");
//        nameLabel.setId("bold-label");
//        GridPane.setConstraints(nameLabel, 0,0);
//
//        //Name input
//        TextField nameInput = new TextField("Bucky");
//        GridPane.setConstraints(nameInput,1,0);
//
//        //Password label
//        Label passLabel = new Label("Password:");
//        GridPane.setConstraints(passLabel, 0,1);
//
//        //Password input
//        TextField passInput = new TextField();
//        passInput.setPromptText("password");
//        GridPane.setConstraints(passInput, 1, 1);
//
//        //Login button
//        Button loginButton = new Button("Log in");
//        GridPane.setConstraints(loginButton, 1, 2);
//
//        //Sign up button
//        Button signupButton = new Button("Sign up");
//        signupButton.getStyleClass().add("button-blue");
//        GridPane.setConstraints(signupButton,1,3);
//
//        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton, signupButton);
//
//        Scene scene = new Scene(grid, 300, 200);
//        scene.getStylesheets().add("viper.css");
//        window.setScene(scene);
//        window.show();



        /* ------------------------------------------------- */
        /* ---------- Extract and validate input ----------- */
        /* ------------------------------------------------- */
//        //Form
//        TextField nameInput = new TextField();
//        Button button = new Button("Click me");
//        button.setOnAction(event -> isInt(nameInput, nameInput.getText()));
//
//        //Layout
//        VBox layout = new VBox(10);
//        layout.setPadding(new Insets(20, 20, 20, 20));
//        layout.getChildren().addAll(nameInput, button);
//
//        Scene scene = new Scene(layout, 300, 250);
//        window.setScene(scene);
//        window.show();



        /* ------------------------------------------------- */
        /* ------------------- Check box ------------------- */
        /* ------------------------------------------------- */
//        //Check box
//        CheckBox box1 = new CheckBox("Bacon");
//        CheckBox box2 = new CheckBox("Tuna");
//        box2.setSelected(true); //check by default
//
//        //Button
//        Button button = new Button("Order now!");
//        button.setOnAction(event -> handleOptions(box1, box2));
//
//        //Layout
//        VBox layout = new VBox(10);
//        layout.setPadding(new Insets(20, 20, 20, 20));
//        layout.getChildren().addAll(box1, box2, button);
//
//        Scene scene = new Scene(layout, 300, 250);
//        window.setScene(scene);
//        window.show();



        /* ------------------------------------------------- */
        /* ----------- Check box (drop down menu) ---------- */
        /* ------------------------------------------------- */
//        ChoiceBox<String> choiceBox = new ChoiceBox<>();
//
//        //getItems return the ObservableList which you can add item to
//        choiceBox.getItems().add("Apple");
//        choiceBox.getItems().add("Bananas");
//        choiceBox.getItems().addAll("Bacon", "Ham", "Meatballs");
//
//        //Set the default value
//        choiceBox.setValue("Apple");
//
//        //Button
//        Button button = new Button("Order now!");
//        button.setOnAction(event -> getChoice(choiceBox));
//
//        //Listen for selection changes
//        choiceBox.getSelectionModel().selectedItemProperty().addListener( (v, oldValue, newValue) -> System.out.println(oldValue + "->" + newValue));
//
//        //Layout
//        VBox layout = new VBox(10);
//        layout.setPadding(new Insets(20, 20, 20, 20));
//        layout.getChildren().addAll(choiceBox, button);
//
//        Scene scene = new Scene(layout, 300, 250);
//        window.setScene(scene);
//        window.show();


        /* ------------------------------------------------- */
        /* -- ComboBox (dont need listener like CheckBox) -- */
        /* ------------------------------------------------- */
//        comboBox = new ComboBox<>();
//        comboBox.getItems().addAll(
//                "Good Will Hunting",
//                "St. Vincent",
//                "Backhat"
//        );
//        comboBox.setPromptText("Your favorite movie:");
//        //ComboBox emits it's own event
//        comboBox.setOnAction(event -> System.out.println("You are selecting: " + comboBox.getValue()));
//        //User can type their own value
//        comboBox.setEditable(true);
//
//        Button button = new Button("Order now!");
//        button.setOnAction(event -> printMovie());
//
//        VBox layout = new VBox(10);
//        layout.setPadding(new Insets(20, 20, 20, 20));
//        layout.getChildren().addAll(comboBox, button);
//
//        Scene scene = new Scene(layout, 300, 250);
//        window.setScene(scene);
//        window.show();



        /* ------------------------------------------------- */
        /* -------------------- ListView ------------------- */
        /* ------------------------------------------------- */
//        listView = new ListView<>();
//        listView.getItems().addAll("Iron man", "Titanic", "Contact");
//        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
//
//        button = new Button("Submit");
//        button.setOnAction(event -> buttonClicked());
//
//        VBox layout = new VBox(10);
//        layout.setPadding(new Insets(20, 20, 20, 20));
//        layout.getChildren().addAll(listView, button);
//
//        Scene scene = new Scene(layout, 300, 250);
//        window.setScene(scene);
//        window.show();



        /* ------------------------------------------------- */
        /* -------------------- TreeView ------------------- */
        /* ------------------------------------------------- */
//        TreeItem<String> root, bucky, megan;
//
//        //Root
//        root = new TreeItem<>();
//        root.setExpanded(true);//everything expanded when program start
//
//        //Bucky
//        bucky = makeBranch("Bucky", root);
//        makeBranch("thenewboston", bucky);
//        makeBranch("YouTube", bucky);
//        makeBranch("Chicken", bucky);
//
//        //Megan
//        megan = makeBranch("Megan", root);
//        makeBranch("Glitter", megan);
//        makeBranch("Makeup", megan);
//
//        //Create tree
//        tree = new TreeView<>(root);
//        tree.setShowRoot(false);//hide root
//        //add listener
//        tree.getSelectionModel().selectedItemProperty().addListener( (v, oldValue, newValue) -> {
//            if (newValue != null)
//                System.out.println(newValue.getValue());
//        });
//
//        StackPane layout = new StackPane();
//        layout.getChildren().add(tree);
//
//        Scene scene = new Scene(layout, 300, 250);
//        window.setScene(scene);
//        window.show();



        /* ------------------------------------------------- */
        /* ------------------- TableView ------------------- */
        /* ------------------------------------------------- */
//        //Name column
//        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
//        nameColumn.setMinWidth(200);
//        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
//
//        //Price column
//        TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
//        priceColumn.setMinWidth(100);
//        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
//
//        //Quantity column
//        TableColumn<Product, Integer> quantityColumn = new TableColumn<>("Quantity");
//        quantityColumn.setMinWidth(100);
//        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
//
//        //Name input
//        nameInput = new TextField();
//        nameInput.setPromptText("Name");
//        nameInput.setMinWidth(100);
//
//        //Price input
//        priceInput = new TextField();
//        priceInput.setPromptText("Price");
//
//        //Quantity input
//        quantityInput = new TextField();
//        quantityInput.setPromptText("Quantity");
//
//        //Button
//        Button addButton = new Button("Add");
//        addButton.setOnAction(event -> addButtonClicked());
//        Button deleteButton = new Button("Delete");
//        deleteButton.setOnAction(event -> deleteButtonClicked());
//
//        HBox hBox = new HBox();
//        hBox.setPadding(new Insets(10, 10, 10, 10));
//        hBox.setSpacing(10);
//        hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);
//
//
//        table = new TableView<>();
//        table.setItems(getProduct());
//        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);
//
//        VBox vBox = new VBox();
//        vBox.getChildren().addAll(table, hBox);
//        Scene scene = new Scene(vBox);
//        window.setScene(scene);
//        window.show();



        /* ------------------------------------------------- */
        /* ---------------------- Menus -------------------- */
        /* ------------------------------------------------- */
//        //File menu
//        Menu fileMenu = new Menu("_File"); //Put underscore treat it as shortcut
//
//        //Menu items
//        MenuItem newFile = new MenuItem("New...");
//        newFile.setOnAction(event -> System.out.println("Create a new file..."));
//        fileMenu.getItems().add(newFile);
//
//        fileMenu.getItems().add(new MenuItem("Open..."));
//        fileMenu.getItems().add(new MenuItem("Save..."));
//        fileMenu.getItems().add(new SeparatorMenuItem());
//        fileMenu.getItems().add(new MenuItem("Setting..."));
//        fileMenu.getItems().add(new SeparatorMenuItem());
//        fileMenu.getItems().add(new MenuItem("Exit..."));
//
//        //Edit menu
//        Menu editMenu = new Menu("_Edit");
//        editMenu.getItems().add(new MenuItem("Cut"));
//        editMenu.getItems().add(new MenuItem("Copy"));
//
//        MenuItem paste = new MenuItem("Paste");
//        newFile.setOnAction(event -> System.out.println("Pasting..."));
//        editMenu.getItems().add(paste);
//        paste.setDisable(true); //Disable menu items
//
//        //Help menu (CHECK MENU ITEMS)
//        Menu helpMenu = new Menu("Help");
//        CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
//        showLines.setOnAction(event -> {
//            if (showLines.isSelected())
//                System.out.println("Program will now display line numbers");
//            else
//                System.out.println("Hiding line numbers");
//        });
//        CheckMenuItem autoSave = new CheckMenuItem("Enable Autosave");
//        autoSave.setSelected(true);
//        helpMenu.getItems().addAll(showLines, autoSave);
//
//        //Difficulty (RADIO MENU ITEMS)
//        Menu difficultyMenu = new Menu("Difficulty");
//        ToggleGroup difficultyToggle = new ToggleGroup();
//
//        RadioMenuItem easy = new RadioMenuItem("Easy");
//        RadioMenuItem medium = new RadioMenuItem("Medium");
//        RadioMenuItem hard = new RadioMenuItem("Hard");
//
//        easy.setToggleGroup(difficultyToggle);
//        medium.setToggleGroup(difficultyToggle);
//        hard.setToggleGroup(difficultyToggle);
//
//        difficultyMenu.getItems().addAll(easy, medium, hard);
//
//        //Main menu bar
//        MenuBar menuBar = new MenuBar();
//        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu, difficultyMenu);
//
//        BorderPane layout = new BorderPane();
//        layout.setTop(menuBar);
//        Scene scene = new Scene(layout, 400, 300);
//        window.setScene(scene);
//        window.show();



        /* ------------------------------------------------- */
        /* ------------------ Properties ------------------- */
        /* ------------------------------------------------- */
//        Person bucky = new Person();
//        bucky.firstNameProperty().addListener( (v, oldValue, newValue) -> {
//            System.out.println("Name change to " + newValue);
//            System.out.println("firstNameProperty() " + bucky.firstNameProperty());
//            System.out.println("getFirstName() " + bucky.getFirstName());
//        });
//
//        button = new Button("Submit");
//        button.setOnAction(event -> bucky.setFirstName("Porky"));
//
//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
//        Scene scene = new Scene(layout, 300, 250);
//        window.setScene(scene);
//        window.show();



        /* ------------------------------------------------- */
        /* -------------------- Binding -------------------- */
        /* ------------------------------------------------- */
        //Example 1:
        IntegerProperty x = new SimpleIntegerProperty(3);
        IntegerProperty y = new SimpleIntegerProperty();

        y.bind(x.multiply(10));
        System.out.println("x: " + x.getValue());
        System.out.println("y: " + y.getValue() + "\n");

        x.setValue(9);
        System.out.println("x: " + x.getValue());
        System.out.println("y: " + y.getValue() + "\n");

        //Example 2:
        //Input
        TextField userInput = new TextField();
        userInput.setMaxWidth(200);
        Label firstLable = new Label("Welcome to the site ");
        Label secondLable = new Label();

        HBox bottomText = new HBox(firstLable, secondLable);
        bottomText.setAlignment(Pos.CENTER);

        secondLable.textProperty().bind(userInput.textProperty());

        VBox layout = new VBox(10, userInput, bottomText);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 300, 250);
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

    /* ------------------------------------------------- */
    /* ---------- Extract and validate input ----------- */
    /* ------------------------------------------------- */
    private boolean isInt(TextField input, String massage) {
        try {
            int age = Integer.parseInt(input.getText());
            System.out.println("User is: " + age);
            input.setStyle("-fx-background-color: rgba(0,255,111,0.5);");
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Error: " + massage + " is not a number");
            input.setStyle("-fx-background-color: rgba(255,0,0,0.5);");
            return false;
        }
    }


    /* ------------------------------------------------- */
    /* ------------------- Check box ------------------- */
    /* ------------------------------------------------- */
    private void handleOptions(CheckBox box1, CheckBox box2) {
        String massage = "User order:\n";

        if(box1.isSelected())
            massage += "Bacon\n";
        if(box2.isSelected())
            massage += "Tuna\n";

        System.out.println(massage);
    }


    /* ------------------------------------------------- */
    /* ----------- Check box (drop down menu ----------- */
    /* ------------------------------------------------- */
    private void getChoice(ChoiceBox<String> choiceBox) {
        String food = choiceBox.getValue();
        System.out.println(food);
    }


    /* ------------------------------------------------- */
    /* -- ComboBox (dont need listener like CheckBox) -- */
    /* ------------------------------------------------- */
    private void printMovie() {
        System.out.println(comboBox.getValue());
    }


    /* ------------------------------------------------- */
    /* -------------------- ListView ------------------- */
    /* ------------------------------------------------- */
    private void buttonClicked() {
        String massage = "";
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();

        for(String m: movies) {
            massage += m + "\n";
        }

        System.out.println(massage);
    }


    /* ------------------------------------------------- */
    /* -------------------- TreeView ------------------- */
    /* ------------------------------------------------- */
    //Create branch
    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }


    /* ------------------------------------------------- */
    /* ------------------- TableView ------------------- */
    /* ------------------------------------------------- */
    //Get all products (for example connect to API to get data)
    public ObservableList<Product> getProduct() {
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Laptop", 900.00, 20));
        products.add(new Product("Ball", 2.49, 198));
        products.add(new Product("Toilet", 99.00, 74));
        products.add(new Product("DVD", 19.99, 12));
        products.add(new Product("Corn", 1.49, 856));
        return products;
    }

    private void addButtonClicked() {
        Product product = new Product();
        product.setName(nameInput.getText());
        product.setPrice(Double.parseDouble(priceInput.getText()));
        product.setQuantity(Integer.parseInt(quantityInput.getText()));
        table.getItems().add(product);
        nameInput.clear();
        priceInput.clear();
        quantityInput.clear();
    }

    private void deleteButtonClicked() {
        ObservableList<Product> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();
        productSelected.forEach(allProducts::remove);
    }

}
