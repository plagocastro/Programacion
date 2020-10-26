
package boletin04;


public class Libro {
        private String titulo;
        private int ano;
        private String autor;
        private short numPaginas;
        private float valoracion;
        
        public Libro (){
            
        }
        public Libro (String tit, int an, short numP, String aut){
            numPaginas = numP;
            titulo = tit;
            ano = an;
            autor = aut;
        }
        public void setTitulo(String tit){
            titulo = tit;
        }
        public String getTitulo(){
            return titulo;
        }
          public void setAutor(String aut){
            autor = aut;
        }
        public String getAutor(){
            return autor;
        }
          public void setAno(int an){
            ano = an;
        }
        public int getAno(){
            return ano;
        }
        public void setNumPaginas(short numP){
            numPaginas = numP;
        }
        public short gettitulo(){
            return numPaginas;
        }
        public void setValoracion(float val){
            valoracion = val;
        }
        public float getValoracion(){
            return valoracion;
        }
        public void amosar(){
            System.out.println("El titulo es "+ titulo +", su autor fue "+ autor +", escribiuse no ano "+ ano + ", ten "+ numPaginas + " paxinas e ten unha valoracion de "+ valoracion);
        }
}

    

