package org.mule.extension.mulechain.internal.helpers;

import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.values.OfValues;

public class fileTypeParameters {
	@Parameter
	@Expression(ExpressionSupport.SUPPORTED)
	@OfValues(fileTypeEmbedding.class)
	@Optional(defaultValue = "text")
	private String fileType;

	public String getFileType() {
		return fileType;
	}
    
}
