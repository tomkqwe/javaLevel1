package org.example.collections.homework1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ChatUtils {
    private ChatUtils() {
    }

//    public static List<Chat> deleteChats(List<Chat> chats) {
//        ArrayList<Chat> result = new ArrayList<>(chats);
//        Iterator<Chat> iterator = result.iterator();
//        while (iterator.hasNext()) {
//            Chat next = iterator.next();
//            if (next.getQuantity() < 1000) {
//                iterator.remove();
//            }
//        }
//        return result;
//    }

    public static List<User> transformateChat(List<Chat> chats) {
        ArrayList<User> resultList = new ArrayList<>();
        for (Chat chat : chats) {
            for (User user : chat.getUsers()) {
                if (user.getAge() >= 18) {
                    resultList.add(user);
                }
            }
        }
        return resultList;
    }

    public static double getAverageAge(List<User> list) {
        int sum = 0;
        for (User user : list) {
            sum += user.getAge();
        }
        return sum / (list.size() + 0.0);
    }
}
