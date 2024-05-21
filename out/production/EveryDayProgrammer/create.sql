-- ddl语言

show databases;
-- 显示当前数据库存在哪些表

SELECT database();
-- 显示当前正在使用的是哪些数据库

use yupi;

show tables;

desc test;

show create table test; -- 查询当前表的建表语句

alter table test MODIFY name VARCHAR(255) -- 更改当前这一列的数据类型

alter TABLE test CHANGE name new_name VARCHAR(255) -- 对某一些修改名称
-- 使用modify 修改列明 add 增加一列 change 更换名称

drop table test_new -- 删除当前表

    truncate TABLE test_new -- 删除表

-- 书写顺序

-- select
-- 			字段列表
-- from
-- 			表明
-- where
-- 			条件列表
-- GROUP BY
-- 			分组字段列表
-- HAVING
-- 			分组之后的条件列表
-- ORDER BY
-- 			排序列表
-- LIMIT
-- 			分页参数

SELECT name as new_name from test; -- 设置别名 使用as

SELECT DISTINCT gender FROM test;

desc test;

SELECT * FROM test where gender = 'M';

SELECT * from test WHERE age BETWEEN 25 and 46; -- beterrn and 的使用

SELECT * from test WHERE name LIKE '%es'; -- 模糊查询的使用

SELECT count(name) from test;

SELECT gender,count(gender) from test GROUP BY gender;

-- WHERE和 HAVING 的区别
-- 执行时机不同：where是分组前进行过滤，不满足where条件的不进行参与分组，HAVING
-- 判断条件不同：where不对对聚合函数进行怕那段，但是having可以

SELECT gender,COUNT(gender),avg(age) from test GROUP BY gender HAVING avg(age) > 460;

SELECT * from test ORDER BY age desc LIMIT 0,1;

SELECT CONCAT("123","12");

SELECT test.name,user.age from test as t, user as u where t.name = u.name;
-- 隐式外链接

SELECT test.name,user.age from test as t INNER JOIN user as u on t.name = u.name;
-- 显式内链接 和 隐式链接

SELECT * FROM test where age > 400
UNION
SELECT * from test WHERE age < 400;

# Write your MySQL query statement below

-- select score,
-- ROW_NUMBER() over (order by score desc) as 'rank'
-- from Scores;

-- row_number 使用排序 有相同的值，并不使用同样的排名 over 使用那一列进行排序 as 名称

-- select score,
-- rank() OVER (order by score desc) as 'rank'
-- from Scores;
-- rank 会将相同的值设置成相同的排名 但是之后 排名是不连续的

select score,
       dense_rank() over (order by score desc) as 'rank'
from Scores;
