package com.step.assignments.LeagueTable;

public class Team {
    private int matchesWon;
    private int matchesLost;
    private int matchesDraw;
    private String teamName;

    public Team(int matchesWon, int matchesLost, int matchesDraw, String teamName) {
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
        this.matchesDraw = matchesDraw;
        this.teamName = teamName;
    }


    public String getName() {
        return this.teamName;
    }

    public int getPoints() {
        return this.matchesWon *2 + this.matchesDraw;
    }

    public int compareTo(Team otherTeam) {
        int myPoints = this.getPoints();
        int othersPoint = otherTeam.getPoints();
        return myPoints-othersPoint;
    }
}
