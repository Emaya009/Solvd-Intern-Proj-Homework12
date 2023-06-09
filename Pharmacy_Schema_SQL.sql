-- MySQL Script generated by MySQL Workbench
-- Sat May 27 14:00:27 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema pharmacy_solvdinternproject
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema pharmacy_solvdinternproject
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `pharmacy_solvdinternproject` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `pharmacy_solvdinternproject` ;

-- -----------------------------------------------------
-- Table `pharmacy_solvdinternproject`.`addresses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_solvdinternproject`.`addresses` (
  `address_id` VARCHAR(70) NOT NULL,
  `city` VARCHAR(50) NOT NULL,
  `state` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`address_id`),
  UNIQUE INDEX `address_id_UNIQUE` (`address_id` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `pharmacy_solvdinternproject`.`customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_solvdinternproject`.`customers` (
  `customer_id` INT NOT NULL,
  `address_id` VARCHAR(70) NOT NULL,
  `first_name` VARCHAR(55) NOT NULL,
  `last_name` VARCHAR(60) NOT NULL,
  `phone` VARCHAR(15) NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE INDEX `customer_id_UNIQUE` (`customer_id` ASC) VISIBLE,
  INDEX `address_id_idx` (`address_id` ASC) VISIBLE,
  CONSTRAINT `FK02_address_id`
    FOREIGN KEY (`address_id`)
    REFERENCES `pharmacy_solvdinternproject`.`addresses` (`address_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `pharmacy_solvdinternproject`.`doctors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_solvdinternproject`.`doctors` (
  `doctor_id` INT NOT NULL,
  `address id` VARCHAR(45) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(15) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`doctor_id`),
  INDEX `address_id_idx` (`address id` ASC) VISIBLE,
  CONSTRAINT `FK03_address id`
    FOREIGN KEY (`address id`)
    REFERENCES `pharmacy_solvdinternproject`.`addresses` (`address_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `pharmacy_solvdinternproject`.`manufacturers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_solvdinternproject`.`manufacturers` (
  `manufacture_id` INT NOT NULL,
  `manufacture_name` VARCHAR(45) NOT NULL,
  `manufacture_license` VARCHAR(100) NOT NULL,
  `address` VARCHAR(100) NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`manufacture_id`),
  INDEX `FK04_address_idx` (`address` ASC) VISIBLE,
  CONSTRAINT `FK04_address`
    FOREIGN KEY (`address`)
    REFERENCES `pharmacy_solvdinternproject`.`addresses` (`address_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `pharmacy_solvdinternproject`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_solvdinternproject`.`products` (
  `product_id` INT NOT NULL,
  `product_name` VARCHAR(100) NOT NULL,
  `unit` VARCHAR(45) NOT NULL,
  `taxing` DECIMAL(10,0) NOT NULL,
  `batch_num` VARCHAR(200) NOT NULL,
  `manufactured_date` DATE NOT NULL,
  `import_date` DATE NOT NULL,
  `expire_date` DATE NOT NULL,
  `manufacturer` INT NOT NULL,
  `comment` TEXT NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`product_id`),
  INDEX `manufacturer_idx` (`manufacturer` ASC) VISIBLE,
  CONSTRAINT `manufacturer`
    FOREIGN KEY (`manufacturer`)
    REFERENCES `pharmacy_solvdinternproject`.`manufacturers` (`manufacture_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `pharmacy_solvdinternproject`.`inventory`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_solvdinternproject`.`inventory` (
  `inventory_id` INT NOT NULL,
  `product_id` INT NOT NULL,
  `bbunit` INT NOT NULL,
  `stripunit` INT NOT NULL,
  `tcvunit` INT NOT NULL,
  `bbcost` DECIMAL(10,0) NOT NULL,
  `stripcost` DECIMAL(10,0) NOT NULL,
  `tcvcost` DECIMAL(10,0) NOT NULL,
  `bbprice` DECIMAL(10,0) NOT NULL,
  `stripprice` DECIMAL(10,0) NOT NULL,
  `tcvprice` DECIMAL(10,0) NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`inventory_id`),
  INDEX `product_id_idx` (`product_id` ASC) VISIBLE,
  CONSTRAINT `product_id`
    FOREIGN KEY (`product_id`)
    REFERENCES `pharmacy_solvdinternproject`.`products` (`product_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `pharmacy_solvdinternproject`.`medication`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_solvdinternproject`.`medication` (
  `medication_id` INT NOT NULL,
  `medication_code` INT NOT NULL,
  `medication_name` VARCHAR(45) NOT NULL,
  `medication_cost` DOUBLE NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`medication_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `pharmacy_solvdinternproject`.`payment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_solvdinternproject`.`payment` (
  `payment_mode_id` INT NOT NULL,
  `payment_name` VARCHAR(45) NOT NULL,
  `cheque_num` VARCHAR(100) NOT NULL,
  `cheque_date` DATE NULL DEFAULT NULL,
  `bank` VARCHAR(100) NOT NULL,
  `Id` INT NOT NULL,
  `payment_mode` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`payment_mode_id`),
  UNIQUE INDEX `payment_mode_id_UNIQUE` (`payment_mode_id` ASC) VISIBLE,
  INDEX `payment_mode_idx` (`payment_mode` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `pharmacy_solvdinternproject`.`medicine_orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_solvdinternproject`.`medicine_orders` (
  `order_id` INT NOT NULL,
  `order_date` DATE NOT NULL,
  `pay_date` DATE NOT NULL,
  `customers_id` INT NOT NULL,
  `med_id` INT NOT NULL,
  `payment_mode` INT NOT NULL,
  `amount_paid` DOUBLE NOT NULL,
  `discount` DOUBLE NOT NULL,
  `status` VARCHAR(45) NOT NULL,
  `comment` TEXT NOT NULL,
  `invoiceno` VARCHAR(255) NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`order_id`),
  INDEX `customers_id_idx` (`customers_id` ASC) VISIBLE,
  INDEX `med_id_idx` (`med_id` ASC) VISIBLE,
  INDEX `FK07_payment_mode_idx` (`payment_mode` ASC) VISIBLE,
  CONSTRAINT `FK05_customers_id`
    FOREIGN KEY (`customers_id`)
    REFERENCES `pharmacy_solvdinternproject`.`customers` (`customer_id`),
  CONSTRAINT `FK06_med_id`
    FOREIGN KEY (`med_id`)
    REFERENCES `pharmacy_solvdinternproject`.`medication` (`medication_id`),
  CONSTRAINT `FK07_payment_mode`
    FOREIGN KEY (`payment_mode`)
    REFERENCES `pharmacy_solvdinternproject`.`payment` (`payment_mode_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `pharmacy_solvdinternproject`.`payment_detail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_solvdinternproject`.`payment_detail` (
  `payment_id` INT NOT NULL,
  `order_id` INT NOT NULL,
  `prod_id` INT NOT NULL,
  `quantity_ordered` INT NOT NULL,
  `price_each` DOUBLE NOT NULL,
  `pay_mode_id` INT NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`payment_id`),
  UNIQUE INDEX `payment_id_UNIQUE` (`payment_id` ASC) VISIBLE,
  INDEX `pay_mode_idx` (`pay_mode_id` ASC) VISIBLE,
  INDEX `order_id_idx` (`order_id` ASC) VISIBLE,
  INDEX `product_id_idx` (`prod_id` ASC) VISIBLE,
  INDEX `pay_mode_idx1` (`pay_mode_id` ASC, `payment_id` ASC) VISIBLE,
  CONSTRAINT `FK01_pay_mode_id`
    FOREIGN KEY (`pay_mode_id`)
    REFERENCES `pharmacy_solvdinternproject`.`payment` (`payment_mode_id`),
  CONSTRAINT `FK08_order_id`
    FOREIGN KEY (`order_id`)
    REFERENCES `pharmacy_solvdinternproject`.`medicine_orders` (`order_id`),
  CONSTRAINT `FK09_prod_id`
    FOREIGN KEY (`prod_id`)
    REFERENCES `pharmacy_solvdinternproject`.`products` (`product_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `pharmacy_solvdinternproject`.`prescription`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_solvdinternproject`.`prescription` (
  `prescription_id` INT NOT NULL,
  `customer_id` INT NOT NULL,
  `doctor_id` INT NOT NULL,
  `payment_method_id` INT NOT NULL,
  `date` DATE NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`prescription_id`),
  INDEX `doctor_id_idx` (`doctor_id` ASC) VISIBLE,
  INDEX `customer_id_idx` (`customer_id` ASC) VISIBLE,
  INDEX `FK12_payment_method_id_idx` (`payment_method_id` ASC) VISIBLE,
  CONSTRAINT `FK10_customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `pharmacy_solvdinternproject`.`customers` (`customer_id`),
  CONSTRAINT `FK11_doctor_id`
    FOREIGN KEY (`doctor_id`)
    REFERENCES `pharmacy_solvdinternproject`.`doctors` (`doctor_id`),
  CONSTRAINT `FK12_payment_method_id`
    FOREIGN KEY (`payment_method_id`)
    REFERENCES `pharmacy_solvdinternproject`.`payment` (`payment_mode_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `pharmacy_solvdinternproject`.`prescription_items`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pharmacy_solvdinternproject`.`prescription_items` (
  `prescription_id` INT NOT NULL,
  `medicine_id` INT NOT NULL,
  `quantity` INT NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `prescription_id_idx` (`prescription_id` ASC) VISIBLE,
  INDEX `medication_id_idx` (`medicine_id` ASC) VISIBLE,
  CONSTRAINT `FK13_prescription_id`
    FOREIGN KEY (`prescription_id`)
    REFERENCES `pharmacy_solvdinternproject`.`prescription` (`prescription_id`),
  CONSTRAINT `FK14_medicine_id`
    FOREIGN KEY (`medicine_id`)
    REFERENCES `pharmacy_solvdinternproject`.`medicine_orders` (`med_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
