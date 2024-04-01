-- -------------------------   CREATE TABLE ------------------------------

-- CREATE TABLE `studinfo`.`studentdataparameters` (
--   `student_id` INT NOT NULL,
--   `student_Name` VARCHAR(45) NOT NULL,
--   `student_Address` VARCHAR(45) NULL,
--   `student_Profile` VARCHAR(45) NULL,
--   PRIMARY KEY (`student_id`),
--   UNIQUE INDEX `student_id_UNIQUE` (`student_id` ASC) VISIBLE);
  
  INSERT INTO `studinfo`.`studentdataparameters` (student_id, student_Name, student_Address, student_Profile) 
-- VALUES (101, 'Kunal Lade', 'Panchavati Nashik', '20230904_152903.jpg');
-- VALUES (102, 'Virat Kohli', 'Old Delhi', '2023479_1547803.jpg');
-- VALUES (103, 'Rohit Sharma', 'Bandra Mumbai', '2023629_1592603.jpg');
-- VALUES (104, 'MS Dhoni', 'Ranchi', '2028129_1543713.jpg');
-- VALUES (105, 'Jasprit Bumrah', 'Mumbai', '2017229_1943503.jpg');
-- VALUES (106, 'Ravindra Jadeja', 'Rajkot', '2019217_1617503.jpg');
VALUES (107, 'Ravindra Jadeja', 'Rajkot', '2019217_1617503.jpg');

-- -------------------------   READ TABLE ------------------------------
SELECT * FROM studinfo.studentdataparameters;

SELECT * FROM studinfo.studentdataparameters WHERE student_id = 101;

-- -------------------------   UPDATE TABLE ------------------------------
UPDATE studinfo.studentdataparameters
SET student_Name = 'Hardik Pandya', student_Address = 'Ahmedabad', student_Profile = '2015235_1616013.jpg' 
WHERE student_id = 106;


-- -------------------------   DELETE TABLE ------------------------------
DELETE FROM studinfo.studentdataparameters WHERE student_id = 106;
