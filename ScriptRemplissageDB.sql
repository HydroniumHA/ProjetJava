/*
#######################
#  INSERTION Address  #
#######################

*/

	INSERT INTO address VALUES ('id1', 'Rue de la Carotte', 50, 'Maryland', 20906);
	INSERT INTO address VALUES ('id2', 'Avenue printanière', 78, 'Madrid', 4907);
	INSERT INTO address VALUES ('A001', 'Rue des Lilas', 12, 'Paris', 75001);
	INSERT INTO address VALUES ('A002', 'Avenue des Champs-Elysées', 105, 'Namur', 5000);
	INSERT INTO address VALUES ('A003', 'Boulevard Haussmann', 142, 'Gembloux', 9980);
	INSERT INTO address VALUES ('A004', 'Rue du Faubourg Saint-Honoré', 45, 'Ottignie', 1056);
	INSERT INTO address VALUES ('A005', 'Place Vendôme', 26, 'Lavalette', 3652);
	INSERT INTO address VALUES ('A006', 'Rue de Rivoli', 1, 'Liège', 4000);
	INSERT INTO address VALUES ('A007', 'Rue Saint-Honoré', 221, 'Mont Saint-Guibert', 8846);
	INSERT INTO address VALUES ('A008', 'Rue de la Paix', 2, 'Bruxelles', 1000);
	INSERT INTO address VALUES ('A009', 'Avenue Montaigne', 28, 'Rixensart', 1332);
	INSERT INTO address VALUES ('A010', 'Rue de la Pompe', 64, 'Anvers', 22365);
	INSERT INTO address VALUES ('A011', 'Rue de Courcelles', 120, 'Mons', 1015);
	INSERT INTO address VALUES ('A012', 'Rue de la Roquette', 25, 'Bruges', 4596);
	INSERT INTO address VALUES ('A013', 'Rue Saint-Maur', 45, 'Louvain', 3474);
	INSERT INTO address VALUES ('A014', 'Rue de Belleville', 72, 'Charleroi', 3065);
	INSERT INTO address VALUES ('A015', 'Rue de Ménilmontant', 33, 'Gand', 8520);
	INSERT INTO address VALUES ('A016', 'Rue du Cherche-Midi', 11, 'Malines', 75006);
	INSERT INTO address VALUES ('A017', 'Rue de Sèvres', 102, 'Tournai', 1048);
    INSERT INTO address VALUES ('A018', 'Rue de Fer', 102, 'Namur', 5000);
	INSERT INTO address VALUES ('A019', 'Avenue Louise', 25, 'Bruxelles', 1000);
	INSERT INTO address VALUES ('A020', 'Rue des Carmes', 10, 'Liège', 4000);
	INSERT INTO address VALUES ('A021', 'Rue du Moulin', 7, 'Namur', 5000);
	INSERT INTO address VALUES ('A022', 'Avenue des Arts', 15, 'Bruxelles', 1000);
	INSERT INTO address VALUES ('A023', 'Boulevard de la Sauvenière', 50, 'Liège', 4000);
	INSERT INTO address VALUES ('A024', 'Rue de Fer', 18, 'Namur', 5000);
	INSERT INTO address VALUES ('A025', 'Rue Neuve', 2, 'Bruxelles', 1000);
	INSERT INTO address VALUES ('A026', 'Place Saint-Lambert', 5, 'Liège', 4000);
	INSERT INTO address VALUES ('A027', 'Rue de lAnge', 12, 'Namur', 5000);
    
/*
####################
#  INSERTION Bike  #
####################

*/

	INSERT INTO bike VALUES ('B01', 'VeloX', 'Giant', '2022-01-01', 1000.00, true);
	INSERT INTO bike VALUES ('B02', 'AeroSwift', 'Trek', '2021-05-10', 1500.50, false);
	INSERT INTO bike VALUES ('B03', 'TrailBlazer', 'Specialized', '2023-02-28', 800.00, true);
	INSERT INTO bike VALUES ('B04', 'UrbanCruiser', 'Cannondale', '2022-11-15', 1200.75, false);
	INSERT INTO bike VALUES ('B05', 'MountainMaster', 'Scott', '2023-04-05', 900.25, true);
	INSERT INTO bike VALUES ('B06', 'SpeedRider', 'Scott', '2021-07-20', 1100.00, false);
	INSERT INTO bike VALUES ('B07', 'CityGlide', 'Bianchi', '2023-03-10', 950.50, true);
	INSERT INTO bike VALUES ('B08', 'RoadWarrior', 'Fuji', '2022-04-15', 1300.25, false);
	INSERT INTO bike VALUES ('B09', 'CrossCountry', 'Fuji', '2021-09-30', 850.75, true);
	INSERT INTO bike VALUES ('B10', 'CommutePro', 'Merida', '2023-01-05', 1150.00, false);
	INSERT INTO bike VALUES ('B11', 'EvoRider', 'Merida', '2022-06-20', 950.50, true);
	INSERT INTO bike VALUES ('B12', 'PowerPedal', 'Cube', '2021-12-31', 1350.25, false);
	INSERT INTO bike VALUES ('B13', 'TouringEdge', 'Giant', '2023-04-15', 900.75, true);
	INSERT INTO bike VALUES ('B14', 'GravelExplorer', 'Fuji', '2022-08-05', 1200.00, false);
	INSERT INTO bike VALUES ('B15', 'HybridX', 'Santa Cruz', '2021-10-25', 1000.50, true);

/*
###########################
#  INSERTION RepairOrder  #
###########################

*/

	INSERT INTO RepairOrder VALUES ('R01', '2022-01-11', '2022-01-20', 'Les freins ont été réparés avec succès.', 'B01');
	INSERT INTO RepairOrder VALUES ('R02', '2022-06-07', '2022-07-10', 'Le pneu a été remplacé et regonflé.', 'B03');
	INSERT INTO RepairOrder VALUES ('R03', '2023-02-28', '2023-03-05', 'Le dérailleur a été ajusté et réparé.', 'B05');
	INSERT INTO RepairOrder VALUES ('R04', '2022-10-10', '2022-11-15', 'Une nouvelle chaine a été installée et lubrifiée.', 'B02');
	INSERT INTO RepairOrder VALUES ('R05', '2023-04-01', '2023-04-05', 'La selle a été remplacée par une nouvelle.', 'B04');
	INSERT INTO RepairOrder VALUES ('R06', '2022-08-20', '2022-08-25', 'La direction a été ajustée et lubrifiée.', 'B06');
	INSERT INTO RepairOrder VALUES ('R07', '2023-03-09', '2023-03-10', 'La roue a été redressée et équilibrée.', 'B08');
	INSERT INTO RepairOrder VALUES ('R08', '2022-04-11', '2022-04-17', 'La suspension a été réparée et réglée.', 'B10');
	INSERT INTO RepairOrder VALUES ('R09', '2022-09-25', '2022-09-30', 'Le pédalier a été remplacé avec succès.', 'B12');
	INSERT INTO RepairOrder VALUES ('R10', '2023-01-05', '2023-01-07', 'Les freins arrière ont été réparés et ajustés.', 'B01');
	INSERT INTO RepairOrder VALUES ('R11', '2022-03-10', '2022-03-15', 'La chaîne a été remplacée.', 'B01');
	INSERT INTO RepairOrder VALUES ('R12', '2022-07-20', '2022-07-25', 'Les pneus ont été changés.', 'B05');
	INSERT INTO RepairOrder VALUES ('R13', '2023-02-28', '2023-03-05', 'Le dérailleur a été réparé.', 'B07');
	INSERT INTO RepairOrder VALUES ('R14', '2022-09-08', '2022-09-13', 'Le guidon a été réajusté.', 'B09');
	INSERT INTO RepairOrder VALUES ('R15', '2023-04-15', '2023-04-17', 'Le siège a été remplacé.', 'B12');
	INSERT INTO RepairOrder VALUES ('R16', '2022-09-30', '2022-11-04', 'La roue avant a été réparée.', 'B01');
	INSERT INTO RepairOrder VALUES ('R17', '2022-11-05', '2022-12-10', 'Les pédales ont été ajustées.', 'B08');
	INSERT INTO RepairOrder VALUES ('R18', '2023-01-18', '2023-01-23', 'Le dérailleur arrière a été réparé.', 'B13');
	INSERT INTO RepairOrder VALUES ('R19', '2022-06-25', '2022-06-30', 'Le frein avant a été remplacé.', 'B03');
	INSERT INTO RepairOrder VALUES ('R20', '2022-02-13', '2022-02-19', 'Le garde-boue a été installé.', 'B06');
	INSERT INTO RepairOrder VALUES ('R21', '2022-03-01', '2022-03-10', 'Le câble de vitesses a été remplacé.', 'B11');
	INSERT INTO RepairOrder VALUES ('R22', '2022-08-10', '2022-08-23', 'Le guidon a été changé.', 'B10');
	INSERT INTO RepairOrder VALUES ('R23', '2023-04-04', '2023-04-07', 'La selle a été ajustée.', 'B02');
	INSERT INTO RepairOrder VALUES ('R24', '2022-11-15', '2022-11-17', 'La roue arrière a été réparée.', 'B04');
	INSERT INTO RepairOrder VALUES ('R25', '2023-01-22', '2023-02-02', 'Le pédalier a été remplacé.', 'B13');
	INSERT INTO RepairOrder VALUES ('R26', '2022-08-15', '2022-09-20', 'Le frein arrière a été réparé.', 'B05');
	INSERT INTO RepairOrder VALUES ('R27', '2022-04-20', '2022-04-27', 'La chaîne a été lubrifiée.', 'B09');

/*
########################
#  INSERTION Building  #
########################

*/

	INSERT INTO Building VALUES ('BU001', 40, 26, 'Workshop', 'A001');
	INSERT INTO Building VALUES ('BU002', 30, 10, 'Workshop', 'A006');
	INSERT INTO Building VALUES ('BU003', 25, 20, 'Station', 'A012');
	INSERT INTO Building VALUES ('BU004', 15, 5, 'Station', 'A015');
	INSERT INTO Building VALUES ('BU005', 50, 30, 'Workshop', 'A009');

/*
######################
#  INSERTION Person  #
######################

*/

	INSERT INTO Person VALUES ('88.03.15-678.58', 'Dupont', 'Jean', '1988-03-15', 'M', 'jean.dupont@example.com', '+32542197586', 'A001', true);
	INSERT INTO Person VALUES ('02.11.28-321.13', 'Durand', 'Marie', '2002-11-28', 'F', 'marie.durand@example.com', '+32327851466', 'A002', false);
	INSERT INTO Person VALUES ('84.09.06-512.77', 'Martin', 'Pierre', '1984-09-06', 'M', 'pierre.martin@example.com', '+32899346725', 'A003', true);
	INSERT INTO Person VALUES ('37.12.31-123.91', 'Leblanc', 'Sophie', '1937-12-31', 'F', 'sophie.leblanc@example.com', '+32175628499', 'A004', false);
	INSERT INTO Person VALUES ('73.05.20-456.22', 'Dupuis', 'Marc', '1973-05-20', 'M', 'marc.dupuis@example.com', '+32633472818', 'A005', true);
	INSERT INTO Person VALUES ('10.08.02-789.66', 'Lefevre', 'Julie', '2010-08-02', 'F', 'julie.lefevre@example.com', '+32438695731', 'A006', false);
	INSERT INTO Person VALUES ('61.02.17-234.45', 'Dubois', 'Nicolas', '1961-02-17', 'M', 'nicolas.dubois@example.com', '+32751983267', 'A007', true);
	INSERT INTO Person VALUES ('95.07.29-888.12', 'Gagnon', 'Isabelle', '1995-07-29', 'F', 'isabelle.gagnon@example.com', '+32285706409', 'A008', false);
	INSERT INTO Person VALUES ('06.12.25-532.62', 'Mart', 'Milo', '2006-12-25', 'M', 'milo.mart@example.com', '+32425618735', 'A009', true);
	INSERT INTO Person VALUES ('62.08.17-148.17', 'Martin', 'Marie', '1962-08-17', 'F', 'marie.martin@example.com', '+32736245910', 'A010', false);
	INSERT INTO Person VALUES ('07.04.03-689.45', 'Lefevre', 'Pierre', '2007-04-03', 'M', 'pierre.lefevre@example.com', '+32581490362', 'A011', true);
	INSERT INTO Person VALUES ('10.09.18-237.83', 'Gagnon', 'Sophie', '2010-09-18', 'F', 'sophie.gagnon@example.com', '+32309857126', 'A012', false);
	INSERT INTO Person VALUES ('98.11.30-795.29', 'Tremblay', 'Marc', '1998-11-30', 'M', 'marc.tremblay@example.com', '+32847562903', 'A013', true);
	INSERT INTO Person VALUES ('63.02.08-412.71', 'Dubois', 'Julie', '1963-02-08', 'F', 'julie.dubois@example.com', '+32162937584', 'A014', false);
	INSERT INTO Person VALUES ('09.07.21-876.55', 'Bergeron', 'Nicolas', '2009-07-21', 'M', 'nicolas.bergeron@example.com', '+32495603871', 'A015', true);
	INSERT INTO Person VALUES ('99.12.31-654.94', 'Rousseau', 'Isabelle', '1999-12-31', 'F', 'isabelle.rousseau@example.com', '+32753186294', 'A016', true);
    INSERT INTO Person VALUES ('21.01.01-654.94', 'Dupont', 'Alice', '1985-06-15', 'F', 'alice.dupont@example.com', '+32753186294', 'A017', false);
	INSERT INTO Person VALUES ('40.05.01-324.76', 'Tremblay', 'Sophie', '1992-09-22', 'F', 'sophie.tremblay@example.com', '+32874569213', 'A018', true);
	INSERT INTO Person VALUES ('61.01.01-899.99', 'Pace', 'Alexandre', '1976-03-10', 'M', 'alexandre.gagnon@example.com', '+32987456321', 'A019', false);
	INSERT INTO Person VALUES ('15.11.01-100.00', 'Lavoie', 'Maxime', '1989-11-01', 'M', 'maxime.lavoie@example.com', '+32851964785', 'A020', false);
	INSERT INTO Person VALUES ('79.01.01-799.99', 'Leblanc', 'Émilie', '1994-07-28', 'F', 'emilie.leblanc@example.com', '+32796852431', 'A021', true);
	INSERT INTO Person VALUES ('30.07.01-499.99', 'Bergeron', 'Simon', '1982-12-05', 'M', 'simon.bergeron@example.com', '+32987451236', 'A022', true);
	INSERT INTO Person VALUES ('92.04.01-199.99', 'Gagné', 'Catherine', '1972-08-17', 'F', 'catherine.gagne@example.com', '+32758961234', 'A023', false);
	INSERT INTO Person VALUES ('50.03.15-654.94', 'Martin', 'Patrick', '1997-02-28', 'M', 'patrick.martin@example.com', '+32874563214', 'A024', false);
	INSERT INTO Person VALUES ('88.06.01-499.99', 'Roy', 'Marie', '1980-07-11', 'F', 'marie.roy@example.com', '+32987412365', 'A025', true);
	INSERT INTO Person VALUES ('77.12.01-998.99', 'Francois', 'Pierre', '1991-10-19', 'M', 'pierre.francois@example.com', '+32745698712', 'A026', false);

/*
#######################
#  INSERTION Job  #
#######################

*/

	INSERT INTO Job VALUES ('2022-01-15', '84.09.06-512.77', 'Développeur', NULL, 'BU001');
	INSERT INTO Job VALUES ('2021-09-28', '98.11.30-795.29', 'Designer', '2023-05-10', 'BU002');
	INSERT INTO Job VALUES ('2022-06-01', '84.09.06-512.77', 'Ingénieur', NULL, 'BU003');
	INSERT INTO Job VALUES ('2023-01-01', '37.12.31-123.91', 'Analyste', NULL, 'BU004');
	INSERT INTO Job VALUES ('2022-04-10', '73.05.20-456.22', 'Technicien', '2023-03-30', 'BU005');

/*
############################
#  INSERTION Subscription  #
############################

*/

	INSERT INTO Subscription VALUES ('S001', '2022-01-15', 31, '2022-07-15', '06.12.25-532.62');
	INSERT INTO Subscription VALUES ('S002', '2021-09-28', 31, NULL, '07.04.03-689.45');
	INSERT INTO Subscription VALUES ('S003', '2022-06-01', 31, '2022-09-01', '09.07.21-876.55');
	INSERT INTO Subscription VALUES ('S004', '2023-01-01', 31, NULL, '10.08.02-789.66');
	INSERT INTO Subscription VALUES ('S005', '2022-04-10', 31, '2022-10-10', '10.09.18-237.83');
	INSERT INTO Subscription VALUES ('S006', '2021-11-19', 31, NULL, '95.07.29-888.12');
	INSERT INTO Subscription VALUES ('S007', '2022-12-31', 31, NULL, '37.12.31-123.91');
	INSERT INTO Subscription VALUES ('S008', '2023-03-15', 31, '2023-09-15', '99.12.31-654.94');
    INSERT INTO Subscription VALUES ('S009', '2022-02-10', 31, '2022-08-10', '21.01.01-654.94');
	INSERT INTO Subscription VALUES ('S010', '2021-05-23', 31, '2021-08-23', '40.05.01-324.76');
	INSERT INTO Subscription VALUES ('S011', '2023-01-07', 31, '2023-07-07', '61.01.01-899.99');
	INSERT INTO Subscription VALUES ('S012', '2021-11-15', 31, '2021-12-15', '15.11.01-100.00');
	INSERT INTO Subscription VALUES ('S013', '2022-09-18', 31, '2023-03-18', '79.01.01-799.99');
	INSERT INTO Subscription VALUES ('S014', '2022-07-01', 31, '2022-12-31', '30.07.01-499.99');
	INSERT INTO Subscription VALUES ('S015', '2023-04-02', 31, '2023-07-02', '92.04.01-199.99');
	INSERT INTO Subscription VALUES ('S016', '2023-03-15', 31, '2023-09-15', '50.03.15-654.94');
	INSERT INTO Subscription VALUES ('S017', '2021-06-28', 31, '2021-12-28', '88.06.01-499.99');
	INSERT INTO Subscription VALUES ('S018', '2022-12-10', 31, '2022-12-10', '77.12.01-998.99');

/*
####################
#  INSERTION Card  #
####################

*/

	INSERT INTO Card VALUES ('C001', '2022-01-16', 'S001');
	INSERT INTO Card VALUES ('C002', '2021-09-29', 'S002');
	INSERT INTO Card VALUES ('C003', '2022-06-02', 'S003');
	INSERT INTO Card VALUES ('C004', '2023-01-02', 'S004');
	INSERT INTO Card VALUES ('C005', '2022-04-11', 'S005');
	INSERT INTO Card VALUES ('C006', '2021-11-20', 'S006');
	INSERT INTO Card VALUES ('C007', '2022-01-01', 'S007');
	INSERT INTO Card VALUES ('C008', '2023-03-16', 'S008');

/*
#######################
#  INSERTION Invoice  #
#######################

*/

	INSERT INTO Invoice VALUES ('I001', '2022-01-16', 50.0, 60.0, true, 'S001');
	INSERT INTO Invoice VALUES ('I002', '2021-09-29', 100.0, 120.0, false, 'S002');
	INSERT INTO Invoice VALUES ('I003', '2022-06-02', 75.0, 90.0, true, 'S003');
	INSERT INTO Invoice VALUES ('I004', '2023-01-02', 150.0, 180.0, false, 'S004');
	INSERT INTO Invoice VALUES ('I005', '2022-04-11', 200.0, 240.0, true, 'S005');
	INSERT INTO Invoice VALUES ('I006', '2021-11-20', 125.0, 150.0, false, 'S006');
	INSERT INTO Invoice VALUES ('I007', '2023-01-01', 50.0, 60.0, true, 'S007');
	INSERT INTO Invoice VALUES ('I008', '2022-03-16', 100.0, 120.0, false, 'S008');
    INSERT INTO Invoice VALUES ('I009', '2021-04-25', 75.0, 90.0, false, 'S009');
	INSERT INTO Invoice VALUES ('I010', '2022-07-09', 200.0, 240.0, false, 'S010');
	INSERT INTO Invoice VALUES ('I011', '2021-08-17', 150.0, 180.0, true, 'S011');
	INSERT INTO Invoice VALUES ('I012', '2023-02-28', 80.0, 96.0, false, 'S012');
	INSERT INTO Invoice VALUES ('I013', '2022-11-02', 120.0, 144.0, false, 'S013');
	INSERT INTO Invoice VALUES ('I014', '2021-06-12', 250.0, 300.0, false, 'S014');
	INSERT INTO Invoice VALUES ('I015', '2022-01-19', 180.0, 216.0, true, 'S015');
	INSERT INTO Invoice VALUES ('I016', '2022-03-16', 100.0, 120.0, false, 'S016');
	INSERT INTO Invoice VALUES ('I017', '2023-05-05', 300.0, 360.0, true, 'S017');
	INSERT INTO Invoice VALUES ('I018', '2021-12-01', 50.0, 60.0, true, 'S018');

/*
#############################
#  INSERTION MovementOrder  #
#############################

*/

	INSERT INTO MovementOrder VALUES ('Mo001', '2022-01-16', '09:30:00', '2022-01-16', '10:45:00', 1, 'BU001', 'BU002', 'B01', 'C001');
	INSERT INTO MovementOrder VALUES ('Mo002', '2021-09-29', '14:45:00', '2021-09-29', '15:30:00', 2, 'BU001', 'BU005', 'B02', 'C002');
	INSERT INTO MovementOrder VALUES ('Mo003', '2022-06-02', '11:00:00', '2022-06-02', '11:30:00', 3, 'BU005', 'BU001', 'B03', 'C003');
	INSERT INTO MovementOrder VALUES ('Mo004', '2023-01-02', '16:20:00', '2023-01-02', '17:10:00', 1, 'BU005', 'BU002', 'B04', 'C004');
	INSERT INTO MovementOrder VALUES ('Mo005', '2022-04-11', '10:15:00', '2022-04-11', '10:45:00', 2, 'BU002', 'BU001', 'B05', 'C005');
	INSERT INTO MovementOrder VALUES ('Mo006', '2021-11-20', '13:50:00', '2021-11-20', '14:30:00', 3, 'BU002', 'BU005', 'B06', 'C006');
	INSERT INTO MovementOrder VALUES ('Mo007', '2023-01-01', '08:00:00', '2038-01-01', '08:45:00', 1, 'BU001', 'BU002', 'B07', 'C007');
	INSERT INTO MovementOrder VALUES ('Mo008', '2022-01-16', '09:30:00', '2022-01-16', '10:45:00', 1, 'BU001', 'BU002', 'B08', 'C001');
	INSERT INTO MovementOrder VALUES ('Mo009', '2021-09-29', '14:45:00', '2021-09-29', '15:30:00', 2, 'BU001', 'BU005', 'B09', 'C002');
	INSERT INTO MovementOrder VALUES ('Mo010', '2022-06-02', '11:00:00', '2022-06-02', '11:30:00', 3, 'BU005', 'BU001', 'B10', 'C003');
	INSERT INTO MovementOrder VALUES ('Mo011', '2023-01-02', '16:20:00', '2023-01-02', '17:10:00', 1, 'BU005', 'BU002', 'B11', 'C004');
	INSERT INTO MovementOrder VALUES ('Mo012', '2022-04-11', '10:15:00', '2022-04-11', '10:45:00', 2, 'BU002', 'BU001', 'B12', 'C005');
	INSERT INTO MovementOrder VALUES ('Mo013', '2021-11-20', '13:50:00', '2021-11-20', '14:30:00', 3, 'BU002', 'BU005', 'B13', 'C006');