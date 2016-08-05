package com.xiaomi.alice;

import bitoflife.chatterbean.AliceBot;
import bitoflife.chatterbean.AliceBotMother;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by qinbin on 2016/6/21.
 */
public class Main {
    public static final String END = "bye";

    public static String input()
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        try
        {
            input = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;

    }
    public static void main(String[] args) throws Exception {
        System.getProperties().load(Main.class.getClassLoader().getResourceAsStream("my.properties"));

        AliceBotMother mother = new AliceBotMother();
        mother.setUp();
        AliceBot bot = mother.newInstance();
        System.out.println(bot.respond("今天星期几"));
        System.out.println(bot.respond("好烦呢"));
        /*System.err.println("Alice>" + bot.respond("welcome"));
        while (true) {
            String input = input();
            if (END.equalsIgnoreCase(input)) {
                break;
            }
            System.err.println("Alice>" + bot.respond(input));
        }*/
    }
}
