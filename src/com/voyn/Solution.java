package com.voyn;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/*
Переходим дорогу вслепую
*/




public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static class Robot extends AbstractRobot {




        public Robot(String s) {
            this.name = s;
        }

    }

    public interface Attackable {
       public BodyPart attack();

    }

    public interface Defenseble {
        public BodyPart defense();

    }

    public abstract static class AbstractRobot implements Attackable, Defenseble {
        String name;
        public String getName() {
            return this.name;
        }

        public BodyPart attack() {
            BodyPart a = new BodyPart();
            return a;
        }


        public BodyPart defense() {
            BodyPart a = new BodyPart();
            return a;
        }

    }

    public static class BodyPart {
        final static BodyPart bodyPart = new BodyPart();
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defenced));
    }
}