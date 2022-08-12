package haven.automation;

import haven.*;

public class Utils {
    public static UI getUI() {
        return ((JOGLPanel) MainFrame.instance.p).ui;
    }

    public static GameUI getGUI() {
        return getUI().gui;
    }

    /**
     * Send message to given chat
     *
     * @param chatName Name of the chat, for example "Area Chat"
     * @param msg      Message to send into the chat
     */
    public static void msgToChat(UI ui, String chatName, String msg) {
        for (Widget w = ui.gui.chat.lchild; w != null; w = w.prev) {
            if (w instanceof ChatUI.EntryChannel) {
                ChatUI.EntryChannel cht = (ChatUI.EntryChannel) w;
                if (cht.name().equals(chatName))
                    cht.send(msg);
            }
        }
    }


}
