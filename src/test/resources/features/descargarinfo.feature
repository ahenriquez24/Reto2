# language: es
# autor: Angel Henriquez

@HU
Característica: Cargar pagina de Banistmo para reto tecnico
  como usuario quiero obtener informacion de la pagina

  @ObtenerInformacion
  Escenario: Obtener informacion de la pagina de banistmo
    Dado que ingreso a la pagina de banistmo
    Cuando cargo las opciones de aprender es facil
    Entonces verfico el documento "PJ+Autocertificacion"