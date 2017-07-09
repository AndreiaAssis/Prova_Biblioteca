import java.util.ArrayList;
import java.util.List;


    public class LivroBean {

        private List<Livros> livro;
  
        public LivroBean(){
            livro = new ArrayList<Livros>();
            livro.add(new Livros("A ultima Musica", "Nicholas Sparks", "Novo Conceito", "2010"));
        }

        public List<Livros> getLivro() {
            return livro;
        }

        public void setLivro(List<Livros> livro) {
            this.livro = livro;
        }
    }  
