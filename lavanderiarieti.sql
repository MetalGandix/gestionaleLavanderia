-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Ago 04, 2022 alle 15:30
-- Versione del server: 10.4.22-MariaDB
-- Versione PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lavanderiarieti`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `articolo`
--

CREATE TABLE `articolo` (
  `id` bigint(20) NOT NULL,
  `consegnato` bit(1) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `numero_lavorazione` int(11) DEFAULT NULL,
  `prezzo` double DEFAULT NULL,
  `pronto` bit(1) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `servizio` varchar(255) DEFAULT NULL,
  `user_username` varchar(255) DEFAULT NULL,
  `sotto_categoria_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `articolo`
--

INSERT INTO `articolo` (`id`, `consegnato`, `date`, `note`, `numero_lavorazione`, `prezzo`, `pronto`, `quantity`, `servizio`, `user_username`, `sotto_categoria_id`) VALUES
(1102, b'0', '2022-08-03', 'La t-shirt è perfetta', 1, 10, b'1', 3, 'Standard', 'Leonardo', 30),
(1106, b'0', '2022-08-08', '', 1, 0, b'0', 1, 'Standard', 'Leonardo', 34),
(1222, b'1', '2022-08-04', '', 10, 9, b'1', 2, 'Standard', 'franco', 3),
(1223, b'0', '2022-08-04', '', 10, 0, b'0', 1, 'Standard', 'franco', 6),
(1224, b'0', '2022-08-04', '', 10, 0, b'0', 2, 'Standard', 'franco', 10),
(1225, b'0', '2022-08-04', '', 10, 0, b'0', 1, 'Standard', 'franco', 19),
(1226, b'0', '2022-08-04', '', 10, 0, b'0', 2, 'Standard', 'franco', 16),
(1227, b'0', '2022-08-04', '', 10, 0, b'0', 1, 'Standard', 'franco', 15),
(1228, b'0', '2022-08-04', '', 10, 0, b'0', 1, 'Standard', 'franco', 62),
(1229, b'0', '2022-08-04', '', 10, 0, b'0', 1, 'Standard', 'franco', 125),
(1230, b'0', '2022-08-04', '', 10, 0, b'0', 1, 'Standard', 'franco', 136),
(1231, b'0', '2022-08-09', '', 11, 0, b'0', 1, 'Standard', 'Leonardo', 134),
(1232, b'0', '2022-08-09', '', 11, 0, b'0', 1, 'Standard', 'Leonardo', 18),
(1233, b'0', '2022-08-09', '', 11, 0, b'0', 1, 'Standard', 'Leonardo', 19);

-- --------------------------------------------------------

--
-- Struttura della tabella `categoria`
--

CREATE TABLE `categoria` (
  `id` bigint(20) NOT NULL,
  `nome` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `categoria`
--

INSERT INTO `categoria` (`id`, `nome`) VALUES
(1, 'Pantaloni'),
(2, 'Gonne'),
(3, 'Camicie'),
(4, 'Cappelli'),
(5, 'Abiti'),
(6, 'Giacche e giacconi'),
(7, 'Trapunte e piumoni'),
(8, 'Maglie'),
(9, 'Pigiami e vestaglie'),
(10, 'Scarpe'),
(11, 'Tappeti'),
(12, 'Tende'),
(13, 'Varie');

-- --------------------------------------------------------

--
-- Struttura della tabella `mysequence`
--

CREATE TABLE `mysequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `mysequence`
--

INSERT INTO `mysequence` (`next_val`) VALUES
(1300);

-- --------------------------------------------------------

--
-- Struttura della tabella `sotto_categoria`
--

CREATE TABLE `sotto_categoria` (
  `id` bigint(20) NOT NULL,
  `descrizione` varchar(255) DEFAULT NULL,
  `categoria_id` bigint(20) DEFAULT NULL,
  `icon_url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `sotto_categoria`
--

INSERT INTO `sotto_categoria` (`id`, `descrizione`, `categoria_id`, `icon_url`) VALUES
(1, 'Abito donna serale', 5, NULL),
(2, 'Abito donna', 5, NULL),
(3, 'Abito lungo', 5, NULL),
(4, 'Abito pizzo', 5, NULL),
(5, 'Abito sposa', 5, NULL),
(6, 'Abito uomo', 5, NULL),
(7, 'Cravatta', 5, NULL),
(8, 'Divisa polizia locale', 5, NULL),
(9, 'Divisa carabiniere', 5, NULL),
(10, 'Divisa finanza', 5, NULL),
(11, 'Divisa polizia', 5, NULL),
(12, 'Gilet uomo', 5, NULL),
(13, 'Tailleur gonna', 5, NULL),
(14, 'Tailleur pantaloni', 5, NULL),
(15, 'Pantaloni divisa', 1, 'assets//images//icon-pack//pantalone_divisa.png'),
(16, 'Pantaloni donna', 1, 'assets//images//icon-pack//pantalone_donna.png'),
(17, 'Pantaloni solo stiro', 1, 'assets//images//icon-pack//pantaloni_solo_stiro.png'),
(18, 'Pantaloni uomo', 1, 'assets//images//icon-pack//jeans_uomo.png'),
(19, 'Pantaloni pelle', 1, 'assets//images//icon-pack//pantaloni_pelle.png'),
(20, 'Pantaloni tuta donna', 1, 'assets//images//icon-pack//pantaloni_tuta_donna.png'),
(21, 'Baby dol', 8, NULL),
(22, 'Cardigan', 8, NULL),
(23, 'Felpa', 8, NULL),
(24, 'Maglia bimbo/a', 8, NULL),
(25, 'Maglia donna', 8, NULL),
(26, 'Maglia uomo', 8, NULL),
(27, 'Maglione cotone', 8, NULL),
(28, 'Maglione lana', 8, NULL),
(29, 'T-shirt', 8, NULL),
(30, 'T-shirt colorata', 8, NULL),
(31, 'Accappatoi', 13, NULL),
(32, 'Accessori', 13, NULL),
(33, 'Bambola stoffa', 13, NULL),
(34, 'Borsa', 13, NULL),
(35, 'Calzini', 13, NULL),
(36, 'Canotta unisex', 13, NULL),
(37, 'Capo con riporti', 13, NULL),
(38, 'Cintura di pelle', 13, NULL),
(39, 'Cintura di stoffa', 13, NULL),
(40, 'Copri divano', 13, NULL),
(41, 'Copri poltrona', 13, NULL),
(42, 'Copri sedia', 13, NULL),
(43, 'Doppio petto', 13, NULL),
(44, 'Fouldard', 13, NULL),
(45, 'Giacca pelle', 13, NULL),
(46, 'Gilet con tasche', 13, NULL),
(47, 'Gilet di pelle', 13, NULL),
(48, 'Guanti di lana', 13, NULL),
(49, 'Guanti uomo', 13, NULL),
(50, 'Pigiama bimbo/a', 13, NULL),
(51, 'Scarponcini', 13, NULL),
(52, 'Sciarpa', 13, NULL),
(53, 'Sciarpa bambino/a', 13, NULL),
(54, 'Sciarpa di cotone', 13, NULL),
(55, 'Sciarpa di seta', 13, NULL),
(56, 'Tovaglia rettangolare', 13, NULL),
(57, 'Tovaglia tonda', 13, NULL),
(58, 'Tuta sci bimbo', 13, NULL),
(59, 'Tuta sci adulto', 13, NULL),
(60, 'Vestaglia', 9, NULL),
(61, 'Ciabatte', 10, NULL),
(62, 'Clark', 10, NULL),
(63, 'Converse', 10, NULL),
(64, 'Hogan', 10, NULL),
(65, 'Nike', 10, NULL),
(66, 'Scarpe da ginnastica', 10, NULL),
(67, 'Scarponcini', 10, NULL),
(68, 'Timberland', 10, NULL),
(69, 'Calate tenda', 12, NULL),
(70, 'Mantovana', 12, NULL),
(71, 'Tenda', 12, NULL),
(72, 'Tenda campeggio', 12, NULL),
(73, 'Coperta 1 piazza lana', 7, NULL),
(74, 'Coperta 2 piazze lana', 7, NULL),
(75, 'Coperta bambino', 7, NULL),
(76, 'Coperta uncinetto', 7, NULL),
(77, 'Coprimaterasso', 7, NULL),
(78, 'Cuscino piuma', 7, NULL),
(79, 'Cuscino sintetico', 7, NULL),
(80, 'Federe', 7, NULL),
(81, 'Lenzuola ad una piazza', 7, NULL),
(82, 'Lenzuolo a due piazze', 7, NULL),
(83, 'Merinos 2 piazze', 7, NULL),
(84, 'Piumone 1P OCA', 7, NULL),
(85, 'Piumone 1P sintetico', 7, NULL),
(86, 'Piumone 2P OCA', 7, NULL),
(87, 'Piumone 2P sintetico', 7, NULL),
(88, 'Sacco a pelo 1 piazza', 7, NULL),
(89, 'Sacco a pelo 2 piazze', 7, NULL),
(90, 'Trapunta 1 piazza', 7, NULL),
(91, 'Trapunta 2 piazze', 7, NULL),
(92, 'Gonna', 2, NULL),
(93, 'Gonna jeans', 2, NULL),
(94, 'Gonna pelle', 2, NULL),
(95, 'Gonna pieghe', 2, NULL),
(96, 'Cappotto bimbo', 6, NULL),
(97, 'Cappotto donna', 6, NULL),
(98, 'Cappotto unisex', 6, NULL),
(99, 'Cappotto uomo', 6, NULL),
(100, 'Giacca donna', 6, NULL),
(101, 'Giacca uomo', 6, NULL),
(102, 'Giaccone corto donna', 6, NULL),
(103, 'Giaccone corto uomo', 6, NULL),
(104, 'Giaccone cotone', 6, NULL),
(105, 'Giaccone lungo donna', 6, NULL),
(106, 'Giaccone lungo uomo', 6, NULL),
(107, 'Giaccone unisex', 6, NULL),
(108, 'Giubbetto', 6, NULL),
(109, 'Giubbetto jeans', 6, NULL),
(110, 'Giubbetto estivo unisex', 6, NULL),
(111, 'Impermeabili unisex', 6, NULL),
(112, 'Interno giaccone', 6, NULL),
(113, 'Montone', 6, NULL),
(114, 'Pelliccia sintetica', 6, NULL),
(115, 'Piumino 7/8 donna', 6, NULL),
(116, 'Piumino 7/8 uomo', 6, NULL),
(117, 'Piumino corto donna', 6, NULL),
(118, 'Piumino corto uomo', 6, NULL),
(119, 'Piumino lungo donna', 6, NULL),
(120, 'Piumino lungo uomo', 6, NULL),
(121, 'Soprabito', 6, NULL),
(122, 'Tranch', 6, NULL),
(123, 'Woolrich', 6, NULL),
(124, 'Camicia bimbo', 3, NULL),
(125, 'Camicia cerimonia', 3, NULL),
(126, 'Camicia donna', 3, NULL),
(127, 'Camicia jeans', 3, NULL),
(128, 'Camicia pelle', 3, NULL),
(129, 'Camicia piegata', 3, NULL),
(130, 'Camicia seta donna', 3, NULL),
(131, 'Camicia seta uomo', 3, NULL),
(132, 'Camicia solo stiro', 3, NULL),
(133, 'Camicia uomo', 3, NULL),
(134, 'Berretto', 4, NULL),
(135, 'Cappello', 4, NULL),
(136, 'Cappello pelle', 4, NULL),
(137, 'Tappeto', 11, NULL);

-- --------------------------------------------------------

--
-- Struttura della tabella `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `cap` varchar(255) DEFAULT NULL,
  `citta` varchar(255) DEFAULT NULL,
  `codice_fiscale` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `indirizzo` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `number` varchar(255) DEFAULT NULL,
  `numero_card` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `presentato_da` varchar(255) DEFAULT NULL,
  `provincia` varchar(255) DEFAULT NULL,
  `regione_sociale` varchar(255) DEFAULT NULL,
  `sconto_card` varchar(255) DEFAULT NULL,
  `sesso` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `user`
--

INSERT INTO `user` (`id`, `cap`, `citta`, `codice_fiscale`, `email`, `indirizzo`, `lastname`, `number`, `numero_card`, `password`, `presentato_da`, `provincia`, `regione_sociale`, `sconto_card`, `sesso`, `username`) VALUES
(1, '62100', 'Macerata', 'MGNLRD97T28E783J', 'leonardo.mogianesi@gmail.com', 'Via Metauro, 89C', 'Mogianesi', '3663467422', '333222', '', 'Comune di Macerata', 'Macerata', 'Marche', '10%', 'Maschio', 'Leonardo'),
(4, '62100', 'Macerata', 'MGNLRD97T28E783J', 'leonardo.mogianesi@gmail.com', 'Via Metauro, 89C', 'aaaaa', '3663467422', NULL, '', NULL, 'macerata', 'Macerata', NULL, 'Maschio', 'franco');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `articolo`
--
ALTER TABLE `articolo`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3nfcpoi3pnqybsdqx57wxqsv5` (`user_username`),
  ADD KEY `FKi6vde3elxv3jgivfpnee9ii4a` (`sotto_categoria_id`);

--
-- Indici per le tabelle `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `sotto_categoria`
--
ALTER TABLE `sotto_categoria`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK5e5bbbd5iigrj9d7jc5b626tl` (`categoria_id`);

--
-- Indici per le tabelle `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_sb8bbouer5wak8vyiiy4pf2bx` (`username`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=92;

--
-- AUTO_INCREMENT per la tabella `sotto_categoria`
--
ALTER TABLE `sotto_categoria`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=138;

--
-- AUTO_INCREMENT per la tabella `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `articolo`
--
ALTER TABLE `articolo`
  ADD CONSTRAINT `FK3nfcpoi3pnqybsdqx57wxqsv5` FOREIGN KEY (`user_username`) REFERENCES `user` (`username`) ON DELETE CASCADE,
  ADD CONSTRAINT `FKi6vde3elxv3jgivfpnee9ii4a` FOREIGN KEY (`sotto_categoria_id`) REFERENCES `sotto_categoria` (`id`);

--
-- Limiti per la tabella `sotto_categoria`
--
ALTER TABLE `sotto_categoria`
  ADD CONSTRAINT `FK5e5bbbd5iigrj9d7jc5b626tl` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
