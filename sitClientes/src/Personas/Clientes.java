package Personas;

public class Clientes {

    private String ip, nomCompleto, telCel, domicilio;

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public void setTelCel(String telCel) {
        this.telCel = telCel;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getIp() {
        return ip;
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public String getTelCel() {
        return telCel;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public Clientes(String ip, String nomCompleto, String telCel, String domicilio) {
        this.ip = ip;
        this.nomCompleto = nomCompleto;
        this.telCel = telCel;
        this.domicilio = domicilio;
    }

}
