-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 29-10-2020 a las 22:05:15
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.2.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `citas_medicas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `citNumero` int(11) NOT NULL,
  `citfecha` date DEFAULT NULL,
  `citHora` varchar(10) DEFAULT NULL,
  `citPaciente` char(10) DEFAULT NULL,
  `citMedico` char(10) DEFAULT NULL,
  `citConsultorio` int(11) DEFAULT NULL,
  `citEstado` enum('asignada','cumplida') DEFAULT NULL,
  `citObservaciones` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consultorios`
--

CREATE TABLE `consultorios` (
  `conIdentificador` int(10) NOT NULL,
  `conNombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicos`
--

CREATE TABLE `medicos` (
  `medIdentificador` char(10) NOT NULL,
  `medNombres` varchar(50) DEFAULT NULL,
  `medApellidos` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `pacIdentificador` char(10) NOT NULL,
  `pacNombres` varchar(50) DEFAULT NULL,
  `pacApellidos` varchar(50) DEFAULT NULL,
  `pacFechaNacimiento` date DEFAULT NULL,
  `pacSexo` enum('M','F') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamientos`
--

CREATE TABLE `tratamientos` (
  `traNumero` int(10) NOT NULL,
  `traFechaAsignada` date DEFAULT NULL,
  `traDescripcion` text DEFAULT NULL,
  `traFechaInicio` date DEFAULT NULL,
  `traFechaFin` date DEFAULT NULL,
  `traObservaciones` text DEFAULT NULL,
  `traPacientes` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`citNumero`),
  ADD KEY `Fk_citas_pacientes` (`citPaciente`),
  ADD KEY `fk_citas_medicos` (`citMedico`),
  ADD KEY `fk_citas_consultorio` (`citConsultorio`);

--
-- Indices de la tabla `consultorios`
--
ALTER TABLE `consultorios`
  ADD PRIMARY KEY (`conIdentificador`);

--
-- Indices de la tabla `medicos`
--
ALTER TABLE `medicos`
  ADD PRIMARY KEY (`medIdentificador`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`pacIdentificador`);

--
-- Indices de la tabla `tratamientos`
--
ALTER TABLE `tratamientos`
  ADD PRIMARY KEY (`traNumero`),
  ADD KEY `fk_tratamientos_pacientes` (`traPacientes`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `citNumero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `tratamientos`
--
ALTER TABLE `tratamientos`
  MODIFY `traNumero` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `Fk_citas_pacientes` FOREIGN KEY (`citPaciente`) REFERENCES `pacientes` (`pacIdentificador`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_citas_consultorio` FOREIGN KEY (`citConsultorio`) REFERENCES `consultorios` (`conIdentificador`),
  ADD CONSTRAINT `fk_citas_medicos` FOREIGN KEY (`citMedico`) REFERENCES `medicos` (`medIdentificador`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `tratamientos`
--
ALTER TABLE `tratamientos`
  ADD CONSTRAINT `fk_tratamientos_pacientes` FOREIGN KEY (`traPacientes`) REFERENCES `pacientes` (`pacIdentificador`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
