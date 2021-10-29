package io.curity.identityserver.plugin.sample

import se.curity.identityserver.sdk.plugin.descriptor.ConsentorPluginDescriptor

class sampleConsentorDescriptor: ConsentorPluginDescriptor<sampleConsentorConfig>
{
    override fun getConsentorType() = sampleConsentor::class.java

    override fun getPluginImplementationType() = "sample"

    override fun getConfigurationType() = sampleConsentorConfig::class.java
}
