package com.gorter.myquizapp.tests

import org.junit.runner.RunWith
import org.junit.runners.Suite

/**
 * Organising test classes into test suite.
 */
@RunWith(Suite::class)
@Suite.SuiteClasses(
    ClickViewActionsTest::class,
    TextViewActionsTest::class
)
class TestSuiteSample {}