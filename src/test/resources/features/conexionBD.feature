#language: es
@conexionBD
Característica: Modulo contacto web
  Como un usuario comun
  Quiero contactarme con servicio al cliente
  Para obtener informacion de sus servicios

  Antecedentes: Definir los parametros previos
    Dado los siguientes parametros de entrada
      | fecha      | portafolio | nominal | precio | total     |
      | 15/05/2020 | OBL-MODER  | 123000  | 23.65  | 2908959   |
      | 15/05/2020 | OBL-MODER  | 10000   | 25.00  | 250000    |
      | 15/05/2020 | OBL-RIESGO | 1276987 | -10.20 | -13023267 |
      | 15/05/2020 | OBL-RIESGO | 123000  | 1.29   | 160670    |
    Entonces debo insertar los registros en la base de datos

  @conexionBD
  Escenario: Calcular e insertar datos de la BD
    Dados los parametros de entrada previo
    Entonces calcular el valor total
    Y validar el valor total sea igual a la base de datos

