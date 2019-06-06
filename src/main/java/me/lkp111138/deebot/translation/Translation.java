package me.lkp111138.deebot.translation;

import java.util.HashMap;

public class Translation {
    public String BOT_NAME() {
        return "jokebig2bot";
    }
    public String ERROR() {
        return "An error occurred: ";
    }
    public String JOIN_SUCCESS() {
        return "You have successfully joined the game in *%s*! Game IDL %d";
    }
    public String BACK_TO() {
        return "Back to ";
    }
    public String JOINED_ANNOUNCEMENT() {
        return "[ <a href=\"tg://user?id=%d\">%s</a> ] has joined the game! <b>%d</b> out of <b>4</b> has joined.";
    }
    public String START_ME_FIRST() {
        return "Please start me first!";
    }
    public String START_ME() {
        return "Start me";
    }
    public String EXTENDED_ANNOUNCEMENT() {
        return "Extended for 30 seconds. %d seconds left to /join";
    }
    public String PASS() {
        return "Pass";
    }
    public String PASS_ON_EMPTY() {
        return "The desk is empty, you are free to play any valid combination";
    }
    public String PASS_ON_FIRST() {
        return "It's the first turn, your hand must include \u2666\ufe0f 3";
    }
    public String NO_D3_ON_FIRST() {
        return "You must play \u2666\ufe0f 3 in the first turn";
    }
    public String PLAYED_ANNOUNCEMENT_LINK() {
        return "<a href=\"https://t.me/%s\">%s</a> played ";
    }
    public String PLAYED_ANNOUNCEMENT() {
        return "%s played ";
    }
    public String PASS_ANNOUNCEMENT() {
        return "%s passed";
    }
    public String PASS_ANNOUNCEMENT_LINK() {
        return "<a href=\"https://t.me/%s\">%s</a> passed";
    }
    public String INVALID_HAND() {
        return "Invalid combination, please try again";
    }
    public String SMALL_HAND() {
        return "Hand too small, please try again";
    }
    public String WON_ANNOUNCEMENT() {
        return "<a href=\"tg://user?id=%d\">%s</a> Won!\n\n";
    }
    public String NEW_GAME_PROMPT() {
        return "\nType /play to start a new game";
    }
    public String GAME_ENDED() {
        return "Game ended";
    }
    public String GAME_ENDED_ANNOUNCEMENT() {
        return "Game ended. /play to start a new one";
    }
    public String YOUR_DECK() {
        return "Your deck:\n";
    }
    public String STARTING_DECK() {
        return "Starting deck:\n";
    }
    public String YOUR_TURN_PROMPT() {
        return "It's your turn!\nOn the desk";
    }
    public String THERE_IS_NOTHING() {
        return " there is nothing";
    }
    public String TIMES_UP() {
        return "Time's up!";
    }
    public String AFK_KILL() {
        return "Looks like everybody is away, stopping game!";
    }
    public String ON_DESK_LINK() {
        return "\nOn the desk: %s by <a href=\"https://t.me/%s\">%s</a>\n";
    }
    public String ON_DESK() {
        return "\nOn the desk: %s by %s\n";
    }
    public String YOUR_TURN_ANNOUNCEMENT() {
        return "It's your turn, <a href=\"tg://user?id=%d\">%s</a>, you have %d seconds to play your cards!";
    }
    public String PICK_CARDS() {
        return "Pick your cards";
    }
    public String CHOOSE_SOME_CARDS() {
        return "\u23eb Choose some cards \u23eb";
    }
    public String JOIN_PROMPT() {
        return "You have %d seconds left to /join";
    }
    public String NO_GAME_TO_JOIN() {
        return "There is no game to join here. /play to start one.";
    }
    public String GAME_STARTING() {
        return "A game is about to start! Type /join to join.";
    }
    public String GAME_STARTED() {
        return "The game has already started! Wait for it to finish before starting a new one.";
    }
    public String GAME_START_ANNOUNCEMENT() {
        return "[ <a href=\"tg://user?id=%d\">%s</a> ] has started a new game! You have %d seconds to /join\n\nPlace-based Scoring: %s\nCard multiplication: %s\nAssistance penalty: %s\nGame ID: %d";
    }
    public String NOTHING_ON_DESK() {
        return "\nThere is nothing on the desk.\n";
    }
    public String SORT_SUIT() {
        return "Sort by suit";
    }
    public String SORT_FACE() {
        return "Sort by face";
    }
    public String FLEE_ANNOUNCEMENT() {
        return "<a href=\"tg://user?id=%d\">%s</a> has fled from the game! %d player%s remaining.";
    }
    public String MAINT_MODE_NOTICE() {
        return "Bot is under maintenance, please try again later.";
    }
    public String CLOSE() {
        return "Close";
    }

    public String HELP() {
        return "**Commands**\n" +
                "\n" +
                "/stats - View your stats.\n" +
                "/help - Shows help.\n" +
                "\n" +
                "**Group only commands**\n" +
                "\n" +
                "/play - Starts a new game.\n" +
                "/startgame - Alias of /play\n" +
                "/join - Joins a game.\n" +
                "/flee - Leaves a game while it is still recruiting.\n" +
                "/extend - Extend the recruiting period.\n" +
                "\n" +
                "**Group admin only commands**\n" +
                "\n" +
                "/config - Changes game configuration, opens in PM.\n" +
                "/setlang - Changes game language.\n" +
                "\n" +
                "**Technical**\n" +
                "\n" +
                "/runinfo - Displays some info.\n" +
                "/ping - Unknown command.";
    }

    public String ACHIEVEMENT_UNLOCKED() {
        return "Achievement Unlocked!\n";
    }

    public String ACHIEVEMENT_PM(String achv_key) {
        switch (achv_key) {
            case "FIRST_GAME":
                return "**Newbie**\n" +
                        "Play your first game.";
            case "FIRST_WIN":
                return "**I won**\n" +
                        "Win a game.";
            case "PLAY_WITH_MINT":
                return "**You need a mint?**\n" +
                        "Play a game with the developer.";
            case "FIRST_BLOOD":
                return "**First Game**\n" +
                        "Play your first game.";
            case "ROOKIE":
                return "**Rookie**\n" +
                        "Play 50 games.";
            case "FAMILIARIZED":
                return "**Familiarized**\n" +
                        "Play 200 games.";
            case "ADDICTED":
                return "**Addicted**\n" +
                        "Play 1000 games. Loved the game don't you?";
            case "AMATEUR":
                return "**Amateur**\n" +
                        "Win 20 games.";
            case "ADEPT":
                return "**Adept**\n" +
                        "Win 100 games. That's impressive.";
            case "EXPERT":
                return "**Expert**\n" +
                        "Win 500 games. That's insane!";
            case "LOSE_IT_ALL":
                return "**Lose it all**\n" +
                        "Lose a game without playing a single card. Oof.";
            case "DEEP_FRIED":
                return "**Deep fried**\n" +
                        "Win a game while your opponents do not get a chance to play a single card.";
            default:
                return achv_key;
        }
    }

    private static HashMap<String, Translation> translations;
    private static final Translation DEFAULT = new Translation();

    public static Translation get(String lang) {
        if (translations == null) {
            translations = new HashMap<>();
            translations.put("en", DEFAULT);
            translations.put("zh", new TraditionalChinese());
            translations.put("hk", new HongKongChinese());
        }
        return translations.getOrDefault(lang, DEFAULT);
    }
}