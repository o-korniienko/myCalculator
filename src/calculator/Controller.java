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

    String indexAction;
    String numberOne;
    String numberTwo;
    BigDecimal big1;
    BigDecimal big2;
    int test1;
    int test2;

    @FXML
    public void initialize() {

        bClearAll.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().contains("r")) {
                    tx.setText("");
                } else {
                    tx.setText("");
                    big1 = null;
                    big2 = null;
                    test1 = 0;
                    test2 = 0;
                    indexAction = null;
                }
            }
        });

        bClearOne.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().isEmpty()) {
                    big1 = null;
                    big2 = null;
                    test1 = 0;
                    test2 = 0;
                    indexAction = null;
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
                clickOnNumber("1");
            }
        });

        b2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                clickOnNumber("2");
            }
        });

        b3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                clickOnNumber("3");
            }
        });

        b4.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                clickOnNumber("4");
            }
        });

        b5.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                clickOnNumber("5");
            }
        });

        b6.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                clickOnNumber("6");
            }
        });

        b7.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                clickOnNumber("7");
            }
        });

        b8.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                clickOnNumber("8");
            }
        });

        b9.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                clickOnNumber("9");
            }
        });

        b0.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                clickOnNumber("0");
            }
        });

        bPoint.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (test1 == 1) return;
                if (tx.getText().isEmpty()) return;
                else tx.setText(tx.getText() + ".");
            }
        });

        bSubtract.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("-")) return;
                else {
                    if (tx.getText().isEmpty()) tx.setText("-");
                    else {
                        setButtonAction("-");
                    }
                }
            }

        });

        bAdd.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("-") || tx.getText().isEmpty()) return;
                else {
                    setButtonAction("+");
                }
            }
        });

        bMultiply.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("-") || tx.getText().isEmpty()) return;
                else {
                    setButtonAction("*");
                }
            }
        });

        bDivide.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("-") || tx.getText().isEmpty()) return;
                else {
                    setButtonAction("/");
                }
            }
        });

        bSqrt.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("-") || tx.getText().isEmpty() || tx.getText().contains("-")) return;
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
                if (tx.getText().equals("-") || tx.getText().isEmpty()) return;
                else {
                    setButtonAction("k");
                }
            }
        });

        bPercentages.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (tx.getText().equals("-") || tx.getText().isEmpty()) return;
                else {
                    setButtonAction("%");
                }

            }
        });

        bResult.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (indexAction == null || tx.getText().isEmpty() || tx.getText().equals("-")) return;
                else {
                    try {
                        numberTwo = tx.getText();
                        big2 = BigDecimal.valueOf(Double.parseDouble(numberTwo));
                        if (big1 == null || big2 == null) {
                            return;
                        }
                        doAction(indexAction);
                        big1 = null;
                        big2 = null;
                        test1 = 0;
                        test2 = 0;
                        indexAction = null;
                    } catch (Exception e) {
                        tx.setText("can not divide by zero");
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

    private void doAction(String actionStr) {
        if (actionStr == null) return;
        if (actionStr == "-") big1 = big1.subtract(big2);
        if (actionStr == "+") big1 = big1.add(big2);
        if (actionStr == "*") big1 = big1.multiply(big2);
        if (actionStr == "/") big1 = big1.divide(big2, 5, BigDecimal.ROUND_HALF_UP);
        if (actionStr == "k") {
            big1 = BigDecimal.valueOf(Math.pow(Double.valueOf(numberOne), Double.parseDouble(numberTwo)));
        }
        if (actionStr == "%") {
            BigDecimal big3 = BigDecimal.valueOf(100);
            big1 = big2.divide(big3).multiply(big1);
        }
        double result = big1.doubleValue();
        if (result % 1 == 0) {
            int resultInt = (int) result;
            tx.setText(String.valueOf(resultInt));
        } else {
            tx.setText(String.valueOf(big1));
        }
    }

    private void clickOnNumber(String numb) {
        if (test1 == 1) {
            tx.setText(numb);
            test1 = 0;
            test2 = 0;
        } else {
            tx.setText(tx.getText() + numb);
            test2 = 0;
        }
    }

    private void setButtonAction(String action) {
        if (indexAction == null) {
            getSet();
            indexAction = action;
        } else {
            if (test2 == 1) {
                return;
            } else {
                numberTwo = tx.getText();
                big2 = BigDecimal.valueOf(Double.parseDouble(numberTwo));
                doAction(indexAction);
                big1 = BigDecimal.valueOf(Double.parseDouble(tx.getText()));
                test1 = 1;
                test2 = 1;
                indexAction = action;
            }
        }
    }
}
