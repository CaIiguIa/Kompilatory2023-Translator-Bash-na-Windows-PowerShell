package pl.edu.agh.kis.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import org.apache.commons.lang3.exception.ExceptionUtils;
import pl.edu.agh.kis.Main;
import pl.edu.agh.kis.files.FullFileReader;
import pl.edu.agh.kis.files.InputOutputFileManager;
import pl.edu.agh.kis.log.Logger;
import pl.edu.agh.kis.settings.ProgramConfig;

import java.io.*;
import java.net.URL;
import java.util.*;

public class Controller implements Initializable {
    @FXML
    TextArea BashCode;

    @FXML
    TextArea PowershellCode;

    @FXML
    Label ErrorMsg;

    @FXML
    TextField Input;

    @FXML
    TextField Output;

    @FXML
    TextField Suffix;

    @FXML
    CheckBox Comments;

    @FXML
    public void Translate(ActionEvent e) {
        PowershellCode.setStyle("-fx-text-fill: black;");

        //Check input file
        if (Input.getText().equals("")) ErrorMsg.setText("You need to choose Inpt file");
        else if (!Input.getText().substring(Input.getText().lastIndexOf('.')).equals(".sh")) ErrorMsg.setText("Input file must be a bash script (.sh " +
                "extension)");
        else if (!checkNamePropriety(Input.getText())) ErrorMsg.setText("Input file name contains forbidden characters");

            //check output directory
        else if (Output.getText().equals("")) ErrorMsg.setText("You must choose output directory");
        else if (Output.getText().lastIndexOf(".") > 0) ErrorMsg.setText("You must choose a directory (not a file) as output directory");
        else if (!checkNamePropriety(Output.getText())) ErrorMsg.setText("Output file name contains forbidden characters");

            //check suffix
        else if (!checkNamePropriety(Suffix.getText())) ErrorMsg.setText("Output file suffix contains forbidden characters");

        else {
            //update arguments
            ProgramConfig config = ProgramConfig.getInstance();
            config.setComments(Comments.isSelected());
            Queue<String> q = new LinkedList<>();
            q.add(Input.getText());
            config.setInput(q);
            config.setOutputDirectory(Output.getText());
            config.setSuffix(Suffix.getText());

            //Translate and save to file
            String out = InputOutputFileManager.process(Input.getText(), Main.run);
            String errors = Logger.getInstance().getAllLogs();
            errors = errors.substring(errors.indexOf(".sh") + 3);
            if (errors.replaceAll("( |\t|\n|\r)", "").equals("")) {
                PowershellCode.setText(out);
                File file =
                        new File(Output.getText() + (Output.getText().lastIndexOf("/") > 0 ? "/" : "\\") + InputOutputFileManager.getOutputFileName(new File(Input.getText()).getName()));

                try {
                    FileWriter writer = new FileWriter(file);
                    writer.write(out);
                    writer.close();
                } catch (IOException err) {
                    String stack = ExceptionUtils.getStackTrace(err);
                    Logger.getInstance().addLog(stack);
                    ErrorMsg.setText("There was an error while writing file, please check input file and output directory");
                }
            }
            else {
                PowershellCode.setText(errors);
                PowershellCode.setStyle("-fx-text-fill: red;");
            }

        }
    }

    @FXML
    public void ChooseFile(ActionEvent e) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose Input File");
        File file = fileChooser.showOpenDialog(App.PrimaryStage);
        if (file == null) {
            ErrorMsg.setText("You didn't choose any file");
            return;
        }

        String path = file.getAbsolutePath();
        String extension = path.substring(path.lastIndexOf('.'));

        if (extension.equals(".sh")) {
            Input.setText(path);
            ErrorMsg.setText("");
            BashCode.setText(new FullFileReader(Input.getText()).contents);
            PowershellCode.setText("");
        } else ErrorMsg.setText("Wrong file extension: " + extension);
    }

    @FXML
    public void chooseDirectory(ActionEvent e) {
        DirectoryChooser dir = new DirectoryChooser();
        File file = dir.showDialog(App.PrimaryStage);
        if (file != null) {
            Output.setText(file.getAbsolutePath());
            ErrorMsg.setText("");
        } else ErrorMsg.setText("You didn't choose any directory");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ProgramConfig config = ProgramConfig.getInstance();
        ErrorMsg.setText("");
        if (config.skipComments()) Comments.setSelected(true);
        Suffix.setText(config.getCustomSuffix());
        Input.setText(config.getInputFiles().peek());
        Output.setText(config.getOutputDirectory());
        BashCode.setText(new FullFileReader(Input.getText()).contents);
        BashCode.setEditable(false);
        PowershellCode.setEditable(false);
        try {
            Font.loadFont(getClass().getResource("\\JetBrainsMono-Medium.ttf").openStream(),13);
            BashCode.setFont(new Font("JetBrains Mono Medium", 13));
            PowershellCode.setFont(new Font("JetBrains Mono Medium", 13));
        } catch (IOException e) {
            BashCode.setFont(new Font("Segoe UI", 12));
            PowershellCode.setFont(new Font("Segoe UI", 12));
            System.out.println("Custom font not loaded");
        }

    }

    /*
     *Checks whether the give filename doesn't contain forbidden characters. Returns false if contains.
     */
    private boolean checkNamePropriety(String name) {
        List<Character> forbiddenChars = Arrays.asList('#', '%', '&', '{', '}', '<', '>', '*', '?', '$', '!', '\'', '\"', '+', '=', '`', '@', '|');
        for (var character : forbiddenChars)
            if (name.lastIndexOf(character) > 0) return false;

        return true;
    }
}
