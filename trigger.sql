-- trigger bat loi khi trung gmail khi them account
create  trigger add_Account on Accounts after insert 
 as
 begin
     if(exists (select * from Accounts where [gmail] in 
	 (select distinct [gmail] from inserted) 
	 and [userID] not in (select [userID] from inserted) ))
	 begin
	 print 'Loi: Ton tai gmail'
	 rollback transaction 
	 end
 end
 --Trigger bat loi khi trung username khi them admin
create trigger Add_Admin on adminAccount after insert as
begin
   if (exists (select * from adminAccount where adUsername in
   (select distinct adUsername from inserted) 
	 and [adminId] not in (select [adminId] from inserted)
   ))
   begin
       print 'Loi'
	   rollback transaction 
   end
end
-- triiger bat loi khi trung ten danh muc khi them danh muc 
create trigger add_Cimages on cImages after insert as
begin
   if(exists (select * from cImages where cname in 
	 (select distinct cname from inserted) 
	 and idCategory not in (select idCategory from inserted) ))
	 begin
	 print 'Loi: Ton tai gmail'
	 rollback transaction 
	 end
  
end
-- triiger bat loi khi trung ten danh muc khi update danh muc
create trigger update_Cimages on cImages after update as
begin
   if(exists (select * from cImages where cname in 
	 (select distinct cname from inserted) 
	 and idCategory not in (select idCategory from inserted) ))
	 begin
	 print 'Loi: Ton tai gmail'
	 rollback transaction 
	 end
  
end