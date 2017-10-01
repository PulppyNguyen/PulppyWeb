create database PulppyDemo

create table Account(
	username VARCHAR(100),
    email VARCHAR(100),
    sex CHAR(1),
    birth DATE
)

insert into Account values('Thocon7278','Thocon7278@gmail.com',0,'1989/11/11'),
insert into Account values('Pulppy','Thocon7278@icloud.com',1,'1989/11/11')

select * from Account

create table Music__t(
	musicID bigint not null primary key auto_increment,
	musicName varchar(255),
    musicSinger varchar(255),
    musicDescription text,
    musicImage text,
    muiscLink TEXT
)

insert into Music__t (musicSinger,musicName,musicDescription,musicImage,muiscLink) values ('Within Temptation',
'Generate',
'This is Demo Song Test, Cras sit amet nibh libero, in gravida nulla. ',
'http://t.hdviet.com/thumbs/124x184/4199ed87937a6aed9117566bcaf3d937.jpg',
'http://chiasenhac.vn/download2.php?v1=1056&v2=0&v3=1UDDDAD-e1U1HIXI&v4=128&v5=Grenade%20Bruno%20Mars%20Cover_%20-%20Within%20Tempt [128kbps_MP3].mp3'
)

insert into Music__t (musicSinger,musicName,musicDescription,musicImage,muiscLink) values ('Within Temptation',
'Radioactive (Imagine Dragons Cover)',
'This is Demo Song Test, Cras sit amet nibh libero, in gravida nulla. ',
'http://t.hdviet.com/thumbs/124x184/4199ed87937a6aed9117566bcaf3d937.jpg',
'http://chiasenhac.vn/download2.php?v1=1056&v2=0&v3=1UDDDAA-MAJAd2aG&v4=128&v5=Radioactive%20Imagine%20Dragons%20Cover_%20-%20Wit [128kbps_MP3].mp3'
)

insert into Music__t (musicSinger,musicName,musicDescription,musicImage,muiscLink) values ('Taylor Swift',
'Look What You Made Me Do',
'This is Demo Song Test, Cras sit amet nibh libero, in gravida nulla. ',
'http://t.hdviet.com/thumbs/124x184/4199ed87937a6aed9117566bcaf3d937.jpg',
'http://chiasenhac.vn/download2.php?v1=1820&v2=0&v3=1Y1AUJU-G1YIYGYe&v4=320&v5=Look%20What%20You%20Made%20Me%20Do%20-%20Taylor%20Swift [320kbps_MP3].mp3'
)

select * from Music__t


create table tbl(ID bigint not null primary key auto_increment,name varchar(100)) auto_increment=1;
