package com.example.sharnir_bot.utils;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для реализации кнопок в опросе
 */

@Component
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Buttons {
    final String YES = "YES_BUTTON";
    final String NO = "NO_BUTTON";

    public InlineKeyboardMarkup getInlineKeyboardMarkup() {
        InlineKeyboardMarkup inlineMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine = new ArrayList<>();
        var yesButton = new InlineKeyboardButton();
        yesButton.setText("+");
        yesButton.setCallbackData(YES);
        var noButton = new InlineKeyboardButton();
        noButton.setText("-");
        noButton.setCallbackData(NO);

        rowInLine.add(yesButton);
        rowInLine.add(noButton);
        rowsInLine.add(rowInLine);
        inlineMarkup.setKeyboard(rowsInLine);
        return inlineMarkup;
    }
}
