package com.saurabh.match_scorecard.entity;

import java.util.ArrayList;

public class Over {

    private int overNumber;
    private List<Ball> deliveries = new ArrayList<>();

    public boolean isCompletd(){
        long validDeliveries = deliveries.stream()
                .filter(ball -> ball.getExtra() = ExtraType.NONE)
                .count();
        return validDeliveries == 6;
    }
}
