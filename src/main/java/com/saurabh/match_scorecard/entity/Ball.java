package com.saurabh.match_scorecard.entity;

import com.saurabh.match_scorecard.enums.ExtraType;

public class Ball {

    private int ballNumber;
    private Player batsman;
    private Player bowler;
    private int runs;
    private ExtraType extra = ExtraType.NONE;
    private boolean isWicket = false;
    private String description;
}
