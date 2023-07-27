package soccerPlayer;

public class Main {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer();
        soccerPlayer.setName("Quiroz");
        soccerPlayer.setGoalsScored(20);
        soccerPlayer.setShirtNumber(10);
        System.out.println(soccerPlayer.getName());
        System.out.println("numero de goles anotados "+soccerPlayer.getGoalsScored());
        System.out.println("El numero de la camisa es "+soccerPlayer.getShirtNumber());
    }
}
