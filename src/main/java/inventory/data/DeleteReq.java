package inventory.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "消去")
@Data
public class DeleteReq {

	@ApiModelProperty(value = "id", example = "1")
	private int id;

}