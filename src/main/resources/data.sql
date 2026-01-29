-- =========================
-- CITY
-- =========================
INSERT INTO city (name, state, country) VALUES
('Indore', 'Madhya Pradesh', 'India'),
('Bhopal', 'Madhya Pradesh', 'India'),
('Mumbai', 'Maharashtra', 'India'),
('Bangalore', 'Karnataka', 'India'),
('Hyderabad', 'Telangana', 'India');

-- =========================
-- AADHAAR CARD
-- =========================
INSERT INTO aadhar_card (aadhar_number) VALUES
('8347 2910 5643'),
('9123 4578 1029'),
('6754 8392 1746'),
('4209 6581 3375'),
('5832 1947 6501'),
('7493 8021 4567'),
('9012 4563 7894'),
('6385 9172 4506'),
('5274 6809 3124'),
('8642 5913 0748'),
('7438 1059 2647'),
('5921 8467 3095'),
('6109 3478 5284'),
('4985 7602 1349'),
('8594 3126 7081'),
('6723 9450 1862'),
('9301 7584 6920'),
('7845 6193 2057'),
('5610 9847 2336'),
('8429 1357 6048'),
('9037 4826 1594'),
('6198 7350 4207'),
('5726 4819 3504'),
('7843 9620 1579'),
('9014 6283 5709'),
('4382 7506 1947'),
('6593 8142 2705'),
('7204 3958 6419'),
('5849 1736 9024'),
('9365 2841 5079'),
('6718 4952 3807'),
('8493 7201 5648'),
('5904 1683 9725'),
('7346 9851 2049'),
('8621 3509 4786'),
('4097 2856 9314'),
('9518 3740 6029'),
('6845 7903 1257'),
('5271 6049 8392'),
('9084 1527 3695'),
('7462 9831 5047'),
('3198 5742 8604'),
('8504 6371 2908'),
('4916 7028 3459'),
('6825 9431 5076'),
('7359 4012 8643'),
('9207 5638 1495'),
('5648 3079 9214'),
('8091 4526 7380'),
('6473 1905 2846');

-- =========================
-- COMPANY
-- =========================
INSERT INTO company (name, industry, city_id) VALUES
('TCS Indore', 'IT Services', 1),
('Infosys Indore', 'IT Services', 1),
('Persistent Systems', 'Software', 1),

('MP State Finance Corp', 'Finance', 2),
('Bhopal Tech Park', 'Technology', 2),

('Reliance Industries', 'Conglomerate', 3),
('Tata Motors', 'Automobile', 3),
('Wipro Mumbai', 'IT Services', 3),

('Flipkart Bangalore', 'E-Commerce', 4),
('Google India', 'Technology', 4),
('Infosys Bangalore', 'IT Services', 4),
('Swiggy HQ', 'FoodTech', 4),

('Amazon Hyderabad', 'E-Commerce', 5),
('Microsoft Hyderabad', 'Technology', 5),
('Deloitte Hyderabad', 'Consulting', 5);


-- =========================
-- PERSON
-- =========================
INSERT INTO person (name, age, city_id, aadhar_id, company_id) VALUES
 ('Rohan Malhotra', 27, 4, 1, 9),
 ('Amit Sharma', 25, 1, 2, 1),
 ('Kavya Reddy', 22, 5, 3, 13),
 ('Priya Desai', 26, 3, 4, 6),
 ('Deepak Rawat', 33, 2, 5, 4),
 ('Snehal Patwardhan', 31, 4, 6, 10),
 ('Rahul Jain', 35, 1, 7, 2),
 ('Sai Kiran', 24, 5, 8, 14),
 ('Shruti Naik', 24, 3, 9, 7),
 ('Tarun Tiwari', 36, 2, 10, 5),

 ('Komal Goyal', 25, 3, 11, 8),
 ('Ananya Iyer', 23, 4, 12, 11),
 ('Rohit Verma', 30, 1, 13, 3),
 ('Ravi Teja', 34, 5, 14, 15),
 ('Manish Shah', 38, 3, 15, 6),

 ('Meghana Kulkarni', 24, 4, 16, 9),
 ('Ankit Yadav', 24, 1, 17, 1),
 ('Bhavya Shekar', 27, 5, 18, 13),
 ('Pooja Patel', 28, 1, 19, 2),
 ('Rakesh Kulkarni', 40, 3, 20, 7),

 ('Pallavi Joshi', 29, 4, 21, 10),
 ('Kunal Thakur', 34, 2, 22, 4),
 ('Ajay Kumar', 35, 5, 23, 14),
 ('Neha Gupta', 22, 1, 24, 3),
 ('Divya Nair', 26, 4, 25, 11),

 ('Omkar Joshi', 29, 3, 26, 6),
 ('Lakshmi Narayan', 41, 5, 27, 15),
 ('Kiran Malviya', 31, 1, 28, 1),
 ('Suresh Rao', 45, 4, 29, 12),
 ('Sumanth Rao', 28, 5, 30, 13),

 ('Vikas Mishra', 34, 1, 31, 2),
 ('Siddhi More', 22, 3, 32, 8),
 ('Harsha Gowda', 33, 4, 33, 10),
 ('Rashmi Joshi', 28, 2, 34, 5),
 ('Pooja Chandra', 26, 5, 35, 14),

 ('Aarti Bansal', 27, 3, 36, 7),
 ('Ritu Singh', 26, 1, 37, 1),
 ('Aditya Soni', 21, 2, 38, 4),
 ('Prakash Shetty', 39, 4, 39, 11),
 ('Nitin Patil', 31, 3, 40, 6),

 ('Nikhil Varma', 30, 5, 41, 13),
 ('Sonal Mehta', 27, 1, 42, 3),
 ('Vishal Pawar', 35, 3, 43, 8),
 ('Arjun Khan', 29, 2, 44, 5),
 ('Karthik Reddy', 28, 4, 45, 9),

 ('Swathi Menon', 23, 5, 46, 14),
 ('Mohit Saxena', 32, 2, 47, 4),
 ('Nisha Ali', 23, 2, 48, 5),
 ('Isha Choudhary', 25, 2, 49, 4),
 ('Sneha Kapoor', 27, 2, 50, 5);


-- =========================
-- ROLE (Enum Based)
-- =========================
INSERT INTO role (name) VALUES
('ADMIN'),
('USER'),
('MANAGER'),
('HR'),
('DEVELOPER');



-- =========================
-- PERSON_ROLE (Many to Many Join Table)
-- =========================
INSERT INTO person_role (person_id, role_id) VALUES

-- Person 1
(1, 1),  -- ADMIN
(1, 2),  -- USER

-- Person 2
(2, 2),  -- USER

-- Person 3
(3, 2),  -- USER
(3, 5),  -- DEVELOPER

-- Person 4
(4, 3),  -- MANAGER
(4, 2),  -- USER

-- Person 5
(5, 4),  -- HR

-- Person 6
(6, 5),  -- DEVELOPER
(6, 2),  -- USER

-- Person 7
(7, 1),  -- ADMIN

-- Person 8
(8, 2),  -- USER

-- Person 9
(9, 3),  -- MANAGER

-- Person 10
(10, 2), -- USER
(10, 5), -- DEVELOPER

-- Person 11
(11, 2), -- USER

-- Person 12
(12, 4), -- HR
(12, 2), -- USER

-- Person 13
(13, 1), -- ADMIN
(13, 3), -- MANAGER

-- Person 14
(14, 2), -- USER

-- Person 15
(15, 5), -- DEVELOPER

-- Person 16
(16, 2), -- USER
(16, 4), -- HR

-- Person 17
(17, 5), -- DEVELOPER
(17, 2), -- USER

-- Person 18
(18, 2), -- USER

-- Person 19
(19, 3), -- MANAGER

-- Person 20
(20, 1), -- ADMIN
(20, 2), -- USER

-- Person 21
(21, 4), -- HR

-- Person 22
(22, 2), -- USER
(22, 5), -- DEVELOPER

-- Person 23
(23, 2), -- USER

-- Person 24
(24, 2), -- USER
(24, 4), -- HR

-- Person 25
(25, 3), -- MANAGER

-- Person 26 to 50 → Default USER role
(26, 2),
(27, 2),
(28, 2),
(29, 2),
(30, 2),
(31, 2),
(32, 2),
(33, 2),
(34, 2),
(35, 2),
(36, 2),
(37, 2),
(38, 2),
(39, 2),
(40, 2),
(41, 2),
(42, 2),
(43, 2),
(44, 2),
(45, 2),
(46, 2),
(47, 2),
(48, 2),
(49, 2),
(50, 2);

