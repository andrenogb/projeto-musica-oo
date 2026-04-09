public class Main {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.titulo = "Pela ultima vez";
        musica.artista = "Menos é mais";
        musica.anoDeLancamento = 2026;
        musica.avalia(5.0);
        musica.avalia(10.0);
        musica.avalia(5.0);

        musica.exibeFichaTecnica();
        System.out.println(musica.pegaMedia());

    }
}
