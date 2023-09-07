-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-05-2021 a las 06:04:41
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `control_seguimiento_covid`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proceso_vacunacion`
--

CREATE TABLE `proceso_vacunacion` (
  `pv_id` int(11) NOT NULL,
  `pc_cedula` int(11) NOT NULL,
  `pc_nombres` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `va_codigo` int(11) NOT NULL,
  `va_nombre` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `va_laboratorio` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `pv_cantidad_dosis` int(10) NOT NULL,
  `pv_fecha_ing` date NOT NULL,
  `usu_cedula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `proceso_vacunacion`
--

INSERT INTO `proceso_vacunacion` (`pv_id`, `pc_cedula`, `pc_nombres`, `va_codigo`, `va_nombre`, `va_laboratorio`, `pv_cantidad_dosis`, `pv_fecha_ing`, `usu_cedula`) VALUES
(1, 1001, 'Hugo Torres', 10002, 'Sinopharm', 'Sinopharm', 1, '2021-04-18', 1001),
(2, 1002, 'Delis Mendoza', 10001, 'Pfizer', 'Pfizer', 1, '2021-04-22', 1001),
(3, 1003, 'Chadia Orozco', 10003, 'Pfizer', 'Pfizer', 1, '2021-04-22', 1001),
(4, 1004, 'Carlos Torres', 10004, 'Pfizer', 'Pfizer', 1, '2021-04-22', 1001),
(5, 1005, 'Luis Alberto', 10005, 'Oxford', 'AstraZeneca', 1, '2021-04-22', 1001),
(6, 1006, 'Maira Mendoza', 10006, 'Oxford', 'AstraZeneca', 1, '2021-04-22', 1001),
(7, 1007, 'Cecilia', 10007, 'Sinopharm', 'Sinopharm', 1, '2021-04-22', 1001),
(8, 1008, 'Hugo Torres Mendoza', 10008, 'Sinopharm', 'Sinopharm', 1, '2021-04-22', 1001),
(9, 1009, 'Dustin Baez', 10009, 'Sinopharm', 'Sinopharm', 1, '2021-04-22', 1001),
(10, 1010, 'Stiven Torres', 10010, 'Sinopharm', 'Sinopharm', 1, '2021-04-22', 1001);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registrar_paciente`
--

CREATE TABLE `registrar_paciente` (
  `pc_cedula` int(11) NOT NULL,
  `pc_nombres` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `pc_telefono` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `pc_fecha_nac` date NOT NULL,
  `pc_genero` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `pc_estado_civil` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `pc_ciudad` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `pc_municipio` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `pc_barrio` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `pc_estado_covid` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `usu_cedula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `registrar_paciente`
--

INSERT INTO `registrar_paciente` (`pc_cedula`, `pc_nombres`, `pc_telefono`, `pc_fecha_nac`, `pc_genero`, `pc_estado_civil`, `pc_ciudad`, `pc_municipio`, `pc_barrio`, `pc_estado_covid`, `usu_cedula`) VALUES
(1001, 'Hugo Torres', '3123', '2021-04-10', 'Masculino', 'Casado/a', 'Barranquilla', 'Malambo', 'Bellavista', 'Negativo', 1001),
(1002, 'Delis Mendoza', '30012', '1997-04-10', 'Femenina', 'Casado/a', 'Barranquilla', 'Malambo', 'Bellavista', 'Negativo', 1001),
(1003, 'Chadia Orozco', '30123', '2000-08-24', 'Femenina', 'Casado/a', 'Barranquilla', 'Malambo', 'Concorde', 'Negativo', 1001),
(1004, 'Carlos Torres', '31023', '1999-08-25', 'Masculino', 'Casado/a', 'Barranquilla', 'Malambo', 'Bellavista', 'Negativo', 1001),
(1005, 'Luis Alberto', '3213', '2018-08-23', 'Masculino', 'Casado/a', 'Barranquilla', 'Malambo', 'Bellavista', 'Negativo', 1001),
(1006, 'Maira Mendoza', '3124', '1996-08-05', 'Femenina', 'Soltero/a', 'Barranquilla', 'Soledad', 'Las moras', 'Negativo', 1001),
(1007, 'Cecilia', '3123', '1996-08-13', 'Femenina', 'Soltero/a', 'Barranquilla', 'Soledad', 'Ciudadela', 'Negativo', 1001),
(1008, 'Hugo Torres Mendoza', '32012', '1996-05-29', 'Femenina', 'Casado/a', 'Barranquilla', 'Malambo', 'Bellavista', 'Negativo', 1001),
(1009, 'Dustin Baez', '31232', '1996-05-01', 'Masculino', 'Casado/a', 'Barranquilla', 'Soledad', 'Carrisal', 'Negativo', 1001),
(1010, 'Stiven Torres', '30122', '2000-01-31', 'Masculino', 'Casado/a', 'Barranquilla', 'Malambo', 'Bellavista', 'Negativo', 1001);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registrar_vacuna`
--

CREATE TABLE `registrar_vacuna` (
  `vc_codigo` int(11) NOT NULL,
  `vc_nombre` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `vc_laboratorio` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `vc_fecha_ing` date NOT NULL,
  `rv_usado` varchar(2) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `registrar_vacuna`
--

INSERT INTO `registrar_vacuna` (`vc_codigo`, `vc_nombre`, `vc_laboratorio`, `vc_fecha_ing`, `rv_usado`) VALUES
(10001, 'Pfizer', 'Pfizer', '2021-04-22', 'Si'),
(10002, 'Sinopharm', 'Sinopharm', '2021-04-18', 'Si'),
(10003, 'Pfizer', 'Pfizer', '2021-04-22', 'Si'),
(10004, 'Pfizer', 'Pfizer', '2021-04-22', 'Si'),
(10005, 'Oxford', 'AstraZeneca', '2021-04-22', 'Si'),
(10006, 'Oxford', 'AstraZeneca', '2021-04-22', 'Si'),
(10007, 'Sinopharm', 'Sinopharm', '2021-04-22', 'Si'),
(10008, 'Sinopharm', 'Sinopharm', '2021-04-22', 'Si'),
(10009, 'Sinopharm', 'Sinopharm', '2021-04-22', 'Si'),
(10010, 'Sinopharm', 'Sinopharm', '2021-04-22', 'Si');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reportar_sintomas`
--

CREATE TABLE `reportar_sintomas` (
  `rs_id` int(11) NOT NULL,
  `pc_cedula` int(11) NOT NULL,
  `pc_nombres` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `vac_codigo` int(11) NOT NULL,
  `rs_sintomas` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `rs_observacion` varchar(200) COLLATE utf8_spanish2_ci NOT NULL,
  `rs_fecha_ing` date NOT NULL,
  `usu_cedula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `reportar_sintomas`
--

INSERT INTO `reportar_sintomas` (`rs_id`, `pc_cedula`, `pc_nombres`, `vac_codigo`, `rs_sintomas`, `rs_observacion`, `rs_fecha_ing`, `usu_cedula`) VALUES
(1, 1001, 'Hugo Torres', 10002, 'Diarrea', 'El paciente presenta diarrea con más de 3 días.', '2021-04-18', 1001),
(2, 1002, 'Delis Mendoza', 10001, 'Fiebre', 'Temperatura a 39 grados', '2021-04-22', 1001),
(3, 1003, 'Chadia Orozco', 10003, 'Fiebre', 'Temperatura a 38.7 grados', '2021-04-22', 1001),
(4, 1004, 'Carlos Torres', 10004, 'Diarrea', 'Lleva 3 días con diarrea', '2021-04-22', 1001),
(5, 1005, 'Luis Alberto', 10005, 'Diarrea', 'lleva 2 dias con diarrea', '2021-04-22', 1001),
(6, 1006, 'Maira Mendoza', 10006, 'Vomito', 'lleva 2 días vomitando', '2021-04-22', 1001),
(7, 1007, 'Cecilia', 10007, 'Vomito', 'lleva 2 dias vomitando', '2021-04-22', 1001),
(8, 1008, 'Hugo Torres Mendoza', 10008, 'Dolor de barriga', 'lleva 2 dias con dolor de barriga', '2021-04-22', 1001),
(9, 1009, 'Dustin Baez', 10009, 'Dolor de barriga', 'lleva 2 dias con dolor de barriga', '2021-04-22', 1001),
(10, 1010, 'Stiven Torres', 10010, 'Dolor de barriga', 'lleva 2 días con dolor de barriga', '2021-04-22', 1001);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `usu_cedula` int(11) NOT NULL,
  `usu_nombres` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `usu_correo` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `usu_telefono` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `usu_usuario` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `usu_clave` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `usu_rol` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `usu_estado_cuenta` varchar(10) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`usu_cedula`, `usu_nombres`, `usu_correo`, `usu_telefono`, `usu_usuario`, `usu_clave`, `usu_rol`, `usu_estado_cuenta`) VALUES
(1001, 'Stiven Torres', 'torresmendoza@gmail.com', '301608', 'stiven3120', '3120', 'Administrador', 'Activo'),
(1002, 'Dustin Gomez', 'dustin@gmail.com', '301612', 'dustin2424', '2525', 'Personal medico', 'Activo'),
(1003, 'Chadia Orozco', 'chadia0324@gmail.com', '30123', 'chadia03', '0324', 'Administrador', 'Activo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `proceso_vacunacion`
--
ALTER TABLE `proceso_vacunacion`
  ADD PRIMARY KEY (`pv_id`),
  ADD UNIQUE KEY `va_codigo` (`va_codigo`),
  ADD KEY `rp_cedula` (`pc_cedula`),
  ADD KEY `usu_cedula` (`usu_cedula`);

--
-- Indices de la tabla `registrar_paciente`
--
ALTER TABLE `registrar_paciente`
  ADD PRIMARY KEY (`pc_cedula`),
  ADD KEY `usu_cedula` (`usu_cedula`);

--
-- Indices de la tabla `registrar_vacuna`
--
ALTER TABLE `registrar_vacuna`
  ADD PRIMARY KEY (`vc_codigo`);

--
-- Indices de la tabla `reportar_sintomas`
--
ALTER TABLE `reportar_sintomas`
  ADD PRIMARY KEY (`rs_id`),
  ADD KEY `usu_cedula` (`usu_cedula`),
  ADD KEY `pc_cedula` (`pc_cedula`),
  ADD KEY `vac_codigo` (`vac_codigo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`usu_cedula`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `proceso_vacunacion`
--
ALTER TABLE `proceso_vacunacion`
  MODIFY `pv_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `reportar_sintomas`
--
ALTER TABLE `reportar_sintomas`
  MODIFY `rs_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `proceso_vacunacion`
--
ALTER TABLE `proceso_vacunacion`
  ADD CONSTRAINT `proceso_vacunacion_ibfk_1` FOREIGN KEY (`usu_cedula`) REFERENCES `usuario` (`usu_cedula`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `proceso_vacunacion_ibfk_2` FOREIGN KEY (`pc_cedula`) REFERENCES `registrar_paciente` (`pc_cedula`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `proceso_vacunacion_ibfk_3` FOREIGN KEY (`va_codigo`) REFERENCES `registrar_vacuna` (`vc_codigo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `registrar_paciente`
--
ALTER TABLE `registrar_paciente`
  ADD CONSTRAINT `registrar_paciente_ibfk_1` FOREIGN KEY (`usu_cedula`) REFERENCES `usuario` (`usu_cedula`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `reportar_sintomas`
--
ALTER TABLE `reportar_sintomas`
  ADD CONSTRAINT `reportar_sintomas_ibfk_1` FOREIGN KEY (`usu_cedula`) REFERENCES `usuario` (`usu_cedula`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
