package com.saurabh.match_scorecard.entity;

import com.saurabh.match_scorecard.enums.MatchFormat;
import com.saurabh.match_scorecard.enums.MatchStatus;

import java.util.*;

public class Match {

    private String matchId;
    private String teamA;
    private String teamB;
    private MatchFormat format;
    private List<Inning> innings = new ArrayList<>();
    private MatchStatus status;
    private List<Scorer> scorers = new ArrayList<>();

}
