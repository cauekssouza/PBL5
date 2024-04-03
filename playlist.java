public class playlist extends Spotify{
    private int qtMaxima;
    private boolean aberto;

    // Construtor
    public playlist(String artista, String albumOrsingle, int duração, String playlist, int artistaMerch, String evento,
     int qtMaxima, boolean aberto){
        super(artista, albumOrsingle, duração, playlist, artistaMerch, evento);
        this.qtMaxima =qtMaxima;
        this.aberto = aberto;
    }
}
