package me.lkp111138.deebot.commands;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.request.SendMessage;
import me.lkp111138.deebot.Main;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Toggle69Command implements Command {
    @Override
    public void respond(TelegramBot bot, Message msg, String[] args) {
        send(bot, msg);
    }

    private void send(TelegramBot bot, Message msg) {
        switch (msg.chat().type()) {
            case group:
            case supergroup:
                try (PreparedStatement stmt = Main.getConnection().prepareStatement("UPDATE `groups` SET protest_mode=1-protest_mode WHERE gid=?")) {
                    stmt.setLong(1, msg.chat().id());
                    stmt.execute();
                    SendMessage send = new SendMessage(msg.chat().id(), "Done.");
                    bot.execute(send);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }
    }


}
