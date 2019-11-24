package inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.data.DeleteReq;
import inventory.data.EntryReq;
import inventory.data.GootsParamRes;
import inventory.data.StockChangeReq;
import inventory.data.StockRes;
import inventory.data.UpdateReq;
import inventory.service.DeleteReqService;
import inventory.service.EntryReqService;
import inventory.service.GootsParamService;
import inventory.service.StockChangeService;
import inventory.service.StockListService;
import inventory.service.UpDateService;
import inventory.service.UpdateStockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("在庫の情報を管理するAPI")
@RestController
@RequestMapping(value = "inventory")
public class InventoryController {

	@Autowired
	private StockListService stockService;
	@Autowired
	private EntryReqService entryReqService;
	@Autowired
	private DeleteReqService deleteReqService;
	@Autowired
	private GootsParamService gootsParamService;
	@Autowired
	private UpDateService upDateService;
	@Autowired
	private StockChangeService stockChangeService;
	@Autowired
	private  UpdateStockService updateStockService;

	@ApiOperation(value = "在庫一覧取得", notes = "在庫の一覧を取得します。")
	@GetMapping("/stock")
	public List<StockRes> getStockList() {
		return this.stockService.getStockList();
	}

	@ApiOperation(value = "在庫登録情報", notes = "新規在庫の情報を入力し、登録します。*IDは自動採番")
	@PostMapping("/entry")
	//引数の@RequestBodyを除去、コンテンツタイプがapplication / x-www-form-urlencodedであるため
	//Testの際はまたつける
	public void entry(@RequestBody EntryReq req) {
		String name = req.getName();
		int stockNum = req.getStockNum();
		this.entryReqService.entryReq(name,stockNum);
	}

	@ApiOperation(value = "在庫登録情報消去", notes = "指定した在庫名の登録情報を消去します。")
	@PostMapping("/delete")
	public void delete(@RequestBody DeleteReq req) {
		this.deleteReqService.deleteReq(req.getId());
	}

	@ApiOperation(value = "品物詳細取得", notes = "指定したＩＤの品物の情報を取得します。")
	@GetMapping("/gootsparam")
	public GootsParamRes getGootsParam(@RequestBody Integer id) {
		return this.gootsParamService.gootsParamReq(id);
	}

	@ApiOperation(value = "品目情報更新", notes = "指定したＩＤの品物の情報を更新します。")
	@PostMapping("/update")
	public void upDate(@RequestBody UpdateReq req) {
		this.upDateService.upDateService(req.getId(),req.getName());
	}

	@ApiOperation(value = "在庫増減", notes = "指定した在庫idの品物の在庫数を増減させます。負の数の場合は減少させます。")
	@PostMapping("/change")
	public void changeStock(@RequestBody StockChangeReq req) {
		this.stockChangeService.stockChange(req.getId(),req.getSumValue());
	}

	@ApiOperation(value = "在庫数更新", notes = "指定した在庫idの品物の在庫数を更新します。")
	@PostMapping("/updatestock")
	public void updateStock(@RequestBody StockChangeReq req) {
		this.updateStockService.updateStock(req.getId(),req.getSumValue());
	}

}