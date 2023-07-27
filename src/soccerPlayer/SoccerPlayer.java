package soccerPlayer;

public class SoccerPlayer {
    private String name;
    private int ShirtNumber;
    private int GoalsScored;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShirtNumber() {
        return ShirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        ShirtNumber = shirtNumber;
    }

    public int getGoalsScored() {
        return GoalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        GoalsScored = goalsScored;
    }
}
