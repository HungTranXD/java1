package assignment8.bookList;

import assignment8.Book;
import assignment8.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;

public class BookListController {
    public ListView<Book> lvBook;

    public static ObservableList<Book> bookList = FXCollections.observableArrayList();

    public void goToAdd(ActionEvent actionEvent) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("bookList/bookList.fxml"));

        Main.rootStage.setTitle("Books management");
        Main.rootStage.setScene(new Scene(root, 800, 600));
        Main.rootStage.show();
    }

    public void goToEdit(ActionEvent actionEvent) {
    }

    public void delete(ActionEvent actionEvent) {
    }
}
