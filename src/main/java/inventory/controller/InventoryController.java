package inventory.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.data.ChangeReq;
import inventory.data.DeleteReq;
import inventory.data.EntryReq;
import inventory.data.GootsParamRes;
import inventory.data.StockRes;
import inventory.data.UpDateRes;
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
		    value = "在庫の登録",
		    notes = "以下情報を入力し在庫の登録を行います。"
		    		+ "・在庫名"
		    		+ "・在庫数"
		    		+ "※IDは自動採番"
		    		+ "※同名の在庫名は情報を更新"
		)
	@GetMapping("/entry")
	public List<EntryReq> getEntryList() {
		return null;
	}

	@ApiOperation(
		    value = "在庫の登録情報を消去",
		    notes = "指定した在庫名の登録情報を消去します。"
		)
	@GetMapping("/delete")
	public List<DeleteReq> getDeleteReqList() {
		return null;
	}

	@ApiOperation(
		    value = "品物の情報を取得",
		    notes = "指定した在庫名の品物の情報を取得します。"
		    		+ "・在庫名"
		    		+ "・在庫数"
		)
	@GetMapping("/gootsparam")
	public List<GootsParamRes> getGootsParamList() {
		return null;
	}

	@ApiOperation(
		    value = "品物の情報を取得",
		    notes = "指定した在庫名の品物の情報を更新します。"
		    		+ "・在庫名"
		    		+ "・在庫数"
		)
	@GetMapping("/update")
	public List<UpDateRes> getUpDateResList() {
		return null;
	}

	@ApiOperation(
		    value = "品物の在庫数を増減させる",
		    notes = "指定した在庫名の品物の在庫数を増減させます。"
		    		+ "・在庫名"
		    		+ "・在庫数"
		)
	@GetMapping("/change")
	public List<ChangeReq> getChangeReqList() {
		return null;
	}
}