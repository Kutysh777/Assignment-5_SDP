// Concrete Strategy
public class BalancedTactic implements FootballTactic {
    public int attackingPlayers(int outfieldPlayers) {
        return outfieldPlayers / 2;
    }
}
