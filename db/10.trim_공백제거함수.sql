/*
	trim - (맨 앞 또는 맨 뒤의) 문자열 공백 없애기
    ltrim - 왼쪽에 있는 공백만 없앰
    rtrim - 오른쪽에 있는 공백만 없앰
     
*/
select ('   HELLO   MYSQL   ') as tmp;
select trim('   HELLO   MYSQL   ') as tmp;
select ltrim('   HELLO   MYSQL   ') as tmp;
select rtrim('   HELLO   MYSQL   ') as tmp;

select trim(leading'!' from  '!!!!HELLO   MYSQL!!!!');
select trim(trailing'!' from  '!!!!HELLO   MYSQL!!!!');



