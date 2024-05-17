package org.mule.extension.langchain.internal.llm;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.values.OfValues;
import org.mule.runtime.extension.api.annotation.connectivity.*;

/**
 * This class represents an extension configuration, values set in this class are commonly used across multiple
 * operations since they represent something core from the extension.
 */
@Configuration(name="llm-configuration") 
@Operations(LangchainLLMOperations.class)
//@ConnectionProviders(LangchainLLMConnectionProvider.class)
public class LangchainLLMConfiguration {

  @Parameter
  @OfValues(LangchainLLMParameterProvider.class)
  private String llmType;
  
  @Parameter
  private String llmApiKey;

  public String getLlmType(){
    return llmType;
  }
  
  public String getLlmApiKey() {
	  return llmApiKey;
  }
}