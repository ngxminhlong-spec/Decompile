package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Xc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362Xc extends Thread implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: P, reason: collision with root package name */
    public static final float[] f7627P = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A, reason: collision with root package name */
    public int f7628A;

    /* renamed from: B, reason: collision with root package name */
    public SurfaceTexture f7629B;

    /* renamed from: C, reason: collision with root package name */
    public SurfaceTexture f7630C;

    /* renamed from: D, reason: collision with root package name */
    public int f7631D;

    /* renamed from: E, reason: collision with root package name */
    public int f7632E;

    /* renamed from: F, reason: collision with root package name */
    public int f7633F;

    /* renamed from: G, reason: collision with root package name */
    public final FloatBuffer f7634G;

    /* renamed from: H, reason: collision with root package name */
    public final CountDownLatch f7635H;

    /* renamed from: I, reason: collision with root package name */
    public final Object f7636I;

    /* renamed from: J, reason: collision with root package name */
    public EGL10 f7637J;

    /* renamed from: K, reason: collision with root package name */
    public EGLDisplay f7638K;

    /* renamed from: L, reason: collision with root package name */
    public EGLContext f7639L;

    /* renamed from: M, reason: collision with root package name */
    public EGLSurface f7640M;
    public volatile boolean N;

    /* renamed from: O, reason: collision with root package name */
    public volatile boolean f7641O;

    /* renamed from: o, reason: collision with root package name */
    public final C0357Wc f7642o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f7643p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f7644q;

    /* renamed from: r, reason: collision with root package name */
    public final float[] f7645r;

    /* renamed from: s, reason: collision with root package name */
    public final float[] f7646s;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f7647t;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f7648u;

    /* renamed from: v, reason: collision with root package name */
    public final float[] f7649v;

    /* renamed from: w, reason: collision with root package name */
    public float f7650w;

    /* renamed from: x, reason: collision with root package name */
    public float f7651x;
    public float y;

    /* renamed from: z, reason: collision with root package name */
    public int f7652z;

    public C0362Xc(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f7634G = asFloatBuffer;
        asFloatBuffer.put(f7627P).position(0);
        this.f7643p = new float[9];
        this.f7644q = new float[9];
        this.f7645r = new float[9];
        this.f7646s = new float[9];
        this.f7647t = new float[9];
        this.f7648u = new float[9];
        this.f7649v = new float[9];
        this.f7650w = Float.NaN;
        C0357Wc c0357Wc = new C0357Wc(context);
        this.f7642o = c0357Wc;
        c0357Wc.f7462h = this;
        this.f7635H = new CountDownLatch(1);
        this.f7636I = new Object();
    }

    public static final void f(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + glGetError);
        }
    }

    public static final void g(float[] fArr, float[] fArr2, float[] fArr3) {
        float f4 = fArr2[0] * fArr3[0];
        float f5 = fArr2[1];
        float f6 = fArr3[3];
        float f7 = fArr2[2];
        float f8 = fArr3[6];
        fArr[0] = f4 + (f5 * f6) + (f7 * f8);
        float f9 = fArr2[0];
        float f10 = fArr3[1] * f9;
        float f11 = fArr3[4];
        float f12 = fArr3[7];
        fArr[1] = f10 + (f5 * f11) + (f7 * f12);
        float f13 = f9 * fArr3[2];
        float f14 = fArr2[1];
        float f15 = fArr3[5];
        float f16 = fArr3[8];
        fArr[2] = f13 + (f14 * f15) + (f7 * f16);
        float f17 = fArr2[3];
        float f18 = fArr3[0];
        float f19 = fArr2[4];
        float f20 = fArr2[5];
        fArr[3] = (f17 * f18) + (f6 * f19) + (f20 * f8);
        float f21 = fArr2[3];
        float f22 = fArr3[1];
        fArr[4] = (f21 * f22) + (f19 * f11) + (f20 * f12);
        float f23 = fArr3[2];
        fArr[5] = (f21 * f23) + (fArr2[4] * f15) + (f20 * f16);
        float f24 = fArr2[6] * f18;
        float f25 = fArr2[7];
        float f26 = fArr3[3] * f25;
        float f27 = fArr2[8];
        fArr[6] = f24 + f26 + (f8 * f27);
        float f28 = fArr2[6];
        float f29 = f12 * f27;
        fArr[7] = f29 + (f25 * fArr3[4]) + (f22 * f28);
        fArr[8] = (f28 * f23) + (fArr2[7] * fArr3[5]) + (f27 * f16);
    }

    public static final void h(float[] fArr, float f4) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f4;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    public static final void i(float[] fArr, float f4) {
        double d = f4;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int j(String str, int i4) {
        int glCreateShader = GLES20.glCreateShader(i4);
        f("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            f("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            f("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            f("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i4 + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                f("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final void a() {
        synchronized (this.f7636I) {
            this.f7636I.notifyAll();
        }
    }

    public final void b(int i4, int i5) {
        synchronized (this.f7636I) {
            this.f7628A = i4;
            this.f7652z = i5;
            this.N = true;
            this.f7636I.notifyAll();
        }
    }

    public final void c() {
        synchronized (this.f7636I) {
            this.f7641O = true;
            this.f7630C = null;
            this.f7636I.notifyAll();
        }
    }

    public final void d(float f4, float f5) {
        int i4 = this.f7628A;
        int i5 = this.f7652z;
        if (i4 <= i5) {
            i4 = i5;
        }
        float f6 = i4;
        this.f7651x -= (f4 * 1.7453293f) / f6;
        float f7 = this.y - ((f5 * 1.7453293f) / f6);
        this.y = f7;
        if (f7 < -1.5707964f) {
            this.y = -1.5707964f;
            f7 = -1.5707964f;
        }
        if (f7 > 1.5707964f) {
            this.y = 1.5707964f;
        }
    }

    public final void e() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f7640M;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.f7637J.eglMakeCurrent(this.f7638K, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f7637J.eglDestroySurface(this.f7638K, this.f7640M);
            this.f7640M = null;
        }
        EGLContext eGLContext = this.f7639L;
        if (eGLContext != null) {
            this.f7637J.eglDestroyContext(this.f7638K, eGLContext);
            this.f7639L = null;
        }
        EGLDisplay eGLDisplay = this.f7638K;
        if (eGLDisplay != null) {
            this.f7637J.eglTerminate(eGLDisplay);
            this.f7638K = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f7633F++;
        synchronized (this.f7636I) {
            this.f7636I.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a2  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0362Xc.run():void");
    }
}
