package inventory.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.data.Stock;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("在庫の情報を管理するAPI")
@RestController()
public class InventoryController {

	@ApiOperation(
		    value = "在庫一覧取得",
		    notes = "在庫の一覧を取得します。"
		)
	@GetMapping("/stock")
	public List<Stock> getStockList() {
		return null;
}
}
