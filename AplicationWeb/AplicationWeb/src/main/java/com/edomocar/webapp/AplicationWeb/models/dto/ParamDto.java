package com.edomocar.webapp.AplicationWeb.models.dto;

public class ParamDto {
    private String mensaje;
    private int codigo;

    public ParamDto() {
    }

    public ParamDto(String mensaje, int codigo) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
