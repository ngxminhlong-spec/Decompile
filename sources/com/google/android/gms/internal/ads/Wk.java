package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Wk implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7557a;

    /* renamed from: b, reason: collision with root package name */
    public SensorManager f7558b;
    public Sensor c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public int f7559e;

    /* renamed from: f, reason: collision with root package name */
    public Ok f7560f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7561g;

    public Wk(Context context) {
        this.f7557a = context;
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.f7561g) {
                    SensorManager sensorManager = this.f7558b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.c);
                        Q1.I.w("Stopped listening for shake gestures.");
                    }
                    this.f7561g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.T7)).booleanValue()) {
                    if (this.f7558b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f7557a.getSystemService("sensor");
                        this.f7558b = sensorManager2;
                        if (sensorManager2 == null) {
                            Y9.s("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f7561g && (sensorManager = this.f7558b) != null && (sensor = this.c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        N1.n.f1204A.f1212j.getClass();
                        this.d = System.currentTimeMillis() - ((Integer) r1.c.a(AbstractC1066q6.V7)).intValue();
                        this.f7561g = true;
                        Q1.I.w("Listening for shake gestures.");
                    }
                }
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
        C0937n6 c0937n6 = AbstractC1066q6.T7;
        O1.r rVar = O1.r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f4 = fArr[0] / 9.80665f;
            float f5 = fArr[1] / 9.80665f;
            float f6 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f6 * f6) + (f5 * f5) + (f4 * f4))) >= ((Float) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.U7)).floatValue()) {
                N1.n.f1204A.f1212j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d + ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.V7)).intValue() <= currentTimeMillis) {
                    if (this.d + ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.W7)).intValue() < currentTimeMillis) {
                        this.f7559e = 0;
                    }
                    Q1.I.w("Shake detected.");
                    this.d = currentTimeMillis;
                    int i4 = this.f7559e + 1;
                    this.f7559e = i4;
                    Ok ok = this.f7560f;
                    if (ok == null || i4 != ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.X7)).intValue()) {
                        return;
                    }
                    ok.d(new Mk(0), Nk.f6374q);
                }
            }
        }
    }
}
