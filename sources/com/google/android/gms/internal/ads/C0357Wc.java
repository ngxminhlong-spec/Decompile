package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Wc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357Wc implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f7457a;
    public final Display c;

    /* renamed from: f, reason: collision with root package name */
    public float[] f7460f;

    /* renamed from: g, reason: collision with root package name */
    public Ur f7461g;

    /* renamed from: h, reason: collision with root package name */
    public C0362Xc f7462h;
    public final float[] d = new float[9];

    /* renamed from: e, reason: collision with root package name */
    public final float[] f7459e = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final Object f7458b = new Object();

    public C0357Wc(Context context) {
        this.f7457a = (SensorManager) context.getSystemService("sensor");
        this.c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public final void a() {
        if (this.f7461g == null) {
            return;
        }
        this.f7457a.unregisterListener(this);
        this.f7461g.post(new RunnableC0286Ib(2));
        this.f7461g = null;
    }

    public final boolean b(float[] fArr) {
        synchronized (this.f7458b) {
            try {
                float[] fArr2 = this.f7460f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i4) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f7458b) {
            try {
                if (this.f7460f == null) {
                    this.f7460f = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SensorManager.getRotationMatrixFromVector(this.d, fArr);
        int rotation = this.c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.d, 2, 129, this.f7459e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.d, 129, 130, this.f7459e);
        } else if (rotation != 3) {
            System.arraycopy(this.d, 0, this.f7459e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.d, 130, 1, this.f7459e);
        }
        float[] fArr2 = this.f7459e;
        float f4 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f4;
        float f5 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f5;
        float f6 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f6;
        synchronized (this.f7458b) {
            System.arraycopy(this.f7459e, 0, this.f7460f, 0, 9);
        }
        C0362Xc c0362Xc = this.f7462h;
        if (c0362Xc != null) {
            c0362Xc.a();
        }
    }
}
