// Concrete Strategy
public class AttackingTactic implements FootballTactic {
    public int attackingPlayers(int outfieldPlayers) {
        return outfieldPlayers * 7 / 10;
    }
}
