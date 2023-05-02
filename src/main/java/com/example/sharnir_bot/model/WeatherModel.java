package com.example.sharnir_bot.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * @Author Dmitry
 * Класс описывающий модель погоды
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WeatherModel {

    String name;
    Double temp;
    Double humidity;
    String icon;
    Double feelsLike;

}
