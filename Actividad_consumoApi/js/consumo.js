let contentPrincipal;
let data;


window.onload = function(){
    contentPrincipal = document.getElementById("contentPrincipal");
    tabla = document.getElementById("tabla");

}

class Persona {
    constructor(cedula, nombres, apellidos, telefono, direccion, email) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

}


function ver_lista(endpoint= "https://codetesthub.com/API/Obtener.php"){
    let img_cargar =   `<div class="row style="margin-top: 20px;">
                <img src="img/waiting-7579_256.gif" alt="" class="img-fluid style="width=50px">
            </div>}`

    contentPrincipal.innerHTML = img_cargar;


fetch(endpoint)
.then(respuesta => respuesta.json())
.then(data => {
    contentPrincipal.innerHTML = "";

let tableHeader = `
    <div class="row mt-5  align-items-center ">
        <div class="col-lg-12 ">
            <table class="table">
                <thead>
                    <tr>
                        <th>Cédula</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Teléfono</th>
                        <th>Dirección</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
`;

let tableFooter = `
                </tbody>
            </table>
        </div>
    </div>
`;

let tableBody = "";

for (var i = 0; i < data.length; i++) {
    tableBody += `
        <tr>
            <td>${data[i].cedula}</td>
            <td>${data[i].nombres}</td>
            <td>${data[i].apellidos}</td>
            <td>${data[i].telefono}</td>
            <td>${data[i].direccion}</td>
            <td>${data[i].email}</td>
        </tr>
    `;
}

contentPrincipal.innerHTML = tableHeader + tableBody + tableFooter;
});

}

function mostrarInputsInsertar(){
    let inputs = `
    <div class="container mt-5 ">
        <div class="row align-items-center">
            <input type="number" id="cedulaInput" placeholder="Cédula">
        </div>
        <div class="row mt-2  align-items-center">
            <input type="text" id="nombresInput" placeholder="Nombres">
        </div>
        <div class="row mt-2  align-items-center">
            <input type="text" id="apellidosInput" placeholder="Apellidos">
        </div>
        <div class="row mt-2  align-items-center">
            <input type="text" id="telefonoInput" placeholder="Teléfono">
        </div>
        <div class="row mt-2  align-items-center">
            <input type="text" id="direccionInput" placeholder="Dirección">
        </div>
        <div class="row mt-2  align-items-center">
            <input type="text" id="emailInput" placeholder="Email">
        </div>
        <div class="row mt-5 align-items-center">
            <button type="submit" id="submitButton">Insertar persona</button>
        </div>
    </div>
    `;

    contentPrincipal.innerHTML = inputs;

    let cedulaInput =document.getElementById("cedulaInput");
    let nombresInput =document.getElementById("nombresInput");
    let apellidosInput =document.getElementById("apellidosInput");
    let telefonoInput =document.getElementById("telefonoInput");
    let direccionInput =document.getElementById("direccionInput");
    let emailInput =document.getElementById("emailInput");

    submitButton.addEventListener("click", function() {
        let cedulaInsert = cedulaInput.value;
        let nombresInsert = nombresInput.value;
        let apellidosInsert = apellidosInput.value;
        let telefonoInsert = telefonoInput.value;
        let direccionInsert = direccionInput.value;
        let emailInsert = emailInput.value;
    
       let persona = new Persona(cedulaInsert, nombresInsert, apellidosInsert,  telefonoInput, direccionInsert, emailInsert);
       insertar(persona);
    });
}

function mostrarInputsEditar(){
      
    fetch("https://codetesthub.com/API/Obtener.php")
    .then(respuesta => respuesta.json())
    .then(data=>{
        let input = `
        <div class="container mt-5 ">
            <div class="row align-items-center">
                <input type="number" id="cedulaInput" placeholder="Cédula">
            </div>
            <div class="row mt-5 align-items-center">
                <div class="col-12 text-end">
                    <button class="btn-btn-dark" type="submit" id="submitButtonBuscar">Buscar persona</button>
                </div>
            </div>
        </div>
        `;
    
        contentPrincipal.innerHTML = input;
        let cedulaInsert;
        let cedulaInput =document.getElementById("cedulaInput");
        submitButtonBuscar.addEventListener("click", function() {
            cedulaInsert = parseInt(cedulaInput.value);
            console.log(cedulaInsert);
        });
        
        for(let i = 0; i < data.length; i++){
            if(data[i].cedula == cedulaInsert){
                console.log('Coincidencia encontrada:', data[i]);
    
                let inputs = `
                <div class="row mt-2 align-items-center">
                    <input type="text" id="nombresInput" value="${data[i].nombres}" placeholder="Nombres">
                </div>
                <div class="row mt-2 align-items-center">
                    <input type="text" id="apellidosInput" value="${data[i].apellidos}" placeholder="Apellidos">
                </div>
                <div class="row mt-2 align-items-center">
                    <input type="text" id="telefonoInput" value="${data[i].telefono}" placeholder="Teléfono">
                </div>
                <div class="row mt-2 align-items-center">
                    <input type="text" id="direccionInput" value="${data[i].direccion}" placeholder="Dirección">
                </div>
                <div class="row mt-2 align-items-center">
                    <input type="text" id="emailInput" value="${data[i].email}" placeholder="Email">
                </div>
                <div class="row mt-5 align-items-center">
                    <button type="submit" id="submitButtonTodo">Actualizar persona</button>
                </div>
            `;
    
            contentPrincipal.innerHTML = inputs;
                

                        let nombresInput =document.getElementById("nombresInput");
                        let apellidosInput =document.getElementById("apellidosInput");
                        let telefonoInput =document.getElementById("telefonoInput");
                        let direccionInput =document.getElementById("direccionInput");
                        let emailInput =document.getElementById("emailInput");

                        submitButtonTodo.addEventListener("click", function() {
                            cedulaInsert = cedulaInput.value;
                            let nombresNew = nombresInput.value;
                            let apellidosNew = apellidosInput.value;
                            let telefonoNew = telefonoInput.value;
                            let direccionNew = direccionInput.value;
                            let emialNew = emailInput.value;
                           
                            let persona = new Persona(cedulaInsert, nombresNew, apellidosNew,  telefonoNew, direccionNew, emialNew);
                            editar(persona);

                           
                        });
                break;
    
            }
        }
    

    });

}


function insertar(Persona){

    let datosInsert = new FormData();
   
    datosInsert.append("cedula", Persona.cedula);
    datosInsert.append("nombres", Persona.nombres);
    datosInsert.append("apellidos", Persona.apellidos);
    datosInsert.append("telefono", Persona.telefono);
    datosInsert.append("direccion", Persona.direccion);
    datosInsert.append("email", Persona.email);
    console.log(Persona.nombres);

    let configuration = {
                            method:"POST",
                            headers:{
                                "Accept": "application/json",
                            },
                            body: datosInsert,
                        };
    fetch("https://codetesthub.com/API/Insertar.php", configuration)
    .then(respuesta => respuesta.json())
    .then(data=>{
         console.log('Respuesta JSON servidor: ');
         console.log(data);

    });
}


function editar(Persona){
    let datosInsert = new FormData();

    datosInsert.append("cedula", Persona.cedula);
    datosInsert.append("nombres", Persona.nombres);
    datosInsert.append("apellidos", Persona.apellidos);
    datosInsert.append("telefono", Persona.telefono);
    datosInsert.append("direccion", Persona.direccion);
    datosInsert.append("email", Persona.email);
    console.log(Persona.nombres);

    let configuration = {
                            method:"POST",
                            headers:{
                                "Accept": "application/json",
                            },
                            body: datosInsert,
                        };
    fetch("https://codetesthub.com/API/Actualizar.php", configuration)
    .then(respuesta => respuesta.json())
    .then(data=>{
         console.log('Respuesta JSON servidor: ');
         console.log(data);

    });
}

function eliminar(){
    let datosInsert = new FormData();
    
    fetch("https://codetesthub.com/API/Obtener.php")
    .then(respuesta => respuesta.json())
    .then(data=>{
        let input = `
        <div class="container mt-5 ">
            <div class="row align-items-center">
                <input type="number" id="cedulaInput" placeholder="Cédula">
            </div>
            <div class="row mt-5 align-items-center">
                <div class="col-12 text-end">
                    <button class="btn-btn-dark" type="submit" id="submitButtonBuscar">Buscar persona</button>
                </div>
            </div>
        </div>
        `;
    
        contentPrincipal.innerHTML = input;
        let cedulaInsert;
        let cedulaInput =document.getElementById("cedulaInput");
        submitButtonBuscar.addEventListener("click", function() {
            cedulaInsert = cedulaInput.value;
        });
        
        for(let i = 0; i < data.length; i++){
            if(data[i].cedula == cedulaInsert){
                let inputs = `<div class="row mt-2  align-items-center">
                                <input type="text" id="nombresInput" value="${data[i].nombres}" placeholder="Nombres">
                            </div>
                            <div class="row mt-2  align-items-center">
                                <input type="text" id="apellidosInput" value="${data[i].apellidos}" placeholder="Nombres">
                                </div>" placeholder="Apellidos">
                            </div>
                            <div class="row mt-2  align-items-center">
                                <input type="text" id="telefonoInput" value="${data[i].telefono}" placeholder="Nombres">
                                </div>" laceholder="Teléfono">
                            </div>
                            <div class="row mt-2  align-items-center">
                                    <input type="text" id="direccionInput" value="${data[i].direccion}" placeholder="Nombres">
                                    </div>" placeholder="Dirección">
                            </div>
                            <div class="row mt-2  align-items-center">
                                    <input type="text" id="emailInput" value="${data[i].email}" placeholder="Nombres">
                                    </div>" placeholder="Email">
                            </div>
                            <div class="row mt-5 align-items-center">
                                    <button type="submit" id="submitButtonTodo">Eliminar persona</button>
                            </div>
                        `;
                        contentPrincipal.innerHTML = inputs;
                let submitButtonTodo = document.getElementById("submitButtonTodo");
                submitButtonTodo.addEventListener("click", function() {
                    data.splice(i, 1); 
                });
   
            }
            break; 
        }
    

    });


    let configuration = {
                            method:"POST",
                            headers:{
                                "Accept": "application/json",
                            },
                            body: datosInsert,
                        };
    fetch("https://codetesthub.com/API/Actualizar.php", configuration)
    .then(respuesta => respuesta.json())
    .then(data=>{
         console.log('Respuesta JSON servidor: ');
         console.log(data);

    });
}





