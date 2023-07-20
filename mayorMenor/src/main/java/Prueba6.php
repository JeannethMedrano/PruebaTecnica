<?php

class Oveja {
    public $nombre;
    public $color;

    public function __construct($nombre, $color) {
        $this->nombre = $nombre;
        $this->color = $color;
    }
}

$ovejas = [
    new Oveja("Ana", "rojo"),
    new Oveja("Nancy", "rojo"),
    new Oveja("Amanda", "blanco"),
    new Oveja("Sam", "rojo"),
    new Oveja("Laura", "rojo"),
    new Oveja("Alex", "blanco"),
    new Oveja("Luz", "rojo"),
    new Oveja("Lau", "blanco"),
    new Oveja("Mariana", "rojo"),
    new Oveja("Santi", "rojo"),
    new Oveja("Mario", "rojo"),
];

function filtrarOvejas($ovejas) {
    $ovejasFiltradas = array_filter($ovejas, function ($oveja) {
        $nombreSinEspacios = str_replace(' ', '', strtolower($oveja->nombre));
        return ($oveja->color === 'rojo' && strpos($nombreSinEspacios, 'a') !== false && strpos($nombreSinEspacios, 'n') !== false);
    });

    return $ovejasFiltradas;
}

echo "Lista ovejas rojas y con nombres que contienen las letras 'a' y 'n':\n";

$ovejasFiltradas = filtrarOvejas($ovejas);

foreach ($ovejasFiltradas as $oveja) {
    echo $oveja->nombre . " - " . $oveja->color . "\n";
}
?>