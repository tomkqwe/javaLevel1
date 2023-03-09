package org.example.multithrading.thread;

import org.example.multithrading.model.Dump;
import org.example.multithrading.model.RobotDetail;
import org.example.multithrading.model.Scientist;
import org.example.multithrading.util.NightConst;
import org.example.multithrading.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public class ScientistAssistant extends Thread {
    private static final int MAX_DETAILS_COUNT = 4;
    private final Night night;
    private final Scientist scientist;
    private final Dump dump;

    public ScientistAssistant(Night night, Scientist scientist, Dump dump) {
        this.night = night;
        this.scientist = scientist;
        this.dump = dump;
    }


    @Override
    public void run() {
        try {
            for (int i = 0; i < NightConst.AMOUNT_OF_NIGHT; i++) {
                List<RobotDetail> robotDetails = gatherRobotDetailsFromFactory();
                scientist.addRobotDetails(robotDetails);
                waitNextNight();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void waitNextNight() throws InterruptedException {
        synchronized (night.getLock()) {
            night.getLock().wait();
        }
    }

    private List<RobotDetail> gatherRobotDetailsFromFactory() {
        int nextWithOutZero = RandomUtil.getNextWithOutZero(MAX_DETAILS_COUNT);
        ArrayList<RobotDetail> robotDetails = new ArrayList<>(MAX_DETAILS_COUNT);
        synchronized (dump.getLock()){
            if (dump.size() <= nextWithOutZero){
                robotDetails.addAll(dump.removeAll());
            }else if (dump.isNotEmpty()){
                for (int i = 0; i < nextWithOutZero; i++) {
                    RobotDetail remove = dump.remove(RandomUtil.getNext(dump.size()));
                    robotDetails.add(remove);
                }
            }
            System.out.printf("%s assistant gathered next details: %s\n", scientist.getName(), robotDetails);
        }
        return robotDetails;
    }

    public Scientist getScientist() {
        return scientist;
    }
}
