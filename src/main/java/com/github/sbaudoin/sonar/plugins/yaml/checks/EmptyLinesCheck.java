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
package com.github.sbaudoin.sonar.plugins.yaml.checks;

import org.sonar.check.Rule;
import org.sonar.check.RuleProperty;

@Rule(key = "EmptyLinesCheck")
public class EmptyLinesCheck extends YamlLintCheck {
    @RuleProperty(key = "max", description = "Maximal number of consecutive empty lines allowed in the document", defaultValue = "2")
    int max;

    @RuleProperty(key = "max-start", description = "Maximal number of empty lines allowed at the beginning of the file. This option takes precedence over max.", defaultValue = "0")
    int maxStart;

    @RuleProperty(key = "max-end", description = "Maximal number of empty lines allowed at the end of the file. This option takes precedence over max.", defaultValue = "0")
    int maxEnd;
}
