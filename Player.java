class Player
{
    String playerName;

    Player(String playerName)
    {
        this.playerName = playerName;
    }

    void getInfo()
    {
        System.out.println("Player Name: " + playerName);
    }
}