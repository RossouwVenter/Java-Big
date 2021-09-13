package com.company.Challenge;

//Driver : James
//Navigator: Rossouw & Muhammed

//import com.company.Generics_Class.Team;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        Team<SoccerPlayer> soccerTeam = new Team<> ("All Stars");


        Team<FootballPlayer> melbourne = new Team<>("Melbourne");

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        League <Team<FootballPlayer>> league1 = new League<>("ABC");
        league1.addTeam(adelaideCrows);
        league1.addTeam(melbourne);
        league1.addTeam(fremantle);
        league1.addTeam(hawthorn);

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//        adelaideCrows.matchResult(baseballTeam, 1, 1); //Correctly recognises error;

//        System.out.println("rankings");
//        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
//        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
//        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
//        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(adelaideCrows.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

        league1.displayleagueTable();




    }
}
