let contentPrincipal;
let nombre;
let image;

window.onload = function(){
    contentPrincipal = document.getElementById("contentPrincipal");
    nombre = document.getElementById("name");
    image = document.getElementById("image");

}




function consumoAPI(endpoint= "https://pokeapi.co/api/v2/pokemon"){
    

    //consumo - AJAX
    fetch(endpoint)
  .then(respuesta => respuesta.json())
  .then(data => {
    let btn_volver = `<div class="col-6 text-end">
    <button onclick="volver('${data.previous}')" id="volver" class="btn btn-outline-danger">VOLVER</button>
    </div>`;
    let btn_siguiente = `<div class="col-6">
    <button onclick="siguiente('${data.next}')" id="siguiente" class="btn btn-outline-success">SIGUIENTE</button>
    </div>`;
    let fila_botones = `<div class="row justify-content-center ">
    ${btn_volver}
    ${btn_siguiente}    
    </div>`;
    contentPrincipal.innerHTML = "";
    for (var i = 0; i < data.results.length; i+=2) { 
        let html_temp = `<div class="row align-items-start ">`;
        
       html_temp = `<div class="row  align-items-start">
                          <div class="col-lg-4  ">
                            <button onclick="cargarDetalle('${data.results[i].url}')" class="btn btn-outline-dark m-1 mt-0 col-12"> ${data.results[i].name} </button>
                          </div>`;
      if (i+1 < data.results.length) { 
        html_temp += `<div class="col-lg-4 ">
                        <button onclick="cargarDetalle('${data.results[i+1].url}')" class="btn btn-outline-dark m-1 mt-0 col-12"> ${data.results[i+1].name} </button>
                      </div>`;
      }
      html_temp += `</div>`; 
      contentPrincipal.innerHTML += html_temp;
    }
    // contentPrincipal.innerHTML += btn_volver;
    // contentPrincipal.innerHTML += btn_siguiente;
    contentPrincipal.innerHTML += fila_botones;

    

  });

}


function cargarDetalle(endpoint){
    fetch(endpoint)
    .then( respuesta => respuesta.json() )
    .then(data => {
        nombre.innerHTML = data.name;
        image.src = data.sprites.other.dream_world.front_default;
        console.log(image)
        console.log(nombre)
      
        });

        
    
}

function siguiente(endpoint){
    consumoAPI(endpoint)
    console.log(endpoint)
}

function volver(endpoint){
   if(endpoint !== null)
        consumoAPI(endpoint)
   else
        consumoAPI("https://pokeapi.co/api/v2/pokemon");
}
