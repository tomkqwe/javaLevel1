package org.example.collections.homework1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ChatUtils {
    private ChatUtils() {
    }

    public static List<Chat> deleteChats(List<Chat> chats) {
        ArrayList<Chat> result = new ArrayList<>(chats);
        Iterator<Chat> iterator = result.iterator();
        while (iterator.hasNext()) {
            Chat next = iterator.next();
            if (next.getQuantity() < 1000) {
                iterator.remove();
            }
        }
        return result;
    }
}
