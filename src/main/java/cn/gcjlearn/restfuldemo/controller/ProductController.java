package cn.gcjlearn.restfuldemo.controller;/**
 * @Auther: GongCJ
 * @Introduce:
 * @Date: 2019-09-06
 * @Description: cn.gcjlearn.restfuldemo.controller
 * @version: 1.0
 */


import cn.gcjlearn.restfuldemo.pojo.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author ：GongCJ
 * @date ：Created in 2019-09-06 22:08
 * @description：
 * @modified By：
 * @version: $
 */

@RestController
@RequestMapping(value = {"/api/product"})
@Api(value = "/product", tags = "Product接口")
public class ProductController {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "根据id获取产品信息", notes = "根据id获取产品信息", httpMethod = "GET", response = Product.class)
	public ResponseEntity<Product> get(@PathVariable Long id) {
		Product product = new Product();
		product.setName("七级滤芯净水器");
		product.setId(1L);
		product.setProductClass("seven_filters");
		product.setProductId("T12345");
		return ResponseEntity.ok(product);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "添加一个新的产品")
	@ApiResponses(value = {@ApiResponse(code = 405, message = "参数错误")})
	public ResponseEntity<String> add(Product product) {
		return ResponseEntity.ok("SUCCESS");
	}

	@RequestMapping(method = RequestMethod.PUT)
	@ApiOperation(value = "更新一个产品")
	@ApiResponses(value = {@ApiResponse(code = 400, message = "参数错误")})
	public ResponseEntity<String> update(Product product) {
		return ResponseEntity.ok("SUCCESS");
	}

}
