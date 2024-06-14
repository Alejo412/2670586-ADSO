let contentPrincipal;
let data;



window.onload = function(){
    contentPrincipal = document.getElementById("contentPrincipal");
    tabla = document.getElementById("tabla");

}

class Marca {
    constructor(id_marca, nombre) {
        this.id_marca = id_marca;
        this.nombre = nombre;
        
    }

}


class Automovil {
    constructor(matricula, marca, modelo, color, precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        
    }

}


function ver_listaMarca(endpoint= "http://localhost/automovilAPI/API/ObtenerMarca.php"){
    
fetch(endpoint)
.then(respuesta => respuesta.json())
.then(data => {
    contentPrincipal.innerHTML = "";

let tableHeader = `
    <div class="container"
        <div class="row mt-5  align-items-center ">
            <div class="col-lg-6 ">
                <table class="table">
                    <thead>
                        <tr>
                         <th>Id_marca</th>
                            <th>Nombre</th>
                        
                        </tr>
                    </thead>
                    <tbody>
`;

let tableFooter = `
                    </tbody>
                </table>
            </div>
        </div>
    </div>
`;

let tableBody = "";

for (var i = 0; i < data.length; i++) {
    tableBody += `
        <tr>
            <td>${data[i].id_marca}</td>
            <td>${data[i].nombre}</td>
           
        </tr>
    `;
}

contentPrincipal.innerHTML = tableHeader + tableBody + tableFooter;
});

}

function ver_listaAutomovil(endpoint= "http://localhost/automovilAPI/API/ObtenerAuto.php"){
    
    fetch(endpoint)
    .then(respuesta => respuesta.json())
    .then(data => {
        contentPrincipal.innerHTML = "";
    
    let tableHeader = `
        <div class="container-fluid d-flex justify-content-end"
            <div class="row mt-5  align-items-center ">
                <div class="col-lg-6 ">
                    <table class="table">
                        <thead>
                            <tr>
                             <th>Matricula</th>
                             <th>Marca</th>
                             <th>Modelo</th>
                             <th>Color</th>
                             <th>Precio</th>
                            
                            </tr>
                        </thead>
                        <tbody>
    `;
    
    let tableFooter = `
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    `;
    
    let tableBody = "";
    
    for (var i = 0; i < data.length; i++) {
        tableBody += `
            <tr>
                <td>${data[i].matricula}</td>
                <td>${data[i].marca}</td>
                <td>${data[i].modelo}</td>
                <td>${data[i].color}</td>
                <td>${data[i].precio}</td>
               
                
               
            </tr>
        `;
    }
    
    contentPrincipal.innerHTML = tableHeader + tableBody + tableFooter;
    });
    
    }


    function mostrarInputsInsertarMarca(){
        let inputs = `
        <div class="container-fluid mt-5 d-flex justify-content-start">
            <div class="col-lg-6">
                <div class="row align-items-center">
                    <input type="text" id="id_marcaInput" placeholder="Id_marca">
                </div>
                <div class="row mt-2  align-items-center">
                    <input type="text" id="nombreInput" placeholder="Nombre">
                </div>
           
                <div class="row mt-5 align-items-center">
                    <button type="submit" id="submitButton">Insertar Marca</button>
                </div>
            </div> 
        </div>
        `;
    
        contentPrincipal.innerHTML = inputs;
    
        let id_marcaInput =document.getElementById("id_marcaInput");
        let nombreInput =document.getElementById("nombreInput");
    
        submitButton.addEventListener("click", function() {
            let id_marcaInsert = id_marcaInput.value;
            let nombreInsert = nombreInput.value;
           
        
           let marca = new Marca(id_marcaInsert, nombreInsert);
           insertarMarca(marca);
        });
    }

    function mostrarInputsInsertarAuto(){
        
        let listaMarcas =  [];
        endpoint= "http://localhost/automovilAPI/API/ObtenerMarca.php"
    
            fetch(endpoint)
            .then(respuesta => respuesta.json())
            .then(data => {

                for (var i = 0; i < data.length; i++) {
                   
                    let idMarca = data[i].id_marca;
                    let nombreMarca = data[i].nombre;
                    let marca = new Marca(idMarca, nombreMarca);
                    listaMarcas[i] = marca;
                    

                }
                let inputs = `
                <div class="container-fluid mt-5 d-flex justify-content-end ">
                    <div class="col-lg-6">
                        <div class="row align-items-center">
                            <input type="text" id="matriculaInput" placeholder="Matricula">
                        </div>
                        <div class="row mt-2  align-items-center">
                            <div class="dropdown">
                                <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    Marca
                                </button>
                                <ul class="dropdown-menu">`;
                                for (let i = 0; i < data.length; i++) {
                                    let nombreTem = listaMarcas[i].nombre;
                                    inputs += `<li><a class="dropdown-item" id="marcaInput" href="#">${nombreTem}</a></li>`;
                                }
                                 inputs += `
                                   
                                </ul>
                            </div>
                        </div>
                        <div class="row mt-2  align-items-center">
                            <input type="text" id="modeloInput" placeholder="Modelo">
                        </div> 
                        <div class="row mt-2  align-items-center">
                            <input type="text" id="colorInput" placeholder="Color">
                        </div>
                        <div class="row mt-2  align-items-center">
                            <input type="number" id="precioInput" placeholder="Precio">
                        </div>
                   
                        <div class="row mt-5 align-items-center">
                            <button type="submit" id="submitButton">Insertar Automovil</button>
                        </div>
                    </div> 
                </div>
                `;
                
            
                 contentPrincipal.innerHTML = inputs;
                 let matriculaInput =document.getElementById("matriculaInput");
                 let marcaInput =document.getElementById("marcaInput");
                 let modeloInput =document.getElementById("modeloInput");
                 let colorInput =document.getElementById("colorInput");
                 let precioInput =document.getElementById("precioInput");
                
    
                submitButton.addEventListener("click", function() {
                    let matriculaInsert = matriculaInput.value;
                    let marcaInsert = marcaInput.value;
                    let modeloInsert = modeloInput.value;
                    let colorInsert = colorInput.value;
                    let precioInsert = precioInput.value;
                    console.log(marcaInsert);
           
        
                let automovil = new Automovil(matriculaInsert, marcaInsert,modeloInsert, colorInsert, precioInsert );
                insertarAutomovil(automovil);
                });

            
            });
    
        
    }



    function insertarMarca(Marca){

        let datosInsert = new FormData();
       
        datosInsert.append("id_marca", Marca.id_marca);
        datosInsert.append("nombre", Marca.nombre);
        console.log(Marca.nombre);
    
        let configuration = {
                                method:"POST",
                                headers:{
                                    "Accept": "application/json",
                                },
                                body: datosInsert,
                            };
        fetch("http://localhost/automovilAPI/API/InsertarMarca.php", configuration)
        .then(respuesta => respuesta.json())
        .then(data=>{
             console.log('Respuesta JSON servidor: ');
             console.log(data);
    
        });
        ver_listaMarca();
    

    }

    function insertarAutomovil(Automovil){

        let datosInsert = new FormData();
       
        datosInsert.append("matricula", Automovil.matricula);
        datosInsert.append("marca", Automovil.marca);
        datosInsert.append("modelo", Automovil.modelo);
        datosInsert.append("color", Automovil.color);
        datosInsert.append("precio", Automovil.precio);

        console.log(Automovil.marca);
    
        let configuration = {
                                method:"POST",
                                headers:{
                                    "Accept": "application/json",
                                },
                                body: datosInsert,
                            };
        fetch("http://localhost/AutomovilAPI/API/InsertarAuto.php", configuration)
        .then(respuesta => respuesta.json())
        .then(data=>{
             console.log('Respuesta JSON servidor: ');
             console.log(data);
    
        });
        ver_listaAutomovil();
    

    }

    
    function mostrarInputsEditarMarca(){
        let inputs = `
        <div class="container-fluid mt-5 d-flex justify-content-start">
      
                <div class="col-lg-6">
                     <div class="row align-items-center">
                        <input type="text" id="id_marcaInput" placeholder="Id_marca">
                    </div>
                    <div class="row mt-2  align-items-center">
                        <input type="text" id="nombreInput" placeholder="Nombre">
                    </div>
           
                    <div class="row mt-5 align-items-center">
                        <button type="submit" id="submitButton">Editar</button>
                    </div>
                </div> 
        </div>
        `;
    
        contentPrincipal.innerHTML = inputs;
    
        let id_marcaInput =document.getElementById("id_marcaInput");
        let nombreInput =document.getElementById("nombreInput");
    
        submitButton.addEventListener("click", function() {
            let id_marcaInsert = id_marcaInput.value;
            let nombreInsert = nombreInput.value;
           
        
           let marca = new Marca(id_marcaInsert, nombreInsert);
           editarMarca(marca);
           ver_listaMarca();
        });
    }

    function editarMarca(Marca){
        let datosInsert = new FormData();
    
        datosInsert.append("id_marca", Marca.id_marca);
        datosInsert.append("nombre", Marca.nombre);
       
        console.log(Marca.nombre);
    
        let configuration = {
                                method:"POST",
                                headers:{
                                    "Accept": "application/json",
                                },
                                body: datosInsert,
                            };
        fetch("http://localhost/AutomovilAPI/API/ActualizarMarca.php", configuration)
        .then(respuesta => respuesta.json())
        .then(data=>{
             console.log('Respuesta JSON servidor: ');
             console.log(data);
    
        });
    }

    function mostrarInputsEditarAuto(){
        
        let listaMarcas =  [];
        endpoint= "http://localhost/automovilAPI/API/ObtenerMarca.php"
    
            fetch(endpoint)
            .then(respuesta => respuesta.json())
            .then(data => {

                for (var i = 0; i < data.length; i++) {
                   
                    let idMarca = data[i].id_marca;
                    let nombreMarca = data[i].nombre;
                    let marca = new Marca(idMarca, nombreMarca);
                    listaMarcas[i] = marca;
                    

                }
                let inputs = `
                <div class="container-fluid mt-5 d-flex justify-content-end ">
                    <div class="col-lg-6">
                        <div class="row align-items-center">
                            <input type="text" id="matriculaInput" placeholder="Matricula">
                        </div>
                        <div class="row mt-2  align-items-center">
                            <div class="dropdown">
                                <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    Marca
                                </button>
                                <ul class="dropdown-menu">`;
                                for (let i = 0; i < data.length; i++) {
                                    let nombreTem = listaMarcas[i].nombre;
                                    inputs += `<li><a class="dropdown-item" id="marcaInput" href="#">${nombreTem}</a></li>`;
                                }
                                 inputs += `
                                   
                                </ul>
                            </div>
                        </div>
                        <div class="row mt-2  align-items-center">
                            <input type="text" id="modeloInput" placeholder="Modelo">
                        </div> 
                        <div class="row mt-2  align-items-center">
                            <input type="text" id="colorInput" placeholder="Color">
                        </div>
                        <div class="row mt-2  align-items-center">
                            <input type="number" id="precioInput" placeholder="Precio">
                        </div>
                   
                        <div class="row mt-5 align-items-center">
                            <button type="submit" id="submitButton">Editar</button>
                        </div>
                    </div> 
                </div>
                `;
                
            
                 contentPrincipal.innerHTML = inputs;
                let matriculaInput =document.getElementById("matriculaInput");
                let marcaInput =document.getElementById("marcaInput");
                let modeloInput =document.getElementById("modeloInput");
                let colorInput =document.getElementById("colorInput");
                let precioInput =document.getElementById("precioInput");
                
    
                submitButton.addEventListener("click", function() {
                    let matriculaInsert = matriculaInput.value;
                    let marcaInsert = marcaInput.value;
                    let modeloInsert = modeloInput.value;
                    let colorInsert = colorInput.value;
                    let precioInsert = precioInput.value;
                    console.log(marcaInsert);
           
        
                let automovil = new Automovil(matriculaInsert, marcaInsert,modeloInsert, colorInsert, precioInsert );
                editarAutomovil(automovil);
                ver_listaAutomovil();
                });

            
            });
    
        
    }

    function editarAutomovil(Automovil){
        let datosInsert = new FormData();
    
        datosInsert.append("matricula", Automovil.id_marca);
        datosInsert.append("marca", Automovil.marca);
        datosInsert.append("modelo", Automovil.modelo);
        datosInsert.append("color", Automovil.color);
        datosInsert.append("precio", Automovil.precio);
       
        console.log(Marca.nombre);
    
        let configuration = {
                                method:"POST",
                                headers:{
                                    "Accept": "application/json",
                                },
                                body: datosInsert,
                            };
        fetch("http://localhost/AutomovilAPI/API/ActualizarAuto.php", configuration)
        .then(respuesta => respuesta.json())
        .then(data=>{
             console.log('Respuesta JSON servidor: ');
             console.log(data);
    
        });
    }

    function inputsEliminarMarca(){
        let inputs = `
                <div class="container mt-5"
                    <div class="row mt-5  align-items-center ">
                        <div class="col-lg-6 ">
                            <input type="text" id="id_marcaInput" placeholder="Id marca">

                            <button type="submit" id="submitButton">Eliminar</button>
                        </div>
                    </div> 
                </div>
                `;
        contentPrincipal.innerHTML = inputs;
    
        let id_marcaInput =document.getElementById("id_marcaInput");
       
        submitButton.addEventListener("click", function() {
            let id_marcaInsert = id_marcaInput.value;
        
           eliminarMarca(id_marcaInsert);
           ver_listaMarca();
        });
    }

    let parametroString;
    function eliminarMarca(parametroString){
        let datosInsert = new FormData();
    
        datosInsert.append("id_marca", parametroString);
       
    
        let configuration = {
                                method:"POST",
                                headers:{
                                    "Accept": "application/json",
                                },
                                body: datosInsert,
                            };
        fetch("http://localhost/AutomovilAPI/API/EliminarMarca.php", configuration)
        .then(respuesta => respuesta.json())
        .then(data=>{
             console.log('Respuesta JSON servidor: ');
             console.log(data);
    
        });
    }

    function inputsEliminarAuto(){
        
        let listaMarcas =  [];
        endpoint= "http://localhost/automovilAPI/API/ObtenerMarca.php"
    
            fetch(endpoint)
            .then(respuesta => respuesta.json())
            .then(data => {

                for (var i = 0; i < data.length; i++) {
                   
                    let idMarca = data[i].id_marca;
                    let nombreMarca = data[i].nombre;
                    let marca = new Marca(idMarca, nombreMarca);
                    listaMarcas[i] = marca;
                    

                }
                let inputs = `
                <div class="container-fluid mt-5 d-flex justify-content-end"
                    <div class="row mt-5  align-items-center ">
                        <div class="col-lg-6 ">
                            <input type="text" id="matriculaInput" placeholder="Matricula">

                            <button type="submit" id="submitButton">Eliminar</button>
                        </div>
                    </div> 
                </div>
                `;
                
            
                 contentPrincipal.innerHTML = inputs;
                let matriculaInput =document.getElementById("matriculaInput");

    
                submitButton.addEventListener("click", function() {
                    let matriculaInsert = matriculaInput.value;
                   
                    console.log(matriculaInsert);
           
        
                eliminarAutomovil(matriculaInsert);
                ver_listaAutomovil();
                });

            
            });
        
    }

    function eliminarAutomovil(parametroString){
        let datosInsert = new FormData();
    
        datosInsert.append("matricula", parametroString );
    
    
        let configuration = {
                                method:"POST",
                                headers:{
                                    "Accept": "application/json",
                                },
                                body: datosInsert,
                            };
        fetch("http://localhost/AutomovilAPI/API/EliminarAuto.php", configuration)
        .then(respuesta => respuesta.json())
        .then(data=>{
             console.log('Respuesta JSON servidor: ');
             console.log(data);
    
        });
    }



    