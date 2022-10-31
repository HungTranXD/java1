package assignment8;

import assignment8.editBook.EditBookController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

import static assignment8.bookList.BookListController.bookList;

public class Book {
    private String id;
    private String name;
    private String author;
    private String publisher;
    private String type;
    private double price;
    private int quantity;
    private Button edit;
    private Button delete;

    public Book() {
    }

    public Book(String id, String name, String author, String publisher, String type, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.edit = new Button("Edit");
        this.edit.setStyle("-fx-background-color: #dcbf13; -fx-text-fill: #ffffff");
        this.edit.setOnAction(event -> {
        try {
            Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
            confirmAlert.setTitle("Confirmation");
            confirmAlert.setHeaderText("Are you sure you want to edit this book info?");
            if (confirmAlert.showAndWait().get() == ButtonType.OK) {
                EditBookController.editedBook = this;

                Parent root = FXMLLoader.load(getClass().getResource("editBook/editBook.fxml"));
                Main.rootStage.setTitle("Edit book");
                Main.rootStage.setScene(new Scene(root, 800, 600));
            }

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
        });
        this.delete = new Button("Delete");
        this.delete.setStyle("-fx-background-color: #c92727; -fx-text-fill: #ffffff");
        this.delete.setOnAction(event -> {
        try {
            Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
            confirmAlert.setTitle("Confirmation");
            confirmAlert.setHeaderText("Are you sure you want to delete this book?");
            if (confirmAlert.showAndWait().get() == ButtonType.OK)
                bookList.remove(this);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
        });
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Button getEdit() {
        return edit;
    }

    public void setEdit(Button edit) {
        this.edit = edit;
    }

    public Button getDelete() {
        return delete;
    }

    public void setDelete(Button delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        return getId() + " - " + getName() + " - " + getAuthor() + " - " + getPublisher() + " - " + getType() + " - " + getPrice() + " - " + getQuantity();
    }
}
