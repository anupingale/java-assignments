package com.step.assignments.LeagueTable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeagueTable<T extends Team> {
    private List<T> teams;

    public LeagueTable(List<T> teams) {
        this.teams = teams;
    }

    public void logTeam() {
        for (T team : teams) {
            System.out.println(team.getName());
            System.out.println(team.getPoints());
        }
    }

    public void teamComparator() {
        teams.sort(new Comparator<Team>() {
            @Override
            public int compare(Team team1, Team team2) {
                return team2.compareTo(team1);
            }
        });

        for (T team : teams) {
            System.out.println(team.getName() + " " + team.getPoints());
        }
    }

    public static void main(String[] args) {
        FootballTeam f = new FootballTeam(10,2,3,"Punters");
        BaseballTeam b = new BaseballTeam(1,2,3,"sparks");
        List<Team> myTeams = new ArrayList<>();
        myTeams.add(b);
        myTeams.add(f);
        LeagueTable<Team> table = new LeagueTable<>(myTeams);
        table.teamComparator();
    }
}

