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
    double d1;
    double d2;
    double d3;
    BigDecimal big1;
    BigDecimal big2;

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
                if (tx.getText().isEmpty())
                    return;
                else {
                    s1 = tx.getText();
                    s2 = s1.substring(0, s1.length() - 1);
                    tx.setText(s2);
                }
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
                if (s1.equals("-")) return;
                else {
                    if (s1.isEmpty()) tx.setText("-");
                    else {
                        try {
                            d1 = Double.parseDouble(s1);
                            big1 = BigDecimal.valueOf(d1);
                            tx.setText("");
                            s0 = "-";
                        } catch (NumberFormatException e) {
                            tx.setText("please enter the numbers");
                        }
                    }
                }
            }

        });
        br.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("") || tx.getText().equals("-")) return;
                else {
                    try {
                        s1 = tx.getText();
                        d1 = Double.parseDouble(s1);
                        big1 = BigDecimal.valueOf(d1);
                        tx.setText("");
                        s0 = "+";
                    } catch (NumberFormatException e) {
                        tx.setText("please enter the numbers");
                    }
                }
            }
        });
        bt.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("") || tx.getText().equals("-")) return;
                else {
                    try {
                        s1 = tx.getText();
                        d1 = Double.parseDouble(s1);
                        big1 = BigDecimal.valueOf(d1);
                        tx.setText("");
                        s0 = "*";
                    } catch (NumberFormatException e) {
                        tx.setText("please enter the numbers");
                    }
                }
            }
        });
        by.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("") || tx.getText().equals("-")) return;
                else {
                    try {
                        s1 = tx.getText();
                        d1 = Double.parseDouble(s1);
                        big1 = BigDecimal.valueOf(d1);
                        tx.setText("");
                        s0 = "/";
                    } catch (NumberFormatException e) {
                        tx.setText("please enter the numbers");
                    }
                }
            }
        });
        bl.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("") || tx.getText().equals("-")) return;
                if (tx.getText().contains("-")) return;
                else {
                    try {
                        s1 = tx.getText();
                        d1 = Double.parseDouble(s1);
                        d3 = Math.sqrt(d1);
                        big1 = BigDecimal.valueOf(d3);
                        s = String.valueOf(big1);

                        tx.setText(s);
                        s0 = "l";
                    } catch (NumberFormatException e) {
                        tx.setText("please enter the numbers");
                    }
                }
            }
        });
        bk.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("") || tx.getText().equals("-")) return;
                else {
                    try {
                        s1 = tx.getText();
                        d1 = Double.parseDouble(s1);
                        big1 = BigDecimal.valueOf(d1);
                        tx.setText("");
                        s0 = "k";
                    } catch (NumberFormatException e) {
                        tx.setText("please enter the numbers");
                    }
                }
            }
        });
        bw.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (s0 == null || tx.getText().isEmpty() || tx.getText().equals("-")) return;
                else {
                    try {
                        s2 = tx.getText();
                        d2 = Double.parseDouble(s2);
                        big2 = BigDecimal.valueOf(d2);
                        if (s0 == "/" && d2 == 0) {
                            tx.setText("can not divide by zero");
                        } else {
                            if (s0 == "-")
                                big1 = big1.subtract(big2);
                            else if (s0 == "+") big1 = big1.add(big2);
                            if (s0 == "*") big1 = big1.multiply(big2);
                            if (s0 == "/") big1 = big1.divide(big2, 2, BigDecimal.ROUND_HALF_UP);
                            if (s0 == "k") {
                                d3 = Math.pow(d1, d2);
                                big1 = BigDecimal.valueOf(d3);
                            }
                            if (s0 == "l") tx.setText("");
                            s = String.valueOf(big1);
                            tx.setText(s);
                        }
                    } catch (NumberFormatException e) {
                        tx.setText("please enter the numbers");
                    }

                }
            }
        });
    }
}
