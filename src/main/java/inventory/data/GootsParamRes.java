package inventory.data;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "在庫")
@Data
public class GootsParamRes {

	@ApiModelProperty(value = "id", example = "2")
	private int id;
	@ApiModelProperty(value = "名前", example = "リンゴ")
	private String name;
	@ApiModelProperty(value = "在庫数", example = "10")
	private Integer stockNum;
	@ApiModelProperty(value = "更新時間", example = "2019-11-17 18:58:58")
	private Date upDateTime;

}
