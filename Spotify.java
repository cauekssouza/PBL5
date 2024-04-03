public class Spotify {
    protected String artista;
    protected String albumOrsingle;
    protected int duração;
    protected String playlist;
    protected int artistaMerch;
    protected String evento;

    // Construtor
    public Spotify(String artista, String albumOrsingle, int duração, String playlist, int artistaMerch, String evento){
        this.artista = artista;
        this.albumOrsingle= albumOrsingle;
        this.duração = duração;
        this.playlist=playlist;
        this.artistaMerch=artistaMerch;
        this.evento=evento;
    }
    /* Getters ou Setters */
    public String getArtista(){
        return artista;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }
    public String getalbumOrsingle(){
        return albumOrsingle;
    }
    public  void  setAlbumOrSingle(String albumOrsingle){
        this.albumOrsingle = albumOrsingle;
    }
    public int getduração(){
        return duração;
    }
public void setDuração(int duração){
    this.duração = duração;
}
public String getPlaylist(){
    return playlist;
}
public void setPlaylist(String playlist){
    this.playlist = playlist;
}
public int getArtistaMerch(){
    return artistaMerch;
}
public void setArtistaMerch(int artistaMerch){
    this.artistaMerch = artistaMerch;
}
public String  getEvento(){
    return evento;
}
public void  setEvento(String evento){
    this.evento = evento;
}

}
