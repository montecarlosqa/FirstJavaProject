package mysql;

public class mysqlstatements {

//    #10 statements for insertion
//    INSERT INTO vehiclerentaldb.car_category (category_name, rental_value) values ('Compact', 36.06),
//('Convertible', 44.50), ('Jeep', 35.90), ('Luxury', 81),('Hatchback', 24),('Pickup', 36.99);
//    INSERT INTO vehiclerentaldb.location (street_address, city,state,country,zip) values
//            ('16030 Springdale', 'Anaheim', 'California', 'United States','92801'),
//('32040 Lyons circle', 'Huntington Beach', 'California', 'United States','92647'), ('54456 Heil', 'Cypress', 'California', 'United States','77410');
//    INSERT INTO vehiclerentaldb.car (car_category_id, brand, model, production_year, mileage, color, current_location_id) values
//            ('6', 'Toyota', 'Tacoma', '2002','17600','black','2'), ('1', 'Honda', 'Civic', '2016','23650','white','1');
//    INSERT INTO vehiclerentaldb.customer (first_name,last_name,birth_date,driving_license_number,driving_license_issue_dt) values
//            ('Blaze', 'Hobbs', '1998-06-27', 'A0002144','2020-08-24'), ('Kathryn', 'Spencer', '1990-11-23', 'A0002456','2011-05-01'), ('River', 'Waller', '1996-08-25', 'A0003246','2015-07-21');
//    INSERT INTO vehiclerentaldb.equipment_category (equip_category_name, rental_value) values
//            ('Safety seats', '15.00'), ('GPS tracking', '11.99');
//    INSERT INTO vehiclerentaldb.equipment (equipment_name, equipment_category_id, current_location_id) values
//            ('Booster seat', '1','1'), ('GPS', '2', '3');
//    INSERT INTO vehiclerentaldb.car_equipment (equipment_id, car_id, start_date, end_date) values
//            ('2', '2','2023-05-23', '2023-05-29'), ('2', '1','2023-05-25', '2023-05-27');
//    INSERT INTO vehiclerentaldb.fuel_option (fuel_description) values
//            ('PREPAY FUEL OPTION (BUY A TANK)'), ('FUEL SERVICE OPTION (WE FILL THE TANK)');
//    INSERT INTO vehiclerentaldb.rental (customer_id, car_id, pick_up_location_id, drop_off_location_id, start_date, end_date, remarks, fuel_option_id) values
//            ('1', '1', '1', '1','2023-05-10','2023-05-15', 'none', 1);
//    INSERT INTO vehiclerentaldb.reservation (pick_up_location_id, drop_off_location_id, car_category_id, customer_id) values
//            ('2', '2', '4', '3');
//
//#10 statements for insertion
//    UPDATE car_category SET rental_value = '75' WHERE id = 4;
//    UPDATE location SET street_address = '16040 Springdale' WHERE id = 1;
//    UPDATE car SET current_location_id = '4' WHERE id = 4;
//    UPDATE customer SET last_name = 'Charles' WHERE id = 2;
//    UPDATE equipment_category SET rental_value = '13.99' WHERE id = 2;
//    UPDATE equipment SET equipment_name = 'Toddler seat' WHERE id = 1;
//    UPDATE car_equipment SET equipment_id = '1' WHERE id = 2;
//    UPDATE rental SET fuel_option_id = '1' WHERE id = 4;
//    UPDATE reservation SET car_category_id = '1' WHERE id = 3;
//    UPDATE insurance SET cost = '65' WHERE id = 2;
//
//#10 statements for delete
//    DELETE FROM vehiclerentaldb.car_category WHERE id = 6;
//    DELETE FROM vehiclerentaldb.location WHERE id = 5;
//    DELETE FROM vehiclerentaldb.car WHERE id = 3;
//    DELETE FROM vehiclerentaldb.customer WHERE id = 5;
//    DELETE FROM vehiclerentaldb.equipment_category WHERE id = 2;
//    DELETE FROM vehiclerentaldb.equipment WHERE id = 1;
//    DELETE FROM vehiclerentaldb.car_equipment WHERE id = 2;
//    DELETE FROM vehiclerentaldb.fuel_option WHERE id = 2;
//    DELETE FROM vehiclerentaldb.rental WHERE id = 4;
//    DELETE FROM vehiclerentaldb.reservation WHERE id = 3;
//
//#5 alter table
//    ALTER TABLE flight_detail MODIFY COLUMN expected_arrival_time DATETIME
//    ALTER TABLE customer MODIFY COLUMN last_name VARCHAR(45);
//    ALTER TABLE customer ADD middle_name VARCHAR(45);
//    ALTER TABLE customer ADD SSN VARCHAR(11);
//    ALTER TABLE insurance DROP COLUMN insurance_desc;
//
//#5 statements with left, right, outer, inner
//    SELECT * FROM car INNER JOIN car_category ON car.car_category_id = car_category.id;
//    SELECT * FROM rental RIGHT JOIN customer ON rental.customer_id = customer.id;
//    SELECT * FROM equipment LEFT JOIN equipment_category ON equipment.id = equipment_category.id
//    SELECT * FROM reservation RIGHT OUTER JOIN customer ON reservation.customer_id = customer.id;
//    SELECT * FROM reservation LEFT OUTER JOIN flight_detail ON reservation.id=flight_detail.reservation_id;
//
//#1 big statement to join all tables in the database.
//            SELECT * FROM rental
//    JOIN customer ON rental.customer_id = customer.id
//    JOIN car ON rental.car_id = car.id
//    JOIN car_category ON car.car_category_id = car_category.id
//    LEFT JOIN car_equipment ON car_equipment.car_id = car.id
//    LEFT JOIN equipment ON car_equipment.equipment_id = equipment.id
//    LEFT JOIN equipment_category ON equipment.equipment_category_id = equipment_category.id
//    JOIN location ON rental.pick_up_location_id = location.id
//    JOIN fuel_option ON rental.fuel_option_id = fuel_option.id
//    JOIN rental_insurance ON rental.id = rental_insurance.rental_id
//    JOIN insurance ON rental_insurance.insurance_id = insurance.id
//    LEFT JOIN reservation ON  customer.id = reservation.customer_id
//    LEFT JOIN reservation_equipment ON reservation_id = reservation.id
//    LEFT JOIN flight_detail ON flight_detail.reservation_id = reservation.id
//    LEFT JOIN rental_invoice ON rental_invoice.rental_id = rental.id;
//
//#7 statements with aggregate functions and group by and without having.
//    SELECT COUNT(*) AS customer_count from vehiclerentaldb.customer;
//    SELECT AVG(rental_value) AS rental_value_avg from vehiclerentaldb.equipment_category;
//    SELECT MAX(rental_value) AS max_rental_value from vehiclerentaldb.car_category;
//    SELECT MIN(rental_value) AS min_rental_value from vehiclerentaldb.car_category;
//    SELECT SUM(cost) AS total_cost from vehiclerentaldb.insurance;
//    SELECT brand,GROUP_CONCAT(model) FROM car GROUP BY brand;
//    SELECT cost, MAX(cost) AS total_cost from vehiclerentaldb.insurance GROUP BY id;
//
//#7 statements with aggregate functions and group by and with having.
//    SELECT COUNT(id), brand FROM car GROUP BY brand HAVING COUNT(id) >= 1;
//    SELECT category_name, MAX(rental_value) AS max_rental_value from car_category GROUP BY category_name HAVING max_rental_value > 40;
//    SELECT insurance_name, MIN(cost) AS min_cost from insurance GROUP BY insurance_name HAVING min_cost <= 50;
//    SELECT equip_category_name, AVG(rental_value) AS rental_value_avg from equipment_category GROUP BY equip_category_name HAVING rental_value_avg > 10;
//    SELECT brand, SUM(mileage) AS total_mileage from car GROUP BY brand HAVING total_mileage <=60000;
//    SELECT customer_id, COUNT(*) as customer_count FROM rental GROUP BY customer_id HAVING customer_count BETWEEN 3 AND 5;
//    SELECT car_category_id, COUNT(*) as car_category_count FROM car GROUP BY car_category_id HAVING car_category_count < 4;

}
