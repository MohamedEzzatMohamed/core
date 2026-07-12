package com.core.shared.utils

object RootUtil {

  fun isDeviceRooted(): Boolean {
    return checkBuildTags() || checkForSuBinary() || checkForRootApps() || checkSystemPaths()
  }

  private fun checkBuildTags(): Boolean {
    val buildTags = android.os.Build.TAGS
    return buildTags != null && buildTags.contains("test-keys")
  }

  private fun checkForSuBinary(): Boolean {
    val suPaths = arrayOf(
      "/system/bin/su",
      "/system/xbin/su",
      "/sbin/su",
      "/system/su",
      "/system/bin/.ext/su",
      "/system/usr/we-need-root/su.backup",
      "/system/xbin/mu"
    )

    return suPaths.any { path ->
      try {
        val file = java.io.File(path)
        file.exists()
      } catch (e: Exception) {
        false
      }
    }
  }

  private fun checkForRootApps(): Boolean {
    val rootApps = listOf(
      "com.noshufou.android.su",
      "eu.chainfire.supersu",
      "com.koushikdutta.superuser",
      "com.thirdparty.superuser",
      "com.zachspong.temprootremovejb",
      "com.ramdroid.appquarantine"
    )

    return rootApps.any { app ->
      try {
        val pm = android.app.Application().applicationContext.packageManager
        pm.getPackageInfo(app, 0)
        true
      } catch (e: Exception) {
        false
      }
    }
  }

  private fun checkSystemPaths(): Boolean {
    val paths = System.getenv("PATH")?.split(":") ?: return false
    return paths.any { path ->
      try {
        val file = java.io.File(path, "su")
        file.exists()
      } catch (e: Exception) {
        false
      }
    }
  }
}
