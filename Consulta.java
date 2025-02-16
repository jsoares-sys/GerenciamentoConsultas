public class Consulta {
   int idConsulta;
   int idPaciente;
   int idMedico;
   Date dataConsulta;
   int horario;
   String statusConsulta;


   public Consulta(){
       this.idConsulta = 0;
       this.dataConsulta = new Date();
       this.horario = 0;
       this.statusConsulta = "";
   }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(String statusConsulta) {
        this.statusConsulta = statusConsulta;
    }
}
