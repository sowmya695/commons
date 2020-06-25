package io.mosip.kernel.masterdata.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import io.mosip.kernel.masterdata.validator.FilterType;
import io.mosip.kernel.masterdata.validator.FilterTypeEnum;
import io.mosip.kernel.masterdata.validator.StringFormatter;
import io.mosip.kernel.masterdata.validator.ValidLangCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Srinivasan
 * @since 1.0.0
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationCreateDto {

	private String code;


	@NotNull
	@StringFormatter(min = 0, max = 128)
	private String name;

	@Range(min = 0)
	private short hierarchyLevel;

	@NotNull
	@StringFormatter(min = 0, max = 64)
	private String hierarchyName;

	private String parentLocCode;

	@ValidLangCode(message = "Language Code is Invalid")
	private String langCode;

	@NotNull
	private Boolean isActive;

}
