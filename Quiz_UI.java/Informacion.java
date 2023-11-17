public class Informacion{

    String materia;
    double creditos;
    double nota;


    public Informacion(String materia, double creditos, double nota){
        this.materia = materia;
        this.creditos = creditos;
        this.nota = nota; 
    }

    public void imprimir(){
        //return this.materia+" -> "+this.creditos+" -> "+this.nota;
        System.out.println(this.materia);
        System.out.println(this.creditos);
        System.out.println(this.nota);
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