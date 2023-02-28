package org.example.collections.homework1;

public class Chat implements Comparable<Chat> {
    private String name;
    private int quantity;

    public Chat(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }


    @Override
    public int compareTo(Chat o) {
        return this.name.compareTo(o.name);
    }
}
