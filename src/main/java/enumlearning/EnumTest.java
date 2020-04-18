package enumlearning;
/**
 * 
 * @author Joe
 *	枚举类型
	●枚举变量:变量的取值只在一个有限的集合内
	如性别、星期几、颜色等
	●Java5推出enum类型
	enum关键字声明枚举类，且都是Enum的子类(但不需写extends)
	-enum内部有多少个值，就有多少个实例对象
	-不能直接new枚举类对象
	
	-===========================-
	
	●Java的enum类型
	-所有的enum类型都是Enum的子类，也继承了相应方法
	- ordinal(返回枚举值所在的索引位置,从0开始
	- comparcTo0比较两个枚举值的索引位置大小
	- toString()返 回枚举值的字符串表示
	- valueOf0将字符串初始化为枚举对象
	- values(返回所有的枚举值
 */
public class EnumTest {

}
