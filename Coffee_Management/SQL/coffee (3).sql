-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 15, 2019 at 03:42 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coffee`
--

-- --------------------------------------------------------

--
-- Table structure for table `desk`
--

CREATE TABLE `desk` (
  `desknumber` int(11) NOT NULL,
  `deskname` varchar(20) COLLATE utf8_vietnamese_ci NOT NULL,
  `status` varchar(30) COLLATE utf8_vietnamese_ci NOT NULL,
  `comments` text CHARACTER SET utf16 COLLATE utf16_vietnamese_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `desk`
--

INSERT INTO `desk` (`desknumber`, `deskname`, `status`, `comments`) VALUES
(1, 'Bàn Số 1', 'Sẵn Sàng', ''),
(2, 'Bàn Số 2', 'Sẵn Sàng', ''),
(3, 'Bàn Số 3', 'Sẵn Sàng', NULL),
(4, 'Bàn Số 4', 'Sẵn Sàng', NULL),
(5, 'Bàn Số 5', 'Sẵn Sàng', NULL),
(6, 'Bàn Số 6', 'Sẵn Sàng', NULL),
(7, 'Bàn Số 7', 'Sẵn Sàng', NULL),
(8, 'Bàn Số 8', 'Sẵn Sàng', ''),
(9, 'Bàn Số 9', 'Sẵn Sàng', NULL),
(10, 'Bàn Số 10', 'Sẵn Sàng', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `discount`
--

CREATE TABLE `discount` (
  `no` int(11) NOT NULL,
  `datestart` date NOT NULL,
  `dateend` date NOT NULL,
  `percent` int(11) NOT NULL,
  `contains` text COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `employeenumbers` varchar(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `email` text NOT NULL,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `phonenumber` text NOT NULL,
  `salary` int(11) DEFAULT NULL,
  `shift` varchar(15) DEFAULT NULL,
  `note` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`employeenumbers`, `name`, `address`, `email`, `username`, `password`, `phonenumber`, `salary`, `shift`, `note`) VALUES
('E001', 'Nguyễn Hoàng Quân', 'Cầu Giấy, Hà Nội', 'nguyenhoangquan@gmail.com', 'E001', 'E001', '0989993427', 0, '', ''),
('E002', 'Hoàng Thị Thái', 'Chí Linh, Hải Dương', 'hoangthithai@gmail.com', 'E002', '2', '012457899', NULL, NULL, NULL),
('E003', 'Nguyễn Huy Long', 'Cầu Giấy, Hà Nội', 'nguyenduylong@gmail.com', 'E003', 'E001', '615479356', NULL, NULL, NULL),
('E004', 'Trần Thị Nga', 'Cầu Giấy, Hà Nội', 'tranthinga@gmail.com', 'E004', 'E004', '7816589', NULL, NULL, NULL),
('M001', 'Diệp Huy Đức', 'Cầu Giấy, Hà Nội', 'diephuyduc@gmail.com', 'M001', 'M001', '0906163294', 0, '', '');

-- --------------------------------------------------------

--
-- Table structure for table `import_materials`
--

CREATE TABLE `import_materials` (
  `idbillimport` varchar(6) COLLATE utf8_vietnamese_ci NOT NULL,
  `materialsname` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `dateimport` date NOT NULL,
  `price` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  `unit` text COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

-- --------------------------------------------------------

--
-- Table structure for table `orderdetail`
--

CREATE TABLE `orderdetail` (
  `ordercode` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `productcode` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `productname` varchar(100) COLLATE utf8_vietnamese_ci NOT NULL,
  `number` int(11) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `orderdetail`
--

INSERT INTO `orderdetail` (`ordercode`, `productcode`, `productname`, `number`, `price`) VALUES
('B201904101052461', 'C002', 'Cookies Quế', 2, 20000),
('B201904101052461', 'D001', 'Cà Phê Sữa', 5, 15000),
('B201904101052461', 'F001', 'Xoài lắc', 2, 10000),
('B201904101053431', 'D001', 'Cà Phê Sữa', 6, 15000),
('B201904101053431', 'F001', 'Xoài lắc', 3, 10000),
('B201904101055285', 'D001', 'Cà Phê Sữa', 10, 15000),
('B201904101055285', 'F001', 'Xoài lắc', 2, 10000),
('B201904101055285', 'F002', 'Mận_ 500 Gam', 2, 15000),
('B201904110744241', 'C002', 'Cookies Quế', 10, 20000),
('B201904110816031', 'D001', 'Cà Phê Sữa', 5, 15000),
('B201904110816031', 'F001', 'Xoài lắc', 10, 10000),
('B201904110949358', 'F001', 'Xoài lắc', 5, 10000),
('B201904110949358', 'F002', 'Mận_ 500 Gam', 2, 15000),
('B201904111112444', 'D001', 'Cà Phê Sữa', 5, 15000),
('B201904111112444', 'F001', 'Xoài lắc', 2, 10000),
('B201904111112444', 'F002', 'Mận_ 500 Gam', 2, 15000),
('B201904120849233', 'C001', 'Pana Cotta', 100, 10000),
('B201904120849233', 'C002', 'Cookies Quế', 100, 20000),
('B201904120849233', 'D001', 'Cà Phê Sữa', 100, 15000),
('B201904120849233', 'D002', 'Trà Đá', 100, 5000),
('B201904120849233', 'F001', 'Xoài lắc', 100, 10000),
('B201904120849233', 'F002', 'Mận_ 500 Gam', 10, 15000),
('B201904120925591', 'C002', 'Cookies Quế', 2, 20000),
('B201904120925591', 'D001', 'Cà Phê Sữa', 2, 15000),
('B201904120925591', 'F002', 'Mận_ 500 Gam', 2, 15000),
('B201904120929001', 'D001', 'Cà Phê Sữa', 2, 15000),
('B201904120933571', 'D002', 'Trà Đá', 4, 5000),
('B201904120933571', 'F002', 'Mận_ 500 Gam', 5, 15000),
('B201904120937291', 'C002', 'Cookies Quế', 3, 20000),
('B2019041209412610', 'D001', 'Cà Phê Sữa', 10, 15000),
('B201904120944418', 'C001', 'Pana Cotta', 2, 10000),
('B201904120949131', 'D001', 'Cà Phê Sữa', 2, 15000),
('B2019041209503810', 'F002', 'Mận_ 500 Gam', 2, 15000),
('B201904121001050', 'D001', 'Cà Phê Sữa', 2, 15000),
('B201904121054121', 'C001', 'Pana Cotta', 2, 10000),
('B201904121057391', 'D001', 'Cà Phê Sữa', 2, 15000),
('B201904121058416', 'D002', 'Trà Đá', 3, 5000),
('B201904121059338', 'D002', 'Trà Đá', 3, 5000),
('B201904121103330', 'D002', 'Trà Đá', 2, 5000),
('B201904121105430', 'F002', 'Mận_ 500 Gam', 2, 15000);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `ordercode` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `tablenumber` int(11) NOT NULL,
  `employeenumber` varchar(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `startingtime` datetime NOT NULL,
  `discount` float DEFAULT NULL,
  `status` varchar(20) COLLATE utf8_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`ordercode`, `tablenumber`, `employeenumber`, `startingtime`, `discount`, `status`) VALUES
('B201904101052461', 1, 'E001', '2019-04-10 10:52:46', 0, 'Đã Thanh Toán'),
('B201904101053431', 1, 'E001', '2019-04-10 10:53:43', 5, 'Đã Thanh Toán'),
('B201904101055285', 5, 'E001', '2019-04-10 10:55:28', 0, 'Đã Thanh Toán'),
('B201904110744241', 1, 'E001', '2019-04-11 07:44:24', 0, 'Đã Thanh Toán'),
('B201904110816031', 1, 'E001', '2019-04-11 08:16:03', 0, 'Đã Thanh Toán'),
('B201904110949358', 8, 'E001', '2019-04-11 09:49:35', 0, 'Đã Thanh Toán'),
('B201904111112444', 4, 'E001', '2019-04-11 11:12:44', 0, 'Đã Thanh Toán'),
('B201904120849233', 3, 'E001', '2019-04-12 08:49:23', 10, 'Đã Thanh Toán'),
('B201904120925591', 1, 'E001', '2019-04-12 09:25:59', 0, 'Đã Thanh Toán'),
('B201904120929001', 1, 'E001', '2019-04-12 09:29:00', 0, 'Đã Thanh Toán'),
('B201904120933571', 1, 'E001', '2019-04-12 09:33:57', 0, 'Đã Thanh Toán'),
('B201904120937291', 1, 'E001', '2019-04-12 09:37:29', 0, 'Đã Thanh Toán'),
('B2019041209412610', 10, 'E001', '2019-04-12 09:41:26', 0, 'Đã Thanh Toán'),
('B201904120944418', 8, 'E001', '2019-04-12 09:44:41', 0, 'Đã Thanh Toán'),
('B201904120949131', 1, 'E001', '2019-04-12 09:49:13', 0, 'Đã Thanh Toán'),
('B2019041209503810', 10, 'E001', '2019-04-12 09:50:38', 0, 'Đã Thanh Toán'),
('B201904121001050', 0, 'E001', '2019-04-12 10:01:05', 0, 'Đã Thanh Toán'),
('B201904121054121', 1, 'E001', '2019-04-12 10:54:12', 0, 'Đã Thanh Toán'),
('B201904121057391', 1, 'E001', '2019-04-12 10:57:39', 0, 'Đã Thanh Toán'),
('B201904121058416', 6, 'E001', '2019-04-12 10:58:41', 0, 'Đã Thanh Toán'),
('B201904121059338', 8, 'E001', '2019-04-12 10:59:33', 0, 'Đã Thanh Toán'),
('B201904121103330', 0, 'E001', '2019-04-12 11:03:33', 0, 'Đã Thanh Toán'),
('B201904121105430', 0, 'E001', '2019-04-12 11:05:43', 0, 'Đã Thanh Toán');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `productcode` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `productname` varchar(100) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `productline` varchar(100) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `priceeach` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`productcode`, `productname`, `productline`, `priceeach`) VALUES
('C001', 'Pana Cotta', 'Bánh Kẹo', 10000),
('C002', 'Cookies Quế', 'Bánh Kẹo', 20000),
('D001', 'Cà Phê Sữa', 'Đồ Uống', 15000),
('D002', 'Trà Đá', 'Đồ Uống', 5000),
('F001', 'Xoài lắc', 'Hoa Quả', 10000),
('F002', 'Mận_ 500 Gam', 'Hoa Quả', 15000);

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `no` int(11) NOT NULL,
  `date` date NOT NULL,
  `contains` text COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Dumping data for table `report`
--

INSERT INTO `report` (`no`, `date`, `contains`) VALUES
(0, '2019-04-06', 'Họp đợt 2'),
(8, '2019-04-06', 'Họp đợt 3'),
(9, '2019-04-07', ' Quyết định nội dung thành lập qui định mới cho quán, Thêm các nhân viên mới và bổ sung các loại hàng hóa'),
(10, '2019-04-10', 'Đây là page của chủ quán : https://www.facebook.com/diephuyduc');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `desk`
--
ALTER TABLE `desk`
  ADD PRIMARY KEY (`desknumber`);

--
-- Indexes for table `discount`
--
ALTER TABLE `discount`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`employeenumbers`);

--
-- Indexes for table `import_materials`
--
ALTER TABLE `import_materials`
  ADD PRIMARY KEY (`idbillimport`);

--
-- Indexes for table `orderdetail`
--
ALTER TABLE `orderdetail`
  ADD UNIQUE KEY `ordercode` (`ordercode`,`productcode`,`productname`),
  ADD KEY `productcode` (`productcode`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`ordercode`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`productcode`);

--
-- Indexes for table `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `discount`
--
ALTER TABLE `discount`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `report`
--
ALTER TABLE `report`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orderdetail`
--
ALTER TABLE `orderdetail`
  ADD CONSTRAINT `orderdetail_ibfk_1` FOREIGN KEY (`ordercode`) REFERENCES `orders` (`ordercode`),
  ADD CONSTRAINT `orderdetail_ibfk_2` FOREIGN KEY (`productcode`) REFERENCES `products` (`productcode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
