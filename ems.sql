-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 07, 2021 at 11:39 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ems`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employee_id` int(36) NOT NULL,
  `role_id` int(36) NOT NULL,
  `first_name` varchar(36) NOT NULL,
  `last_name` varchar(36) NOT NULL,
  `birth_date` datetime NOT NULL,
  `home_address` varchar(255) NOT NULL,
  `domicile_address` varchar(255) NOT NULL,
  `phone_number` varchar(24) NOT NULL,
  `email` varchar(48) NOT NULL,
  `password` text NOT NULL,
  `created_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`employee_id`, `role_id`, `first_name`, `last_name`, `birth_date`, `home_address`, `domicile_address`, `phone_number`, `email`, `password`, `created_at`) VALUES
(1, 1, 'Dummy', 'User', '2021-10-06 18:43:06', 'Jalan', 'Jalan', '+62', 'dummy@mail.com', '5f4dcc3b5aa765d61d8327deb882cf99', '2021-10-06 18:43:06');

-- --------------------------------------------------------

--
-- Table structure for table `payroll`
--

CREATE TABLE `payroll` (
  `payroll_id` int(36) NOT NULL,
  `employee_id` int(36) NOT NULL,
  `payroll_date` datetime NOT NULL,
  `hourly_rate` bigint(255) NOT NULL,
  `annual_salary` bigint(255) NOT NULL,
  `tax` int(255) NOT NULL,
  `net_salary` bigint(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `role_id` int(36) NOT NULL,
  `role_title` varchar(48) NOT NULL,
  `role_description` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`role_id`, `role_title`, `role_description`) VALUES
(1, 'Admin', 'Admin privilege'),
(2, 'Employee', 'Employee privilege');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employee_id`),
  ADD KEY `FK_ROLE_ID` (`role_id`) USING BTREE;

--
-- Indexes for table `payroll`
--
ALTER TABLE `payroll`
  ADD PRIMARY KEY (`payroll_id`),
  ADD KEY `EMPLOYEE_ID` (`employee_id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`role_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `employee_id` int(36) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `payroll`
--
ALTER TABLE `payroll`
  MODIFY `payroll_id` int(36) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `role_id` int(36) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
