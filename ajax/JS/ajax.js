$(document).ready(function(){


    //Listar
    $('#listar').on('click', function(){
        let tabla = document.querySelector('#tabla')
        tabla.innerHTML = '<thead>'+
        '<th>Curso</th>'+
        '<th>Codigo</th>'+
        '<th>Nombre</th>'+
        '<th>Apellido</th>'+
        '<th>Materias</th>'+
        '<th>Notas</th>'+
        '</thead>'

        $.ajax({
            url:"http://localhost:8080/listarestudiantes",
            type: "GET",
            dataType: "JSON",
            success: function(respuesta){
                for(i = 0; i <= respuesta.length; i++){
                    tabla.innerHTML += '<tr><td>'+ respuesta[i].curso +
                    '<td>'+ respuesta[i].codigo +
                    '<td>'+ respuesta[i].nombre +
                    '<td>'+ respuesta[i].apellido +
                    '<td>'+ respuesta[i].materias +
                    '<td>'+ respuesta[i].notas
                }
            }
        })
    })


    //Actualizar
    $('#btnactualizar').on('click',function(){
        let datos = {
            codigo: parseInt($('#codigo').val()),
            curso: parseInt($('#curso').val()),
            notas: [parseFloat($('#nota1').val()),parseFloat($('#nota2').val()),parseFloat($('#nota3').val())]
        }

        let datosEnvio = JSON.stringify(datos)

        $.ajax({
            url:"http://localhost:8080/actualizarestudiante",
            type: "POST",
            data: datosEnvio,
            contentType: "application/JSON",
            dataType: "TEXT",
            success: function(respuesta){
                alert(respuesta)
            }
        })
    })


    //Eliminar

    $('#btneliminar').on('click',function(){
        let cursoEliminar = $('#cursoeliminar').val()
        $.ajax({
            url:"http://localhost:8080/eliminarestudiante/"+cursoEliminar,
            type: "DELETE",
            dataType: "TEXT",
            success: function(respuesta){
                alert(respuesta)
            }

        })
    })




})