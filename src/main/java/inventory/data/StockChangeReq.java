package inventory.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "在庫増減リクエスト")
@Data
public class StockChangeReq {

	@ApiModelProperty(value = "id", example = "1")
	private String id;

	@ApiModelProperty(value = "加算数量", example = "1")
	private int sumValue;

}
