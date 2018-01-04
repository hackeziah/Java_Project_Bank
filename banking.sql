-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 10, 2016 at 04:03 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `banking`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `USER` varchar(50) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`USER`, `PASSWORD`) VALUES
('admin', 'admin'),
('5000', 'tet'),
('sds', 'ss'),
('kevin', 'test'),
('kevin', 'pass'),
('camz', 'camz'),
('tony', 'tony');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `Account No.` int(150) NOT NULL,
  `Name` varchar(150) NOT NULL,
  `Address` varchar(150) NOT NULL,
  `Phone No.` int(150) NOT NULL,
  `Email ID` varchar(150) NOT NULL,
  `Birth_month` varchar(150) NOT NULL,
  `Birth_day` varchar(150) NOT NULL,
  `Birth_year` varchar(150) NOT NULL,
  `Gender` varchar(150) NOT NULL,
  `Balance` int(150) NOT NULL,
  `Users_Name` varchar(150) NOT NULL,
  `Password` varchar(150) NOT NULL,
  `Date` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`Account No.`, `Name`, `Address`, `Phone No.`, `Email ID`, `Birth_month`, `Birth_day`, `Birth_year`, `Gender`, `Balance`, `Users_Name`, `Password`, `Date`) VALUES
(111, 'kevin paul lamadrid', 'pup sta.mesa manila', 91067, 'lamadridkevin@gmail.com', 'May', '14', '1999', 'Male', 6470, 'kevin', 'pass', '2016/10/10 03:47:44'),
(112, 'camille lamadrid', 'WBTGC', 52659, 'camz@gmail.com', 'March', '5', '1999', 'Female', 7210, 'camz', 'camz', '2016/10/10 03:51:36'),
(113, 'anthony', 'WBNS', 9090, 'anthony@gmail.com', 'March', '5', '1998', 'Male', 8321, 'tony', 'tony', '2016/10/10 03:51:36');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD UNIQUE KEY `Account No.` (`Account No.`,`Name`,`Address`,`Phone No.`,`Email ID`,`Birth_month`,`Birth_day`,`Birth_year`,`Gender`,`Balance`,`Users_Name`,`Password`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
