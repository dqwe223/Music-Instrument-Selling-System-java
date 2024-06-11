-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 03, 2023 at 05:55 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mipdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `caccounts`
--

CREATE TABLE `caccounts` (
  `aid` int(5) NOT NULL,
  `aname` varchar(20) NOT NULL,
  `auname` varchar(20) NOT NULL,
  `apword` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `caccounts`
--

INSERT INTO `caccounts` (`aid`, `aname`, `auname`, `apword`) VALUES
(1, 'ganga', 'gg', '111'),
(9, 'shan', 'sh', '123'),
(12, 'mashas', 'msa', '555'),
(15, 'nuwan', 'nunn2', '213'),
(22, 'praveen', 'pv', '444');

-- --------------------------------------------------------

--
-- Table structure for table `cattable`
--

CREATE TABLE `cattable` (
  `id` int(10) NOT NULL,
  `type` varchar(20) NOT NULL,
  `price` int(10) NOT NULL,
  `qty` int(10) DEFAULT 0,
  `total` int(10) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ctable`
--

CREATE TABLE `ctable` (
  `ctid` int(8) NOT NULL,
  `ctname` varchar(20) NOT NULL,
  `ctnumber` varchar(10) NOT NULL,
  `cttotal` int(20) NOT NULL,
  `ctdate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ctable`
--

INSERT INTO `ctable` (`ctid`, `ctname`, `ctnumber`, `cttotal`, `ctdate`) VALUES
(2, 'fvxvxcv', '45345345', 216000, '2022-12-19'),
(3, 'gamage', '0776585643', 137750, '2022-12-19'),
(4, 'dsfgdfg', '34345345', 77900, '2022-12-19'),
(5, 'fcfg', '42342', 332500, '2022-12-19'),
(6, 'dggrtgr', '123123', 350000, '2022-12-19'),
(7, 'dfgdf', '435345', 247500, '2022-12-19'),
(8, 'dina', '078345534', 304000, '2022-12-19'),
(9, 'nipun', '0762368374', 123500, '2022-12-19'),
(10, 'gamage', '076523424', 180000, '2022-12-20'),
(11, 'ftyf', 'ccf', 100800, '2022-12-21'),
(12, 'sarana', '078826234', 427500, '2022-12-28'),
(14, 'samaradil', '072654783', 132000, '2022-12-29'),
(15, 'rsr', '0898876543', 532000, '2023-01-01'),
(16, 'gune', '07213123', 509400, '2023-01-02');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `nic` int(15) NOT NULL,
  `cname` varchar(20) NOT NULL,
  `cproduct` varchar(20) NOT NULL,
  `ctime` int(2) NOT NULL,
  `ctnumber` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `drum`
--

CREATE TABLE `drum` (
  `did` int(4) NOT NULL,
  `dtype` varchar(20) NOT NULL,
  `dprice` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `drum`
--

INSERT INTO `drum` (`did`, `dtype`, `dprice`) VALUES
(11, 'Electronic', 150000),
(12, 'acoustic', 250000),
(13, 'Hang Drums', 100000),
(14, 'Tenor Drums', 80000),
(15, 'Congas and Bongos', 75000),
(16, 'Tabla', 50000),
(17, 'Djembes', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `guitar`
--

CREATE TABLE `guitar` (
  `gid` int(2) NOT NULL,
  `gtype` varchar(20) NOT NULL,
  `gprice` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guitar`
--

INSERT INTO `guitar` (`gid`, `gtype`, `gprice`) VALUES
(31, 'Classical', 15000),
(32, 'Steel String', 15000),
(33, 'Acoustic', 22000),
(34, 'Electric', 55000),
(35, 'Electro-Acoustic', 100000),
(36, 'Bass', 70000);

-- --------------------------------------------------------

--
-- Table structure for table `keyboard`
--

CREATE TABLE `keyboard` (
  `kid` int(5) NOT NULL,
  `ktype` varchar(20) NOT NULL,
  `kprice` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `keyboard`
--

INSERT INTO `keyboard` (`kid`, `ktype`, `kprice`) VALUES
(21, 'Basic', 50000),
(22, 'Workstation', 100000),
(23, 'Electronic Organ', 90000),
(24, 'Piano', 150000),
(25, 'MIDI Keyboard', 250000);

-- --------------------------------------------------------

--
-- Table structure for table `octapad`
--

CREATE TABLE `octapad` (
  `oid` int(5) NOT NULL,
  `otype` varchar(20) NOT NULL,
  `oprice` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `octapad`
--

INSERT INTO `octapad` (`oid`, `otype`, `oprice`) VALUES
(41, 'Basic', 35000),
(42, 'pro', 90000),
(43, 'SPD-20X', 150000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `caccounts`
--
ALTER TABLE `caccounts`
  ADD PRIMARY KEY (`aid`);

--
-- Indexes for table `cattable`
--
ALTER TABLE `cattable`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ctable`
--
ALTER TABLE `ctable`
  ADD PRIMARY KEY (`ctid`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`nic`);

--
-- Indexes for table `drum`
--
ALTER TABLE `drum`
  ADD PRIMARY KEY (`did`);

--
-- Indexes for table `guitar`
--
ALTER TABLE `guitar`
  ADD PRIMARY KEY (`gid`);

--
-- Indexes for table `keyboard`
--
ALTER TABLE `keyboard`
  ADD PRIMARY KEY (`kid`);

--
-- Indexes for table `octapad`
--
ALTER TABLE `octapad`
  ADD PRIMARY KEY (`oid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `caccounts`
--
ALTER TABLE `caccounts`
  MODIFY `aid` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `ctable`
--
ALTER TABLE `ctable`
  MODIFY `ctid` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
