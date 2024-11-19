const pantalla = document.getElementById('pantalla');
const botonesNumeros = document.querySelectorAll('.numero');
const botonesOperaciones = document.querySelectorAll('.operacion');
const botonesCientificos = document.querySelectorAll('.cientifica');
const botonIgual = document.getElementById('igual');
const botonBorrar = document.getElementById('borrar');
const botonPunto = document.getElementById('punto');

let operacion = '';
let numero1 = '';
let numero2 = '';
let resultado = '';
let nuevaOperacion = true;

// Manejo de botones numéricos
botonesNumeros.forEach(boton => {
    boton.addEventListener('click', () => {
        if (nuevaOperacion) {
            pantalla.value = '';
            nuevaOperacion = false;
        }
        pantalla.value += boton.textContent;
    });
});

// Manejo de botones de operaciones
botonesOperaciones.forEach(boton => {
    boton.addEventListener('click', () => {
        if (pantalla.value !== '') {
            numero1 = parseFloat(pantalla.value);
            operacion = boton.textContent;
            nuevaOperacion = true;
        }
    });
});

// Manejo del botón igual
botonIgual.addEventListener('click', () => {
    if (pantalla.value !== '' && operacion !== '') {
        numero2 = parseFloat(pantalla.value);
        switch (operacion) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero2 !== 0 ? numero1 / numero2 : 'Error';
                break;
        }
        pantalla.value = resultado;
        nuevaOperacion = true;
    }
});

// Manejo de botones científicos
botonesCientificos.forEach(boton => {
    boton.addEventListener('click', () => {
        if (pantalla.value !== '') {
            const numero = parseFloat(pantalla.value);
            switch (boton.textContent) {
                case 'sin':
                    resultado = Math.sin(numero);
                    break;
                case 'cos':
                    resultado = Math.cos(numero);
                    break;
                case 'tan':
                    resultado = Math.tan(numero);
                    break;
            }
            pantalla.value = resultado;
        }
    });
});

// Manejo del botón borrar
botonBorrar.addEventListener('click', () => {
    pantalla.value = '';
    numero1 = '';
    numero2 = '';
    operacion = '';
});

// Manejo del botón punto
botonPunto.addEventListener('click', () => {
    if (!pantalla.value.includes('.')) {
        pantalla.value += '.';
    }
});
