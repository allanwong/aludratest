/*
 * Copyright (C) 2010-2014 Hamburg Sud and the contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.aludratest.scheduler.test.annot;

import org.aludratest.testcase.AludraTestCase;
import org.aludratest.testcase.Test;
import org.aludratest.testcase.TestAttribute;
import org.aludratest.testcase.TestAttributes;

@TestAttributes({ @TestAttribute(name = "author", value = "secondauthor"), @TestAttribute(name = "author", value = "falbrech"),
    @TestAttribute(name = "state", value = "InWork"),
    @TestAttribute(name = "testName", value = "RunnerTreeBuilderImplTest") })
public class AnnotatedTestClass3 extends AludraTestCase {

    @Test
    public void testSth() {

    }

}
