package inventory.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "情報更新")
@Data
public class UpdateReq {

	@ApiModelProperty(value = "id", example = "1")
	private String id;
	@ApiModelProperty(value = "名前", example = "リンゴ")
	private String name;

}
