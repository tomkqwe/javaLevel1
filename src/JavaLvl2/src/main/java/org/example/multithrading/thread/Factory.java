package org.example.multithrading.thread;

import org.example.multithrading.model.Dump;
import org.example.multithrading.model.RobotDetail;
import org.example.multithrading.util.NightConst;
import org.example.multithrading.util.RandomUtil;

import java.util.Collections;
import java.util.List;

public class Factory extends Thread{
    public static final int MAX_DETAILS_COUNT = 4;
    private final Night night;
    private final Dump dump;

    public Factory(Night night) {
       this(night, Collections.emptyList());
    }
    public Factory(Night night, List<RobotDetail> initialRobotDetails) {
        this.dump = new Dump(initialRobotDetails);
        this.night = night;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < NightConst.AMOUNT_OF_NIGHT; i++) {
                throwNewRobotDetails();
                waitNextNight();
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private void throwNewRobotDetails() {
        int nextWithOutZero = RandomUtil.getNextWithOutZero(MAX_DETAILS_COUNT);
        synchronized (dump.getLock()){
            for (int i = 0; i < nextWithOutZero; i++) {
                RobotDetail robotDetail = RobotDetail.CASHED_VALUES.get(RandomUtil.getNext(RobotDetail.CASHED_VALUES.size()));
                dump.add(robotDetail);
            }
            System.out.println("Factory throw new robot detals: "+ nextWithOutZero);
        }
    }

    private void waitNextNight() throws InterruptedException {
        synchronized (night.getLock()){
            night.getLock().wait();
        }
    }

    public Dump getDump() {
        return dump;
    }
}
