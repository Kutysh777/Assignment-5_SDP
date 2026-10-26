// Client
public class Main {
    public static void main(String[] args) {
        Coach coach = new Coach(new BalancedTactic());
        coach.showPlan(10);

        coach.setTactic(new AttackingTactic());
        coach.showPlan(10);

        coach.setTactic(new DefensiveTactic());
        coach.showPlan(10);
    }
}
