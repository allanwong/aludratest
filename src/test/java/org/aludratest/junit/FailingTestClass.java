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
package org.aludratest.junit;

import org.aludratest.testcase.AludraTestCase;
import org.aludratest.testcase.Test;

/** Plain AludraTest test class with a method that causes a runtime exception. This is used for testing failure reporting of the
 * JUnit wrapper for AludraTest. */
public class FailingTestClass extends AludraTestCase {

    /** AludraTest test method which raises a RuntimeException carrying the message "This is a failure!" */
    @Test
    public void testWithFailure() {
        newTestStepGroup("group");
        throw new RuntimeException("This is a failure!");
    }
}
