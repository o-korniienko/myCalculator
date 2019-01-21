package calculator;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.math.BigDecimal;

public class Controller {

    @FXML
    private Button bClearAll;
    @FXML
    private Button bPow;
    @FXML
    private Button bSqrt;
    @FXML
    private Button bClearOne;
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
    private Button bPoint;
    @FXML
    private Button bResult;
    @FXML
    private Button bSubtract;
    @FXML
    private Button bAdd;
    @FXML
    private Button bMultiply;
    @FXML
    private Button bDivide;
    @FXML
    private TextField tx;
    @FXML
    private Button bPercentages;

    String actionStr;
    String numberOne;
    String numberTwo;
    BigDecimal big1;
    BigDecimal big2;

    @FXML
    public void initialize() {

        bClearAll.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tx.setText("");
                big1 = null;
                big2 = null;
            }
        });
        bClearOne.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().isEmpty()) {
                    big1 = null;
                    big2 = null;
                    return;
                } else {
                    numberOne = tx.getText();
                    numberTwo = numberOne.substring(0, numberOne.length() - 1);
                    tx.setText(numberTwo);
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
        bPoint.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                tx.setText(tx.getText() + ".");
            }
        });
        bSubtract.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("-")) return;
                else {
                    if (tx.getText().isEmpty()) tx.setText("-");
                    else {
                        getSet();
                        actionStr = "-";
                    }
                }
            }

        });
        bAdd.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("-")) return;
                else {
                    getSet();
                    actionStr = "+";
                }
            }
        });
        bMultiply.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("-")) return;
                else {
                    getSet();
                    actionStr = "*";
                }
            }
        });
        bDivide.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("-")) return;
                else {
                    getSet();
                    actionStr = "/";
                }
            }
        });
        bSqrt.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("-")) return;
                if (tx.getText().contains("-")) return;
                else {
                    try {
                        numberOne = tx.getText();
                        big1 = BigDecimal.valueOf(Math.sqrt(Double.parseDouble(numberOne)));
                        double sQ = big1.doubleValue();
                        if (sQ % 1 == 0) {
                            int sQr = (int) sQ;
                            tx.setText(String.valueOf(sQr));
                            big1 = null;
                            big2 = null;
                        } else {
                            tx.setText(String.valueOf(big1));
                            actionStr = "l";
                            big1 = null;
                            big2 = null;
                        }
                    } catch (NumberFormatException e) {
                        tx.setText("please enter the numbers");
                    }
                }
            }
        });
        bPow.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("-")) return;
                else {
                    getSet();
                    actionStr = "k";

                }
            }
        });
        bPercentages.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("-")) return;
                else {
                    getSet();
                    actionStr = "%";
                }

            }
        });
        bResult.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (actionStr == null || tx.getText().isEmpty() || tx.getText().equals("-")) return;
                else {
                    try {
                        numberTwo = tx.getText();
                        big2 = BigDecimal.valueOf(Double.parseDouble(numberTwo));
                        if (big1 == null || big2 == null) {
                            return;
                        }
                        if (actionStr == "/" && Double.parseDouble(numberTwo) == 0) {
                            tx.setText("can not divide by zero");
                        } else {
                            if (actionStr == "-")
                                big1 = big1.subtract(big2);
                            else if (actionStr == "+") big1 = big1.add(big2);
                            if (actionStr == "*") big1 = big1.multiply(big2);
                            if (actionStr == "/") big1 = big1.divide(big2, 5, BigDecimal.ROUND_HALF_UP);
                            if (actionStr == "k") {
                                big1 = BigDecimal.valueOf(Math.pow(Double.valueOf(numberOne), Double.parseDouble(numberTwo)));
                            }
                            if (actionStr == "l") {
                                tx.setText("");
                            }
                            if (actionStr == "%") {
                                BigDecimal big3 = BigDecimal.valueOf(100);
                                big1 = big2.divide(big3).multiply(big1);
                            }
                            double result = big1.doubleValue();
                            if (result % 1 == 0) {
                                int resultInt = (int) result;
                                tx.setText(String.valueOf(resultInt));
                                big1 = null;
                                big2 = null;
                            } else {
                                tx.setText(String.valueOf(big1));
                                big1 = null;
                                big2 = null;
                            }
                        }
                    } catch (NumberFormatException e) {
                        tx.setText("please enter the numbers");
                    }

                }
            }
        });
    }

    public void getSet() {
        try {
            numberOne = tx.getText();
            big1 = BigDecimal.valueOf(Double.parseDouble(numberOne));
            tx.setText("");
        } catch (NumberFormatException e) {
            tx.setText("please enter the numbers");
        }
    }
}
