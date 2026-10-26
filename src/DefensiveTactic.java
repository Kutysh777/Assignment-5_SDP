// Concrete Strategy
public class DefensiveTactic implements FootballTactic {
    public int attackingPlayers(int outfieldPlayers) {
        return outfieldPlayers * 3 / 10;
    }
}
