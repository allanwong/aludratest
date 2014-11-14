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
package org.aludratest.codecheck.rule.pmd.page;

import net.sourceforge.pmd.Report;

import org.aludratest.codecheck.rule.pmd.AbstractPmdTestCase;
import org.aludratest.codecheck.rule.pmd.page.PageImportRestriction;
import org.junit.Test;
import org.test.testclasses.page.InvalidPage;
import org.test.testclasses.page.ValidPageChild;

public class PageImportRestrictionTest extends AbstractPmdTestCase {

    @Test
    public void testInvalidClass() {
        Report report = runPmdTest(InvalidPage.class, new PageImportRestriction());
        assertReportViolations(report, 1);
        assertReportViolationLine(report, 0, 18);
    }

    @Test
    public void testValidClass() {
        Report report = runPmdTest(ValidPageChild.class, new PageImportRestriction());
        assertReportViolations(report, 0);
    }

}
