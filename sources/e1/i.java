package e1;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import p1.C1915a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1915a f12720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f12721b;

    public i(j jVar, C1915a c1915a) {
        this.f12721b = jVar;
        this.f12720a = c1915a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i4) {
        this.f12720a.f14493a = i4;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        j jVar = this.f12721b;
        q2.e eVar = jVar.c;
        eVar.f14709p = sensorEvent;
        this.f12720a.b(eVar);
        SensorManager sensorManager = jVar.f12726f;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }
}
