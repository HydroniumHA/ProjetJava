CREATE TABLE Address(
	addressID varchar(36) primary key,
    street varchar(45) not null,
    streetNumber int not null CHECK (streetNumber >= 0),
    cityName varchar(58) not null,
    zip int not null  CHECK (zip > 0)
);

CREATE TABLE Bike(
	bikeID varchar(36) primary key,
    model varchar(20) not null,
    brand varchar(20) not null,
    purchaseDate date not null,
    value double not null  CHECK (value >= 0),
    isDeclassified boolean not null
);

CREATE TABLE RepairOrder(
	repairID varchar(36) primary key,
    issueDate date not null,
    repairDate date,
    comments varchar(500),
    bike varchar(36),
    foreign key (bike) references Bike(bikeID)
);

CREATE TABLE Building(
	buildingID varchar(36) primary key,
    numberMaxPlaces int not null CHECK (numberMaxPlaces > 0),
    numberOccupiedPlaces int not null CHECK (numberOccupiedPlaces >= 0),
    buildingType varchar(8) not null,
    address varchar(36) not null,
    foreign key (address) REFERENCES Address(addressID)
);



CREATE TABLE Person(
	nationalRegistrationNumber varchar(36) primary key,
    lastName varchar(50) not null,
    firstName varchar(50) not null,
    birthDate date not null,
    gender varchar(1) not null,
    email varchar(50),
    phoneNumber varchar(15),
    addressID varchar(36),
    wantsNewsletter boolean not null,
    foreign key (addressID) REFERENCES Address(addressID)
);

CREATE TABLE Job(
	startDate date not null,
    person varchar(36) not null,
    jobName varchar(30),
    endDate date,
    building varchar(36),
    foreign key (person) REFERENCES Person(nationalRegistrationNumber),
    foreign key (building) REFERENCES Building(buildingID),
    primary key (startDate,person)
);

CREATE TABLE Subscription (
	subscriptionID varchar(36) primary key,
    startDate date not null,
    expectedDuration int not null CHECK (expectedDuration > 0),
    endDate date,
    person varchar(36) not null,
    foreign key (person) REFERENCES Person(nationalRegistrationNumber)
);

CREATE TABLE Card(
	cardID varchar(36) primary key,
    creationDate date not null,
    subscription varchar(36) not null,
    foreign key (subscription) REFERENCES Subscription(subscriptionID)
);

CREATE TABLE Invoice(
	documentID varchar(36) primary key,
    invoiceDate date not null,
    totalPriceWithoutVAT double not null CHECK (totalPriceWithoutVAT >= 0),
    totalPriceIncludingVAT double not null CHECK (totalPriceIncludingVAT >= 0),
    isPaid boolean not null,
    subscription varchar(36) not null,
    foreign key (subscription) REFERENCES Subscription(subscriptionID)
);

CREATE TABLE MovementOrder(
	movementID varchar(36) primary key,
    departureDate date not null,
    departureTime time not null,
    arrivalDate date,
    arrivalTime time,
    urgencyLevel int not null  CHECK (urgencyLevel >= 0),
    arrivalBuilding varchar(36),
    departureBuilding varchar(36) not null,
    bike varchar(36),
    card varchar(36) not null,
    foreign key (arrivalBuilding) REFERENCES Building(buildingID),
    foreign key (departureBuilding) REFERENCES Building(buildingID),
    foreign key (bike) REFERENCES Bike(bikeID),
    foreign key (card) references Card(cardID)
);