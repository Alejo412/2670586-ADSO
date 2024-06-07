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
        <div class="container mt-5 ">
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
        let inputs = `
        <div class="container-fluid mt-5 d-flex justify-content-end ">
            <div class="col-lg-6">
                <div class="row align-items-center">
                    <input type="text" id="matriculaInput" placeholder="Matricula">
                </div>
                <div class="row mt-2  align-items-center">
                    <input type="text" id="marcaInput" placeholder="Marca">
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
    
        let id_marcaInput =document.getElementById("id_marcaInput");
        let nombreInput =document.getElementById("nombreInput");
    
        submitButton.addEventListener("click", function() {
            let matriculaInsert = matriculaInput.value;
            let marcaInsert = marcaInput.value;
            let modeloInsert = modeloInput.value;
            let colorInsert = colorInput.value;
            let precioInsert = precioInput.value;
           
        
           let automovil = new Automovil(matriculaInsert, marcaInsert,modeloInsert, colorInsert, precioInsert );
           insertarAutomovil(automovil);
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
    }
    