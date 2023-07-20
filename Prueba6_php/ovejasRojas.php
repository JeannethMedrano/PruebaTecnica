<?php

// Definir una clase para representar una oveja
class Oveja {
    public $nombre;
    public $color;

    public function __construct($nombre, $color) {
        $this->nombre = $nombre;
        $this->color = $color;
    }
}

// Crear un array de ovejas
$ovejas = [
    new Oveja("Ana", "rojo"),
    new Oveja("Nancy", "rojo"),
    new Oveja("Amanda", "blanco"),
    new Oveja("Sam", "rojo"),
    new Oveja("Laura", "rojo"),
    new Oveja("Samantha", "rojo"),
    new Oveja("Marian", "blanco"),
    new Oveja("Mario", "rojo"),
    new Oveja("Horacio", "rojo"),
    new Oveja("Andrea", "blanco"),
];

function filtrarOvejas($ovejas) {
    $ovejasFiltradas = array_filter($ovejas, function ($oveja) {
        // Convertir el nombre a minúsculas y eliminar los espacios
        $nombreSinEspacios = str_replace(' ', '', strtolower($oveja->nombre));

        // Verificar que el color sea rojo y que el nombre contenga las letras "a" y "n" (sin importar el orden)
        return ($oveja->color === 'rojo' && strpos($nombreSinEspacios, 'a') !== false && strpos($nombreSinEspacios, 'n') !== false);
    });

    return $ovejasFiltradas;
}

echo "Lista de todas las ovejas de color rojo cuyos nombres contienen las letras 'a' y 'n':\n";

$ovejasFiltradas = filtrarOvejas($ovejas);

foreach ($ovejasFiltradas as $oveja) {
    echo $oveja->nombre . " - " . $oveja->color . "\n";
}
?>