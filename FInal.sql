USE [QuanLyPetShop]
GO
/****** Object:  Table [dbo].[Bill]    Script Date: 27/12/2023 5:07:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Bill](
	[ID_HD] [int] IDENTITY(1,1) NOT NULL,
	[ID_NV] [int] NOT NULL,
	[ID_KH] [int] NOT NULL,
	[NgMua] [date] NOT NULL,
 CONSTRAINT [PK_Bill] PRIMARY KEY CLUSTERED 
(
	[ID_HD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[chiTietDonHang]    Script Date: 27/12/2023 5:07:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chiTietDonHang](
	[ID_HD] [int] NOT NULL,
	[ID_HH] [int] NOT NULL,
 CONSTRAINT [PK_cthd] PRIMARY KEY CLUSTERED 
(
	[ID_HD] ASC,
	[ID_HH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[hangHoa]    Script Date: 27/12/2023 5:07:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[hangHoa](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ten] [nvarchar](20) NOT NULL,
	[Loai] [nvarchar](20) NOT NULL,
	[giaTien] [int] NOT NULL,
	[gioiTinh] [bit] NOT NULL,
	[ngNhap] [date] NOT NULL,
	[chiTiet] [text] NULL,
	[trangThai] [bit] NULL,
	[url] [text] NULL,
 CONSTRAINT [PK__hoangHoa__3214EC279043AD3A] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[khachHang]    Script Date: 27/12/2023 5:07:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[khachHang](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ho] [nvarchar](30) NOT NULL,
	[ten] [nvarchar](50) NOT NULL,
	[diaChi] [nvarchar](50) NULL,
	[sdt] [nvarchar](20) NOT NULL,
 CONSTRAINT [PK__khachHan__3214EC273A61ABB4] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[nhanVien]    Script Date: 27/12/2023 5:07:26 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nhanVien](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ho] [nvarchar](30) NULL,
	[ten] [nvarchar](50) NULL,
	[SDT] [nvarchar](20) NULL,
	[diaChi] [nvarchar](100) NULL,
	[taiKhoan] [nvarchar](20) NULL,
	[matKhau] [nvarchar](20) NULL,
	[ngSinh] [date] NULL,
	[gioiTinh] [bit] NULL,
	[Luong] [int] NULL,
	[admin] [bit] NULL,
 CONSTRAINT [PK__nhanVien__3214EC2779E52555] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Bill] ON 

INSERT [dbo].[Bill] ([ID_HD], [ID_NV], [ID_KH], [NgMua]) VALUES (2, 1, 2, CAST(N'2003-10-04' AS Date))
INSERT [dbo].[Bill] ([ID_HD], [ID_NV], [ID_KH], [NgMua]) VALUES (8, 4, 6, CAST(N'0199-01-01' AS Date))
INSERT [dbo].[Bill] ([ID_HD], [ID_NV], [ID_KH], [NgMua]) VALUES (17, 1, 1, CAST(N'2023-12-27' AS Date))
SET IDENTITY_INSERT [dbo].[Bill] OFF
GO
INSERT [dbo].[chiTietDonHang] ([ID_HD], [ID_HH]) VALUES (2, 1)
INSERT [dbo].[chiTietDonHang] ([ID_HD], [ID_HH]) VALUES (8, 2)
INSERT [dbo].[chiTietDonHang] ([ID_HD], [ID_HH]) VALUES (8, 9)
INSERT [dbo].[chiTietDonHang] ([ID_HD], [ID_HH]) VALUES (17, 2)
GO
SET IDENTITY_INSERT [dbo].[hangHoa] ON 

INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (1, N'Chó Husky ngáo', N'Chó', 60000, 0, CAST(N'1999-01-01' AS Date), N'', 0, N'')
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (2, N'Mèo Ả Rập', N'Mèo', 10000, 0, CAST(N'1111-09-09' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (4, N'Sư Tủ Trằng', N'Sư Tử', 90000, 1, CAST(N'2003-03-10' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (8, N'Báo Đốm', N'Báo', 2500, 1, CAST(N'1921-05-05' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (9, N'Hà mã Pháp', N'Hà Mã', 3000000, 0, CAST(N'2023-12-08' AS Date), N'', 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (14, N'Gấu trúc Bắc', N'Gấu', 12000000, 1, CAST(N'2023-01-12' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (16, N'Chó sói', N'Chó', 900000, 0, CAST(N'2023-07-12' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (24, N'123', N'123', 123, 1, CAST(N'2003-10-03' AS Date), N'123', 0, N'123')
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (27, N'123', N'123', 123, 1, CAST(N'2003-10-03' AS Date), N'123', 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (58, N'123', N'123', 123, 1, CAST(N'2023-12-12' AS Date), N'123', 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (60, N'123', N'123', 123, 1, CAST(N'2023-12-20' AS Date), N'123', 0, NULL)
SET IDENTITY_INSERT [dbo].[hangHoa] OFF
GO
SET IDENTITY_INSERT [dbo].[khachHang] ON 

INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (1, N'Van', N'Khanh', N'Hồ Chí Minh', N'0971238641')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (2, N'Dao', N'Hoai', N'Ben Tre', N'011111111')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (6, N'Nguyen', N'Tung', N'Ben Tre', N'01123123')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (7, N'Đức', N'Thái', N'Thủ Đức', N'0123523423423')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (8, N'Hồng', N'Nghi', N'Hồ Chí Minh', N'0123456789')
SET IDENTITY_INSERT [dbo].[khachHang] OFF
GO
SET IDENTITY_INSERT [dbo].[nhanVien] ON 

INSERT [dbo].[nhanVien] ([ID], [ho], [ten], [SDT], [diaChi], [taiKhoan], [matKhau], [ngSinh], [gioiTinh], [Luong], [admin]) VALUES (1, N'Ðào Phan Qu?c', N'Hoài', N'111111111', N'Gò V?p', N'admin', N'123', CAST(N'2003-10-03' AS Date), 0, 1000000, 1)
INSERT [dbo].[nhanVien] ([ID], [ho], [ten], [SDT], [diaChi], [taiKhoan], [matKhau], [ngSinh], [gioiTinh], [Luong], [admin]) VALUES (3, N'Nguyễn Khánh', N'Khánh', N'0000000000', N'Thủ Đức', N'vankhanh', N'123', CAST(N'1999-01-01' AS Date), 1, 2000000, NULL)
INSERT [dbo].[nhanVien] ([ID], [ho], [ten], [SDT], [diaChi], [taiKhoan], [matKhau], [ngSinh], [gioiTinh], [Luong], [admin]) VALUES (4, N'Lê', N'Hảo', N'0000000', N'Man Thiện', N'lehao', N'123', CAST(N'2000-01-01' AS Date), 0, 2000000, NULL)
INSERT [dbo].[nhanVien] ([ID], [ho], [ten], [SDT], [diaChi], [taiKhoan], [matKhau], [ngSinh], [gioiTinh], [Luong], [admin]) VALUES (6, N'Hoàng', N'Điệp                          ', N'0111111111', N'Đường số 2', N'dieplien', N'123', CAST(N'2001-01-01' AS Date), 1, 2000, NULL)
INSERT [dbo].[nhanVien] ([ID], [ho], [ten], [SDT], [diaChi], [taiKhoan], [matKhau], [ngSinh], [gioiTinh], [Luong], [admin]) VALUES (9, N'Đào Phan Quốc Hoài', N'Hoài', N'0123123123', N'Gò vấp', N'quochoai2110', N'123', CAST(N'2003-10-03' AS Date), 0, 1000000, NULL)
SET IDENTITY_INSERT [dbo].[nhanVien] OFF
GO
ALTER TABLE [dbo].[Bill]  WITH CHECK ADD  CONSTRAINT [FK_Bill_khachHang] FOREIGN KEY([ID_KH])
REFERENCES [dbo].[khachHang] ([ID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Bill] CHECK CONSTRAINT [FK_Bill_khachHang]
GO
ALTER TABLE [dbo].[Bill]  WITH CHECK ADD  CONSTRAINT [FK_Bill_nhanVien] FOREIGN KEY([ID_NV])
REFERENCES [dbo].[nhanVien] ([ID])
GO
ALTER TABLE [dbo].[Bill] CHECK CONSTRAINT [FK_Bill_nhanVien]
GO
ALTER TABLE [dbo].[chiTietDonHang]  WITH CHECK ADD  CONSTRAINT [FK_chiTietDonHang_Bill] FOREIGN KEY([ID_HD])
REFERENCES [dbo].[Bill] ([ID_HD])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[chiTietDonHang] CHECK CONSTRAINT [FK_chiTietDonHang_Bill]
GO
ALTER TABLE [dbo].[chiTietDonHang]  WITH CHECK ADD  CONSTRAINT [FK_chiTietDonHang_hangHoa] FOREIGN KEY([ID_HH])
REFERENCES [dbo].[hangHoa] ([ID])
GO
ALTER TABLE [dbo].[chiTietDonHang] CHECK CONSTRAINT [FK_chiTietDonHang_hangHoa]
GO
