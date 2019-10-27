package inventory.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import inventory.data.DeleteReq;
import inventory.data.EntryReq;
import inventory.data.GootsParamRes;
import inventory.data.StockChangeReq;
import inventory.data.StockRes;
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
	public List<StockRes> getStockList() {
		return null;
	}

	@ApiOperation(
		    value = "在庫登録情報",
		    notes = "新規在庫の情報を入力し、登録します。*IDは自動採番"
		)
	@PostMapping("/entry")
	public void entry(@RequestBody EntryReq req) {
	}

	@ApiOperation(
		    value = "在庫登録情報消去",
		    notes = "指定した在庫名の登録情報を消去します。"
		)
	@PostMapping("/delete")
	public void delete(@RequestBody DeleteReq req) {
	}

	@ApiOperation(
		    value = "品物情報",
		    notes = "指定した在庫名の品物の情報を取得します。"
		)
	@PostMapping("/gootsparam")
	public List<GootsParamRes> getGootsParamList() {
		return null;
	}

	@ApiOperation(
		    value = "品目情報更新",
		    notes = "指定した在庫名の品物の情報を更新します。"
		)
	@PostMapping("/update")
	public void getUpDateResList() {
	}

	@ApiOperation(
		    value = "在庫増減",
		    notes = "指定した在庫名の品物の在庫数を増減させます。負の数の場合に、減少させます。"
		)
	@PostMapping("/change")
	public void changeStock(@RequestBody StockChangeReq req) {
	}
}