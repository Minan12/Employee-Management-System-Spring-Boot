-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 06, 2021 at 07:32 PM
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
-- Database: `EMPLOYEE_MANAGEMENT_SYSTEM`
--

-- --------------------------------------------------------

--
-- Table structure for table `EMPLOYEE`
--

CREATE TABLE `EMPLOYEE` (
  `EMPLOYEE_ID` int(36) NOT NULL,
  `ROLE_ID` int(36) NOT NULL,
  `FIRST_NAME` varchar(36) NOT NULL,
  `LAST_NAME` varchar(36) NOT NULL,
  `BIRTH_DATE` datetime NOT NULL,
  `HOME_ADDRESS` varchar(255) NOT NULL,
  `DOMICILE_ADDRESS` varchar(255) NOT NULL,
  `PHONE_NUMBER` varchar(24) NOT NULL,
  `EMAIL` varchar(48) NOT NULL,
  `USERNAME` varchar(16) NOT NULL,
  `PASSWORD` varchar(36) NOT NULL,
  `CREATED_AT` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `EMPLOYEE`
--

INSERT INTO `EMPLOYEE` (`EMPLOYEE_ID`, `ROLE_ID`, `FIRST_NAME`, `LAST_NAME`, `BIRTH_DATE`, `HOME_ADDRESS`, `DOMICILE_ADDRESS`, `PHONE_NUMBER`, `EMAIL`, `USERNAME`, `PASSWORD`, `CREATED_AT`) VALUES
(1, 1, 'Dummy', 'User', '2021-10-06 18:43:06', 'Jalan', 'Jalan', '+62', 'Mail.com', 'username', '5f4dcc3b5aa765d61d8327deb882cf99', '2021-10-06 18:43:06');

-- --------------------------------------------------------

--
-- Table structure for table `PAYROLL`
--

CREATE TABLE `PAYROLL` (
  `PAYROLL_ID` int(36) NOT NULL,
  `EMPLOYEE_ID` int(36) NOT NULL,
  `PAYROLL_DATE` datetime NOT NULL,
  `HOURLY_RATE` bigint(255) NOT NULL,
  `ANNUAL_SALARY` bigint(255) NOT NULL,
  `TAX` int(255) NOT NULL,
  `NET_SALARY` bigint(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `ROLE`
--

CREATE TABLE `ROLE` (
  `ROLE_ID` int(36) NOT NULL,
  `ROLE_TITLE` varchar(48) NOT NULL,
  `ROLE_DESCRIPTION` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ROLE`
--

INSERT INTO `ROLE` (`ROLE_ID`, `ROLE_TITLE`, `ROLE_DESCRIPTION`) VALUES
(1, 'Admin', 'Admin privilege'),
(2, 'Employee', 'Employee privilege');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `EMPLOYEE`
--
ALTER TABLE `EMPLOYEE`
  ADD PRIMARY KEY (`EMPLOYEE_ID`),
  ADD KEY `FK_ROLE_ID` (`ROLE_ID`) USING BTREE;

--
-- Indexes for table `PAYROLL`
--
ALTER TABLE `PAYROLL`
  ADD PRIMARY KEY (`PAYROLL_ID`),
  ADD KEY `EMPLOYEE_ID` (`EMPLOYEE_ID`);

--
-- Indexes for table `ROLE`
--
ALTER TABLE `ROLE`
  ADD PRIMARY KEY (`ROLE_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `EMPLOYEE`
--
ALTER TABLE `EMPLOYEE`
  MODIFY `EMPLOYEE_ID` int(36) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `PAYROLL`
--
ALTER TABLE `PAYROLL`
  MODIFY `PAYROLL_ID` int(36) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `ROLE`
--
ALTER TABLE `ROLE`
  MODIFY `ROLE_ID` int(36) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `EMPLOYEE`
--
ALTER TABLE `EMPLOYEE`
  ADD CONSTRAINT `FK_ROLE_ID` FOREIGN KEY (`ROLE_ID`) REFERENCES `ROLE` (`ROLE_ID`);

--
-- Constraints for table `PAYROLL`
--
ALTER TABLE `PAYROLL`
  ADD CONSTRAINT `FK_EMPLOYEE_ID` FOREIGN KEY (`EMPLOYEE_ID`) REFERENCES `EMPLOYEE` (`EMPLOYEE_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
