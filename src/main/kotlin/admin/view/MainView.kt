/**
 * Created by hunyadym on 2016. 02. 10..
 */

package admin.view

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.layout.AnchorPane
import tornadofx.View

class MainView : View() {
    override val root: AnchorPane by fxml()

    @FXML lateinit var testButton: Button;

    init {
        title = "Teszt"
        testButton.text = "Teszt2"
    }
}