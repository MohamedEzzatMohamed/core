#include <jni.h>
#include <string>
#include <sys/stat.h>

extern "C"
JNIEXPORT jboolean JNICALL
Java_com_core_shared_utils_RootChecker_00024Companion_isDeviceRootedNative(JNIEnv *env,
                                                                               jobject thiz) {
    const char *paths[] = {
            "/system/app/Superuser.apk",
            "/sbin/su", "/system/bin/su", "/system/xbin/su",
            "/data/local/xbin/su", "/data/local/bin/su",
            "/system/sd/xbin/su", "/system/bin/failsafe/su",
            "/data/local/su"
    };

    for (const char *path: paths) {
        struct stat st;
        if (stat(path, &st) == 0) {
            return JNI_TRUE;
        }
    }
    return JNI_FALSE;
}