package inventory.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "消去")
@Data
public class DeleteReq {

	@ApiModelProperty(value = "名前", example = "リンゴ")
	private String name;

}