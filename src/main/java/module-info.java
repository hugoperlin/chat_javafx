module ifpr.pgua.eic.chat {
    requires javafx.controls;
    requires javafx.fxml;

    opens ifpr.pgua.eic.chat.cliente to javafx.fxml;
    exports ifpr.pgua.eic.chat;
}
