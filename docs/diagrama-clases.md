```mermaid
classDiagram
    class Pedido {
        -int numero
        -double total
        -String estado
        +Pedido(int numero)
        +getNumero() int
    }

    class Suscripcion {
        -String usuario
        -String plan
        -LocalDate inicio
        -int meses
        +Suscripcion(String usuario, String plan, LocalDate inicio, int meses)
        +Suscripcion(String usuario, String plan, LocalDate inicio)
        +Suscripcion(String usuario, String plan)
        +Suscripcion(String usuario)
        +gratuita(String usuario)$ Suscripcion
        +premium(String usuario)$ Suscripcion
        +toString() String
    }

    class ConfiguracionReporte {
        -String titulo
        -boolean incluirGraficos
        -String formato
        -ConfiguracionReporte(Builder b)
        +toString() String
    }

    class Builder {
        -String titulo
        -boolean incluirGraficos
        -String formato
        +titulo(String t) Builder
        +conGrafico() Builder
        +build() ConfiguracionReporte
    }

    class Carrito {
        -List~String~ items
        +agregar(String producto) void
        +getItems() List~String~
    }

    class Empleado {
        -String dui
        -LocalDate fechaIngreso
        -String cargo
        +Empleado(String dui, String cargo)
        +ascender(String nuevoCargo) void
        +toString() String
    }

    class Punto {
        -double x
        -double y
        +Punto(double x, double y)
        +mover(double dx, double dy) Punto
        +toString() String
    }

    class Vehiculo {
        -String placa
        -String marca
        -int kilometraje
        +Vehiculo(String placa, String marca, int kilometraje)
        +Vehiculo(String placa, String marca)
        -validar(String placa, int kilometraje) void
        +nuevo(String placa, String marca)$ Vehiculo
        +recorrer(int km) void
        +toString() String
    }

    class LibroBiblioteca {
        -String titulo
        -String autor
        -int ejemplaresDisponibles
        +LibroBiblioteca(String titulo, String autor, int ejemplares)
        +LibroBiblioteca(String titulo, String autor)
        -validar(String titulo, int ejemplares) void
        +unico(String titulo, String autor)$ LibroBiblioteca
        +prestar() boolean
        +getTitulo() String
        +getEjemplaresDisponibles() int
    }

    ConfiguracionReporte +-- Builder