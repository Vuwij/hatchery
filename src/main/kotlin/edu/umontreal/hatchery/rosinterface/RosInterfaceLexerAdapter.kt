package edu.umontreal.hatchery.rosinterface

import com.intellij.lexer.FlexAdapter

class RosInterfaceLexerAdapter : FlexAdapter(ROSInterfaceLexer(null))