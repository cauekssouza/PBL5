public class Musica extends Spotify {
    private String genero;
    // Construtor 
    public Musica(String artista, String albumOrsingle, int duração, String playlist, int artistaMerch, String evento,String genero){
       super(artista, albumOrsingle, duração, playlist, artistaMerch, evento);
       this.genero = genero; 
    }
    /*Getters e Setters */
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public playlist extends Spotify{
        private int qtMaxima;
        private boolean aberto;

        // Construtor
        public playlist(String artista, String albumOrsingle, int duração, String playlist, int artistaMerch, String evento,String genero, int qtMaxima, boolean aberto){
            super(artista, albumOrsingle, duração, playlist, artistaMerch, evento, qtMaxima, aberto);
        }
    }

}
