USE [master]
GO
/****** Object:  Database [DB_Pronostico]    Script Date: 10/14/2016 13:48:01 ******/
CREATE DATABASE [DB_Pronostico] ON  PRIMARY 
( NAME = N'DB_Pronostico', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\DB_Pronostico.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'DB_Pronostico_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\DB_Pronostico_log.LDF' , SIZE = 576KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [DB_Pronostico] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [DB_Pronostico].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [DB_Pronostico] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [DB_Pronostico] SET ANSI_NULLS OFF
GO
ALTER DATABASE [DB_Pronostico] SET ANSI_PADDING OFF
GO
ALTER DATABASE [DB_Pronostico] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [DB_Pronostico] SET ARITHABORT OFF
GO
ALTER DATABASE [DB_Pronostico] SET AUTO_CLOSE ON
GO
ALTER DATABASE [DB_Pronostico] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [DB_Pronostico] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [DB_Pronostico] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [DB_Pronostico] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [DB_Pronostico] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [DB_Pronostico] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [DB_Pronostico] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [DB_Pronostico] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [DB_Pronostico] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [DB_Pronostico] SET  ENABLE_BROKER
GO
ALTER DATABASE [DB_Pronostico] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [DB_Pronostico] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [DB_Pronostico] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [DB_Pronostico] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [DB_Pronostico] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [DB_Pronostico] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [DB_Pronostico] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [DB_Pronostico] SET  READ_WRITE
GO
ALTER DATABASE [DB_Pronostico] SET RECOVERY SIMPLE
GO
ALTER DATABASE [DB_Pronostico] SET  MULTI_USER
GO
ALTER DATABASE [DB_Pronostico] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [DB_Pronostico] SET DB_CHAINING OFF
GO
USE [DB_Pronostico]
GO
/****** Object:  Table [dbo].[Descripcion]    Script Date: 10/14/2016 13:48:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Descripcion](
	[id_Descripcion] [int] NOT NULL,
	[descripcion] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_Descripcion] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Pais]    Script Date: 10/14/2016 13:48:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Pais](
	[nombre_Pais] [varchar](50) NOT NULL,
	[descripcion] [nchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[nombre_Pais] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Atmosfera]    Script Date: 10/14/2016 13:48:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Atmosfera](
	[Id_Atmosfera] [int] IDENTITY(1,1) NOT NULL,
	[humedad] [float] NULL,
	[presion] [float] NULL,
	[visibilidad] [float] NULL,
	[ambiente_asc] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_Atmosfera] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Viento]    Script Date: 10/14/2016 13:48:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Viento](
	[Id_Viento] [int] IDENTITY(1,1) NOT NULL,
	[direccion] [float] NULL,
	[velocidad] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id_Viento] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Region]    Script Date: 10/14/2016 13:48:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Region](
	[nombre_Pais] [varchar](50) NOT NULL,
	[nombre_Region] [varchar](50) NOT NULL,
	[descripcion] [varchar](50) NULL,
 CONSTRAINT [pk_Region] PRIMARY KEY CLUSTERED 
(
	[nombre_Pais] ASC,
	[nombre_Region] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[DiaActual]    Script Date: 10/14/2016 13:48:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DiaActual](
	[fecha] [date] NOT NULL,
	[temp] [float] NULL,
	[descripcion] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[fecha] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Ciudad]    Script Date: 10/14/2016 13:48:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Ciudad](
	[nombre_Ciudad] [varchar](50) NOT NULL,
	[nombre_Pais] [varchar](50) NOT NULL,
	[nombre_Region] [varchar](50) NOT NULL,
	[descripcion] [varchar](50) NULL,
 CONSTRAINT [pkCiudad_Region] PRIMARY KEY CLUSTERED 
(
	[nombre_Ciudad] ASC,
	[nombre_Pais] ASC,
	[nombre_Region] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Pronostico]    Script Date: 10/14/2016 13:48:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Pronostico](
	[fecha] [date] NOT NULL,
	[nombre_Ciudad] [varchar](50) NOT NULL,
	[nombre_Pais] [varchar](50) NOT NULL,
	[nombre_Region] [varchar](50) NOT NULL,
	[id_Viento] [int] NULL,
	[id_Atmosfera] [int] NULL,
 CONSTRAINT [pkPronostico] PRIMARY KEY CLUSTERED 
(
	[fecha] ASC,
	[nombre_Ciudad] ASC,
	[nombre_Pais] ASC,
	[nombre_Region] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Pronostico_Extendido]    Script Date: 10/14/2016 13:48:03 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Pronostico_Extendido](
	[id_Pronostico_Extendido] [int] IDENTITY(1,1) NOT NULL,
	[fecha] [date] NOT NULL,
	[nombre_Ciudad] [varchar](50) NOT NULL,
	[nombre_Pais] [varchar](50) NOT NULL,
	[nombre_Region] [varchar](50) NOT NULL,
	[min] [float] NULL,
	[max] [float] NULL,
	[descripcion] [int] NULL,
	[dia] [varchar](20) NULL,
	[fecha_Ext] [date] NULL,
 CONSTRAINT [pkPronosticoExt] PRIMARY KEY CLUSTERED 
(
	[id_Pronostico_Extendido] ASC,
	[fecha] ASC,
	[nombre_Ciudad] ASC,
	[nombre_Pais] ASC,
	[nombre_Region] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  ForeignKey [fk_nombrePais]    Script Date: 10/14/2016 13:48:03 ******/
ALTER TABLE [dbo].[Region]  WITH CHECK ADD  CONSTRAINT [fk_nombrePais] FOREIGN KEY([nombre_Pais])
REFERENCES [dbo].[Pais] ([nombre_Pais])
GO
ALTER TABLE [dbo].[Region] CHECK CONSTRAINT [fk_nombrePais]
GO
/****** Object:  ForeignKey [fkDiaActual_Descripcion]    Script Date: 10/14/2016 13:48:03 ******/
ALTER TABLE [dbo].[DiaActual]  WITH CHECK ADD  CONSTRAINT [fkDiaActual_Descripcion] FOREIGN KEY([descripcion])
REFERENCES [dbo].[Descripcion] ([id_Descripcion])
GO
ALTER TABLE [dbo].[DiaActual] CHECK CONSTRAINT [fkDiaActual_Descripcion]
GO
/****** Object:  ForeignKey [fkCiudad]    Script Date: 10/14/2016 13:48:03 ******/
ALTER TABLE [dbo].[Ciudad]  WITH CHECK ADD  CONSTRAINT [fkCiudad] FOREIGN KEY([nombre_Pais], [nombre_Region])
REFERENCES [dbo].[Region] ([nombre_Pais], [nombre_Region])
GO
ALTER TABLE [dbo].[Ciudad] CHECK CONSTRAINT [fkCiudad]
GO
/****** Object:  ForeignKey [fkPronostico_Atmosfera]    Script Date: 10/14/2016 13:48:03 ******/
ALTER TABLE [dbo].[Pronostico]  WITH CHECK ADD  CONSTRAINT [fkPronostico_Atmosfera] FOREIGN KEY([id_Atmosfera])
REFERENCES [dbo].[Atmosfera] ([Id_Atmosfera])
GO
ALTER TABLE [dbo].[Pronostico] CHECK CONSTRAINT [fkPronostico_Atmosfera]
GO
/****** Object:  ForeignKey [fkPronostico_Fecha]    Script Date: 10/14/2016 13:48:03 ******/
ALTER TABLE [dbo].[Pronostico]  WITH CHECK ADD  CONSTRAINT [fkPronostico_Fecha] FOREIGN KEY([fecha])
REFERENCES [dbo].[DiaActual] ([fecha])
GO
ALTER TABLE [dbo].[Pronostico] CHECK CONSTRAINT [fkPronostico_Fecha]
GO
/****** Object:  ForeignKey [fkPronostico_Ubicacion]    Script Date: 10/14/2016 13:48:03 ******/
ALTER TABLE [dbo].[Pronostico]  WITH CHECK ADD  CONSTRAINT [fkPronostico_Ubicacion] FOREIGN KEY([nombre_Ciudad], [nombre_Pais], [nombre_Region])
REFERENCES [dbo].[Ciudad] ([nombre_Ciudad], [nombre_Pais], [nombre_Region])
GO
ALTER TABLE [dbo].[Pronostico] CHECK CONSTRAINT [fkPronostico_Ubicacion]
GO
/****** Object:  ForeignKey [fkPronostico_Viento]    Script Date: 10/14/2016 13:48:03 ******/
ALTER TABLE [dbo].[Pronostico]  WITH CHECK ADD  CONSTRAINT [fkPronostico_Viento] FOREIGN KEY([id_Viento])
REFERENCES [dbo].[Viento] ([Id_Viento])
GO
ALTER TABLE [dbo].[Pronostico] CHECK CONSTRAINT [fkPronostico_Viento]
GO
/****** Object:  ForeignKey [fkPronosticoExt_Descipcion]    Script Date: 10/14/2016 13:48:03 ******/
ALTER TABLE [dbo].[Pronostico_Extendido]  WITH CHECK ADD  CONSTRAINT [fkPronosticoExt_Descipcion] FOREIGN KEY([descripcion])
REFERENCES [dbo].[Descripcion] ([id_Descripcion])
GO
ALTER TABLE [dbo].[Pronostico_Extendido] CHECK CONSTRAINT [fkPronosticoExt_Descipcion]
GO
/****** Object:  ForeignKey [fkPronosticoExt_Pronostico]    Script Date: 10/14/2016 13:48:03 ******/
ALTER TABLE [dbo].[Pronostico_Extendido]  WITH CHECK ADD  CONSTRAINT [fkPronosticoExt_Pronostico] FOREIGN KEY([fecha], [nombre_Ciudad], [nombre_Pais], [nombre_Region])
REFERENCES [dbo].[Pronostico] ([fecha], [nombre_Ciudad], [nombre_Pais], [nombre_Region])
GO
ALTER TABLE [dbo].[Pronostico_Extendido] CHECK CONSTRAINT [fkPronosticoExt_Pronostico]
GO
