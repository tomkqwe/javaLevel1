package org.example.multithrading.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Dump {
    private final Object lock = new Object();
    private final List<RobotDetail> dump = new LinkedList<>();

    public Dump() {
    }

    public Dump(List<RobotDetail> dump){
        this.dump.addAll(dump);
    }

    public RobotDetail remove(int index){
       return dump.remove(index);
    }

    public List<RobotDetail> removeAll(){
        ArrayList<RobotDetail> robotDetails = new ArrayList<>(dump);
        dump.clear();
        return robotDetails;
    }
    public int size(){
        return dump.size();
    }
    public boolean isNotEmpty(){
        return !dump.isEmpty();
    }

    public Object getLock() {
        return lock;
    }

    public void add(RobotDetail robotDetail) {
        dump.add(robotDetail);
    }
}
