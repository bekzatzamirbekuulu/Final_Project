package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import java.util.*;

public class Controller{

    @FXML
    private Button button1_1;

    @FXML
    private Button button1_2;

    @FXML
    private Button button1_3;

    @FXML
    private Button button1_4;

    @FXML
    private Button button2_1;

    @FXML
    private Button button2_2;

    @FXML
    private Button button2_3;

    @FXML
    private Button button2_4;

    @FXML
    private Button button3_4;

    @FXML
    private Button button3_3;

    @FXML
    private Button button3_2;

    @FXML
    private Button button3_1;

    @FXML
    private Button button4_4;

    @FXML
    private Button button4_3;

    @FXML
    private Button button4_2;

    @FXML
    private Button button4_1;

    @FXML
    private Button startButton;

    boolean isSecond = false;
    boolean isThird = false;
    ActionEvent temp;
    ActionEvent temp1;

    @FXML
    void start(){
        String[] letters = {"A", "A", "B", "B", "C", "C", "D", "D", "E", "E", "F", "F", "G", "G", "J", "J"};
        List<String> listLetters = Arrays.asList(letters);
        Collections.shuffle(listLetters);
        listLetters.toArray(letters);
        startButton.setDisable(true);
        startButton.setVisible(false);
        button1_1.setText(letters[0]);
        button1_1.setDisable(false);
        button1_1.setFont(new Font("System Bold", 28));
        button1_2.setText(letters[1]);
        button1_2.setDisable(false);
        button1_2.setFont(new Font("System Bold", 28));
        button1_3.setText(letters[2]);
        button1_3.setDisable(false);
        button1_3.setFont(new Font("System Bold", 28));
        button1_4.setText(letters[3]);
        button1_4.setDisable(false);
        button1_4.setFont(new Font("System Bold", 28));
        button2_1.setText(letters[4]);
        button2_1.setDisable(false);
        button2_1.setFont(new Font("System Bold", 28));
        button2_2.setText(letters[5]);
        button2_2.setDisable(false);
        button2_2.setFont(new Font("System Bold", 28));
        button2_3.setText(letters[6]);
        button2_3.setDisable(false);
        button2_3.setFont(new Font("System Bold", 28));
        button2_4.setText(letters[7]);
        button2_4.setDisable(false);
        button2_4.setFont(new Font("System Bold", 28));
        button3_1.setText(letters[8]);
        button3_1.setDisable(false);
        button3_1.setFont(new Font("System Bold", 28));
        button3_2.setText(letters[9]);
        button3_2.setDisable(false);
        button3_2.setFont(new Font("System Bold", 28));
        button3_3.setText(letters[10]);
        button3_3.setDisable(false);
        button3_3.setFont(new Font("System Bold", 28));
        button3_4.setText(letters[11]);
        button3_4.setDisable(false);
        button3_4.setFont(new Font("System Bold", 28));
        button4_1.setText(letters[12]);
        button4_1.setDisable(false);
        button4_1.setFont(new Font("System Bold", 28));
        button4_2.setText(letters[13]);
        button4_2.setDisable(false);
        button4_2.setFont(new Font("System Bold", 28));
        button4_3.setText(letters[14]);
        button4_3.setDisable(false);
        button4_3.setFont(new Font("System Bold", 28));
        button4_4.setText(letters[15]);
        button4_4.setDisable(false);
        button4_4.setFont(new Font("System Bold", 28));




    }
    @FXML
    void clicked(ActionEvent event) throws InterruptedException {
        ((Button)event.getSource()).setOpacity(1.0);
        ((Button)event.getSource()).setDisable(true);
        Thread.sleep(1000);
        if (!isSecond && (temp != event)) {
            isSecond = true;
            temp = event;
        }else{
            String text1 = ((Button)temp.getSource()).getText();
            String text2 = ((Button)event.getSource()).getText();
            if (text1.equals(text2) && !isThird){
                ((Button)temp.getSource()).setDisable(true);
                ((Button)event.getSource()).setDisable(true);
                ((Button)temp.getSource()).setStyle("-fx-background-color: #00FF00;");
                ((Button)event.getSource()).setStyle("-fx-background-color: #00FF00;");
                isSecond = false;
                isThird = false;
            }else{
                if (!isThird) {
                    temp1 = event;
                    isThird = true;
                }else{
                    String text11 = ((Button)temp1.getSource()).getText();
                    String text22 = ((Button)temp.getSource()).getText();
                    if (text11.equals(text22)){
                        ((Button)temp.getSource()).setDisable(true);
                        ((Button)temp1.getSource()).setDisable(true);
                        ((Button)temp.getSource()).setStyle("-fx-background-color: #00FF00;");
                        ((Button)temp1.getSource()).setStyle("-fx-background-color: #00FF00;");
                    }else{
                        ((Button)temp.getSource()).setDisable(false);
                        ((Button)temp1.getSource()).setDisable(false);
                        ((Button)temp.getSource()).setOpacity(0);
                        ((Button)temp1.getSource()).setOpacity(0);
                    }
                    temp = event;
                    ((Button)event.getSource()).setOpacity(1);
                    isThird = false;

                }

            }
        }
    }
}
