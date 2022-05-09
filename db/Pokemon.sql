-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-05-2022 a las 22:57:14
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Base de datos: `pokemon`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `combate`
--

CREATE TABLE `combate` (
  `Jugador` int(20) NOT NULL,
  `Rival` int(20) NOT NULL,
  `Ganador` int(20) NOT NULL,
  `Turno` int(20) NOT NULL,
  `Numero de KO jugador` int(20) NOT NULL,
  `Numero de KO rival` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrenador`
--

CREATE TABLE `entrenador` (
  `Nombre` varchar(20) NOT NULL,
  `Equipo` int(20) NOT NULL,
  `Caja` int(20) NOT NULL,
  `Pokedollar` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pokémon`
--

CREATE TABLE `pokémon` (
  `Nombre` varchar(20) NOT NULL,
  `Mote` varchar(20) NOT NULL,
  `Vitalidad` int(20) NOT NULL,
  `Tipo` enum('AGUA','FUEGO','PLANTA','BICHO','ELECTRICO','TIERRA','VOLADOR') NOT NULL,
  `Ataque` int(20) NOT NULL,
  `Defensa` int(20) NOT NULL,
  `Ataque especial` int(20) NOT NULL,
  `Defensa especial` int(20) NOT NULL,
  `Velocidad` int(20) NOT NULL,
  `Fertilidad` int(20) NOT NULL,
  `Estamina` int(20) NOT NULL,
  `Nivel` int(20) NOT NULL,
  `Estado` enum('PARALIZADO','DORMIDO','QUEMADO','SIN_ESTADO') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turno`
--

CREATE TABLE `turno` (
  `Número de turnos` int(20) NOT NULL,
  `Acción jugador` varchar(20) NOT NULL,
  `Acción rival` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `entrenador`
--
ALTER TABLE `entrenador`
  ADD PRIMARY KEY (`Nombre`);

--
-- Indices de la tabla `pokémon`
--
ALTER TABLE `pokémon`
  ADD PRIMARY KEY (`Nombre`);
COMMIT;