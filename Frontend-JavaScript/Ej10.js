let prueba = prompt('Dicte una frase');

var suma = "";

let vuelta = (a) => console.log(a);

for (let index = 0; index < prueba.length; index++) {
    let corto = prueba.substring(index, index + 1);

    suma = corto + suma;
}

let vueltas = vuelta(suma);

