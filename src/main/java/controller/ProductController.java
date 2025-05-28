package controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.entity.Product;
import model.entity.enums.Brand;
import model.entity.enums.Os;

import java.time.LocalDate;
import java.util.Date;

public class ProductController {
@FXML
    private TextField productIdTxt,modelTxt,countTxt,priceTxt,searchBrandTxt,searchPriceTxt;
@FXML
    private RadioButton iosRdo,androidRdo;
@FXML
    private CheckBox hasChargerChk,hasHansfreeChk;
@FXML
    private ComboBox<Brand> brandCmb;
@FXML
    private DatePicker datePick;
@FXML
    private Button saveBtn,editBtn,deleteBtn,SearchBtn,showAllBtn;
@FXML
    private ToggleGroup osToggleGroup;
@FXML
    private TableView<Product> productTable;
@FXML
    private TableColumn<Product, Integer> ProductIdCol;
@FXML
    private TableColumn<Product, String> modelCol,countCol,priceCol;
@FXML
    private TableColumn<Product, Brand> BrandCol ;
@FXML
    private TableColumn<Product, Os> osCol;
@FXML
    private TableColumn<Product, Date> dateCol;
@FXML
    private TableColumn<Product, Boolean> hasChargerCol,hasHansfreeCol;


}
