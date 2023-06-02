package mysql;

public class vehiclerentaldb {
//
//    CREATE DATABASE vehiclerentaldb;
//    USE vehiclerentaldb;
//
//    CREATE TABLE customer (
//            id INT NOT NULL AUTO_INCREMENT,
//            first_name VARCHAR(45),
//    last_name VARCHAR(255),
//    birth_date date,
//    driving_license_number VARCHAR(255),
//    driving_license_number_dt date,
//    PRIMARY KEY(id)
//);
//
//    CREATE TABLE car_category (
//            id INT NOT NULL AUTO_INCREMENT,
//            category_name VARCHAR(255),
//    rental_value DECIMAL(5,2),
//    PRIMARY KEY(id)
//);
//
//    CREATE TABLE location(
//            id INT NOT NULL AUTO_INCREMENT,
//            street_address VARCHAR(100),
//    city VARCHAR(50),
//    state VARCHAR(50),
//    country VARCHAR(50),
//    zip VARCHAR(50),
//    PRIMARY KEY(id)
//);
//
//    CREATE TABLE fuel_option (
//            id INT NOT NULL AUTO_INCREMENT,
//            fuel_description VARCHAR(50),
//    PRIMARY KEY(id)
//);
//
//    CREATE TABLE car (
//            id INT NOT NULL AUTO_INCREMENT,
//            car_category_id INT NOT NULL,
//            brand VARCHAR(255),
//    model VARCHAR(255),
//    production_year INT NOT NULL,
//    mileage INT NOT NULL,
//    color VARCHAR(255),
//    current_location_id INT NOT NULL,
//    PRIMARY KEY(id),
//    FOREIGN KEY(car_category_id) references car_category(id),
//    FOREIGN KEY(current_location_id) references location(id)
//            );
//
//
//    CREATE TABLE rental (
//            id INT NOT NULL AUTO_INCREMENT,
//            customer_id INT NOT NULL,
//            car_id INT NOT NULL,
//            pick_up_location_id INT NOT NULL,
//            drop_off_location_id INT NOT NULL,
//            start_date DATE,
//            end_date DATE,
//            remarks TEXT,
//            fuel_option_id INT NOT NULL,
//            PRIMARY KEY(id),
//    FOREIGN KEY(customer_id) references customer(id),
//    FOREIGN KEY(car_id) references car(id),
//    FOREIGN KEY(pick_up_location_id) references location(id),
//    FOREIGN KEY(drop_off_location_id) references location(id),
//    FOREIGN KEY(fuel_option_id) references fuel_option(id)
//            );
//
//    CREATE TABLE insurance (
//            id INT NOT NULL AUTO_INCREMENT,
//            insurace_name VARCHAR(255),
//    insurace_desc TEXT,
//    cost DECIMAL(5,2),
//    PRIMARY KEY (id)
//);
//
//    CREATE TABLE rental_insurance (
//            rental_id INT NOT NULL,
//            insurance_id INT NOT NULL,
//            PRIMARY KEY (rental_id, insurance_id),
//    FOREIGN KEY(rental_id) references rental(id) ON UPDATE  NO ACTION  ON DELETE  CASCADE,
//    FOREIGN KEY(insurance_id) references insurance(id) ON UPDATE  NO ACTION  ON DELETE  CASCADE
//);
//
//
//    CREATE TABLE rental_invoice(
//            id INT NOT NULL AUTO_INCREMENT,
//            rental_id INT NOT NULL,
//            car_rent DECIMAL(5,2),
//    equipment_rent_total DECIMAL(5,2),
//    insurance_cost_total DECIMAL(5,2),
//    service_tax DECIMAL(5,2),
//    VAT DECIMAL(5,2),
//    total_amount_payable DECIMAL(5,2),
//    discount_amount DECIMAL(5,2),
//    net_amount_payable DECIMAL(5,2),
//    PRIMARY KEY (id),
//    FOREIGN KEY(rental_id) references rental(id)
//            );
//
//
//    CREATE TABLE reservation(
//            id INT NOT NULL AUTO_INCREMENT,
//            pick_up_location_id INT NOT NULL,
//            drop_off_location_id INT NOT NULL,
//            car_category_id INT NOT NULL,
//            customer_id INT NOT NULL,
//            PRIMARY KEY(id),
//    FOREIGN KEY(pick_up_location_id) references location(id),
//    FOREIGN KEY(drop_off_location_id) references location(id),
//    FOREIGN KEY(car_category_id) references car_category(id),
//    FOREIGN KEY(customer_id) references customer(id)
//            );
//
//
//    CREATE TABLE equipment_category (
//            id INT NOT NULL AUTO_INCREMENT,
//            equip_category_name VARCHAR(255),
//    rental_value DECIMAL(5,2),
//    PRIMARY KEY(id)
//);
//
//    CREATE TABLE equipment (
//            id INT NOT NULL AUTO_INCREMENT,
//            equipment_name VARCHAR(255),
//    equipment_category_id INT NOT NULL,
//    current_location_id INT NOT NULL,
//    PRIMARY KEY(id),
//    FOREIGN KEY(equipment_category_id) references equipment_category(id),
//    FOREIGN KEY(current_location_id) references location(id)
//            );
//
//    CREATE TABLE reservation_equipment(
//            reservation_id INT NOT NULL ,
//            equipment_category_id INT NOT NULL,
//            PRIMARY KEY (reservation_id, equipment_category_id),
//    FOREIGN KEY(reservation_id) references reservation(id) ON UPDATE  NO ACTION  ON DELETE  CASCADE,
//    FOREIGN KEY(equipment_category_id) references equipment_category(id) ON UPDATE  NO ACTION  ON DELETE  CASCADE
//);
//
//    CREATE TABLE flight_detail (
//            reservation_id INT NOT NULL AUTO_INCREMENT,
//            flight_number VARCHAR(20),
//    coming_from VARCHAR(50),
//    expected_arrival_time DATE,
//    PRIMARY KEY(reservation_id),
//    FOREIGN KEY(reservation_id) references reservation(id) ON UPDATE  NO ACTION  ON DELETE  CASCADE
//);
//
//
//
//    CREATE TABLE car_equipment (
//            id INT NOT NULL AUTO_INCREMENT,
//            equipment_id INT NOT NULL,
//            car_id INT NOT NULL,
//            start_date DATE,
//            end_date DATE,
//            PRIMARY KEY(id),
//    FOREIGN KEY(equipment_id) references equipment(id),
//    FOREIGN KEY(car_id) references car(id)
//            );
}
