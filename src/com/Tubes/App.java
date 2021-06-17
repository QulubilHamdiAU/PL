package com.Tubes;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Qulubil Hamdi A U
 * @version 3.1
 * @since 1.0
 */
public class App extends Application {
    /**
     *
     * @param args sebagai parameter class main
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     *
     * @param primaryStage untuk start aplikasi
     */
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Perhitungan Gaji Karyawan");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(40, 40, 40, 40));

        Button btn = new Button("Hitung");
        HBox hbBtn = new HBox(15);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 2, 15);

        Scene scene = new Scene(grid, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

        Text title = new Text("Perhitungan Gaji");
        title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 16));
        grid.add(title, 0, 0, 2, 1);

        Label nama = new Label("Nama:");
        grid.add(nama, 0, 1);

        TextField name = new TextField();
        grid.add(name, 2, 1);

        Label usia = new Label("Usia:");
        grid.add(usia, 0, 2);

        TextField age = new TextField();
        grid.add(age,2,2);

        Label alamat = new Label("Alamat:");
        grid.add(alamat, 0, 3);

        TextField addr = new TextField();
        grid.add(addr, 2, 3);

        Label tmk = new Label("Tahun Masuk Kerja:");
        grid.add(tmk, 0, 4);

        TextField Tmk = new TextField();
        grid.add(Tmk, 2, 4);

        Label bulan = new Label("Bulan saat ini:");
        grid.add(bulan, 0, 5);

        ChoiceBox<String> cb = new ChoiceBox<>(FXCollections.observableArrayList("Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"));
        grid.add(cb, 2, 5);

        Label jl = new Label("Jumlah jam lembur:");
        grid.add(jl, 0, 6);

        TextField lbr = new TextField();
        grid.add(lbr, 2, 6);

        Label jbt = new Label("Jabatan perusahaan:");
        grid.add(jbt, 0, 7);

        ChoiceBox<String> jb = new ChoiceBox<>(FXCollections.observableArrayList("Direktur", "Manager", "Staf"));
        grid.add(jb, 2, 7);

        jb.getSelectionModel().selectedIndexProperty().addListener(
                (ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
                    Text teks =new Text("PERLU DIPERHATIKAN!!");
                    teks.setFill(Color.RED);
                    grid.add(teks,0,10);
                    Text teks1 =new Text("Harap masukkan gaji pokok \nsesuai pilihan anda!!");
                    teks1.setFill(Color.RED);
                    grid.add(teks1,0,11);
                    Text teks2 =new Text("Direktur\t : Rp. 17.500.000\nManager\t : Rp. 10.000.000\nStaf\t\t : Rp. 7.000.000");
                    teks2.setFill(Color.RED);
                    grid.add(teks2,2,11);
                });

        Label gaji = new Label("Gaji Pokok :");
        grid.add(gaji,0,12);

        TextField fee = new TextField();
        grid.add(fee, 2, 12);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            /**
             *
             * @param event parameter untuk action dari button
             */
            @Override
            public void handle(ActionEvent event) {
                String KERJA = Tmk.getText();

                if (KERJA.length()==4) {
                    String NAMA = name.getText();
                    String UMUR = age.getText();
                    String ALAMAT = addr.getText();
                    String BULAN = cb.getValue();
                    int BONUS = Integer.parseInt(lbr.getText());
                    String JABATAN = jb.getValue();
                    int GAJIPOKOK = Integer.parseInt(fee.getText());

                    systemInformation("Perhitungan Gaji Karyawan", "System says:", "Data sedang diproses");
                    GridPane gridPane = new GridPane();
                    gridPane.setAlignment(Pos.CENTER);
                    gridPane.setVgap(10);

                    Scene scene1 = new Scene(gridPane,500,500);
                    primaryStage.setScene(scene1);
                    primaryStage.show();

                    Text title1 = new Text("Hasil perhitungan gaji Bulan "+BULAN);
                    title1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 18));
                    gridPane.add(title1, 0, 0, 2, 1);

                    Label nama = new Label("Nama");
                    gridPane.add(nama,0,1);
                    Text nama1 =new Text(" :   "+NAMA);
                    gridPane.add(nama1,1,1);

                    Label umur1 = new Label("Umur");
                    gridPane.add(umur1,0,2);
                    Text umur2 =new Text(" :   "+UMUR);
                    gridPane.add(umur2,1,2);

                    Label alamat1 = new Label("Alamat");
                    gridPane.add(alamat1,0,3);
                    Text alamat2 =new Text(" :   "+ALAMAT);
                    gridPane.add(alamat2,1,3);

                    Label tmk1 = new Label("Tahun Masuk Kerja");
                    gridPane.add(tmk1,0,4);
                    Text tmk2 =new Text(" :   "+KERJA);
                    gridPane.add(tmk2,1,4);

                    Label jabatan1 = new Label("Jabatan");
                    gridPane.add(jabatan1,0,5);
                    Text jabatan2 = new Text(" :   "+JABATAN);
                    gridPane.add(jabatan2,1,5);

                    Label gaji = new Label("Gaji Pokok");
                    gridPane.add(gaji,0,6);
                    Text gaji1 = new Text(" :   "+GAJIPOKOK);
                    gridPane.add(gaji1,1,6);

                    Label tunjangan = new Label("Tunjangan");
                    gridPane.add(tunjangan,0,7);

                    if (GAJIPOKOK == 17500000){
                        int tunjangan1;
                        tunjangan1 = GAJIPOKOK*20/100;
                        Text tunjangan2 = new Text(" :   "+tunjangan1);
                        gridPane.add(tunjangan2,1,7);

                        Label bonus = new Label("Bonus");
                        gridPane.add(bonus,0,8);
                        int bonus1;
                        bonus1 = BONUS * 100000;
                        Text bonus2 = new Text(" :   "+bonus1);
                        gridPane.add(bonus2,1,8);

                        Text garis = new Text("____________________");
                        gridPane.add(garis,0,9);
                        Text garis1 = new Text("_____________+");
                        gridPane.add(garis1,1,9);

                        Label total = new Label("Total Gaji");
                        gridPane.add(total,0,10);
                        int hitung;
                        hitung = GAJIPOKOK + tunjangan1 + bonus1;
                        Text total1 = new Text(" :   "+hitung);
                        gridPane.add(total1,1,10);

                    }else if (GAJIPOKOK == 10000000){
                        int tunjangan3;
                        tunjangan3 = GAJIPOKOK*15/100;
                        Text tunjangan4 = new Text(" :   "+tunjangan3);
                        gridPane.add(tunjangan4,1,7);

                        Label bonus3 = new Label("Bonus");
                        gridPane.add(bonus3,0,8);
                        int bonus4;
                        bonus4 = BONUS * 100000;
                        Text bonus5 = new Text(" :   "+bonus4);
                        gridPane.add(bonus5,1,8);

                        Text garis2 = new Text("____________________");
                        gridPane.add(garis2,0,9);
                        Text garis3 = new Text("_____________+");
                        gridPane.add(garis3,1,9);

                        Label total2 = new Label("Total Gaji");
                        gridPane.add(total2,0,10);
                        int hitung1;
                        hitung1 = GAJIPOKOK + tunjangan3 + bonus4;
                        Text total3 = new Text(" :   "+hitung1);
                        gridPane.add(total3,1,10);

                    }else if (GAJIPOKOK == 7000000){
                        int tunjangan5;
                        tunjangan5 = GAJIPOKOK*10/100;
                        Text tunjangan6 = new Text(" :   "+tunjangan5);
                        gridPane.add(tunjangan6,1,7);

                        Label bonus6 = new Label("Bonus");
                        gridPane.add(bonus6,0,8);
                        int bonus7;
                        bonus7 = BONUS * 100000;
                        Text bonus8 = new Text(" :   "+bonus7);
                        gridPane.add(bonus8,1,8);

                        Text garis4 = new Text("____________________");
                        gridPane.add(garis4,0,9);
                        Text garis5 = new Text("_____________+");
                        gridPane.add(garis5,1,9);

                        Label total4 = new Label("Total Gaji");
                        gridPane.add(total4,0,10);
                        int hitung2;
                        hitung2 = GAJIPOKOK + tunjangan5 + bonus7;
                        Text total5 = new Text(" :   "+hitung2);
                        gridPane.add(total5,1,10);

                    }


                    Button Back= new Button("Back");
                    gridPane.add(Back,1,11);

                    Back.setOnAction(new EventHandler<ActionEvent>() {
                        /**
                         *
                         * @param event parameter button back untuk kembali ke stage awal
                         */
                        @Override
                        public void handle(ActionEvent event) {
                            start(primaryStage);
                        }
                    });



                } else {
                    systemWarning("ERROR!", "System Says:", "Masukkan Format Tahun Secara Lengkap / 4 Digit!!");
                }
            }
        });
        primaryStage.show();
    }

    /**
     *
     * @param title sebagai judul dari information data berhasil
     * @param header sebagai awalan kalimat informasi
     * @param isi isi dari informasi jika data sedang diproses
     */
    public void systemInformation(String title, String header, String isi) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(isi);
        alert.showAndWait();
    }

    /**
     *
     * @param title sebagai judul dari warning message kesalahan inputan
     * @param header awalan kalimat didalam warning message
     * @param isi isi dari warning message
     */
    public void systemWarning(String title, String header, String isi) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(isi);
        alert.showAndWait();
    }
}
