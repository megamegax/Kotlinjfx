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
}
