/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.module.extension.vegan;

import static org.mule.runtime.module.extension.vegan.VeganExtension.BANANA;
import org.mule.extension.api.annotation.Configuration;
import org.mule.extension.api.annotation.Operations;
import org.mule.extension.api.annotation.connector.Providers;

@Configuration(name = BANANA)
@Operations(EatBananaOperation.class)
@Providers(VeganBananaConnectionProvider.class)
public class BananaConfig
{

}