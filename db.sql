create database Db_du_an_
go
create table Accounts
(
[userID] int IDENTITY(1,1) primary key not null,
[gmail] varchar(100) not null,
[password] varchar(100) not null,
[uImages] nvarchar(max),
[faceBook] nvarchar(max),
[soDienThoai] char(20),
firstName nvarchar(100),
lastName nvarchar(100),
gender nvarchar(50),
congviec nvarchar(50)
)
go
create table adminAccount
(
adminId int identity(1,1) primary key not null,
adUsername nvarchar(100) not null,
adPassword nvarchar(100) not null,
member int,
adName nvarchar(100)
)
go
create table cImages
(
idCategory int identity(1,1) primary key not null,
cname nvarchar(100),
)
go 
create table Images
(
idImage int identity(1,1) primary key not null,
images nvarchar(max) not null,
idCategory int not null,
userID int not null,
Tag nvarchar(max) not null,
TieuCu nvarchar(50),
KhauDo nvarchar(50),
TocDoManTrap nvarchar(50),
ISO varchar(50),
Camera nvarchar(100),
LoaiHinhAnh nvarchar (50),
[date] date,
[view] int,
ready int,
isPublic bit,
FOREIGN KEY (idCategory) REFERENCES cImages (idCategory) on delete cascade,
FOREIGN KEY (userID) REFERENCES Accounts (userID) on delete cascade
)
go 
CREATE TABLE Comments
(
  idComment int IDENTITY(1,1) primary key not null,
  comment nvarchar(max) not null,
  userID int not null,
  idImage int not null,
  commentDay SMALLDATETIME,
  CONSTRAINT FK_Comments_Accounts FOREIGN KEY (userID) REFERENCES Accounts (userID) ON DELETE CASCADE,
  CONSTRAINT FK_Comments_idImage FOREIGN KEY (idImage) REFERENCES Images (idImage) ON DELETE CASCADE
);

go
create table web
(
idBanner int primary key identity(1,1),
banner nvarchar(255),
title1 nvarchar(100),
title2 nvarchar(100),
facebook nvarchar(255),
instagram nvarchar(255),
pinterest nvarchar(255)
)



CREATE TABLE Comments
(
  idComment int IDENTITY(1,1) primary key not null,
  comment nvarchar(max) not null,
  userID int not null,
  idImage int not null,
  commentDay SMALLDATETIME,
  CONSTRAINT FK_Comments_Accounts FOREIGN KEY (userID) REFERENCES Accounts (userID) ON DELETE NO ACTION,
  CONSTRAINT FK_Comments_idImage FOREIGN KEY (idImage) REFERENCES Images (idImage) ON DELETE CASCADE 
);
