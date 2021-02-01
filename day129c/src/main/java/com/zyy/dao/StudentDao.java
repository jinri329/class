package com.zyy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zyy.bean.Student;

/**
 * 
 * mybatis映射文件规则：
 * 	1 想要mybatis映射文件生效 必须映射文件的名称和接口同名
 * 2 映射文件不一定放在接口之下 看spring的配置文件是写的那个位置 就是扫描包的位置
 * 3 mybatis映射文件里面一个属性namespace一定要写dao层接口的全类名
 * 4 在映射文件里面写mybatis的标签 在标签里面写SQL语句 就能完成了
 * 5 每一个标签都有id id就是方法名
 * 
 */
//这里以后不用加注解 没有实现类
public interface StudentDao {
	/**
	 * mybatis使用注解模式时 就不用写映射文件
	 * 直接在方法上写注解以及sql语句
	 * 增删改查都可以加注解 只能用于简单sql语句
	 * 动态sql和多表查询的时候 就用映射文件更简单方便
	 */
	//@Select("sql语句")
	List<Student> findStudentAll();
	List<Student> findOneStudent(Integer id);
	int addStudent(Student s);
	int delStudent(Integer id);
	int updateStudent(Student s);
	List<Student> findLikeByName(String name);
	List<Student> findStudentBySearch(Student s);
	//注解模式的mybatis
	int delStudentById(@Param("ids")List<Integer> ids);
}
