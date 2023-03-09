package org.example.multithrading;

import org.example.multithrading.model.RobotDetail;
import org.example.multithrading.model.Scientist;
import org.example.multithrading.thread.Factory;
import org.example.multithrading.thread.Night;
import org.example.multithrading.thread.ScientistAssistant;
import org.example.multithrading.util.RandomUtil;
import org.example.multithrading.util.ThreadUtil;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FactoryDemo {
    public static void main(String[] args) throws InterruptedException {
        Night night = new Night();
        Factory factory = new Factory(night, getInitialRobotDetailsInDump());
        ScientistAssistant badScientistAssistant = new ScientistAssistant(night, new Scientist("Плохой ученый"), factory.getDump());
        ScientistAssistant goodScientistAssistant = new ScientistAssistant(night, new Scientist("Хороший ученый"), factory.getDump());

        ThreadUtil.startThreads(night, factory, badScientistAssistant, goodScientistAssistant);
        ThreadUtil.joinThreads(night, factory, badScientistAssistant, goodScientistAssistant);

        viewStatistic(badScientistAssistant.getScientist(), goodScientistAssistant.getScientist());
    }

    private static List<RobotDetail> getInitialRobotDetailsInDump() {
        return IntStream.range(0, 20)
                .map(value -> RandomUtil.getNext(RobotDetail.CASHED_VALUES.size()))
                .mapToObj(RobotDetail.CASHED_VALUES::get)
                .collect(Collectors.toList());
    }

    private static void viewStatistic(Scientist firstScientist, Scientist secondScientist) {
        System.out.println("----------------");
        System.out.println(firstScientist.getName() + " " + firstScientist.buildRobots().size());
        System.out.println(secondScientist.getName() + " " + secondScientist.buildRobots().size());
    }
}

