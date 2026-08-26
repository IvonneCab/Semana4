package com.uped.proyecto.modelo;

public class ConfiguracionReporte {
    private final String titulo;
    private final boolean incluirGraficos;
    private final String formato;

    private ConfiguracionReporte(Builder builder) {
        this.titulo = builder.titulo;
        this.incluirGraficos = builder.incluirGraficos;
        this.formato = builder.formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isIncluirGraficos() {
        return incluirGraficos;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public String toString() {
        return "ConfiguracionReporte{" +
                "titulo='" + titulo + '\'' +
                ", incluirGraficos=" + incluirGraficos +
                ", formato='" + formato + '\'' +
                '}';
    }

    public static class Builder {
        private String titulo = "Reporte General";
        private boolean incluirGraficos = false;
        private String formato = "PDF";


        public Builder() {
        }

        public Builder(String titulo) {
            this.titulo = titulo;
        }

        public Builder incluirGraficos(boolean incluirGraficos) {
            this.incluirGraficos = incluirGraficos;
            return this;
        }

        public Builder formato(String formato) {
            this.formato = formato;
            return this;
        }

        public ConfiguracionReporte build() {
            return new ConfiguracionReporte(this);
        }
    }

}
