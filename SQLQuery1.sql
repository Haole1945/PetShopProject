USE [QuanLyPetShop]
GO


DELETE FROM [dbo].[chiTietDonHang];
DELETE FROM [dbo].[Bill];
GO


DELETE FROM [dbo].[hangHoa];
GO

SET IDENTITY_INSERT [dbo].[hangHoa] ON 
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (1, N'Chó Husky ngáo', N'Chó', 60000, 0, CAST(N'1999-01-01' AS Date), N'', 0, N'')
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (2, N'Mèo Ả Rập', N'Mèo', 10000, 0, CAST(N'1111-09-09' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (4, N'Sư Tủ Trằng', N'Sư Tử', 90000, 1, CAST(N'2003-03-10' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (8, N'Báo Đốm', N'Báo', 2500, 1, CAST(N'1921-05-05' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (9, N'Hà mã Pháp', N'Hà Mã', 3000000, 0, CAST(N'2023-12-08' AS Date), N'', 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (14, N'Gấu trúc Bắc', N'Gấu', 12000000, 1, CAST(N'2023-01-12' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (16, N'Chó sói', N'Chó', 900000, 0, CAST(N'2023-07-12' AS Date), NULL, 0, NULL)

INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (19, N'Chó Alaska', N'Chó', 9000000, 0, CAST(N'2023-07-20' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (20, N'Chó Pug', N'Chó', 2900000, 0, CAST(N'2023-07-30' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (21, N'Chó Lập Xưởng', N'Chó', 1200000, 0, CAST(N'2023-07-12' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (23, N'Chó Shiba', N'Chó', 40000000, 1, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (25, N'Chó Shiba', N'Chó', 40000000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (26, N'Chó Ngao Tây Tạng', N'Chó', 40000000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (28, N'Chó Phú Quốc', N'Chó', 1000000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (29, N'Chó Phú Quốc', N'Chó', 900000, 1, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (30, N'Chó Phú Quốc', N'Chó', 1200000, 1, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (31, N'Chó Phú Quốc', N'Chó', 1000000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (32, N'Chó Phú Quốc', N'Chó', 1300000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (33, N'Chó Phú Quốc', N'Chó', 1000000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (34, N'Chó Phú Quốc', N'Chó', 1000000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (35, N'Mèo Anh Lông Ngắn', N'Mèo', 20000000, 1, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (36, N'Mèo Xiêm', N'Mèo', 2000000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (37, N'Mèo Anh Lông Ngắn', N'Mèo', 11000000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (38, N'Mèo Anh Lông Ngắn', N'Mèo', 21000000, 1, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (39, N'Mèo Anh Lông Ngắn', N'Mèo', 16000000, 1, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (40, N'Mèo Anh Lông Ngắn', N'Mèo', 18000000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (41, N'Mèo Anh Lông Ngắn', N'Mèo', 20000000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (42, N'Mèo Xiêm', N'Mèo', 2000000, 1, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (43, N'Mèo Xiêm', N'Mèo', 1200000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (44, N'Mèo Ta Tam Thể', N'Mèo', 200000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (45, N'Mèo Ta Tam Thể', N'Mèo', 200000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (46, N'Mèo Chân Ngắn', N'Mèo', 50000000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (48, N'Mèo Mướp', N'Mèo', 110000, 1, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (49, N'Mèo Mướp', N'Mèo', 200000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (52, N'Mèo Mướp', N'Mèo', 100000, 1, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (55, N'Mèo Mướp', N'Mèo', 210000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (56, N'Mèo BeLi', N'Mèo', 20000000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (57, N'Mèo Nga mắt xanh', N'Mèo', 12000000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (58, N'Chó sói', N'Chó', 900000, 0, CAST(N'2023-07-12' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (60, N'Chó Alaska', N'Chó', 9000000, 0, CAST(N'2023-07-20' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (62, N'Chó Pug', N'Chó', 2900000, 0, CAST(N'2023-07-30' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (65, N'Chó Lập Xưởng', N'Chó', 1200000, 0, CAST(N'2023-07-12' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (66, N'Chó Shiba', N'Chó', 40000000, 1, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
INSERT [dbo].[hangHoa] ([ID], [Ten], [Loai], [giaTien], [gioiTinh], [ngNhap], [chiTiet], [trangThai], [url]) VALUES (67, N'Chó Shiba', N'Chó', 40000000, 0, CAST(N'2023-12-27' AS Date), NULL, 0, NULL)
SET IDENTITY_INSERT [dbo].[hangHoa] OFF
GO

DELETE FROM [dbo].[khachHang];
GO

SET IDENTITY_INSERT [dbo].[khachHang] ON 
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (1, N'Nguyen Quoc', N'Khanh', N'Phường X, TP.Thủ Đức, Hồ Chí Minh', N'0971238641')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (2, N'Nguyen Kim', N'Viên', N'Phường X1, TP.Thủ Đức, Hồ Chí Minh', N'0973386413')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (3, N'Nguyen Văn', N'Tư', N'Phường PB, TP.Thủ Đức, Hồ Chí Minh', N'0971238323')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (6, N'Nguyễn Hoang', N'Giang', N'Phường X, TP.Thủ Đức, Hồ Chí Minh', N'0971238333')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (5, N'Hồ Thị', N'Ngân',N'Phường X, Q1, Hồ Chí Minh', N'0971238323')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (7, N'Nguyen Trung', N'Hải', N'Phường X, TP.Thủ Đức, Hồ Chí Minh', N'0971232641')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (8, N'Trần Hoài', N'Bảo', N'Phường X1, TP.Thủ Đức, Hồ Chí Minh', N'0973381413')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (10, N'Lê Văn', N'Chính', N'Phường PB, TP.Thủ Đức, Hồ Chí Minh', N'0791238323')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (20, N'Hoàng Lê', N'Giang', N'Phường X, TP.Thủ Đức, Hồ Chí Minh', N'0971218333')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (30, N'Lê', N'Vân',N'Phường X, Q1, Hồ Chí Minh', N'0978238323')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (22, N'Quoc', N'Khanh', N'Phường X, TP.Thủ Đức, Hồ Chí Minh', N'0971266641')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (23, N'Nguyễn Kim', N'Viên', N'Phường X1, Q7, Hồ Chí Minh', N'0973333333')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (24, N'Nguyễn Văn', N'Tư', N'Phường PB, TP.Thủ Đức, Hồ Chí Minh', N'0971238323')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (25, N'Nguyen Hoang', N'Phúc', N'Phường X, TP.Thủ Đức, Hồ Chí Minh', N'0971222333')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (12, N'Hồ Lê', N'Hường',N'Phường X, Q1, Hồ Chí Minh', N'0971238323')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (13, N'Nguyễn Trung', N'Hải', N'Phường X, TP.Thủ Đức, Hồ Chí Minh', N'0971232641')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (14, N'Trần Hoài', N'Bảo', N'Phường X1, TP.Thủ Đức, Hồ Chí Minh', N'0973381413')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (15, N'Lê Văn', N'Chính', N'Phường PB, TP.Thủ Đức, Hồ Chí Minh', N'0791238323')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (16, N'Hoàng Lê', N'Giang', N'Phường X, TP.Thủ Đức, Hồ Chí Minh', N'0871218333')
INSERT [dbo].[khachHang] ([ID], [ho], [ten], [diaChi], [sdt]) VALUES (17, N'Trần', N'Phú',N'Phường X, Q8, Hồ Chí Minh', N'0878238323')
SET IDENTITY_INSERT [dbo].[khachHang] OFF
GO