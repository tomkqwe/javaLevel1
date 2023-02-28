package org.example.collections.homework1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ChatRunner {
    public static void main(String[] args) {
//        List<Chat> chats = Arrays.asList(new Chat("ICQ", 246),
//                new Chat("Skype", 7777),
//                new Chat("WhathsUp", 7777),
//                new Chat("Telegram", 777),
//                new Chat("Telegram", 7777),
//                new Chat("Telegram", 7778));
//
//        List<Chat> result = ChatUtils.deleteChats(chats);
//        //sort by name by default
//        result.sort(Chat::compareTo);
//        System.out.println(result);
//        System.out.println();
//        //sort by quantity next by name
//        result.sort(new QuantityNameComparator());
//        System.out.println(result);

        List<User> users1 = Arrays.asList(new User(1, "Artem", 27), new User(2, "Ivan", 44), new User(4, "Sanya", 14));
        List<User> users2 = Arrays.asList(new User(1, "Bob", 17), new User(3, "Sveta", 18), new User(12, "Gimmie", 20));
        List<User> users3 = Arrays.asList(new User(23, "Dima", 32),new User(34,"Sema",17));

        List<Chat> chats = Arrays.asList(new Chat("Telegram", users1),
                new Chat("Viber", users2),
                new Chat("Sheeesh", users3));

        List<User> result = ChatUtils.transformateChat(chats);
        System.out.println(result);

        double averageAge = ChatUtils.getAverageAge(result);

//        OptionalDouble average = result.stream().mapToInt(User::getAge).average();
//        System.out.println(average);

        System.out.println(averageAge);


    }
}
