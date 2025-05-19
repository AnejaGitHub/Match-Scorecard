package com.saurabh.match_scorecard.entity;

import java.util.ArrayList;

public class Inning {

    private Team battingTeam;
    private Team bowlingTeam;
    private List<Over> overs = new ArrayList<>();
    private int totalRuns = 0;
    private int wickets = 0;
    private int extra = 0;

    private Player striker;
    private Player nonStriker;
    private Player currentBowler;

}
