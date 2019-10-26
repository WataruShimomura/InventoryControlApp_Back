package inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.data.ApiSampleRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;

@Api("在庫の情報を管理するAPI")
@RestController()

public class InventoryController {

	@ApiOperation(
		    value = "",
		    notes = ""
		)
	@ApiResponse(code = 200, message = "", response = )
	@GetMapping("")
	public ApiSampleRes testAPI(@ApiParam("") String param) {
		return null;
}
}
