public class Musica {

    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoDeLancamento);
    }

    void avalia(double nota) {
        avaliacoes += nota;
        numAvaliacoes++;

    }

    double pegaMedia() {
    if (numAvaliacoes == 0){
        return 0;
    }
        return avaliacoes / numAvaliacoes;
    }
}

