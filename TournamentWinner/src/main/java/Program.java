import java.util.*;

public class Program {
    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        if (competitions.size() != results.size()){
            return "-1";
        }
        HashMap<String, Integer> scoresMap = new HashMap<>();
        for (int i=0;i<competitions.size();i++){
            ArrayList<String> teams = competitions.get(i);
            int teamWon = results.get(i);
            if (teamWon == 0){
                String winningTeam = teams.get(1);
                if (!scoresMap.containsKey(winningTeam)){
                    scoresMap.put(winningTeam, 3);
                }else{
                    int oldScore = scoresMap.get(winningTeam) + 3;
                    scoresMap.replace(winningTeam, oldScore+3);
                }
            }

            if (teamWon == 1){
                String winningTeam = teams.get(0);
                if (!scoresMap.containsKey(winningTeam)){
                    scoresMap.put(winningTeam, 3);
                }else{
                    int oldScore = scoresMap.get(winningTeam) + 3;
                    scoresMap.replace(winningTeam, oldScore+3);
                }
            }
        }
        int maxScore = Collections.max(scoresMap.values());
        String highestScorer = "";
        for (String key: scoresMap.keySet()) {
                if (maxScore == scoresMap.get(key)){
                    highestScorer = key;
                }

        }
        return highestScorer;
    }

    public static void main(String[] args) {
        ArrayList<String> comp1 = new ArrayList<>();
        comp1.add("Bulls");
        comp1.add("Eagles");
        /*ArrayList<String> comp2 = new ArrayList<>();
        comp2.add("C#");
        comp2.add("Python");
        ArrayList<String> comp3 = new ArrayList<>();
        comp3.add("Python");
        comp3.add("HTML");*/
        ArrayList<Integer> results = new ArrayList<>();
        results.add(1);
        ArrayList<ArrayList<String>> lists = new ArrayList<>();
        lists.add(comp1);
        System.out.println(tournamentWinner(lists, results));

    }
}
