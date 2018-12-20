package calculator;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.math.BigDecimal;

public class Controller {

    @FXML
    private Button bc;
    @FXML
    private Button bk;
    @FXML
    private Button bl;
    @FXML
    private Button bx;
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;
    @FXML
    private Button b0;
    @FXML
    private Button bq;
    @FXML
    private Button bw;
    @FXML
    private Button be;
    @FXML
    private Button br;
    @FXML
    private Button bt;
    @FXML
    private Button by;
    @FXML
    private TextField tx;

    String s0;
    String s1;
    String s2;
    String s;
    double i;
    double c;
    double d;
    BigDecimal d1;
    BigDecimal d2;
    BigDecimal d3;

    @FXML
    public void initialize() {

        bc.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tx.setText("");
            }
        });
        bx.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                s1 = tx.getText();
                s2 = s1.substring(0, s1.length() - 1);
                tx.setText(s2);
            }
        });
        b1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tx.setText(tx.getText() + "1");
            }
        });
        b2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tx.setText(tx.getText() + "2");
            }
        });
        b3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tx.setText(tx.getText() + "3");
            }
        });
        b4.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tx.setText(tx.getText() + "4");
            }
        });
        b5.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tx.setText(tx.getText() + "5");
            }
        });
        b6.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tx.setText(tx.getText() + "6");
            }
        });
        b7.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tx.setText(tx.getText() + "7");
            }
        });
        b8.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tx.setText(tx.getText() + "8");
            }
        });
        b9.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tx.setText(tx.getText() + "9");
            }
        });
        b0.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tx.setText(tx.getText() + "0");
            }
        });
        bq.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tx.setText(tx.getText() + ".");
            }
        });
        be.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                s1 = tx.getText();
                if (s1.isEmpty()) tx.setText("-");
                else {
                    i = Double.parseDouble(s1);
                    d1 = BigDecimal.valueOf(i);
                    tx.setText("");
                    s0 = "-";
                }
            }

        });
        br.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                s1 = tx.getText();
                i = Double.parseDouble(s1);
                d1 = BigDecimal.valueOf(i);
                tx.setText("");
                s0 = "+";
            }
        });
        bt.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                s1 = tx.getText();
                i = Double.parseDouble(s1);
                d1 = BigDecimal.valueOf(i);
                tx.setText("");
                s0 = "*";
            }
        });
        by.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                s1 = tx.getText();
                i = Double.parseDouble(s1);
                d1 = BigDecimal.valueOf(i);
                tx.setText("");
                s0 = "/";
            }
        });
        bl.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                s1 = tx.getText();
                i = Double.parseDouble(s1);
                d = Math.sqrt(i);
                d1 = BigDecimal.valueOf(d);
                s = String.valueOf(d1);

                tx.setText(s);
                s0 = "l";
            }
        });
        bk.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                s1 = tx.getText();
                i = Double.parseDouble(s1);
                d1 = BigDecimal.valueOf(i);
                tx.setText("");
                s0 = "k";
            }
        });
        bw.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                s2 = tx.getText();
                c = Double.parseDouble(s2);
                d2 = BigDecimal.valueOf(c);
                if (s0 == "-")
                    d1 = d1.subtract(d2);
                else if (s0 == "+") d1 = d1.add(d2);
                if (s0 == "*") d1 = d1.multiply(d2);
                if (s0 == "/") d1 = d1.divide(d2, 4, BigDecimal.ROUND_HALF_UP);
                if (s0 == "k") d = Math.pow(i, c);
                if (s0 == "k") d1 = BigDecimal.valueOf(d);
                if (s0 == "l") tx.setText("");

                s = String.valueOf(d1);
                tx.setText(s);
            }
        });
    }
}
