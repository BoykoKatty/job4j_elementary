package ru.job4j;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Info {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(formattedDate.format(date));
    }
}
