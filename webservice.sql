-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 17, 2019 at 07:26 PM
-- Server version: 10.1.39-MariaDB
-- PHP Version: 7.1.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `webservice`
--

-- --------------------------------------------------------

--
-- Table structure for table `group`
--

CREATE TABLE `group` (
  `group_id` varchar(10) NOT NULL,
  `group_name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `group_mst`
--

CREATE TABLE `group_mst` (
  `group_id` varchar(10) NOT NULL,
  `group_name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `module`
--

CREATE TABLE `module` (
  `id` int(11) NOT NULL,
  `module_order` int(2) NOT NULL,
  `module_name` varchar(30) NOT NULL,
  `group_id` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `module`
--

INSERT INTO `module` (`id`, `module_order`, `module_name`, `group_id`) VALUES
(1, 1, 'PromoCard', 'GroupA'),
(2, 2, 'CategoryCard', 'GroupA'),
(3, 3, 'FlashSaleCard', 'GroupA'),
(4, 4, 'HistoryCard', 'GroupA'),
(5, 5, 'NewsCard', 'GroupA'),
(6, 1, 'PromoCard', 'GroupB'),
(7, 2, 'NewsCard', 'GroupB'),
(8, 3, 'FlashSaleCard', 'GroupB'),
(9, 4, 'CategoryCard', 'GroupB'),
(10, 5, 'NewsCard', 'GroupB'),
(11, 1, 'PromoCard', 'GroupC'),
(12, 2, 'FlashSaleCard', 'GroupC'),
(13, 3, 'CategoryCard', 'GroupC'),
(14, 4, 'NewsCard', 'GroupC'),
(15, 5, 'HistoryCard', 'GroupC');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` varchar(10) NOT NULL,
  `user_name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `user_name`) VALUES
('UserA', 'Username A'),
('UserB', 'Username B'),
('UserC', 'Username C');

-- --------------------------------------------------------

--
-- Table structure for table `user_group`
--

CREATE TABLE `user_group` (
  `group_name` varchar(10) NOT NULL,
  `user_id` varchar(10) NOT NULL,
  `group_id` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_group`
--

INSERT INTO `user_group` (`group_name`, `user_id`, `group_id`) VALUES
('Grup A', 'UserA', 'GroupA'),
('Grup B', 'UserB', 'GroupB'),
('Grup C', 'UserC', 'GroupC');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `group`
--
ALTER TABLE `group`
  ADD PRIMARY KEY (`group_id`);

--
-- Indexes for table `group_mst`
--
ALTER TABLE `group_mst`
  ADD PRIMARY KEY (`group_id`);

--
-- Indexes for table `module`
--
ALTER TABLE `module`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `user_group`
--
ALTER TABLE `user_group`
  ADD PRIMARY KEY (`user_id`,`group_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
