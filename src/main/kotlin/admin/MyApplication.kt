package admin

/**
 * Created by hunyadym on 2016. 02. 10..
 */

import admin.view.MainView
import tornadofx.App

fun main(args: Array<String>) {
    javafx.application.Application.launch(MyApplication::class.java);
}

class MyApplication : App() {
    override val primaryView = MainView::class
/*
override fun start(stage: Stage?) {
 val uri: java.net.URL = MyApplication::class.java.getResource("/layout/main/MainView.fxml");
 println(uri);
 val mScene: Scene = Scene(load(uri),300.0,300.0);
 stage!!.scene = (mScene);
 stage.title = "Teszt";
 stage.show();
}
*/

}
