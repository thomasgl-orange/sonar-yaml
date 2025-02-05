/**
 * Copyright (c) 2018-2023, Sylvain Baudoin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.sbaudoin.sonar.plugins.yaml;

import junit.framework.TestCase;
import org.sonar.api.Plugin;
import org.sonar.api.SonarEdition;
import org.sonar.api.SonarQubeSide;
import org.sonar.api.internal.SonarRuntimeImpl;
import org.sonar.api.utils.Version;

public class YamlPluginTest extends TestCase {
    public void testExtensionCounts() {
        Plugin.Context context = new Plugin.Context(SonarRuntimeImpl.forSonarQube(Version.create(6, 2), SonarQubeSide.SERVER, SonarEdition.COMMUNITY));
        new YamlPlugin().define(context);
        assertEquals(7, context.getExtensions().size());
    }

    public void testExtensionCountsWithYamlBuiltinSupport() {
        Plugin.Context context = new Plugin.Context(SonarRuntimeImpl.forSonarQube(YamlPlugin.SONARQUBE_WITH_YAML_SUPPORT_VERSION, SonarQubeSide.SERVER, SonarEdition.COMMUNITY));
        new YamlPlugin().define(context);
        assertEquals(5, context.getExtensions().size());
    }
}
