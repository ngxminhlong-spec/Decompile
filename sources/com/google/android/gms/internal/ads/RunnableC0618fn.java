package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0618fn implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f8735u = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: o, reason: collision with root package name */
    public final Handler f8736o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f8737p = new int[1];

    /* renamed from: q, reason: collision with root package name */
    public EGLDisplay f8738q;

    /* renamed from: r, reason: collision with root package name */
    public EGLContext f8739r;

    /* renamed from: s, reason: collision with root package name */
    public EGLSurface f8740s;

    /* renamed from: t, reason: collision with root package name */
    public SurfaceTexture f8741t;

    public RunnableC0618fn(Handler handler) {
        this.f8736o = handler;
    }

    public final void a(int i4) {
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        Zf.D("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr = new int[2];
        Zf.D("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        this.f8738q = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f8735u, 0, eGLConfigArr, 0, 1, iArr2, 0);
        Zf.D(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f8738q, eGLConfig, EGL14.EGL_NO_CONTEXT, i4 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        Zf.D("eglCreateContext failed", eglCreateContext != null);
        this.f8739r = eglCreateContext;
        EGLDisplay eGLDisplay = this.f8738q;
        if (i4 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i4 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            Zf.D("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        Zf.D("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        this.f8740s = eglCreatePbufferSurface;
        int[] iArr3 = this.f8737p;
        GLES20.glGenTextures(1, iArr3, 0);
        Zf.l();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        this.f8741t = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void b() {
        this.f8736o.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f8741t;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f8737p, 0);
            }
            EGLDisplay eGLDisplay = this.f8738q;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f8738q;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f8740s;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f8738q, this.f8740s);
            }
            EGLContext eGLContext = this.f8739r;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f8738q, eGLContext);
            }
            int i4 = AbstractC0751is.f9071a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f8738q;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f8738q);
            }
            this.f8738q = null;
            this.f8739r = null;
            this.f8740s = null;
            this.f8741t = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f8738q;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f8738q;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f8740s;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f8738q, this.f8740s);
            }
            EGLContext eGLContext2 = this.f8739r;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f8738q, eGLContext2);
            }
            int i5 = AbstractC0751is.f9071a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f8738q;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f8738q);
            }
            this.f8738q = null;
            this.f8739r = null;
            this.f8740s = null;
            this.f8741t = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f8736o.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f8741t;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
