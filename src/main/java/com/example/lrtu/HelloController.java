package com.example.lrtu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;


public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button file;

    @FXML
    private TextField pololctrok;

    @FXML
    private TextField pololstolb;

    @FXML
    private Button save;

    @FXML
    private TextField text;

    @FXML
    void initialize() {

        save.setOnAction(event -> {
            System.out.println("Файл успешно сохранен");
        });

        file.setOnAction(event -> {
            //Cоздаем новый объект JFileChooser - это компонент окна выбора файлов.
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Выберите файл");
            //Устанавливаем фильтр файлов с помощью метода setFileFilter, указывая только файлы с расширением .xlsx.
            fileChooser.setFileFilter(new FileNameExtensionFilter("Файлы Excel", "xlsx"));

            int userSelection = fileChooser.showOpenDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                // Получение выбранного файла
                File selectedFile = fileChooser.getSelectedFile();
                System.out.println("Выбран файл: " + selectedFile.getAbsolutePath());
            }
        });
    }

}
