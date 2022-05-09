#language: es
@ContatoWeb
Característica: Modulo contacto web
  Como un usuario comun
  Quiero contactarme con servicio al cliente
  Para obtener informacion de sus servicios

  Antecedentes:
    Dado cargo la pagina principal de makers

  @Registro_Consulta
  Esquema del escenario: Registrar la consulta en el modulo de contacto web
    Dado que selecciono la opcion CONTACTO
    Cuando obtengo el numero de servicio al cliente
    E ingreso mi nombre <sNombre> apellido <sApellido> correo <sEmail> y telefono <sTelefono>
    Y ingreso el mensaje que deseo enviar <sMensaje>
    Y le doy click al boton enviar mensaje
    Entonces se muestra en mensaje de envio exitoso

    Ejemplos:
      | sNombre | sApellido | sEmail          | sTelefono | sMensaje                                       |
      | admin   | admin     | admin@gmail.com | 987456321 | Hola, quisiera información sobre sus productos |
