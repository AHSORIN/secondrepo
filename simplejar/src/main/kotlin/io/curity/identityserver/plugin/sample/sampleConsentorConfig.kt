package io.curity.identityserver.plugin.sample

import se.curity.identityserver.sdk.config.Configuration
import se.curity.identityserver.sdk.config.annotation.Description

interface sampleConsentorConfig: Configuration
{
    @Description("A parameter used for demo purposes")
    fun getDemoParameter(): Int
}
