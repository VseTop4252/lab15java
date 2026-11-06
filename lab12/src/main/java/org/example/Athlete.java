package org.example;

import java.util.List;

public class Athlete {
    private int id;
    private String name;
    private String sport;
    private String level;
    private List<Integer> competitionResults;

    public Athlete(int id, String name, String sport, String level, List<Integer> competitionResults) {
        this.id = id;
        this.name = name;
        this.sport = sport;
        this.level = level;
        this.competitionResults = competitionResults;
    }

    public double getAverageResult() {
        if (competitionResults == null) return 0;
        int sum = 0;
        for (int r : competitionResults) sum += r;
        return (double) sum / competitionResults.toArray().length;
    }

    public int getId() {
        return id;
    }

    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", sport=" + sport + ", level=" + level + ", avg=" + getAverageResult();
    }
}
