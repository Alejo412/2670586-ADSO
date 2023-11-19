public class Informacion{

    String materia;
    double creditos;
    double nota;


    public Informacion(String materia, double creditos, double nota){
        this.materia = materia;
        this.creditos = creditos;
        this.nota = nota; 
    }

    public String imprimir(){
        return this.materia+" -> Creditos: "+this.creditos+" -> Nota: "+this.nota;
       
    }


    public String getMateria(){ 
        return materia;
    }

    public double getCreditos(){ 
        return creditos;
    }

    public double getNota(){ 
        return nota;
    }

    public void setMateria(String materia){
        this.materia = materia;
   }

   public void setCreditos(double creditos){
     this.creditos = creditos;
   }

   public void setNota(double nota){
    this.nota = nota;
   }




}