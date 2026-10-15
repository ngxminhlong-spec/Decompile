package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ek implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f4915a;

    /* renamed from: b, reason: collision with root package name */
    public final Sensor f4916b;
    public float c = 0.0f;
    public Float d = Float.valueOf(0.0f);

    /* renamed from: e, reason: collision with root package name */
    public long f4917e;

    /* renamed from: f, reason: collision with root package name */
    public int f4918f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4919g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4920h;

    /* renamed from: i, reason: collision with root package name */
    public Ok f4921i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4922j;

    public Ek(Context context) {
        N1.n.f1204A.f1212j.getClass();
        this.f4917e = System.currentTimeMillis();
        this.f4918f = 0;
        this.f4919g = false;
        this.f4920h = false;
        this.f4921i = null;
        this.f4922j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f4915a = sensorManager;
        if (sensorManager != null) {
            this.f4916b = sensorManager.getDefaultSensor(4);
        } else {
            this.f4916b = null;
        }
    }

    public final void a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.f4922j && (sensorManager = this.f4915a) != null && (sensor = this.f4916b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.f4922j = false;
                    Q1.I.w("Stopped listening for flick gestures.");
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
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.Y7)).booleanValue()) {
                    if (!this.f4922j && (sensorManager = this.f4915a) != null && (sensor = this.f4916b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f4922j = true;
                        Q1.I.w("Listening for flick gestures.");
                    }
                    if (this.f4915a == null || this.f4916b == null) {
                        Y9.s("Flick detection failed to initialize. Failed to obtain gyroscope.");
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
        C0937n6 c0937n6 = AbstractC1066q6.Y7;
        O1.r rVar = O1.r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue()) {
            N1.n.f1204A.f1212j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f4917e + ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.a8)).intValue() < currentTimeMillis) {
                this.f4918f = 0;
                this.f4917e = currentTimeMillis;
                this.f4919g = false;
                this.f4920h = false;
                this.c = this.d.floatValue();
            }
            float floatValue = this.d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.d = Float.valueOf(floatValue);
            float f4 = this.c;
            C0937n6 c0937n62 = AbstractC1066q6.Z7;
            if (floatValue > ((Float) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(c0937n62)).floatValue() + f4) {
                this.c = this.d.floatValue();
                this.f4920h = true;
            } else if (this.d.floatValue() < this.c - ((Float) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(c0937n62)).floatValue()) {
                this.c = this.d.floatValue();
                this.f4919g = true;
            }
            if (this.d.isInfinite()) {
                this.d = Float.valueOf(0.0f);
                this.c = 0.0f;
            }
            if (this.f4919g && this.f4920h) {
                Q1.I.w("Flick detected.");
                this.f4917e = currentTimeMillis;
                int i4 = this.f4918f + 1;
                this.f4918f = i4;
                this.f4919g = false;
                this.f4920h = false;
                Ok ok = this.f4921i;
                if (ok == null || i4 != ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.b8)).intValue()) {
                    return;
                }
                ok.d(new Mk(1), Nk.f6374q);
            }
        }
    }
}
