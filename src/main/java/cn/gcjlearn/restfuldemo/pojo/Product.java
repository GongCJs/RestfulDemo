package cn.gcjlearn.restfuldemo.pojo;/**
 * @Auther: GongCJ
 * @Introduce:
 * @Date: 2019-09-06
 * @Description: cn.gcjlearn.restfuldemo.pojo
 * @version: 1.0
 */


import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author ：GongCJ
 * @date ：Created in 2019-09-06 22:06
 * @description：
 * @modified By：
 * @version: $
 */

@Data
@ToString
public class Product implements Serializable {
	/**
	 * ID
	 */
	private Long id;

	/**
	 * 产品名称
	 */
	private String name;

	/**
	 * 产品型号
	 */
	private String productClass;

	/**
	 * 产品ID
	 */
	private String productId;
}
