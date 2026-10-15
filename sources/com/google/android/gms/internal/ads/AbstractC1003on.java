package com.google.android.gms.internal.ads;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.on, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1003on {
    public static int a() {
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        Zf.l();
        return iArr[0];
    }

    public static EGLContext b(EGLContext eGLContext, EGLDisplay eGLDisplay, int i4, int[] iArr) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, l(eGLDisplay, iArr), eGLContext, new int[]{12440, i4, 12344}, 0);
        if (eglCreateContext != null) {
            Zf.l();
            return eglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new Exception(U.a.i("eglCreateContext() failed to create a valid context. The device may not support EGL version ", i4));
    }

    public static EGLContext c() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay d() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        Zf.D("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        Zf.D("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        Zf.l();
        return eglGetDisplay;
    }

    public static EGLSurface e(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, l(eGLDisplay, iArr), iArr2, 0);
        g("Error creating a new EGL Pbuffer surface");
        return eglCreatePbufferSurface;
    }

    public static EGLSurface f(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, l(eGLDisplay, iArr), obj, iArr2, 0);
        g("Error creating a new EGL surface");
        return eglCreateWindowSurface;
    }

    public static void g(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new Exception(n0.a.i(str, ", error code: 0x", Integer.toHexString(eglGetError)));
        }
    }

    public static void h(EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (eGLDisplay == null) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        g("Error releasing context");
        if (eGLContext != null) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            g("Error destroying context");
        }
        EGL14.eglReleaseThread();
        g("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        g("Error terminating display");
    }

    public static void i(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        if (eGLDisplay == null || eGLSurface == null) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        g("Error destroying surface");
    }

    public static void j(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i4, int i5, int i6) {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        g("Error making context current");
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i4) {
            GLES20.glBindFramebuffer(36160, i4);
        }
        Zf.l();
        GLES20.glViewport(0, 0, i5, i6);
        Zf.l();
    }

    public static boolean k(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    private static EGLConfig l(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new Exception("eglChooseConfig failed.");
    }
}
