package io.github.jiashunx.app.jsonformatter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

/**
 * @author jiashunx
 */
public class JsonFormatterController {

    @FXML
    private TextArea jsonResource;

    @FXML
    private TextArea jsonTarget;

    public void format() {
        try {
            String jsonResource = this.jsonResource.getText();
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonResource);
            String jsonTarget = jsonNode.toPrettyString();
            this.jsonTarget.setText(jsonTarget);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.titleProperty().set("异常");
            alert.headerTextProperty().set("json解析异常，reason：" + throwable.getMessage());
            alert.showAndWait();
        }
    }

}
