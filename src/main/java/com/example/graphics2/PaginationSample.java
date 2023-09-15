package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Pagination;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PaginationSample extends Application {
    private Pagination pagination;
    private Button previousButton;
    private Button nextButton;
    final String[] textPages = new String[]{
            "The apple is the pomaceous fruit of the apple tree, species Malus "
                    + "domestica in the rose family (Rosaceae). It is one of the most "
                    + "widely cultivated tree fruits, and the most widely known of "
                    + "the many members of genus Malus that are used by humans. "
                    + "The tree originated in Western Asia, where its wild ancestor, "
                    + "the Alma, is still found today.",
            "The hawthorn is a large genus of shrubs and trees in the rose family,"
                    + "Rosaceae, native to temperate regions of the Northern Hemisphere "
                    + "in Europe, Asia and North America. The name hawthorn was "
                    + "originally applied to the species native to northern Europe, "
                    + "especially the Common Hawthorn C. monogyna, and the unmodified "
                    + "name is often so used in Britain and Ireland.",
            "The ivy is a flowering plant in the grape family (Vitaceae) native to "
                    + " eastern Asia in Japan, Korea, and northern and eastern China. "
                    + "It is a deciduous woody vine growing to 30 m tall or more given "
                    + "suitable support,  attaching itself by means of numerous small "
                    + "branched tendrils tipped with sticky disks."

    };

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public int itemsPerPage() {
        return 1;
    }

    public VBox createPage(int pageIndex) {
        VBox box = new VBox(3);
        int page = pageIndex * itemsPerPage();
        for (int i = page; i < page + itemsPerPage(); i++) {
            TextArea text = new TextArea(textPages[i]);
            text.setWrapText(true);
            box.getChildren().add(text);
        }
        return box;
    }

    @Override
    public void start(final Stage stage) throws Exception {
        pagination = new Pagination(28, 0);
        pagination.setStyle("-fx-border-color:red;");
        pagination.setPageFactory((Integer pageIndex) -> {
            if (pageIndex >= textPages.length) {
                return null;
            } else {
                return createPage(pageIndex);
            }
        });

        previousButton = new Button("Previous");
        previousButton.setOnAction(event -> pagination.setCurrentPageIndex(pagination.getCurrentPageIndex() - 1));
        previousButton.disableProperty().bind(pagination.currentPageIndexProperty().isEqualTo(0));

        nextButton = new Button("Next");
        nextButton.setOnAction(event -> pagination.setCurrentPageIndex(pagination.getCurrentPageIndex() + 1));
        nextButton.disableProperty().bind(pagination.currentPageIndexProperty().isEqualTo(textPages.length - 1));

        AnchorPane anchor = new AnchorPane();
        AnchorPane.setTopAnchor(pagination, 10.0);
        AnchorPane.setRightAnchor(pagination, 10.0);
        AnchorPane.setBottomAnchor(pagination, 10.0);
        AnchorPane.setLeftAnchor(pagination, 10.0);
        anchor.getChildren().addAll(pagination);
        Scene scene = new Scene(anchor, 400, 250);
        stage.setScene(scene);
        stage.setTitle("PaginationSample");
        stage.show();
    }
}
