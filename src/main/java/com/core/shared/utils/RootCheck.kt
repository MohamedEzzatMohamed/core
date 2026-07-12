package com.core.shared.utils

class RootChecker {
  companion object {
    init {
      System.loadLibrary("native-lib")
    }

    external fun isDeviceRootedNative(): Boolean
  }
}