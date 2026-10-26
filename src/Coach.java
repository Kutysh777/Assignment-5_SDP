// Context
public class Coach {
    private FootballTactic tactic;

    public Coach(FootballTactic tactic) {
        this.tactic = tactic;
    }

    public void setTactic(FootballTactic tactic) {
        this.tactic = tactic;
    }

    public void showPlan(int outfieldPlayers) {
        int attackers = tactic.attackingPlayers(outfieldPlayers);
        int defenders = outfieldPlayers - attackers;
        System.out.println("Attack: " + attackers + ", Defense: " + defenders);
    }
}
