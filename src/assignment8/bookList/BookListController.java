package assignment8.bookList;

import assignment8.Book;
import assignment8.Main;
import assignment8.editBook.EditBookController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class BookListController implements Initializable {
    public static ObservableList<Book> bookList = FXCollections.observableArrayList();
    public TextField txtSearch;
    public TableView<Book> tbBooks;
    public TableColumn<Book, String> cId;
    public TableColumn<Book, String> cName;
    public TableColumn<Book, String> cAuthor;
    public TableColumn<Book, String> cPublisher;
    public TableColumn<Book, String> cType;
    public TableColumn<Book, Double> cPrice;
    public TableColumn<Book, Integer> cQuantity;
    public TableColumn<Book, Button> cEdit;
    public TableColumn<Book, Button> cDelete;
    private boolean sortOrder = true;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cId.setCellValueFactory(new PropertyValueFactory<>("id"));
        cName.setCellValueFactory(new PropertyValueFactory<>("name"));
        cAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));
        cPublisher.setCellValueFactory(new PropertyValueFactory<>("publisher"));
        cType.setCellValueFactory(new PropertyValueFactory<>("type"));
        cPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        cQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        cEdit.setCellValueFactory(new PropertyValueFactory<>("edit"));
        cDelete.setCellValueFactory(new PropertyValueFactory<>("delete"));

        if (bookList.size() == 0) {
            bookList.add(new Book("B001", "It Starts with Us: A Novel (It Ends with Us)", "Colleen Hoover", "Penguin/Random House", "Romance", 12.98, 105));
            bookList.add(new Book("B002", "The Boys from Biloxi: A Legal Thriller", "John Grisham", "Hachette Book Group", "Thriller", 20.07, 80));
            bookList.add(new Book("B003", "Demon Copperhead: A Novel", "Barbara Kingsolver", "Harper Collins", "Adventure", 21.04, 210));
            bookList.add(new Book("B004", "Beyond the Wand: The Magic and Mayhem of Growing Up a Wizard", "Tom Felton", "Simon and Schuster", "Dystopian", 18.31, 55));
            bookList.add(new Book("B005", "And There Was Light: Abraham Lincoln and the American Struggle", "Jon Meacham", "Macmillan", "History", 24.58, 165));
        }

        tbBooks.setItems(bookList);
    }

    public void goToAdd(ActionEvent actionEvent) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../addBook/addBook.fxml"));
        Main.rootStage.setTitle("Add book");
        Main.rootStage.setScene(new Scene(root, 800, 600));
    }

//    public void goToEdit(ActionEvent actionEvent){
//        try {
//            if (lvBook.getSelectionModel().getSelectedItem() == null)
//                throw new Exception("No book selected!");
//            Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
//            confirmAlert.setTitle("Confirmation");
//            confirmAlert.setHeaderText("Are you sure you want to edit this book info?");
//            if (confirmAlert.showAndWait().get() == ButtonType.OK) {
//                EditBookController.editedBook = lvBook.getSelectionModel().getSelectedItem();
//
//                Parent root = FXMLLoader.load(getClass().getResource("../editBook/editBook.fxml"));
//                Main.rootStage.setTitle("Edit book");
//                Main.rootStage.setScene(new Scene(root, 800, 600));
//            }
//
//        } catch (Exception e) {
//            Alert alert = new Alert(Alert.AlertType.WARNING);
//            alert.setTitle("Warning!");
//            alert.setHeaderText(e.getMessage());
//            alert.show();
//        }
//    }

//    public void delete(ActionEvent actionEvent) {
//        try {
//            if (lvBook.getSelectionModel().getSelectedItem() == null)
//                throw new Exception("No book selected!");
//            Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
//            confirmAlert.setTitle("Confirmation");
//            confirmAlert.setHeaderText("Are you sure you want to delete this book?");
//            if (confirmAlert.showAndWait().get() == ButtonType.OK)
//                bookList.remove(lvBook.getSelectionModel().getSelectedItem());
//        } catch (Exception e) {
//            Alert alert = new Alert(Alert.AlertType.WARNING);
//            alert.setTitle("Warning!");
//            alert.setHeaderText(e.getMessage());
//            alert.show();
//        }
//    }
//
//    public void sortByPrice(ActionEvent actionEvent) {
//        bookList.sort(new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return sortOrder ? Double.compare(o1.getPrice(), o2.getPrice()) : Double.compare(o2.getPrice(), o1.getPrice());
//            }
//        });
//        sortOrder = !sortOrder;
//    }
//
//    public void sortByQuantity(ActionEvent actionEvent) {
//        bookList.sort(new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return sortOrder ? Integer.compare(o1.getQuantity(), o2.getQuantity()) : Integer.compare(o2.getQuantity(), o1.getQuantity());
//            }
//        });
//        sortOrder = !sortOrder;
//    }

    public void search(ActionEvent actionEvent) {
        try {
            String searchValue = txtSearch.getText();
            if (searchValue.isEmpty()) throw new Exception("Enter search value!");
            ObservableList<Book> searchResult = FXCollections.observableArrayList();
            searchResult = bookList.stream().filter(book -> book.getName().toLowerCase().contains(searchValue.toLowerCase())).collect(Collectors.toCollection(FXCollections::observableArrayList));
            tbBooks.setItems(searchResult);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }

    public void clearSearch(ActionEvent actionEvent) {
        txtSearch.clear();
        tbBooks.setItems(bookList);
    }
}
