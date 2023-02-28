package org.example.collections.homework1;

import java.util.Arrays;
import java.util.List;

public class ChatRunner {
    public static void main(String[] args) {
        List<Chat> chats = Arrays.asList(new Chat("ICQ", 246),
                new Chat("Skype", 7777),
                new Chat("WhathsUp", 7777),
                new Chat("Telegram", 777),
                new Chat("Telegram", 7777),
                new Chat("Telegram", 7778));

        List<Chat> result = ChatUtils.deleteChats(chats);
        //sort by name by default
        result.sort(Chat::compareTo);
        System.out.println(result);
        System.out.println();
        //sort by quantity next by name
        result.sort(new QuantityNameComparator());
        System.out.println(result);



    }
}
